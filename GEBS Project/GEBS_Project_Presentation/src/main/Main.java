package main;

import java.io.IOException;
import java.sql.SQLException;

import panels.AddCriminalPanel;
import panels.AllCriminalsPanel;
import panels.ApplicationFrame;
import panels.CriminalStatisticsPanel;
import panels.LogInPanel;
import panels.ShowCriminalPanel;

public class Main {

	public static void main(String[] args){

		LookAndFeel.nimbusLookAndFeel();
		
		 java.awt.EventQueue.invokeLater(new Runnable() {
	            public void run() {
	            	
	            	MyContainer container = new MyContainer();
	
	        		container.logInPanel = new LogInPanel(container);
	        		try {
						container.showCriminalPanel = new ShowCriminalPanel(container);
					} catch (IOException e) {
						e.printStackTrace();
					}
	        		try {
						container.allCriminalsPanel = new AllCriminalsPanel(container);
					} catch (SQLException e) {
						e.printStackTrace();
					}
	        		try {
						container.addCriminalPanel = new AddCriminalPanel(container);
					} catch (SQLException e) {
						e.printStackTrace();
					}
	        		try {
						container.criminalStatisticsPanel = new CriminalStatisticsPanel(container);
					} catch (IOException e) {
						e.printStackTrace();
					}
	            	
	            	ApplicationFrame frame = new ApplicationFrame(container);
	            	frame.setResizable(false);
	            	frame.setVisible(true);	
	            }
	        });

	}

}
