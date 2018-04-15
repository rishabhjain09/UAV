/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EnvironmentAdminWorkArea;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Administrator
 */
public class EnvironmentManageEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageEmployeeJPanel
     */
    private JPanel container;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem business;

    public EnvironmentManageEmployeeJPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem business) {
         initComponents();
        this.container = container;
        this.account =account;
        this.organization = organization;
        this.enterprise = enterprise;
        this.business = business;
        populateComboType();
        populateComboTypeTable();
    }

     private void populateComboType(){
        comboType.removeAllItems();
        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                comboType.addItem(organization);
        }
    }
     private void populateComboTypeTable(){
        comboOrganization.removeAllItems();
        for (Organization organziation : enterprise.getOrganizationDirectory().getOrganizationList()){
                comboOrganization.addItem(organziation);
        }
    }
     
    private void populateTable(Organization organization){
        DefaultTableModel model = (DefaultTableModel) tblEmployee.getModel();
        
        model.setRowCount(0);
        
        for (Employee employee : organization.getEmployeeDirectory().getEmployeeList()){
            Object[] row = new Object[3];
            row[0] = employee.getId();
            row[1] = employee;
            row[2]=employee.getJoinDate();
            model.addRow(row);
        }
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
        comboOrganization = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEmployee = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        comboType = new javax.swing.JComboBox();
        btnAddEmpolyee = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtEmployeeName = new javax.swing.JTextField();
        dateChooserCombo2 = new datechooser.beans.DateChooserCombo();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Organization:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        comboOrganization.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        comboOrganization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboOrganizationActionPerformed(evt);
            }
        });
        add(comboOrganization, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 110, 160, -1));

        tblEmployee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        tblEmployee.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Join Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblEmployee);
        if (tblEmployee.getColumnModel().getColumnCount() > 0) {
            tblEmployee.getColumnModel().getColumn(0).setResizable(false);
            tblEmployee.getColumnModel().getColumn(1).setResizable(false);
            tblEmployee.getColumnModel().getColumn(2).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, 510, 130));

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel2.setText("Organization Type:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        comboType.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(comboType, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 180, -1));

        btnAddEmpolyee.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnAddEmpolyee.setText("Add Employee");
        btnAddEmpolyee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmpolyeeActionPerformed(evt);
            }
        });
        add(btnAddEmpolyee, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 440, -1, -1));

        btnBack.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        btnBack.setText("<<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 630, -1, -1));

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel3.setText("Employee Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, -1, -1));

        txtEmployeeName.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        add(txtEmployeeName, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 350, 180, -1));

        dateChooserCombo2.setCurrentView(new datechooser.view.appearance.AppearancesList("Grey",
            new datechooser.view.appearance.ViewAppearance("custom",
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    true,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 255),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(128, 128, 128),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(0, 0, 255),
                    false,
                    true,
                    new datechooser.view.appearance.swing.LabelPainter()),
                new datechooser.view.appearance.swing.SwingCellAppearance(new java.awt.Font("Lucida Grande", java.awt.Font.PLAIN, 13),
                    new java.awt.Color(0, 0, 0),
                    new java.awt.Color(255, 0, 0),
                    false,
                    false,
                    new datechooser.view.appearance.swing.ButtonPainter()),
                (datechooser.view.BackRenderer)null,
                false,
                true)));
    add(dateChooserCombo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 390, 180, -1));

    jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
    jLabel4.setText("Join Date:");
    add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 390, -1, -1));

    jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pic/background2.png"))); // NOI18N
    jLabel5.setText("jLabel5");
    add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 700));

    jLabel6.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
    jLabel6.setText("Manage Employee");
    add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddEmpolyeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmpolyeeActionPerformed
        // TODO add your handling code here:
        String name = txtEmployeeName.getText();
        String join1 = dateChooserCombo2.getText();
        if((name != null)&&!(name.isEmpty()))
        {
            Pattern pattern = Pattern.compile("[^A-Za-z]");
            Matcher m = pattern.matcher(name);
            boolean boo = m.find();
            if(boo == true || name == null) {
                JOptionPane.showMessageDialog(null,"Enter Valid Details");
            }
            else{            
                Date joindate = new Date();
                try {
                     joindate =new SimpleDateFormat("MM/dd/yyyy").parse(join1);
                     System.out.println("DATE"+joindate);
                } catch (ParseException ex) {
                    JOptionPane.showMessageDialog(null, "Please enter a valid date");
                }
                Organization organization1 = (Organization) comboType.getSelectedItem();
                organization1.getEmployeeDirectory().createEmployee(name,joindate);
                populateTable(organization1);
            }
        }
        else {
            JOptionPane.showMessageDialog(null,"Enter Valid Details");
        }
    }//GEN-LAST:event_btnAddEmpolyeeActionPerformed

    private void comboOrganizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboOrganizationActionPerformed
        // TODO add your handling code here:
         Organization organization1 = (Organization) comboOrganization.getSelectedItem();
        if (organization1 != null){
            populateTable(organization1);
        }
    }//GEN-LAST:event_comboOrganizationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddEmpolyee;
    private javax.swing.JButton btnBack;
    private javax.swing.JComboBox comboOrganization;
    private javax.swing.JComboBox comboType;
    private datechooser.beans.DateChooserCombo dateChooserCombo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblEmployee;
    private javax.swing.JTextField txtEmployeeName;
    // End of variables declaration//GEN-END:variables
}
