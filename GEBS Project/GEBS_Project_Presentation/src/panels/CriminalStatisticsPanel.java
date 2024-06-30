package panels;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

import main.JDBCOperations;
import main.MyContainer;

public class CriminalStatisticsPanel extends javax.swing.JPanel {

	MyContainer myParent;
	Object[] column = null;

    public CriminalStatisticsPanel(MyContainer param) throws IOException {
    	myParent = param; 
        initComponents();
    }

	    @SuppressWarnings("unchecked")
	    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
	    private void initComponents() {

	    	Show_Criminal_Button = new javax.swing.JButton();
	        All_Criminals_Button = new javax.swing.JButton();
	        Criminal_Statics_Button = new javax.swing.JButton();
	        Add_Criminal_Button = new javax.swing.JButton();
	        jScrollPane1 = new javax.swing.JScrollPane();
	        SQLTable = new javax.swing.JTable();
	        JDBC_ComboBox = new javax.swing.JComboBox<>();

	        Show_Criminal_Button.setText("->");
	        All_Criminals_Button.setText("->");
	        Criminal_Statics_Button.setText("->");
	        Add_Criminal_Button.setText("->");
	        
	        DefaultTableModel model = new DefaultTableModel();
            column = new Object[]{"ID","Name","Age","Gender"};
            Object[] row = new Object[4];
            model.setColumnIdentifiers(column);
            SQLTable.setModel(model);
   
	        jScrollPane1.setViewportView(SQLTable);

			JDBC_ComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SQL Operations", "Count",
					"Sum of ages", "The average age", "ID (Between)", "All Users", "All Victims", "Hair Color",
					"Is Guilty?", "ID Having", "Sequence", "Minimum Age", "Maximum Age", "Choose Gender", "ID Not In",
					"Filtering", "Empty Picture", "Different Nationalities", "Above Average Height",
					"Same Criminal/Victim Names", "Different Criminal/Victim Names", "Criminals and Victims",
					"Officer And Reports", "Officer/Reports/Victim", "Officer And Criminals"}));

	        JDBC_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            	public void actionPerformed(java.awt.event.ActionEvent evt) {
            		try {
						JDBC_ComboBoxActionPerformed(evt,model,row);
					} catch (SQLException e) {
						e.printStackTrace();
					}
            	}
            });
	        
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
            
            JButton add_column_button = new JButton("Add Column");
            add_column_button.addActionListener(new java.awt.event.ActionListener() {
			    public void actionPerformed(java.awt.event.ActionEvent evt) {
			        try {
			            addNewColumn_actionPerformed(evt,SQLTable);
			        } catch (SQLException e) {
			            e.printStackTrace();
			        }
			    }
			
	        });
            add_column_button.setFont(new Font("SansSerif", Font.BOLD, 14));

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            layout.setHorizontalGroup(
            	layout.createParallelGroup(Alignment.LEADING)
            		.addGroup(layout.createSequentialGroup()
            			.addGap(374)
            			.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
            				.addComponent(All_Criminals_Button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            				.addComponent(Add_Criminal_Button, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            				.addComponent(Show_Criminal_Button, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            				.addComponent(Criminal_Statics_Button, GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            			.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            			.addGroup(layout.createParallelGroup(Alignment.LEADING)
            				.addComponent(JDBC_ComboBox, GroupLayout.PREFERRED_SIZE, 200, GroupLayout.PREFERRED_SIZE)
            				.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 512, GroupLayout.PREFERRED_SIZE))
            			.addGap(125))
            		.addGroup(Alignment.TRAILING, layout.createSequentialGroup()
            			.addContainerGap(609, Short.MAX_VALUE)
            			.addComponent(add_column_button, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
            			.addGap(277))
            );
            layout.setVerticalGroup(
            	layout.createParallelGroup(Alignment.TRAILING)
            		.addGroup(layout.createSequentialGroup()
            			.addGap(272)
            			.addComponent(All_Criminals_Button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            			.addGap(26)
            			.addComponent(Add_Criminal_Button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            			.addGap(31)
            			.addComponent(Show_Criminal_Button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            			.addGap(18)
            			.addComponent(Criminal_Statics_Button, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
            			.addGap(0, 180, Short.MAX_VALUE))
            		.addGroup(layout.createSequentialGroup()
            			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            			.addComponent(JDBC_ComboBox, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
            			.addPreferredGap(ComponentPlacement.UNRELATED)
            			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 574, GroupLayout.PREFERRED_SIZE)
            			.addGap(36)
            			.addComponent(add_column_button, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
            			.addGap(41))
            );
            this.setLayout(layout);
        }// </editor-fold>           
	    
	    public void paintComponent (Graphics g) {
        	
        	ImageIcon im = new ImageIcon(getClass().getResource("/src/Criminal_Statistics_Background.png"));
        	Image i = im.getImage();
        	
        	g.drawImage(i, 0, 0, this.getSize().width,this.getSize().height,null);
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
  
        private void addNewColumn_actionPerformed(java.awt.event.ActionEvent e,javax.swing.JTable table)
        		throws SQLException{

        	DefaultTableModel model = (DefaultTableModel) table.getModel();
		    String columnName = JOptionPane.showInputDialog("Enter Column Name:");
		    String columnType = JOptionPane.showInputDialog("Enter Column Type:");
		    String query = "ALTER TABLE gebs.criminal ADD COLUMN " + columnName + " " + columnType + " UNIQUE;";
		    boolean executed = JDBCOperations.executeStatement(query);
		    if (executed) {
    		    model.addColumn(columnName);
				JOptionPane.showMessageDialog(add_column_button, "Succesfully added!");
			    JOptionPane.showMessageDialog(null, "Additional Information: The values"
			    		+ " to be added to the column specified with the UNIQUE constraint must not be repeated"
			    		+ "(Consider adding value!).", "Alter table criminal",
						JOptionPane.INFORMATION_MESSAGE); 
			}
		    else {
		    	JOptionPane.showMessageDialog(null, "UnSuccesfully transaction!", "Alter table criminal",
						JOptionPane.INFORMATION_MESSAGE);
		    }
        }
        
        private void Show_Criminal_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        	
        	JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
			
			if(topFrame instanceof ApplicationFrame) {
				ApplicationFrame parent = (ApplicationFrame) topFrame;
				parent.showCriminalPanel();
			}
        }
        
        private void JDBC_ComboBoxActionPerformed(java.awt.event.ActionEvent evt,DefaultTableModel model, Object[] row)
        		throws SQLException {                                              
  	
			enum ComboBox {
				Count, SumOfAges, AverageAge, ID_Between, AllUsers, AllVictims, HairColor, 
				IsGuilty, ID_Having, Sequence, MinimumAge, MaximumAge, ChooseGender, ID_NotIn,
				Filtering, EmptyPicture, DifferentNationalities, AboveAverageHeight, 
				SameNameCriminalAndVictim, DifferentNameCriminalAndVictim, CriminalsAndVictims,
				OfficerAndReports, Officer_Reports_Victim, OfficerAndCriminals
			}
			
			ComboBox operations = null;
			int index = JDBC_ComboBox.getSelectedIndex();
			
			switch(index) {
			case 1: // Count Operation
				operations = ComboBox.Count;
				break;
			case 2: // Sum Operation
				operations = ComboBox.SumOfAges;
				break;
			case 3: // AVG Operation
				operations = ComboBox.AverageAge;
				break;
			case 4: // Between Operation
				operations = ComboBox.ID_Between;
				break;
			case 5: // All users Table
				operations = ComboBox.AllUsers;
				break;
			case 6: // View Operation
				operations = ComboBox.AllVictims;
				break;
			case 7: // Or Operation
				operations = ComboBox.HairColor;
				break;
			case 8: // Case When Operation
				operations = ComboBox.IsGuilty;
				break;
			case 9: // Having Operation
				operations = ComboBox.ID_Having;
				break;
			case 10: // Sequence Operation
				operations = ComboBox.Sequence;
				break;
			case 11: // Min Operation
				operations = ComboBox.MinimumAge;
				break;
			case 12: // Max Operation
				operations = ComboBox.MaximumAge;
				break;
			case 13: // Like
				operations = ComboBox.ChooseGender;
				break;
			case 14: // ID Not In
				operations = ComboBox.ID_NotIn;
				break;
			case 15: // Filtering - Not Null Operations
				operations = ComboBox.Filtering;
				break;
			case 16: // Is Null Operation
				operations = ComboBox.EmptyPicture;
				break;
			case 17: // Distinct Operation
				operations = ComboBox.DifferentNationalities;
				break;
			case 18: // Above Average
				operations = ComboBox.AboveAverageHeight;
				break;
			case 19: // Intersect Operation
				operations = ComboBox.SameNameCriminalAndVictim;
				break;
			case 20: // Except Operation
				operations = ComboBox.DifferentNameCriminalAndVictim;
				break;
			case 21: // Union Operation
				operations = ComboBox.CriminalsAndVictims;
				break;
			case 22: // Join (2)
				operations = ComboBox.OfficerAndReports;
				break;
			case 23: // Join (3)
				operations = ComboBox.Officer_Reports_Victim;
				break;
			case 24: // Join (Outer)
				operations = ComboBox.OfficerAndCriminals;
				break;
			}
			
			String query = null;
			String columnNames[] = null;
			String sqlNames[] = null;
			switch(operations) {
			case Count:
				query = "SELECT COUNT(*) FROM gebs.criminal;";
				showMessage("Criminal count is: " + JDBCOperations.getOneValue(query));
				break;
			case SumOfAges:
				query = "SELECT SUM(Age) FROM gebs.criminal;";
				showMessage("Sum of ages: " + JDBCOperations.getOneValue(query));
				break;
			case AverageAge:
				query = "SELECT avg(Age) FROM gebs.criminal";
				showMessage("Average age: " + JDBCOperations.getOneValue(query));
				break;
			case ID_Between:
				JTextField field1 = new JTextField();
				JTextField field2 = new JTextField();
				Object[] fields = { "From", field1, "To", field2, };

				JOptionPane.showConfirmDialog(null, fields, "Choose the interval of ID between:",
						JOptionPane.OK_CANCEL_OPTION);
				query = "SELECT * FROM gebs.criminal WHERE ID between " + field1.getText() + " AND "
						+ field2.getText();
				columnNames = new String[] {"ID","Name","Age","Gender"};
				sqlNames = new String[] {"ID", "Name","Age","Gender"};
				showTable(query,columnNames,model,sqlNames);
				break;
			case AllUsers:  
				query = "SELECT * FROM gebs.users;";
				columnNames = new String[] {"ID","Name","Is Admin?"};
				sqlNames = new String[] {"ID", "Name","IsAdmin"};
				showTable(query,columnNames,model,sqlNames);
				break;
			case AllVictims:
				columnNames = new String[] {"Victim ID", "Victim Name", "Victim Age", "Victim Gender"};
				sqlNames = new String[] {"ID","Name","Age","Gender"};
				String createViewAllVictims = "CREATE VIEW gebs.allVictims AS SELECT ID, Name,"
						+ " Age, Gender FROM gebs.victim;";
				query = "SELECT * FROM gebs.allVictims";
				JDBCOperations.executeStatement(createViewAllVictims);
				
				showTable(query,columnNames,model,sqlNames);
				
				query = "DROP VIEW `gebs`.`allvictims`;";
				JDBCOperations.executeStatement(query);
				break;
			case HairColor:
				JTextField HairColor1 = new JTextField();
				JTextField HairColor2 = new JTextField();
				Object[] fields2 = { "From", HairColor1, "To", HairColor2};

				JOptionPane.showConfirmDialog(null, fields2, "Choose two hair color:",
						JOptionPane.OK_CANCEL_OPTION);
				
				columnNames = new String[] {"Hair", "ID", "Name", "Gender"};
				sqlNames = new String[] {"Hair","ID","Name","Gender"};
				query = "SELECT Hair, ID, Name, "
						+ "Gender FROM gebs.criminal WHERE Hair ="
						+ "  '"+ HairColor1.getText() +"' or Hair = '"+ HairColor2.getText() +"';";
				showTable(query,columnNames,model,sqlNames);
				break;
			case IsGuilty:
				columnNames = new String[] {"Criminal Name","Criminal Age","Criminal Gender", "Criminal ID", "Guilty"};
				sqlNames = new String[] {"Name","Age","Gender","ID","Guilty"};
				query = "SELECT Name, Age, Gender,"
						+ " ID, CASE WHEN Age >= 18 THEN 'Yes'"
						+ " ELSE 'No' END AS Guilty FROM gebs.criminal;";				
				showTable(query,columnNames,model,sqlNames);
				break;
			case ID_Having:
				columnNames = new String[] {"ID","Name","Age","Gender"};
				sqlNames = new String[] {"ID","Name","Age","Gender"};
				JTextField operand = new JTextField();
				JTextField number = new JTextField();
				Object[] havingIDs = { "Enter the operation ( < , >, =)", operand, "Enter the number", number, };
				JOptionPane.showConfirmDialog(null, havingIDs, "Having Operation ",
						JOptionPane.OK_CANCEL_OPTION);

				query = "SELECT * FROM gebs.criminal GROUP BY ID HAVING(criminal.ID)";
				switch (operand.getText()) {
				case ">":
					query += " > " + number.getText();
					break;
				case "<":
					query += " < " + number.getText();
					break;
				case "=":
					query += " = " + number.getText();
					break;
				}
				showTable(query,columnNames,model,sqlNames);	
				break;
			case Sequence: // TEKRAR KONTROL ET! ÇALIŞIYOR AMA KENDİNİ TEKRAR EDİYOR.
				//Create new table
				query = "CREATE TABLE gebs.nationalities (\r\n"
						+ "    count INT AUTO_INCREMENT PRIMARY KEY,\r\n"
						+ "    race VARCHAR(50)\r\n"
						+ ");";
				JDBCOperations.executeStatement(query);
				
				//Insert races
				query = "INSERT INTO gebs.nationalities (race)\r\n"
						+ "SELECT Race\r\n"
						+ "FROM gebs.criminal\r\n"
						+ "WHERE NOT EXISTS (\r\n"
						+ "	select race\r\n"
						+ "    FROM gebs.nationalities\r\n"
						+ "    WHERE race = criminal.race\r\n"
						+ ");";
				JDBCOperations.executeStatement(query);
				
				//Show in JTable
				query = "SELECT * FROM gebs.nationalities;";
				columnNames = new String[] {"Count", "Race"};
				sqlNames = new String [] {"count", "race"};
				showTable(query, columnNames, model, sqlNames);
				
				//Delete table
				query = "DROP TABLE `gebs`.`nationalities`;";
				JDBCOperations.executeStatement(query);
				break;
			case MinimumAge:
				query = "SELECT min(Age) FROM gebs.criminal;";
				showMessage("Minimum age: " + JDBCOperations.getOneValue(query));
				break;
			case MaximumAge:
				query = "SELECT max(Age) FROM gebs.criminal";
				showMessage("Maximum age: " + JDBCOperations.getOneValue(query));
				break;
			case ChooseGender:
				JTextField genderField = new JTextField();
				JOptionPane.showConfirmDialog(null, genderField, "Choose the Gender:",
						JOptionPane.OK_CANCEL_OPTION);
				query = "SELECT * FROM gebs.criminal WHERE Gender LIKE '"+ genderField.getText() + "'";
				columnNames = new String[] {"Gender","Name","ID","Race"};
				sqlNames = new String[] {"Gender","Name","ID","Race"};
				
				showTable(query, columnNames, model,sqlNames);
				break;
			case ID_NotIn:
				JTextField fieldNot1 = new JTextField();
				JTextField fieldNot2 = new JTextField();
				Object[] fieldForNot = {fieldNot1, fieldNot2,};

				JOptionPane.showConfirmDialog(null, fieldForNot, "Choose the not in interval of ID:",
						JOptionPane.OK_CANCEL_OPTION);
				query = "SELECT * FROM gebs.criminal WHERE criminal.ID NOT IN (" + fieldNot1.getText() + "," + fieldNot2.getText() + ")";

				columnNames = new String[] {"ID","Name","Age","Gender"};
				sqlNames = new String[] {"ID","Name","Age","Gender"};
				showTable(query, columnNames, model, sqlNames);
				break;
			case Filtering:
				JTextField fieldFiltering = new JTextField();
				JTextField fieldFilteringCondition = new JTextField();
				
				Object[] fieldForFiltering = {"Filtered Column (Name or Race):", fieldFiltering,
						"Write Key to Search:", fieldFilteringCondition, };
				
				JOptionPane.showConfirmDialog(null, fieldForFiltering, "Filtering Operation:",JOptionPane.OK_CANCEL_OPTION);
				
				String filter = null;
				if (fieldFiltering.getText().equalsIgnoreCase("name")) {
					filter = "Name";
					columnNames = new String[] { "Name", "Race", "Age", "Gender" };
					sqlNames = new String[] {filter,"Race","Age","Gender"};
				}
				else if (fieldFiltering.getText().equalsIgnoreCase("race")) {
					filter = "Race";
					columnNames = new String[] { "Race", "Name", "Age", "Gender" };
					sqlNames = new String[] {filter,"Name","Age","Gender"};
				}
				
				query = "SELECT Name, Race, Age, Gender"
						+" FROM (SELECT * FROM gebs.criminal WHERE " + filter
						+" LIKE '%"+ fieldFilteringCondition.getText() +"%') AS selectedTable"
						+" WHERE " + filter +" IS NOT NULL";
				
				showTable(query, columnNames, model, sqlNames);
				break;
			case EmptyPicture:
				 query = "SELECT ID, Name, Age, Gender FROM gebs.criminal WHERE Image IS NULL";
				 columnNames = new String[] { "ID", "Name", "Age", "Gender" };
				 sqlNames = new String[] {"ID","Name","Age","Gender"};
				 showTable(query, columnNames, model, sqlNames);
				break;
			case DifferentNationalities:
				query = "SELECT distinct Race FROM gebs.criminal;";
				columnNames = new String[] {"Race"};
				sqlNames = new String [] {"Race"};
				showTable(query, columnNames, model, sqlNames);
				break;
			case AboveAverageHeight:
				query = "SELECT Height, Name, Age, Gender FROM gebs.criminal "
						+ "WHERE Height > (SELECT AVG(Height) FROM gebs.criminal)";
				columnNames = new String[] { "Height", "Name", "Age", "Gender"};
				sqlNames = new String[] {"Height","Name","Age","Gender"};
				showTable(query, columnNames, model, sqlNames);
				break;
			case SameNameCriminalAndVictim:
				query = "SELECT Name FROM gebs.criminal\r\n"
						+ "INTERSECT\r\n"
						+ "SELECT Name FROM gebs.victim;";
				columnNames = new String[] {"Criminals and Victims with the same name"};
				sqlNames = new String[] {"Name"};
				showTable(query, columnNames, model, sqlNames);
			    break;
			case DifferentNameCriminalAndVictim:
				query = "SELECT Name FROM gebs.criminal EXCEPT SELECT Name FROM gebs.victim;";
				columnNames = new String[] {"Criminals and Victims with different name"};
				sqlNames = new String[] {"Name"};
				showTable(query, columnNames, model, sqlNames);
				break;
			case CriminalsAndVictims:
				query = "SELECT ID, Name, Age, Gender FROM gebs.criminal UNION "
	                    + "SELECT ID, Name, Age, Gender FROM gebs.victim";
				columnNames = new String[]{"ID", "Name", "Age", "Gender"};
				sqlNames = new String[] {"ID","Name","Age","Gender"};
				showTable(query, columnNames, model, sqlNames);
				break;
			case OfficerAndReports:
				query = "SELECT officer.Name, officer.Department, \r\n"
						+ "policereport.CaseNO, policereport.ArrestDate, \r\n"
						+ "policereport.LastSeen FROM gebs.officer\r\n"
						+ "INNER JOIN gebs.policereport\r\n"
						+ "ON gebs.officer.ID = gebs.policereport.policeID;";
				columnNames = new String[]{"Department", "Police Name", "Case NO", "Arrest Date","Last Seen"};
				sqlNames = new String[]{"Department", "Name", "CaseNO", "ArrestDate","LastSeen"};
				showTable(query, columnNames, model, sqlNames);
				break;
			case Officer_Reports_Victim:
				query = "SELECT officer.Department, policereport.CaseNO, criminal.Name, \r\n"
						+ "criminal.Age, policereport.LastSeen FROM gebs.officer\r\n"
						+ "INNER JOIN gebs.policereport\r\n"
						+ "ON gebs.officer.ID = gebs.policereport.policeID\r\n"
						+ "INNER JOIN gebs.criminal\r\n"
						+ "ON gebs.criminal.ID = gebs.policereport.policeID\r\n"
						+ "ORDER BY CaseNO;";
				columnNames = new String[]{"Department", "Case No", "Criminal Name", "Criminal Age","Last Seen"};
				sqlNames = new String[]{"Department", "CaseNO", "Name", "Age","LastSeen"};
				showTable(query, columnNames, model, sqlNames);
				break;
			case OfficerAndCriminals:
				query = "SELECT officer.Name, officer.department, \r\n"
						+ "criminal.Name, criminal.Race\r\n"
						+ "FROM gebs.criminal\r\n"
						+ "LEFT JOIN gebs.officer\r\n"
						+ "ON gebs.criminal.CrimeID = gebs.officer.ID;";
				columnNames = new String[]{"Police Name", "Department", "Criminal Name","Race"};
				sqlNames = new String[]{"Name", "department", "Name", "Race"};
				showTable(query, columnNames, model, sqlNames);
				break;
				default:
					break;
			}
		}
        
        private void showTable(String query,String[] columnNames,DefaultTableModel model, String[] sqlNames) throws SQLException {
        	
        	model.setRowCount(0);
        	ResultSet resultset = JDBCOperations.getValuesFromSQL(query);
        	
        	if (resultset != null) {
        		
        		int rowCount = columnNames.length;
            	Object[] column = new Object[rowCount];

            	for(int i = 0; i < rowCount; i++) {
            		column[i] = columnNames[i];
            	}
            	
        		model.setColumnIdentifiers(column);
        		SQLTable.setModel(model);
        	
            	Object[] row= new Object[rowCount];
        		while (resultset.next()) {

        			for(int i = 0; i < rowCount; i++) {
        				row[i] = resultset.getString(sqlNames[i]);
        			}
					model.addRow(row);
				}
        	}
        }
        
        private void showMessage(String message) {
        	JOptionPane.showMessageDialog(null, message, "SQL Operations",
					JOptionPane.PLAIN_MESSAGE);
        }

	    // Variables declaration - do not modify                     
        private javax.swing.JButton Add_Criminal_Button;
        private javax.swing.JButton Show_Criminal_Button;
        private javax.swing.JButton All_Criminals_Button;
        private javax.swing.JButton Criminal_Statics_Button;
        private javax.swing.JComboBox<String> JDBC_ComboBox;
        private javax.swing.JTable SQLTable;
        private javax.swing.JScrollPane jScrollPane1;
        private JButton add_column_button;
	}
