/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package evhotel21;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author 63997
 */
public class First extends javax.swing.JFrame {

    /**
     * Creates new form First
     */
    public First() {
        initComponents();
        fetch();
        load();
    }
    
    private void load(){
       String databaseURL = "jdbc:derby://localhost:1527/C:/derby/hoteldb";
        Connection con;  
        try {
            con = DriverManager.getConnection(databaseURL);
            PreparedStatement pst = con.prepareStatement("Select RESERVATION_ID From RESERVATION ");
            ResultSet rs = pst.executeQuery();
            RID.removeAllItems();
            while(rs.next()){
                RID.addItem(rs.getString(1));
                }    
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
    
    
    
    
    
private void fetch(){
   String databaseURL = "jdbc:derby://localhost:1527/C:/derby/hoteldb"; 
        
        try {
            
        
            Connection con = DriverManager.getConnection(databaseURL);
           PreparedStatement pst =con.prepareStatement("Select * from RESERVATION");
             ResultSet rs =pst.executeQuery();
             
              DefaultTableModel df = (DefaultTableModel)jTable1.getModel();
              df.setRowCount(0);
             while(rs.next()){
                 df.addRow(new String[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8),rs.getString(9)});
             }
        }catch(SQLException e){
                System.out.println(e);
             }

}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        RID = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 6, -1, -1));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Reservation_ID", "GUEST_NAME", "CHECK_IN_DATE", "CHECK_OUT_DATE", "TOTAL_GUEST ", "PRICE", "TOTAL_NIGHTS", "ROOM_TYPE", "HOTEL_ID"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 530));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 0, 960, 530));

        jPanel2.setBackground(new java.awt.Color(0, 204, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setText("HOTEL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, 190, 40));

        jButton2.setText("CHECK IN");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 190, 40));

        jButton3.setText("CHECK OUT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 190, 40));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("EV HOTEL FINDER");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jButton4.setText("EXIT");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 190, 40));

        RID.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jPanel2.add(RID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 210, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 0));
        jLabel2.setText("|");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 0, -1, 80));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 0));
        jLabel3.setText("|");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, -1, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 51));
        jLabel4.setText("|");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, 60));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 0));
        jLabel5.setText("|");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 1, -1, 80));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("|");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, -1, 60));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 60)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 0));
        jLabel7.setText("|");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 41, -1, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 0, 0));
        jLabel8.setText("O");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 60, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 0));
        jLabel9.setText("O");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 410, -1, -1));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 80)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 255, 0));
        jLabel10.setText("O");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 60, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 280, 530));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Hotel info =new Hotel();
        info.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        Reservation info=new Reservation();
        info.show();
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        EnterPage info=new EnterPage();
        info.show();
        dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        String url = "jdbc:derby://localhost:1527/C:/derby/hoteldb";  
        String sql = "Delete from RESERVATION where RESERVATION_ID = ?";
        
          try {
            Connection con = DriverManager.getConnection(url);
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, (String)RID.getSelectedItem());
 

            int q = ps.executeUpdate();

            if (q==1){
                JOptionPane.showMessageDialog(null, "CHECK OUT");
                RID.setSelectedItem(0);
                fetch();


            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
        }
      

    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(First.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new First().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> RID;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
