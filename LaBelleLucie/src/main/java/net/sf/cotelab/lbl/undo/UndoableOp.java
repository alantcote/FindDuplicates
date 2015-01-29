package net.sf.cotelab.lbl.undo;

/**
 * An undoable operation.
 */
public interface UndoableOp {
	/**
	 * Do the operation.
	 */
	public void doOp();
	
	/**
	 * Undo the operation.
	 */
	public void undoOp();
}
