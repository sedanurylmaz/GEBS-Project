package panels;

import main.MyContainer;

public class ApplicationFrame extends javax.swing.JFrame {

	MyContainer myParent;

    public ApplicationFrame(MyContainer param) {
    	myParent = param;
        initComponents();
        showLogInPanel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("sansserif", 3, 24)); // NOI18N
        jLabel1.setText("Project");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(342, 342, 342)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 326, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(532, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(664, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>    
    
    void showCriminalPanel() {
    	setContentPane(myParent.showCriminalPanel);
		revalidate();
    }
    
    void showLogInPanel() {
        setContentPane(myParent.logInPanel);
        revalidate();
    }
    
    void showAllCriminalsPanel() {
    	setContentPane(myParent.allCriminalsPanel);
        revalidate();
    }
    
    void showAddCriminalPanel() {
    	setContentPane(myParent.addCriminalPanel);
        revalidate();
    }
    
    void showCriminalStaticsPanel() {
    	setContentPane(myParent.criminalStatisticsPanel);
        revalidate();
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    // End of variables declaration                   
}
