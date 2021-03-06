/*
 * [y] hybris Platform
 *
 * Copyright (c) 2000-2019 SAP SE
 * All rights reserved.
 *
 * This software is the confidential and proprietary information of SAP
 * Hybris ("Confidential Information"). You shall not disclose such
 * Confidential Information and shall use it only in accordance with the
 * terms of the license agreement you entered into with SAP Hybris.
 */
package ydocumentcartpackage.persistence.polyglot.repository.documentcart;

import de.hybris.platform.persistence.polyglot.model.ChangeSet;
import de.hybris.platform.persistence.polyglot.model.Identity;
import de.hybris.platform.persistence.polyglot.PolyglotPersistence.CoreAttributes;
import de.hybris.platform.persistence.polyglot.model.SingleAttributeKey;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiConsumer;


public class EntityModification implements ChangeSet
{
	private final Identity id;
	private final Document document;

	private final Map<SingleAttributeKey, Object> changes = new HashMap<>();

	public EntityModification(final Identity id, final Document document)
	{
		this.id = Objects.requireNonNull(id, "id mustn't be null.");
		this.document = Objects.requireNonNull(document, "document mustn't be null.");
	}

	public static Optional<EntityModification> from(final ChangeSet changeSet)
	{
		return Optional.of(changeSet).filter(EntityModification.class::isInstance).map(EntityModification.class::cast);
	}

	public Identity getId()
	{
		return id;
	}

	public Document getDocument()
	{
		return document;
	}

	@Override
	public void set(final SingleAttributeKey key, final Object value)
	{
		if (CoreAttributes.isPk(key) || CoreAttributes.isVersion(key))
		{
			return;
		}
		changes.put(key, value);
	}

	public void forEveryChange(final BiConsumer<SingleAttributeKey, Object> consumer)
	{
		Objects.requireNonNull(consumer, "consumer mustn't be null");
		changes.forEach(consumer);
	}
}
