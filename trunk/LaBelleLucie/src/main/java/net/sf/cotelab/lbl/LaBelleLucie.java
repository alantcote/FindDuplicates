package net.sf.cotelab.lbl;

/*
 * Wish list
 * 
 * . ubiquitous test cases
 *   . one source file per Node type
 *   . (refactor) extract anonymous classes into independent files with named
 *     classes
 *   . (refactor) extract inner classes into independent files
 *   . (refactor) extract phrases of the form "new Mumble()" into methods of the
 *     form "Mumble newMumble() { return new Mumble(); }
 * . (refactor) organize classes into packages by category
 * . undo/redo command hot-keys
 * . restart game command
 * . animation of card moves
 * . save/resume games
 * . potential preferences
 *   . card size
 *   . trefoil rule (aces begin game on foundations)
 *   . tableau stacking by alternating colors
 *   . allow draw only when both reshuffles have been used
 *   . deck design
 *   . table background color
 *   . hinting (integrated with loss detection?)
 */

import javafx.application.Application;
import javafx.stage.Stage;
import net.sf.cotelab.lbl.controller.facade.Controller;
import net.sf.cotelab.lbl.controller.impl.ControllerImpl;
import net.sf.cotelab.lbl.model.facade.GameState;
import net.sf.cotelab.lbl.model.impl.GameStateImpl;
import net.sf.cotelab.lbl.view.facade.View;
import net.sf.cotelab.lbl.view.impl.ViewImpl;

public class LaBelleLucie extends Application {
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(final Stage primaryStage) {
		GameState model = new GameStateImpl();
		Controller controller = new ControllerImpl(model);
		View view = new ViewImpl(primaryStage, model);
		
		view.setInputHandler(controller.getInputHandler());
		
		// show the stage
		primaryStage.show();
	}
}
