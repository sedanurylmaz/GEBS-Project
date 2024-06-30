package panels;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import main.JDBCOperations;
import main.MyContainer;

public class AddCriminalPanel extends javax.swing.JPanel {

	MyContainer myParent;
	
    public AddCriminalPanel(MyContainer param) throws SQLException {
    	myParent = param; 
        initComponents();
    }                         
        private void initComponents() {

            addCriminal_Button = new javax.swing.JButton();
            Show_Criminal_Button = new javax.swing.JButton();
            All_Criminals_Button = new javax.swing.JButton();
            Criminal_Statics_Button = new javax.swing.JButton();
            Add_Criminal_Button = new javax.swing.JButton();
            IDText_Label = new javax.swing.JLabel();
            NameText_Label = new javax.swing.JLabel();
            AgeText_Label = new javax.swing.JLabel();
            GenderText_Label = new javax.swing.JLabel();
            weightText_Label = new javax.swing.JLabel();
            RaceText_Label = new javax.swing.JLabel();
            HeightText_Label = new javax.swing.JLabel();
            eyesText_Label = new javax.swing.JLabel();
            scarMarkText_Label = new javax.swing.JLabel();
            hairText_Label = new javax.swing.JLabel();
            ID_TextField = new javax.swing.JTextField();
            name_TextField = new javax.swing.JTextField();
            age_TextField = new javax.swing.JTextField();
            gender_TextField = new javax.swing.JTextField();
            race_TextField = new javax.swing.JTextField();
            height_TextField = new javax.swing.JTextField();
            weight_TextField = new javax.swing.JTextField();
            hair_TextField = new javax.swing.JTextField();
            eyes_TextField = new javax.swing.JTextField();
            scarMark_TextField = new javax.swing.JTextField();
            updateCriminal_Button = new javax.swing.JButton();
            text1_label = new javax.swing.JLabel();

            addCriminal_Button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
            addCriminal_Button.setText("Add Criminal");

            Show_Criminal_Button.setText("->");
            All_Criminals_Button.setText("->");
            Criminal_Statics_Button.setText("->");
            Add_Criminal_Button.setText("->");

            IDText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            IDText_Label.setText("ID:");

            NameText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            NameText_Label.setText("Name:");

            AgeText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            AgeText_Label.setText("Age:");

            GenderText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            GenderText_Label.setText("Gender:");

            weightText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            weightText_Label.setText("Weight:");

            RaceText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            RaceText_Label.setText("Race:");

            HeightText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            HeightText_Label.setText("Height:");

            eyesText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            eyesText_Label.setText("Eyes:");

            scarMarkText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            scarMarkText_Label.setText("Scars and Marks:");

            hairText_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
            hairText_Label.setText("Hair:");
            
            updateCriminal_Button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
            updateCriminal_Button.setText("Update Criminal");
            
            text1_label.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
            text1_label.setText("Status: waiting...");
            text1_label.setVisible(true);
            
            addCriminal_Button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
    					addCriminalButtonActionPerformed(evt);
    				} catch (SQLException e) {
    					e.printStackTrace();
    				}
                }
            });
            
            updateCriminal_Button.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    try {
                    	updateCriminal_ButtonActionPerformed(evt);
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
                    .addGap(136, 136, 136)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NameText_Label)
                                .addGap(71, 71, 71)
                                .addComponent(name_TextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(AgeText_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(age_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(GenderText_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(gender_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(RaceText_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(race_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(HeightText_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(height_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(weightText_Label)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(weight_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDText_Label)
                                .addGap(109, 109, 109)
                                .addComponent(ID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(text1_label, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(hairText_Label)
                                .addGap(89, 89, 89)
                                .addComponent(hair_TextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(eyesText_Label)
                                .addGap(80, 80, 80)
                                .addComponent(eyes_TextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(scarMarkText_Label)
                                .addGap(18, 18, 18)
                                .addComponent(scarMark_TextField))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(addCriminal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(updateCriminal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 304, Short.MAX_VALUE))
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
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap(138, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(IDText_Label)
                        .addComponent(ID_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(NameText_Label)
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(AgeText_Label)
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(GenderText_Label)
                                            .addGap(18, 18, 18)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(RaceText_Label)
                                                    .addGap(18, 18, 18)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(HeightText_Label)
                                                            .addGap(18, 18, 18)
                                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(weightText_Label)
                                                                    .addGap(18, 18, 18)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(hairText_Label)
                                                                        .addComponent(hair_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(18, 18, 18)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(eyesText_Label)
                                                                        .addComponent(eyes_TextField))
                                                                    .addGap(18, 18, 18)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(scarMark_TextField)
                                                                        .addComponent(scarMarkText_Label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                    .addGap(18, 18, 18)
                                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(addCriminal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(updateCriminal_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGap(30, 30, 30))
                                                                .addGroup(layout.createSequentialGroup()
                                                                    .addComponent(weight_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                                        .addGroup(layout.createSequentialGroup()
                                                            .addComponent(height_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addGap(282, 282, 282)))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(text1_label, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(87, 87, 87))
                                                .addGroup(layout.createSequentialGroup()
                                                    .addComponent(race_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGap(0, 0, Short.MAX_VALUE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(gender_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addContainerGap())))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(age_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(name_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))))
            );
        }// </editor-fold>            
        
        public void paintComponent (Graphics g) {
        	
        	ImageIcon im = new ImageIcon(getClass().getResource("/src/Add_Criminal_Background.png"));
        	Image i = im.getImage();
        	
        	g.drawImage(i, 0, 0, this.getSize().width,this.getSize().height,null);
        }
        
        private void All_Criminals_ButtonActionPerformed(java.awt.event.ActionEvent evt) {

			JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

			if (topFrame instanceof ApplicationFrame) {
				ApplicationFrame parent = (ApplicationFrame) topFrame;
				parent.showAllCriminalsPanel();
			}
			succesfullMessage();
			waitingMessage();
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
        
		private void updateCriminal_ButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {

			String ID = ID_TextField.getText();

			String change = (JOptionPane.showInputDialog(null, "Which value would you like to update?",
					"Update Criminal from ID", JOptionPane.INFORMATION_MESSAGE));

			String value = (JOptionPane.showInputDialog(null, "Enter the value you want to change",
					"Update Criminal from ID", JOptionPane.INFORMATION_MESSAGE));
			
			if (value != null) {
				String valueUpperCase = Pattern.compile("^.").matcher(value).replaceFirst(m -> m.group().toUpperCase());
				String query = "UPDATE `gebs`.`criminal` SET `" + change + "` = '" + valueUpperCase
						+ "' WHERE (`ID` = '" + ID + "');";
				boolean updatedCriminal = JDBCOperations.executeStatement(query);

				if (updatedCriminal) {
					updatedMessage();
				} else {
					errorMessage();
				}
			}

		}
        
        private void addCriminalButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	
        	String ID = Pattern.compile("^.").matcher(ID_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	String name = Pattern.compile("^.").matcher(name_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	String age = Pattern.compile("^.").matcher(age_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());        	
        	String gender = Pattern.compile("^.").matcher(gender_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	String race = Pattern.compile("^.").matcher(race_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	String height = Pattern.compile("^.").matcher(height_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	String weight = Pattern.compile("^.").matcher(weight_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	String hair = Pattern.compile("^.").matcher(hair_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	String eyes = Pattern.compile("^.").matcher(eyes_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	String scarMark = Pattern.compile("^.").matcher(scarMark_TextField.getText()).replaceFirst(m -> m.group().toUpperCase());
        	
			String VALUES = "('" + ID + "','" + name + "','" + age + "','" + gender + "','" + race + "','" + height
					+ "','" + weight + "','" + hair + "','" + eyes + "','" + scarMark + "','1')";

			String query = "INSERT INTO gebs.criminal (ID, Name, Age, Gender,"
					+ "Race, Height, Weight, Hair,"
					+ "Eyes, Scars, CrimeID) VALUES " + VALUES;

			boolean addedCriminal = JDBCOperations.executeStatement(query);

			if (addedCriminal) {
				succesfullMessage();
			} else {
				errorMessage();
			}

		}
        
        private void waitingMessage() {
        	text1_label.setText("Status: Waiting");
        }

        private void succesfullMessage() {
        	text1_label.setText("Successfully added to the database!");
        }
        
        private void errorMessage() {
        	text1_label.setText("Incorrect input!");		
        }
        
        private void updatedMessage() {
        	text1_label.setText("Successfully updated!");
        }

        // Variables declaration - do not modify          
        private javax.swing.JButton updateCriminal_Button;
        private javax.swing.JButton Add_Criminal_Button;
        private javax.swing.JButton Show_Criminal_Button;
        private javax.swing.JLabel AgeText_Label;
        private javax.swing.JButton All_Criminals_Button;
        private javax.swing.JButton Criminal_Statics_Button;
        private javax.swing.JLabel GenderText_Label;
        private javax.swing.JLabel HeightText_Label;
        private javax.swing.JLabel IDText_Label;
        private javax.swing.JTextField ID_TextField;
        private javax.swing.JLabel NameText_Label;
        private javax.swing.JLabel RaceText_Label;
        private javax.swing.JTextField age_TextField;
        private javax.swing.JButton addCriminal_Button;
        private javax.swing.JLabel eyesText_Label;
        private javax.swing.JTextField eyes_TextField;
        private javax.swing.JTextField gender_TextField;
        private javax.swing.JLabel hairText_Label;
        private javax.swing.JTextField hair_TextField;
        private javax.swing.JTextField height_TextField;
        private javax.swing.JTextField name_TextField;
        private javax.swing.JTextField race_TextField;
        private javax.swing.JLabel scarMarkText_Label;
        private javax.swing.JTextField scarMark_TextField;
        private javax.swing.JLabel weightText_Label;
        private javax.swing.JTextField weight_TextField;
        private javax.swing.JLabel text1_label;
        // End of variables declaration                   
    }
