package com.javacodegeeks.snippets.desktop;

import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class GetSetSelectedTabInJTabbedPane {
    private static void createAndShowGUI() {

		// Create and set up the window.
		final JFrame frame = new JFrame("Tabbed Pane Example");

		// Display the window.
		frame.setSize(400, 400);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set grid layout for the frame
		frame.getContentPane().setLayout(new GridLayout(1, 1));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		tabbedPane.addTab("Tab1", makePanel("This is tab 1"));
		tabbedPane.addTab("Tab2", makePanel("This is tab 2"));
		tabbedPane.addTab("Tab3", makePanel("This is tab 3"));
		tabbedPane.addTab("Tab4", makePanel("This is tab 4"));

		frame.getContentPane().add(tabbedPane);

		// get the currently selected index for this tabbedpane
		int selectedIndex = tabbedPane.getSelectedIndex();
		System.out.println("Default Index:" + selectedIndex);

		// select the last tab
		tabbedPane.setSelectedIndex(tabbedPane.getTabCount()-1);

		selectedIndex = tabbedPane.getSelectedIndex();
		System.out.println("New Index:" + selectedIndex);

	}

	private static JPanel makePanel(String text) {
		JPanel p = new JPanel();
		p.add(new Label(text));
		p.setLayout(new GridLayout(1, 1));
		return p;
	}

	public static void main(String[] args) {

  //Schedule a job for the event-dispatching thread:

  //creating and showing this application's GUI.

  javax.swing.SwingUtilities.invokeLater(new Runnable() {

public void run() {

    createAndShowGUI(); 

}

  });
    }
}
