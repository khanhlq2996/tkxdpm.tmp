/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendbooks.boundary;

/**
 *
 * @author khanh
 */
public class RegisterCardForm extends javax.swing.JFrame {

    /**
     * Creates new form RegisterCardForm
     */
    public RegisterCardForm() {
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

        tf_book_name = new javax.swing.JTextField();
        la_book_name = new javax.swing.JLabel();
        lb_publishing_name = new javax.swing.JLabel();
        tf_publishing_name = new javax.swing.JTextField();
        lb_author_name = new javax.swing.JLabel();
        lb_book_category = new javax.swing.JLabel();
        cb_book_category = new javax.swing.JComboBox<>();
        tf_author_name = new javax.swing.JTextField();
        bt_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_result_search = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tb_list_register = new javax.swing.JTable();
        lb_total_cost = new javax.swing.JLabel();
        tf_total_cost = new javax.swing.JTextField();
        bt_register = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        mb_mainmenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tf_book_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_book_name.setText("Tên sách");
        tf_book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_nameActionPerformed(evt);
            }
        });

        la_book_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        la_book_name.setText("Tên Sách");

        lb_publishing_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_publishing_name.setText("Tên NXB");

        tf_publishing_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_publishing_name.setText("Tên NXB");
        tf_publishing_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_publishing_nameActionPerformed(evt);
            }
        });

        lb_author_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_author_name.setText("Tên Tác giả");

        lb_book_category.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_book_category.setText("Thể loại sách");

        cb_book_category.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cb_book_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thể loại sách" }));
        cb_book_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_book_categoryActionPerformed(evt);
            }
        });

        tf_author_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_author_name.setText("Tên Tác giả");
        tf_author_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_author_nameActionPerformed(evt);
            }
        });

        bt_search.setBackground(new java.awt.Color(0, 51, 255));
        bt_search.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        bt_search.setText("Tìm kiếm");
        bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_searchActionPerformed(evt);
            }
        });

        tb_result_search.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tb_result_search.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sách", "Tên Sách", "Tác giả", "NXB", "Thể loại", "Số bản sao còn lại", "Giá ", "Hành động"
            }
        ));
        tb_result_search.setColumnSelectionAllowed(true);
        jScrollPane1.setViewportView(tb_result_search);

        jLabel1.setText("Danh sách sách tìm kiếm");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        jLabel2.setText("Danh sách đăng ký mượn");

        tb_list_register.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tb_list_register.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sách", "Tên Sách", "Giá ", "Hành động"
            }
        ));
        tb_list_register.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tb_list_register);
        tb_list_register.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);

        lb_total_cost.setText("Tổng tiền đặt cọc");

        tf_total_cost.setText("Tổng tiền");
        tf_total_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_total_costActionPerformed(evt);
            }
        });

        bt_register.setText("Đăng ký Mượn sách");
        bt_register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_registerActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("ĐĂNG KÝ MƯỢN SÁCH");

        jLabel4.setText("Ngày đến mượn");

        jTextField1.setText("Ngày đến mượn");
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        mb_mainmenu.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenu1.setText("Tìm kiếm sách");
        mb_mainmenu.add(jMenu1);

        jMenu2.setText("Edit");
        mb_mainmenu.add(jMenu2);

        setJMenuBar(mb_mainmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bt_register, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 770, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)
                                .addComponent(jScrollPane1)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lb_publishing_name)
                                            .addGap(35, 35, 35)
                                            .addComponent(tf_publishing_name, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(la_book_name)
                                            .addGap(31, 31, 31)
                                            .addComponent(tf_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(47, 47, 47)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(lb_book_category)
                                            .addGap(18, 18, 18)
                                            .addComponent(cb_book_category, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lb_author_name)
                                            .addGap(31, 31, 31)
                                            .addComponent(tf_author_name, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(53, 53, 53)
                                    .addComponent(bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lb_total_cost)
                                        .addComponent(jLabel4))
                                    .addGap(38, 38, 38)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(tf_total_cost)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE))))
                            .addGap(2, 2, 2))))
                .addGap(25, 25, 25))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_author_name)
                            .addComponent(tf_author_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_book_category)
                            .addComponent(cb_book_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_book_name)
                            .addComponent(tf_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_publishing_name)
                            .addComponent(tf_publishing_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_total_cost)
                            .addComponent(tf_total_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(bt_register, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(26, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_book_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_nameActionPerformed

    private void tf_publishing_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_publishing_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_publishing_nameActionPerformed

    private void cb_book_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_book_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_book_categoryActionPerformed

    private void tf_author_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_author_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_author_nameActionPerformed

    private void bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_searchActionPerformed

    private void tf_total_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_total_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_total_costActionPerformed

    private void bt_registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_registerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_registerActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCardForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCardForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_register;
    private javax.swing.JButton bt_search;
    private javax.swing.JComboBox<String> cb_book_category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel la_book_name;
    private javax.swing.JLabel lb_author_name;
    private javax.swing.JLabel lb_book_category;
    private javax.swing.JLabel lb_publishing_name;
    private javax.swing.JLabel lb_total_cost;
    private javax.swing.JMenuBar mb_mainmenu;
    private javax.swing.JTable tb_list_register;
    private javax.swing.JTable tb_result_search;
    private javax.swing.JTextField tf_author_name;
    private javax.swing.JTextField tf_book_name;
    private javax.swing.JTextField tf_publishing_name;
    private javax.swing.JTextField tf_total_cost;
    // End of variables declaration//GEN-END:variables
}
