module dupfilefinder {
	exports net.sf.cotelab.app.dupfilefinder;
	exports net.sf.cotelab.app.dupfilefinder.action;
	exports net.sf.cotelab.app.dupfilefinder.beans;
	exports net.sf.cotelab.app.dupfilefinder.gui;
	exports net.sf.cotelab.app.dupfilefinder.hunter;
	exports net.sf.cotelab.app.dupfilefinder.tree;
	
	requires java.desktop;
	requires javafx.graphics;
	requires javafx.swing;
	requires javafx.web;
	requires java.logging;
	requires util;
}