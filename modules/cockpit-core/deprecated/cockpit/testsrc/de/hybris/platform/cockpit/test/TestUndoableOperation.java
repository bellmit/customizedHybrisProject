/*
 * Copyright (c) 2019 SAP SE or an SAP affiliate company. All rights reserved
 */
package de.hybris.platform.cockpit.test;

import de.hybris.platform.cockpit.model.undo.UndoableOperation;
import de.hybris.platform.cockpit.model.undo.impl.CannotRedoException;
import de.hybris.platform.cockpit.model.undo.impl.CannotUndoException;

import org.apache.log4j.Logger;


public class TestUndoableOperation implements UndoableOperation
{
	private final static Logger LOG = Logger.getLogger(TestUndoableOperation.class);
	private final String oldValue;
	private final String newValue;
	private final boolean undoable;
	private final boolean redoable;

	public TestUndoableOperation(final String oldValue, final String newValue)
	{
		this(oldValue, newValue, true, true);
	}

	public TestUndoableOperation(final String oldValue, final String newValue, final boolean undoable, final boolean redoable)
	{
		this.oldValue = oldValue;
		this.newValue = newValue;
		this.undoable = undoable;
		this.redoable = redoable;
	}

	public String getOldValue()
	{
		return this.oldValue;
	}

	public String getNewValue()
	{
		return this.newValue;
	}

	@Override
	public boolean canRedo()
	{
		return redoable;
	}

	@Override
	public boolean canUndo()
	{
		return undoable;
	}

	@Override
	public String getRedoPresentationName()
	{
		return "Redo [" + oldValue + "] -> [" + newValue + "]";
	}

	@Override
	public String getUndoPresentationName()
	{
		return "Undo [" + newValue + "] -> [" + oldValue + "]";
	}

	@Override
	public void redo() throws CannotRedoException
	{
		LOG.info("Doing " + getRedoPresentationName());
	}

	@Override
	public void undo() throws CannotUndoException
	{
		LOG.info("Doing " + getUndoPresentationName());
	}

	@Override
	public String getRedoContextDescription()
	{
		return null;
	}

	@Override
	public String getUndoContextDescription()
	{
		return null;
	}
}
