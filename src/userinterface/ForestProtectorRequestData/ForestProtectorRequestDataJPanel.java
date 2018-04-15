/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.ForestProtectorRequestData;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ForestProtectorRequestDataOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author rishabhjain
 */
public class ForestProtectorRequestDataJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ForestProtectorRequestDataJPanel
     */
    private JPanel container;
    private UserAccount account;
    private ForestProtectorRequestDataOrganization organization;
    private Enterprise enterprise;
    private EcoSystem business;

    public ForestProtectorRequestDataJPanel(JPanel userProcessContainer, UserAccount account, ForestProtectorRequestDataOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.container = userProcessContainer;
        this.account =account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnRequestData = new javax.swing.JButton();
        btnAnalyzeData = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel1.setText("Forest Protector Request Data");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        btnRequestData.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnRequestData.setText("RequestData");
        btnRequestData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestDataActionPerformed(evt);
            }
        });
        add(btnRequestData, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 210, 260, -1));

        btnAnalyzeData.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAnalyzeData.setText("Analyze Data");
        btnAnalyzeData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnalyzeDataActionPerformed(evt);
            }
        });
        add(btnAnalyzeData, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 290, 260, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestDataActionPerformed
        // TODO add your handling code here:
        ForestWillRequestDataJPanel mirjp = new ForestWillRequestDataJPanel(container,account,organization,enterprise,business);
        container.add("ForestWillRequestDataJPanel", mirjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnRequestDataActionPerformed

    private void btnAnalyzeDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnalyzeDataActionPerformed
        // TODO add your handling code here:
        AnalyzeDataJPanel mirjp = new AnalyzeDataJPanel(container,account,organization,enterprise,business);
        container.add("AnalyzeDataJPanel", mirjp);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_btnAnalyzeDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnalyzeData;
    private javax.swing.JButton btnRequestData;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
