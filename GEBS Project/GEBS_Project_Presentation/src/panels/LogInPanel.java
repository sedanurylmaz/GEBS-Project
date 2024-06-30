package panels;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

import main.JDBCOperations;
import main.MyContainer;

public class LogInPanel extends javax.swing.JPanel {

	static boolean admin = false;
	MyContainer myParent;

    public LogInPanel(MyContainer param) {
    	myParent = param; 
        initComponents();
    }                         
    private void initComponents() {

        GEBS_Label = new javax.swing.JLabel();
        CMS_Label = new javax.swing.JLabel();
        userName_Label = new javax.swing.JLabel();
        password_Label = new javax.swing.JLabel();
        logIn_Button = new javax.swing.JButton();
        userName_TextField = new javax.swing.JTextField();
        password_TextField = new javax.swing.JPasswordField();
        
        arrange_label = new javax.swing.JLabel();
        arrange_label_bot = new javax.swing.JLabel();

        GEBS_Label.setFont(new java.awt.Font("Berlin Sans FB", 1, 36)); // NOI18N
        GEBS_Label.setForeground(new java.awt.Color(255, 255, 255));
        GEBS_Label.setText("GEBS");

        CMS_Label.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        CMS_Label.setForeground(new java.awt.Color(255, 255, 255));
        CMS_Label.setText("Criminal Management System");

        userName_Label.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        userName_Label.setForeground(new java.awt.Color(255, 255, 255));
        userName_Label.setText("User Name");

        password_Label.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        password_Label.setForeground(new java.awt.Color(255, 255, 255));
        password_Label.setText("Password");

        logIn_Button.setBackground(new java.awt.Color(101, 101, 101));
        logIn_Button.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        logIn_Button.setText("Log In");
        logIn_Button.setForeground(new java.awt.Color(255, 255, 255));
        
		logIn_Button.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				try {
					logInButtonActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		});
        
        // Background Color: 88,88,88
        userName_TextField.setBackground(new java.awt.Color(101, 101, 101));
        userName_TextField.setForeground(Color.WHITE);
        password_TextField.setBackground(new java.awt.Color(101, 101, 101));
        password_TextField.setForeground(Color.WHITE);
        
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(CMS_Label)
                        .addGap(406, 406, 406))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(GEBS_Label)
                        .addGap(545, 545, 545))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(558, 558, 558)
                        .addComponent(userName_Label)
                        .addGap(115, 115, 115)
                        .addComponent(arrange_label))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(password_Label)
                        .addGap(122, 122, 122)
                        .addComponent(arrange_label_bot)))
                .addGap(0, 404, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(userName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(476, 476, 476))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(logIn_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(530, 530, 530))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(GEBS_Label)
                .addGap(18, 18, 18)
                .addComponent(CMS_Label)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userName_Label)
                    .addComponent(arrange_label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userName_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(password_Label)
                    .addComponent(arrange_label_bot))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(password_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(logIn_Button)
                .addContainerGap(234, Short.MAX_VALUE))
        );
    }// </editor-fold>  
    
    public void paintComponent (Graphics g) {
    	
    	ImageIcon im = new ImageIcon(getClass().getResource("/src/GEBS_logIn_background.png"));
    	Image i = im.getImage();
    	
    	g.drawImage(i, 0, 0, this.getSize().width,this.getSize().height,null);
    } 
    
    private void logInButtonActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {
    	
    	String inputUserName = userName_TextField.getText();
		char pf[] = password_TextField.getPassword();
		String inputPassword = new String(pf);

		String getNameFromSQL = "SELECT Name FROM gebs.users WHERE Name = '"+ inputUserName + "';";
		String SQLName = JDBCOperations.getOneValue(getNameFromSQL);
				
		if(SQLName!= null && SQLName.equals(inputUserName)){
			
			String getPassword = "Select Password FROM gebs.users WHERE Name = '" + SQLName + "';";
			String SQLUserPassword = JDBCOperations.getOneValue(getPassword);
			
			if (SQLUserPassword != null && SQLUserPassword.equals(inputPassword)) {
				
				//Check For Admin
				String SQLAdmin = "SELECT IsAdmin FROM gebs.users WHERE Name = '"+ SQLName +"';";
				String isAdmin = JDBCOperations.getOneValue(SQLAdmin);
				if(isAdmin.equals("1")) {
					admin = true;
				}
				
				JFrame topFrame = (JFrame) SwingUtilities.getWindowAncestor(this);

				if (topFrame instanceof ApplicationFrame) {
					
					ApplicationFrame parent = (ApplicationFrame) topFrame;
					parent.showAllCriminalsPanel();
					
				}
			} else {
				JOptionPane.showMessageDialog(null, "Password is incorrect!", "LogIn",
						JOptionPane.INFORMATION_MESSAGE);
			}
				
			}
		else {
			JOptionPane.showMessageDialog(null, "User name is incorrect!", "LogIn",
					JOptionPane.INFORMATION_MESSAGE);
		}
    }

    // Variables declaration - do not modify   
    private javax.swing.JLabel arrange_label;
    private javax.swing.JLabel arrange_label_bot;
    private javax.swing.JLabel CMS_Label;
    private javax.swing.JLabel GEBS_Label;
    private javax.swing.JButton logIn_Button;
    private javax.swing.JLabel password_Label;
    private javax.swing.JPasswordField password_TextField;
    private javax.swing.JLabel userName_Label;
    private javax.swing.JTextField userName_TextField;
    // End of variables declaration                   
}
