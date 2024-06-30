package panels;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import main.JDBCOperations;
import main.MyContainer;

public class AllCriminalsPanel extends javax.swing.JPanel {
	
	MyContainer myParent;
	
	static String ID;
	
	String query; 
	Object[] column = null;
	
    public AllCriminalsPanel(MyContainer param) throws SQLException {
    	myParent = param; 
        initComponents();
    }
                    
	    private void initComponents() throws SQLException {

	    	updateTable_Button = new javax.swing.JButton();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        allCriminalsTable = new javax.swing.JTable();
	        deleteCriminal_Button = new javax.swing.JButton();
	        sort_ComboBox = new javax.swing.JComboBox<>();
	        Show_Criminal_Button = new javax.swing.JButton();
	        All_Criminals_Button = new javax.swing.JButton();
	        Criminal_Statics_Button = new javax.swing.JButton();
	        Add_Criminal_Button = new javax.swing.JButton();

	        updateTable_Button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
	        updateTable_Button.setText("Update Table");

	        DefaultTableModel model = new DefaultTableModel();
            column = new Object[]{"ID","Name","Age","Gender"};
            Object[] row = new Object[4];
            model.setColumnIdentifiers(column);
            allCriminalsTable.setModel(model);
            //addTenCriminals();
            
            query = "SELECT ID, Name, Age, Gender FROM gebs.criminal;";
            showAllCriminals(model,row,query);
            
            All_Criminals_Button.addActionListener(new java.awt.event.ActionListener() {
            	public void actionPerformed(java.awt.event.ActionEvent evt) {
            		All_Criminals_ButtonActionPerformed(evt);
            	}
            });
            
            Add_Criminal_Button.addActionListener(new java.awt.event.ActionListener() {
            	public void actionPerformed(java.awt.event.ActionEvent evt) {
            		Add_Criminal_ButtonActionPerformed(evt);
            	}
            });
            
            Show_Criminal_Button.addActionListener(new java.awt.event.ActionListener() {
            	public void actionPerformed(java.awt.event.ActionEvent evt) {
            		Show_Criminal_ButtonActionPerformed(evt);
            	}
            });
            
			Criminal_Statics_Button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					Criminal_Statics_ButtonActionPerformed(evt);
				}
			});
			
			deleteCriminal_Button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					try {
						deleteCriminalButtonActionPerformed(evt, model, allCriminalsTable);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			});

			updateTable_Button.addActionListener(new java.awt.event.ActionListener() {
				public void actionPerformed(java.awt.event.ActionEvent evt) {
					try {
						updateTable_ButtonActionPerformed(evt, model, row, query);
					} catch (SQLException e) {
						e.printStackTrace();
					}
				}
			});
            
			sort_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            	public void actionPerformed(java.awt.event.ActionEvent evt) {
            		try {
						sort_ComboBoxActionPerformed(evt,model,row);
					} catch (SQLException e) {
						e.printStackTrace();
					}
            	}
            });
            
            allCriminalsTable.addMouseListener(new MouseAdapter() {
    			public void mouseClicked(MouseEvent me) {
    				try {
						openCriminalButtonActionPerformed(me, allCriminalsTable);
					} catch (SQLException e) {
						e.printStackTrace();
					}
    			}
    		});
	        jScrollPane1.setViewportView(allCriminalsTable);

	        deleteCriminal_Button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
	        deleteCriminal_Button.setText("Delete Criminal");

	        sort_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {"Ascending","Descending",
	        		"Sort by: ID" , "Sort by: Name", "Sort by: Age", "Sort by: Gender",
	        		"Average Age"}));

	        Show_Criminal_Button.setText("->");
	        All_Criminals_Button.setText("->");
	        Criminal_Statics_Button.setText("->");
	        Add_Criminal_Button.setText("->");

	        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
	        this.setLayout(layout);
	        layout.setHorizontalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addGap(374, 374, 374)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                    .addComponent(All_Criminals_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Add_Criminal_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Show_Criminal_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(Criminal_Statics_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	                    .addComponent(sort_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
	                        .addGroup(layout.createSequentialGroup()
	                            .addComponent(deleteCriminal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
	                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
	                            .addComponent(updateTable_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
	                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 512, javax.swing.GroupLayout.PREFERRED_SIZE)))
	                .addGap(125, 125, 125))
	        );
	        layout.setVerticalGroup(
	            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
	            .addGroup(layout.createSequentialGroup()
	                .addGap(272, 272, 272)
	                .addComponent(All_Criminals_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(26, 26, 26)
	                .addComponent(Add_Criminal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(31, 31, 31)
	                .addComponent(Show_Criminal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addComponent(Criminal_Statics_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(0, 0, Short.MAX_VALUE))
	            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
	                .addContainerGap(72, Short.MAX_VALUE)
	                .addComponent(sort_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
	                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE)
	                .addGap(18, 18, 18)
	                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
	                    .addComponent(deleteCriminal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
	                    .addComponent(updateTable_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
	                .addGap(52, 52, 52))
	        );
	    }// </editor-fold>       
	    
	    public void paintComponent (Graphics g) {
        	
        	ImageIcon im = new ImageIcon(getClass().getResource("/src/All_Criminals_Background.png"));
        	Image i = im.getImage();
        	
        	g.drawImage(i, 0, 0, this.getSize().width,this.getSize().height,null);
        }
	    
	    private void sort_ComboBoxActionPerformed(java.awt.event.ActionEvent evt, DefaultTableModel model, Object[] row) throws SQLException {
	    			  	
			enum ComboBox {
				Ascending, Descending, SortbyID, SortbyName, SortByAge, SortbyGender, AverageAge
			}
			
			ComboBox JDBCOperations = null;
			int index = sort_ComboBox.getSelectedIndex();
			
			switch (index) {
			case 0:
				JDBCOperations = ComboBox.Ascending;
				break;
			case 1:
				JDBCOperations = ComboBox.Descending;
				break;
			case 2:
				JDBCOperations = ComboBox.SortbyID;
				break;
			case 3:
				JDBCOperations = ComboBox.SortbyName;
				break;
			case 4:
				JDBCOperations = ComboBox.SortByAge;
				break;
			case 5:
				JDBCOperations = ComboBox.SortbyGender;
				break;
			case 6:
				JDBCOperations = ComboBox.AverageAge;
				break;
			}
			
			switch(JDBCOperations) {
			case Ascending:
				query = "SELECT ID, Name, Age, Gender FROM gebs.criminal ORDER BY ID asc";
				model.setRowCount(0);
				column = new Object[]{"ID","Name","Age","Gender"};
				model.setColumnIdentifiers(column);
				showAllCriminals(model,row,query);
				break;
			case Descending:
				query = "SELECT ID, Name, Age, Gender FROM gebs.criminal ORDER BY ID desc";
				model.setRowCount(0);
				column = new Object[]{"ID","Name","Age","Gender"};
				model.setColumnIdentifiers(column);
				showAllCriminals(model,row,query);
				break;
			case SortbyID:
				query = "SELECT ID, Name, Age, Gender FROM gebs.criminal";
				model.setRowCount(0);
				column = new Object[]{"ID","Name","Age","Gender"};
				model.setColumnIdentifiers(column);
				showAllCriminals(model,row,query);
				break;
			case SortbyName:
				query = "SELECT Name, ID, Age, Gender FROM gebs.criminal ORDER BY Name asc";
				model.setRowCount(0);
				column = new Object[]{"Name","ID","Age","Gender"};
				model.setColumnIdentifiers(column);
				showAllCriminals(model,row,query);
				break;
			case SortByAge:
				query = "SELECT Age, ID, Name, Gender FROM gebs.criminal ORDER BY Age asc";
				model.setRowCount(0);
				column = new Object[]{"Age","ID","Name","Gender"};
				model.setColumnIdentifiers(column);
				showAllCriminals(model,row,query);
				break;
			case SortbyGender:
				query = "SELECT Gender, ID, Name, Age FROM gebs.criminal ORDER BY Gender asc";
				model.setRowCount(0);
				column = new Object[]{"Gender","ID","Name","Age"};
				model.setColumnIdentifiers(column);
				showAllCriminals(model,row,query);
				break;
			case AverageAge:
				query = "SELECT Gender, AVG(Age) FROM gebs.criminal group by Gender";
				model.setRowCount(0);
				column = new Object[]{"Gender","Average age"};
				model.setColumnIdentifiers(column);
				showAverageAgeCriminals(model,row,query,2);
				break;
			}		
	    }
	    
	    // 10 Insert
	    private void addTenCriminals() throws SQLException {

			String criminal1 = "('11','Ahmet','25','Male','Turk','180','78','Brown','Brown','None','1'),";
			String criminal2 = "('12','Ece','47','Female','Turk','159','59','Black','Brown','None','1'),";
			String criminal3 = "('13','Tunc','25','Male','Turk','199','87','Brown','Green','None','1'),";
			String criminal4 = "('14','Eda','78','Female','Turk','178','74','Blonde','Black','None','1'),";
			String criminal5 = "('15','Arda','46','Male','Turk','183','78','Brown','Black','None','1'),";
			String criminal6 = "('16','Ekin','62','Male','Turk','190','70','Black','Brown','None','1'),";
			String criminal7 = "('17','Buse','15','Female','Turk','155','48','Brown','Blonde','None','1'),";
			String criminal8 = "('18','Hazal','63','Female','Turk','110','41','Black','Blonde','None','1'),";
			String criminal9 = "('19','Başak','25','Female','Turk','167','56','Blonde','Blonde','None','1'),";
			String criminal10 = "('20','Berkin','54','Male','Turk','149','51','Brown','Brown','None','1')";
			
			String insertInto = "INSERT INTO gebs.criminal (ID, Name, Age, Gender, Race, Height, Weight, Hair, Eyes, Scars, CrimeID) VALUES ";

			String query = insertInto + criminal1 + criminal2 + criminal3 + criminal4 + criminal5 + criminal6
					+ criminal7 + criminal8 + criminal9 + criminal10;
			
			JDBCOperations.executeStatement(query);
		}
	    
		private void All_Criminals_ButtonActionPerformed(java.awt.event.ActionEvent evt) {

			JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

			if (topFrame instanceof ApplicationFrame) {
				ApplicationFrame parent = (ApplicationFrame) topFrame;
				parent.showAllCriminalsPanel();
			}
		}
		
        private void Add_Criminal_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        	
        	if(LogInPanel.admin) {
        		JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
    			
    			if(topFrame instanceof ApplicationFrame) {
    				ApplicationFrame parent = (ApplicationFrame) topFrame;
    				parent.showAddCriminalPanel();
    			}
        	} else {
        		JOptionPane.showMessageDialog(null, "You are not Admin!", "Action not allowed",
						JOptionPane.ERROR_MESSAGE);
        	}
        }
        
        private void Show_Criminal_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        	
        	JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
			
			if(topFrame instanceof ApplicationFrame) {
				ApplicationFrame parent = (ApplicationFrame) topFrame;
				parent.showCriminalPanel();
			}
        }
        
        private void Criminal_Statics_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        	
        	JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

			if (topFrame instanceof ApplicationFrame) {
				ApplicationFrame parent = (ApplicationFrame) topFrame;
				parent.showCriminalStaticsPanel();
			}
        }
        
        private void showAllCriminals(DefaultTableModel model, Object[] row, String query) throws SQLException {
        	
        	ResultSet resultset = JDBCOperations.getValuesFromSQL(query);
        	
        	while (resultset.next()) {
	
        		row[0] = resultset.getString(1);
				row[1] = resultset.getString(2);
				row[2] = resultset.getString(3);
				row[3] = resultset.getString(4);

	            model.addRow(row);
			}
        } 
        
		private void showAverageAgeCriminals(DefaultTableModel model, Object[] row, String query, int count) throws SQLException {
			
			ResultSet resultset = JDBCOperations.getValuesFromSQL(query);
			
			while (resultset.next()) {
				int rowCount = 0;
				for(int i = 1; i <= count; i++) {
					row[rowCount] = resultset.getString(i);
					rowCount++;
				}
		        model.addRow(row);
			}
		} 
		
		private void openCriminalButtonActionPerformed(MouseEvent me, javax.swing.JTable table) throws SQLException {
			
			JTable target = (JTable) me.getSource();
			int row = target.getSelectedRow();
			int column = target.getSelectedColumn();

			String columnName = (String) allCriminalsTable.getColumnName(column);
			
			if (columnName.equalsIgnoreCase("ID")) {
				ID = (String) allCriminalsTable.getValueAt(row, column);
				
				ShowCriminalPanel.getCriminalValues();
				ShowCriminalPanel.Criminal_Or_Victim_Label.setForeground(new java.awt.Color(255, 51, 51));
				ShowCriminalPanel.Criminal_Or_Victim_Label.setText("Criminal");

				JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

				if (topFrame instanceof ApplicationFrame) {
					ApplicationFrame parent = (ApplicationFrame) topFrame;
					parent.showCriminalPanel();
				}
			}

		}
    		
		private void updateTable_ButtonActionPerformed(java.awt.event.ActionEvent evt, DefaultTableModel model,
				Object[] row, String query) throws SQLException {

			model.setRowCount(0);
			showAllCriminals(model, row, query);
			;
		}
    	
		private void deleteCriminalButtonActionPerformed(java.awt.event.ActionEvent evt, DefaultTableModel model,
				javax.swing.JTable table) throws SQLException {

			String ID = (JOptionPane.showInputDialog(null,
					"Which criminal would you like to delete? (Enter Criminal ID)", "Delete Criminal from ID",
					JOptionPane.INFORMATION_MESSAGE));

			String IDquery = "SELECT ID FROM gebs.criminal where ID = '" + ID + "';";

			ResultSet resultset = JDBCOperations.getValuesFromSQL(IDquery);

			String checkID = null;
			while (resultset.next()) {
				checkID = resultset.getString(1);
			}

			if (checkID != null && checkID.equals(ID)) {
				String query = "DELETE FROM `gebs`.`criminal` WHERE (`ID` = '" + ID + "');";

				boolean deleted = JDBCOperations.executeStatement(query);

				if (deleted) {
					if(table.getSelectedRow() == -1) {
						JOptionPane.showMessageDialog(null, "Criminal " + ID + " has deleted! Update table.", "Delete Criminal",
								JOptionPane.INFORMATION_MESSAGE);
					}
					else {
						model.removeRow(table.getSelectedRow());
						JOptionPane.showMessageDialog(null, "Criminal " + ID + " has deleted", "Delete Criminal",
								JOptionPane.INFORMATION_MESSAGE);
					}
				}
			}
			else {
				JOptionPane.showMessageDialog(null, "Cannot deleted!", "Delete Criminal",
						JOptionPane.INFORMATION_MESSAGE);
			}
		}

	    // Variables declaration - do not modify                     
	    private javax.swing.JButton Add_Criminal_Button;
	    private javax.swing.JButton Show_Criminal_Button;
	    private javax.swing.JButton All_Criminals_Button;
	    private javax.swing.JButton Criminal_Statics_Button;
	    private javax.swing.JTable allCriminalsTable;
	    private javax.swing.JButton deleteCriminal_Button;
	    private javax.swing.JScrollPane jScrollPane1;
	    private javax.swing.JComboBox<String> sort_ComboBox;
	    private javax.swing.JButton updateTable_Button;
	    // End of variables declaration                   
	}