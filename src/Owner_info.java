
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Adarsh Maurya
 */
public class Owner_info extends javax.swing.JFrame {

    /**
     * Creates new form Owner_info
     */DefaultTableModel model;
     establishconnection ob=new establishconnection();
     int editmode=0;
    public Owner_info() {
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

        jButton5 = new javax.swing.JButton();
        btnback = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnsearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtownername = new javax.swing.JTextField();
        btnadd = new javax.swing.JButton();
        txtname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtcontact = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtaddress = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnsave = new javax.swing.JButton();
        btnedit = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnconfirm = new javax.swing.JButton();

        jButton5.setText("jButton5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1500, 800));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(null);

        btnback.setText("Back");
        btnback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbackActionPerformed(evt);
            }
        });
        getContentPane().add(btnback);
        btnback.setBounds(44, 24, 59, 25);

        jScrollPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jScrollPane1MouseClicked(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name_ID", "Owner_Name", "Contact", "Address"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
        }
        jTable1.setRowSelectionAllowed(true);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(305, 135, 661, 414);

        btnsearch.setText("Search");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });
        getContentPane().add(btnsearch);
        btnsearch.setBounds(870, 53, 73, 25);

        jLabel1.setText("Owner Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(512, 50, 107, 30);
        getContentPane().add(txtownername);
        txtownername.setBounds(637, 50, 215, 30);

        btnadd.setText("Add New");
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        getContentPane().add(btnadd);
        btnadd.setBounds(30, 161, 134, 33);
        getContentPane().add(txtname);
        txtname.setBounds(61, 682, 147, 48);

        jLabel2.setText("Contact(10 digits)");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(246, 616, 147, 48);
        getContentPane().add(txtcontact);
        txtcontact.setBounds(246, 682, 147, 48);

        jLabel3.setText("Owner Name");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(61, 616, 147, 48);
        getContentPane().add(txtaddress);
        txtaddress.setBounds(426, 682, 147, 48);

        jLabel5.setText("Address");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(426, 616, 147, 48);

        btnsave.setText("Save");
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        getContentPane().add(btnsave);
        btnsave.setBounds(650, 680, 102, 48);

        btnedit.setText("Edit");
        btnedit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btneditActionPerformed(evt);
            }
        });
        getContentPane().add(btnedit);
        btnedit.setBounds(30, 229, 134, 33);

        btndelete.setText("Delete");
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btndelete);
        btndelete.setBounds(30, 290, 134, 33);

        btnconfirm.setText("Confirm");
        btnconfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmActionPerformed(evt);
            }
        });
        getContentPane().add(btnconfirm);
        btnconfirm.setBounds(650, 620, 100, 50);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbackActionPerformed
        new Browse().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnbackActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        setdisable();
         
           String code="select * from owner;";
           ob.execute(code);
          model =(DefaultTableModel)jTable1.getModel();
          model.setRowCount(0);
           String[] s=new String[4];
           try{
               while(ob.rs.next()){
                   s[0]=ob.rs.getString(1);
                   s[1]=ob.rs.getString(2);
                   s[2]=ob.rs.getString(3);
                   s[3]=ob.rs.getString(4);
                   model.addRow(s);
               }
           }
           catch(Exception e){
               System.out.println("error in getting data");
           }
    }//GEN-LAST:event_formWindowActivated

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // TODO add your handling code here:
       setenable();
    }//GEN-LAST:event_btnaddActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        // TODO add your handling code here:
        String name=txtname.getText();
        String Contact=txtcontact.getText();
        String address=txtaddress.getText();
        
        if(name.length()==0||name.charAt(0)==' '){
            JOptionPane.showMessageDialog(this,"Please Enter correct details");
        }
        else{
            String code="select * from owner where Owner_name='"+name+"';";
           ob.execute(code);
           try{
           if(ob.rs.next()){
               JOptionPane.showMessageDialog(this,"Entry with this Owner Name already exits");
           }
           else{
               String sql="insert into owner(Owner_Name,Contact_No,Address) values('"+name+"','"+Contact+"','"+address+"');";
              int flag=ob.update(sql);
        
        if(flag==1){
            JOptionPane.showMessageDialog(null,"added successfully");
            new Owner_info().setVisible(true);
            this.dispose();
         }
        else if(flag==0)
                JOptionPane.showMessageDialog(null,"addition failed");
           }
           }
           catch(Exception e){
               System.out.println(e);
           }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void jScrollPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jScrollPane1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jScrollPane1MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
       
        
    }//GEN-LAST:event_jTable1MouseClicked
    int id=-1;
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        // TODO add your handling code here:
        
       this.editmode=0;
         int row = jTable1.getSelectedRow();
        int column = jTable1.getSelectedColumn();
        if(row==-1||column==-1){
            JOptionPane.showMessageDialog(this,"Please select a cell in row which u want to delete.");
        }
        else{
            clearfield();
            setenable();
             btnsave.setEnabled(false);
                btnconfirm.setEnabled(true);
            txtname.setText((String)jTable1.getValueAt(row, 1));
             txtcontact.setText((String)jTable1.getValueAt(row, 2));
              txtaddress.setText((String)jTable1.getValueAt(row, 3));
              id=Integer.parseInt((String)jTable1.getValueAt(row,0));
        }
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnconfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmActionPerformed
        // TODO add your handling code here:
        if(this.editmode==0){
        if(id!=-1){
            String sql="Delete from owner where Name_ID="+id+";";
             int flag=ob.update(sql);
        
        if(flag==1){
            JOptionPane.showMessageDialog(null,"Deleted successfully");
            new Owner_info().setVisible(true);
            this.dispose();
         }
        else if(flag==0)
                JOptionPane.showMessageDialog(null,"Deletion failed");
        btnconfirm.setEnabled(false);
        id=-1;
        }
        }
        else if(editmode==1){
            String name=txtname.getText();
        String Contact=txtcontact.getText();
        String address=txtaddress.getText();
        
        if(name.length()==0||name.charAt(0)==' '){
            JOptionPane.showMessageDialog(this,"Please Enter correct details");
        }
        else {
               String sql="Update owner set Owner_Name='"+name+"',Contact_No='"+Contact+"',Address='"+address+"' where Name_ID="+id+";";
              int flag=ob.update(sql);
        
        if(flag==1){
            JOptionPane.showMessageDialog(null,"Updated successfully");
            new Owner_info().setVisible(true);
            this.dispose();
         }
        else if(flag==0)
                JOptionPane.showMessageDialog(null,"Updation failed");
           }

        }
            
    }//GEN-LAST:event_btnconfirmActionPerformed

    private void btneditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btneditActionPerformed
        // TODO add your handling code here:
        this.editmode=1;
        txtname.setText("");
       txtcontact.setText("");
       txtaddress.setText("");
       int row = jTable1.getSelectedRow();
        int column = jTable1.getSelectedColumn();
        if(row==-1||column==-1){
            JOptionPane.showMessageDialog(this,"Please select a cell in row which u want to delete.");
        }
        else{
               txtname.setText("");
                txtcontact.setText("");
                txtaddress.setText("");
            setenable();
             btnsave.setEnabled(false);
                btnconfirm.setEnabled(true);
            txtname.setText((String)jTable1.getValueAt(row, 1));
             txtcontact.setText((String)jTable1.getValueAt(row, 2));
              txtaddress.setText((String)jTable1.getValueAt(row, 3));
              id=Integer.parseInt((String)jTable1.getValueAt(row,0));
              
        }
    }//GEN-LAST:event_btneditActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        // TODO add your handling code here:
        String str=txtownername.getText();
        if(str.length()==0){
            JOptionPane.showMessageDialog(this, "Please provide owner name");
        }
        else{
         String code="select * from owner where Owner_Name='"+str+"';";
           ob.execute(code);
          model =(DefaultTableModel)jTable1.getModel();
          model.setRowCount(0);
           String[] s=new String[4];
           try{
               while(ob.rs.next()){
                   s[0]=ob.rs.getString(1);
                   s[1]=ob.rs.getString(2);
                   s[2]=ob.rs.getString(3);
                   s[3]=ob.rs.getString(4);
                   model.addRow(s);
               }
           }
           catch(Exception e){
               System.out.println("error in getting data");
           }
           
        }
    }//GEN-LAST:event_btnsearchActionPerformed
    void setdisable(){
        btnsave.setEnabled(false);
        txtname.setEnabled(false);
        txtcontact.setEnabled(false);
        txtaddress.setEnabled(false);
        btnconfirm.setEnabled(false);
    }
    void setenable(){
          btnsave.setEnabled(true);
        txtname.setEnabled(true);
        txtcontact.setEnabled(true);
        txtaddress.setEnabled(true); 
    }
    void clearfield(){
        txtname.setText("");
       txtcontact.setText("");
       txtaddress.setText("");
       txtname.setEditable(false);
       txtcontact.setEditable(false);
       txtaddress.setEditable(false);
    }
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
            java.util.logging.Logger.getLogger(Owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Owner_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnback;
    private javax.swing.JButton btnconfirm;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnedit;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtaddress;
    private javax.swing.JTextField txtcontact;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtownername;
    // End of variables declaration//GEN-END:variables
}
