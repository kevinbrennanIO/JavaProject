/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package electionapplication;

/**
 *
 * @author markk
 */
public class PollGui extends javax.swing.JFrame {

    /**
     * Creates new form PollGui
     */
    public PollGui() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        endUserPnl = new javax.swing.JPanel();
        titleLbl = new javax.swing.JLabel();
        can1Btn = new javax.swing.JRadioButton();
        can2Btn = new javax.swing.JRadioButton();
        can3Btn = new javax.swing.JRadioButton();
        can4Btn = new javax.swing.JRadioButton();
        genderLbl = new javax.swing.JLabel();
        genderCbo = new javax.swing.JComboBox<>();
        voteCbo = new javax.swing.JComboBox<>();
        voteLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        endUserPnl.setPreferredSize(new java.awt.Dimension(500, 550));

        titleLbl.setFont(new java.awt.Font("Bookman Old Style", 3, 48)); // NOI18N
        titleLbl.setText("Election 2018 Exit Poll");

        can1Btn.setBackground(new java.awt.Color(204, 204, 204));
        can1Btn.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        can1Btn.setText("18 - 25");

        can2Btn.setBackground(new java.awt.Color(204, 204, 204));
        can2Btn.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        can2Btn.setText("25 - 40");

        can3Btn.setBackground(new java.awt.Color(204, 204, 204));
        can3Btn.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        can3Btn.setText("40 - 65");

        can4Btn.setBackground(new java.awt.Color(204, 204, 204));
        can4Btn.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        can4Btn.setText("> 65");

        genderLbl.setText("Gender:");

        genderCbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Male", "Female" }));
        genderCbo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderCboActionPerformed(evt);
            }
        });

        voteCbo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        voteCbo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Michael D Higgins", "Peter Casey", "Sean Gallagher", "Joan Freeman", "Gavin Duffy", "Liadh Ni Riada" }));

        voteLbl.setText("Vote:");

        javax.swing.GroupLayout endUserPnlLayout = new javax.swing.GroupLayout(endUserPnl);
        endUserPnl.setLayout(endUserPnlLayout);
        endUserPnlLayout.setHorizontalGroup(
            endUserPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endUserPnlLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(genderLbl)
                .addGap(133, 133, 133)
                .addComponent(genderCbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endUserPnlLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(endUserPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(endUserPnlLayout.createSequentialGroup()
                        .addComponent(can1Btn)
                        .addGap(50, 50, 50)
                        .addComponent(can2Btn)
                        .addGap(50, 50, 50)
                        .addComponent(can3Btn)
                        .addGap(50, 50, 50)
                        .addComponent(can4Btn)
                        .addContainerGap())
                    .addGroup(endUserPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endUserPnlLayout.createSequentialGroup()
                            .addComponent(voteLbl)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(voteCbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(165, 165, 165))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, endUserPnlLayout.createSequentialGroup()
                            .addComponent(titleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 612, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40)))))
        );
        endUserPnlLayout.setVerticalGroup(
            endUserPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(endUserPnlLayout.createSequentialGroup()
                .addComponent(titleLbl)
                .addGap(34, 34, 34)
                .addGroup(endUserPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(voteCbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(voteLbl))
                .addGap(53, 53, 53)
                .addGroup(endUserPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(can1Btn)
                    .addComponent(can2Btn)
                    .addComponent(can3Btn)
                    .addComponent(can4Btn))
                .addGap(79, 79, 79)
                .addGroup(endUserPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(genderLbl)
                    .addComponent(genderCbo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(215, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(endUserPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 705, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(endUserPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void genderCboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderCboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderCboActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PollGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PollGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PollGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PollGui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PollGui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton can1Btn;
    private javax.swing.JRadioButton can2Btn;
    private javax.swing.JRadioButton can3Btn;
    private javax.swing.JRadioButton can4Btn;
    private javax.swing.JPanel endUserPnl;
    private javax.swing.JComboBox<String> genderCbo;
    private javax.swing.JLabel genderLbl;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JComboBox<String> voteCbo;
    private javax.swing.JLabel voteLbl;
    // End of variables declaration//GEN-END:variables

    void visible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}