/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved.
 */
package de.hybris.platform.outboundsync.router.impl;

import de.hybris.platform.outboundsync.activator.OutboundItemConsumer;
import de.hybris.platform.outboundsync.dto.OutboundChangeType;
import de.hybris.platform.outboundsync.dto.OutboundItemDTO;
import de.hybris.platform.outboundsync.job.RootItemChangeSender;
import de.hybris.platform.outboundsync.router.OutboundItemDTORouter;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Required;

public class DefaultOutboundItemDTORouter implements OutboundItemDTORouter
{
	private static final Logger LOG = LoggerFactory.getLogger(DefaultOutboundItemDTORouter.class);
	private OutboundItemConsumer changeConsumer;
	private RootItemChangeSender rootItemChangeSender;
	private RootItemPKPopulator populator;

	@Override
	public void route(final OutboundItemDTO itemDto)
	{
		if (isDeletedItem(itemDto))
		{
			consumeChange(itemDto);
		}
		else
		{
			final List<OutboundItemDTO> updatedDtos = getPopulator().populatePK(itemDto);
			updatedDtos.forEach(this::routeDto);
		}
	}

	private void routeDto(final OutboundItemDTO dto)
	{
		if (dto.getRootItemPK() != null)
		{
			getRootItemChangeSender().sendPopulatedItem(dto);
		}
		else
		{
			consumeChange(dto);
		}
	}

	private boolean isDeletedItem(final OutboundItemDTO itemDto)
	{
		return itemDto.getItem().getChangeType().equals(OutboundChangeType.DELETED);
	}

	private void consumeChange(final OutboundItemDTO itemDto)
	{
		LOG.debug("Consuming change for item DTO {}", itemDto);
		getChangeConsumer().consume(itemDto);
	}

	protected RootItemChangeSender getRootItemChangeSender()
	{
		return rootItemChangeSender;
	}

	@Required
	public void setRootItemChangeSender(final RootItemChangeSender rootItemChangeSender)
	{
		this.rootItemChangeSender = rootItemChangeSender;
	}

	protected OutboundItemConsumer getChangeConsumer()
	{
		return changeConsumer;
	}

	@Required
	public void setChangeConsumer(final OutboundItemConsumer changeConsumer)
	{
		this.changeConsumer = changeConsumer;
	}

	protected RootItemPKPopulator getPopulator()
	{
		return populator;
	}

	@Required
	public void setPopulator(final RootItemPKPopulator populator)
	{
		this.populator = populator;
	}
}
