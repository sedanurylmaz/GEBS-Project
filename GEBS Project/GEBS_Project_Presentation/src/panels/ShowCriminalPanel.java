package panels;

import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import main.JDBCOperations;
import main.MyContainer;

/**
 *
 * @author Emre
 */
public class ShowCriminalPanel extends javax.swing.JPanel {

	MyContainer myParent;
	
	static String ID_Criminal;

    public ShowCriminalPanel(MyContainer param) throws IOException {
    	myParent = param; 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws IOException {

    	Show_Criminal_Button = new javax.swing.JButton();
        All_Criminals_Button = new javax.swing.JButton();
        Criminal_Statics_Button = new javax.swing.JButton();
        Add_Criminal_Button = new javax.swing.JButton();
        ID_Label = new javax.swing.JLabel();
        Age_Label = new javax.swing.JLabel();
        Gender_Label = new javax.swing.JLabel();
        Name_Label = new javax.swing.JLabel();
        Race_Label = new javax.swing.JLabel();
        Height_Label = new javax.swing.JLabel();
        Hair_Label = new javax.swing.JLabel();
        Weight_Label = new javax.swing.JLabel();
        Eyes_Label = new javax.swing.JLabel();
        scarMark_Label = new javax.swing.JLabel();
        back_Button = new javax.swing.JButton();
        imageText_Label = new javax.swing.JLabel();
        photo_Label = new javax.swing.JLabel();
        ID_Criminal_Label = new javax.swing.JLabel();
        Name_Criminal_Label = new javax.swing.JLabel();
        Age_Criminal_Label = new javax.swing.JLabel();
        Gender_Criminal_Label = new javax.swing.JLabel();
        Race_Criminal_Label = new javax.swing.JLabel();
        Height_Criminal_Label = new javax.swing.JLabel();
        Weight_Criminal_Label = new javax.swing.JLabel();
        Hair_Criminal_Label = new javax.swing.JLabel();
        Eyes_Criminal_Label = new javax.swing.JLabel();
        ScarMark_Criminal_Label = new javax.swing.JLabel();
        showVictim_Button = new javax.swing.JButton();
        Criminal_Or_Victim_Label = new javax.swing.JLabel();
        
        Show_Criminal_Button.setText("->");
        All_Criminals_Button.setText("->");
        Criminal_Statics_Button.setText("->");
        Add_Criminal_Button.setText("->");

        ID_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        ID_Label.setText("ID:");

        Age_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Age_Label.setText("Age:");

        Gender_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Gender_Label.setText("Gender: ");

        Name_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Name_Label.setText("Name:");

        Race_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Race_Label.setText("Race:");

        Height_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Height_Label.setText("Height:");

        Hair_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Hair_Label.setText("Hair:");

        Weight_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Weight_Label.setText("Weight:");

        Eyes_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Eyes_Label.setText("Eyes:");

        scarMark_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        scarMark_Label.setText("Scars and Marks:");

        back_Button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        back_Button.setText("BACK");
        
        back_Button.addActionListener(e -> backButtonActionPerformed(e));
        
        showVictim_Button.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        showVictim_Button.setText("Show Victim");

        imageText_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        imageText_Label.setText("Image:");

        ID_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        ID_Criminal_Label.setText("none");

        Name_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Name_Criminal_Label.setText("none");

        Age_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Age_Criminal_Label.setText("none");

        Gender_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Gender_Criminal_Label.setText("none");

        Race_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Race_Criminal_Label.setText("none");

        Height_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Height_Criminal_Label.setText("none");

        Weight_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Weight_Criminal_Label.setText("none");

        Hair_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Hair_Criminal_Label.setText("none");

        Eyes_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        Eyes_Criminal_Label.setText("none");

        ScarMark_Criminal_Label.setFont(new java.awt.Font("SansSerif", 1, 22)); // NOI18N
        ScarMark_Criminal_Label.setText("none");
        
        Criminal_Or_Victim_Label.setFont(new java.awt.Font("sansserif", 1, 22)); // NOI18N
        Criminal_Or_Victim_Label.setForeground(new java.awt.Color(255, 51, 51));
        Criminal_Or_Victim_Label.setText("Criminal");
           
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
        
		Criminal_Statics_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				Criminal_Statics_ButtonActionPerformed(evt);
			}
		});
		
		showVictim_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					showVictim_ButtonActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
		
		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(374, 374, 374)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(All_Criminals_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Add_Criminal_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Show_Criminal_Button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Criminal_Statics_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(136, 136, 136)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Age_Label)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Name_Label)
                                    .addComponent(ID_Label)
                                    .addComponent(Gender_Label)
                                    .addComponent(Race_Label)
                                    .addComponent(Height_Label)
                                    .addComponent(Weight_Label))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Weight_Criminal_Label)
                                    .addComponent(Race_Criminal_Label)
                                    .addComponent(Gender_Criminal_Label)
                                    .addComponent(Age_Criminal_Label)
                                    .addComponent(Height_Criminal_Label)
                                    .addComponent(Eyes_Criminal_Label)
                                    .addComponent(Name_Criminal_Label)
                                    .addComponent(Hair_Criminal_Label)
                                    .addComponent(ID_Criminal_Label))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 171, Short.MAX_VALUE)
                        .addComponent(photo_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hair_Label)
                            .addComponent(Eyes_Label)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(scarMark_Label)
                                .addGap(18, 18, 18)
                                .addComponent(ScarMark_Criminal_Label))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(showVictim_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(Criminal_Or_Victim_Label))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(Criminal_Or_Victim_Label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ID_Label, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ID_Criminal_Label, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Name_Label)
                            .addComponent(Name_Criminal_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Age_Label)
                            .addComponent(Age_Criminal_Label))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Gender_Label)
                            .addComponent(Gender_Criminal_Label)))
                    .addComponent(photo_Label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Race_Label)
                    .addComponent(Race_Criminal_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Height_Label)
                    .addComponent(Height_Criminal_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Weight_Label)
                    .addComponent(Weight_Criminal_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hair_Label)
                    .addComponent(Hair_Criminal_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Eyes_Label)
                    .addComponent(Eyes_Criminal_Label))
                .addGap(18, 19, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scarMark_Label)
                    .addComponent(ScarMark_Criminal_Label))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showVictim_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(146, 146, 146))
        );
    }// </editor-fold>  
    
    public static void getCriminalValues() throws SQLException {
    	ID_Criminal = AllCriminalsPanel.ID;
    	
    	String query = "SELECT * FROM gebs.criminal where ID = " + ID_Criminal;
		ResultSet resultset = JDBCOperations.getValuesFromSQL(query);
		while (resultset.next()) {
			
			ID_Criminal_Label.setText(resultset.getString(1)); 
			Name_Criminal_Label.setText(resultset.getString(2));
			Age_Criminal_Label.setText(resultset.getString(3));	
			Gender_Criminal_Label.setText(resultset.getString(4)); 
			Race_Criminal_Label.setText(resultset.getString(5));
			Height_Criminal_Label.setText(resultset.getString(6));
			Weight_Criminal_Label.setText(resultset.getString(7));
			Hair_Criminal_Label.setText(resultset.getString(8)); 
	    	Eyes_Criminal_Label.setText(resultset.getString(9));
	    	ScarMark_Criminal_Label.setText(resultset.getString(10));
		}
    }
    
    private void showVictim_ButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	
    	int CrimeID = Integer.valueOf(ID_Criminal);
    	String query = "SELECT * FROM gebs.victim WHERE (SELECT CrimeID FROM gebs.criminal WHERE CrimeID = '" + CrimeID +"') = ID;";
    	boolean hasNext = false;
    	
    	ResultSet resultset = JDBCOperations.getValuesFromSQL(query);
		while (resultset.next()) {
			
			hasNext = true;
			ID_Criminal_Label.setText(resultset.getString(1));
			Name_Criminal_Label.setText(resultset.getString(2));
			Age_Criminal_Label.setText(resultset.getString(3));	
			Gender_Criminal_Label.setText(resultset.getString(4));  
			Race_Criminal_Label.setText(resultset.getString(5));  
			Height_Criminal_Label.setText(resultset.getString(6));
			Weight_Criminal_Label.setText(resultset.getString(7));
			Hair_Criminal_Label.setText(resultset.getString(8)); 
			Eyes_Criminal_Label.setText(resultset.getString(9));
			ScarMark_Criminal_Label.setText(resultset.getString(10));
			
			// Color blue
			Criminal_Or_Victim_Label.setForeground(new java.awt.Color(51, 51, 255));
	        Criminal_Or_Victim_Label.setText("VICTIM");
		}
		
		if(!hasNext) {
			JOptionPane.showMessageDialog(null, "There is no victim for this criminal.", "Victim",
					JOptionPane.ERROR_MESSAGE);
		}
    }
    
    public void paintComponent (Graphics g) {
    	
    	ImageIcon im = new ImageIcon(getClass().getResource("/src/Show_Criminal_Background.png"));
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
    
    private void Criminal_Statics_ButtonActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

		if (topFrame instanceof ApplicationFrame) {
			ApplicationFrame parent = (ApplicationFrame) topFrame;
			parent.showCriminalStaticsPanel();
		}
    }
    
    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {

		JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

		if (topFrame instanceof ApplicationFrame) {
			ApplicationFrame parent = (ApplicationFrame) topFrame;
			parent.showAllCriminalsPanel();
		}
	}

    // Variables declaration - do not modify    
    public static javax.swing.JLabel Criminal_Or_Victim_Label;
    private javax.swing.JButton Add_Criminal_Button;
    private javax.swing.JButton All_Criminals_Button;
    private javax.swing.JButton Criminal_Statics_Button;
    private javax.swing.JButton Show_Criminal_Button;
    private javax.swing.JButton showVictim_Button;  
    private static javax.swing.JLabel Age_Criminal_Label;
    private static javax.swing.JLabel Eyes_Criminal_Label;
    private static javax.swing.JLabel Gender_Criminal_Label;
    private static javax.swing.JLabel Hair_Criminal_Label;
    private static javax.swing.JLabel Height_Criminal_Label;
    private static javax.swing.JLabel ID_Criminal_Label;
    private javax.swing.JLabel ID_Label;
    private static javax.swing.JLabel Name_Criminal_Label;
    private static javax.swing.JLabel Race_Criminal_Label;
    private static javax.swing.JLabel ScarMark_Criminal_Label;
    private static javax.swing.JLabel Weight_Criminal_Label;
    private static javax.swing.JLabel Age_Label;
    private javax.swing.JButton back_Button;
    private javax.swing.JLabel Eyes_Label;
    private javax.swing.JLabel Gender_Label;
    private javax.swing.JLabel Hair_Label;
    private javax.swing.JLabel Height_Label;
    private javax.swing.JLabel imageText_Label;
    private javax.swing.JLabel Name_Label;
    private javax.swing.JLabel photo_Label;
    private javax.swing.JLabel Race_Label;
    private javax.swing.JLabel scarMark_Label;
    private javax.swing.JLabel Weight_Label;
    // End of variables declaration                   
}
