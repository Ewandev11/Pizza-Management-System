package Pizza;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;

public class pizza extends javax.swing.JFrame {
    {
       initComponents();
    }
    
    DefaultTableModel model;
    String item;
    int price;
    
    Connection con;
    PreparedStatement pst;
    PreparedStatement pst1;
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblsmall = new javax.swing.JRadioButton();
        lblmed = new javax.swing.JRadioButton();
        lbllarge = new javax.swing.JRadioButton();
        lblexlarge = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txt_qty = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        txt_payment = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txt_balance = new javax.swing.JTextField();
        btn_add = new javax.swing.JButton();
        btn_invoice = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_total = new javax.swing.JTextField();
        btn_remove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 0));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Pizza Ordering System");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblsmall.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblsmall.setText("Small");

        lblmed.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblmed.setText("Medium");
        lblmed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblmedActionPerformed(evt);
            }
        });

        lbllarge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbllarge.setText("Large");

        lblexlarge.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblexlarge.setText("Extra Large");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblsmall, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbllarge, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblexlarge, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblmed, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblsmall)
                .addGap(28, 28, 28)
                .addComponent(lblmed)
                .addGap(31, 31, 31)
                .addComponent(lbllarge)
                .addGap(26, 26, 26)
                .addComponent(lblexlarge)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        jTable1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item", "Price", "Qty", "Total"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Qty");

        txt_qty.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Payment");

        txt_payment.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Balance");

        txt_balance.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        btn_add.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_add.setText("Add");
        btn_add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_addActionPerformed(evt);
            }
        });

        btn_invoice.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_invoice.setText("Print Invoice");
        btn_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_invoiceActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Total");

        btn_remove.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btn_remove.setText("Remove");
        btn_remove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_removeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btn_add, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 413, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(btn_invoice)
                        .addGap(33, 33, 33)
                        .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txt_payment, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_balance)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt_total))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txt_qty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(txt_total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txt_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(23, 23, 23)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_add)
                    .addComponent(btn_invoice)
                    .addComponent(txt_balance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_remove, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 61, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblmedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblmedActionPerformed
      
    }//GEN-LAST:event_lblmedActionPerformed

    private void btn_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_invoiceActionPerformed
       int tot = Integer.parseInt(txt_total.getText());
       int pay = Integer.parseInt(txt_payment.getText());
    
       int bal = pay - tot;
    
       txt_balance.setText(String.valueOf(bal));
    
       sales();
    }//GEN-LAST:event_btn_invoiceActionPerformed

    private void btn_addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_addActionPerformed
       
        if (lblsmall.isSelected()) {
        item = "Small";
        price = 500;
    } else if (lblmed.isSelected()) {
        item = "Medium";
        price = 800;
    } else if (lbllarge.isSelected()) {
        item = "Large";
        price = 1500;
    } else if (lblexlarge.isSelected()) {
        item = "Extra Large";
        price = 2500;
    }
    
    int qty = Integer.parseInt(txt_qty.getValue().toString());
    int tot = qty * price;
    
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.addRow(new Object[] { item, price, qty, tot });
    
    int sum = 0;
    for (int a = 0; a < jTable1.getRowCount(); a++) {
        sum += Integer.parseInt(jTable1.getValueAt(a, 3).toString());
    }
    
        txt_total.setText(Integer.toString(sum));
    }//GEN-LAST:event_btn_addActionPerformed

    public void sales(){
        int lastid = 0;

        try{
        Class.forName("com.mysql.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pizza", "root", "");

        String total = txt_total.getText();
        String bal = txt_balance.getText();
        String pay = txt_payment.getText();

        String query = "insert into sales(subtotal, pay, bal) values(?, ?, ?)";
        PreparedStatement pst = con.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
        pst.setString(1, total);
        pst.setString(2, bal);
        pst.setString(3, pay);

        pst.executeUpdate();

        ResultSet rs = pst.getGeneratedKeys();
         if (rs.next()) {
         lastid = rs.getInt(1);
         }
         int row = jTable1.getRowCount();
         String query1 = "INSERT INTO sales_product (sales_id, prodname, price, quantity, total) VALUES (?, ?, ?, ?, ?)";
         PreparedStatement pst1 = con.prepareStatement(query1);
         String prodname;
         int price;
         int qty;
         int tot = 0;
         
         for (int i = 0; i < jTable1.getRowCount(); i++) {
         prodname = (String) jTable1.getValueAt(i, 0);
         price = (int) jTable1.getValueAt(i, 1);
         qty = (int) jTable1.getValueAt(i, 2);
         tot = (int) jTable1.getValueAt(i, 3);

         pst1.setInt(1, lastid);
         pst1.setString(2, prodname);
         pst1.setInt(3, price);
         pst1.setInt(4, qty);
         pst1.setInt(5, tot);
         pst1.executeUpdate();
        }
      JOptionPane.showMessageDialog(this, "Sales Completed!. ");
        
      } catch (ClassNotFoundException ex) {
        Logger.getLogger(pizza.class.getName()).log(Level.SEVERE, null, ex);
      } catch (SQLException ex) {
       Logger.getLogger(pizza.class.getName()).log(Level.SEVERE, null, ex);
}
    }
    
    private void btn_removeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_removeActionPerformed
       // Ensure this method is called within the event dispatch thread
    SwingUtilities.invokeLater(new Runnable() {
      public void run() {
          int selectedRow = jTable1.getSelectedRow();
          if (selectedRow != -1) {
            
            ((DefaultTableModel) jTable1.getModel()).fireTableRowsDeleted(selectedRow, selectedRow);
            
            ((DefaultTableModel) jTable1.getModel()).removeRow(selectedRow);

            int sum = 0;
            for (int a = 0; a < jTable1.getRowCount(); a++) {
                try {
                    sum += Integer.parseInt(jTable1.getValueAt(a, 3).toString());
                } catch (NumberFormatException e) {
                    // Handle the exception if the value is not an integer
                    JOptionPane.showMessageDialog(null, "Error in table data format.");
                }
            }
            txt_total.setText(Integer.toString(sum));
            
            // Notify the model that the update is complete
            ((DefaultTableModel) jTable1.getModel()).fireTableDataChanged();
        } else {
            // No row is selected
            JOptionPane.showMessageDialog(null, "Please select a row to remove.");
        }
    }
    } );

    }//GEN-LAST:event_btn_removeActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pizza().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_add;
    private javax.swing.JButton btn_invoice;
    private javax.swing.JButton btn_remove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JRadioButton lblexlarge;
    private javax.swing.JRadioButton lbllarge;
    private javax.swing.JRadioButton lblmed;
    private javax.swing.JRadioButton lblsmall;
    private javax.swing.JTextField txt_balance;
    private javax.swing.JTextField txt_payment;
    private javax.swing.JSpinner txt_qty;
    private javax.swing.JTextField txt_total;
    // End of variables declaration//GEN-END:variables
}
