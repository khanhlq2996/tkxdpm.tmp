/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package books.boundary;

/**
 *
 * @author khanh
 */
public class CreateBookForm extends javax.swing.JFrame {

    /**
     * Creates new form CreateBookForm
     */
    public CreateBookForm() {
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

        lb_create_book = new javax.swing.JLabel();
        la_book_name = new javax.swing.JLabel();
        tf_book_name = new javax.swing.JTextField();
        lb_publishing_name = new javax.swing.JLabel();
        tf_publishing_name = new javax.swing.JTextField();
        lb_book_category = new javax.swing.JLabel();
        lb_author_name = new javax.swing.JLabel();
        tf_author_name = new javax.swing.JTextField();
        cb_book_category = new javax.swing.JComboBox<>();
        tf_book_created = new javax.swing.JTextField();
        lb_book_created = new javax.swing.JLabel();
        lb_librarian_name = new javax.swing.JLabel();
        la_book_cost = new javax.swing.JLabel();
        tf_book_cost = new javax.swing.JTextField();
        cb_librarian_name = new javax.swing.JComboBox<>();
        bt_add_book = new javax.swing.JButton();
        mb_mainmenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_create_book.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        lb_create_book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_create_book.setText("THÊM SÁCH");

        la_book_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        la_book_name.setText("Tên Sách");

        tf_book_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_book_name.setText("Tên sách");
        tf_book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_nameActionPerformed(evt);
            }
        });

        lb_publishing_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_publishing_name.setText("Tên NXB");

        tf_publishing_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_publishing_name.setText("Tên NXB");
        tf_publishing_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_publishing_nameActionPerformed(evt);
            }
        });

        lb_book_category.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_book_category.setText("Thể loại sách");

        lb_author_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_author_name.setText("Tên Tác giả");

        tf_author_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_author_name.setText("Tên Tác giả");
        tf_author_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_author_nameActionPerformed(evt);
            }
        });

        cb_book_category.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cb_book_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thể loại sách" }));
        cb_book_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_book_categoryActionPerformed(evt);
            }
        });

        tf_book_created.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_book_created.setText("Ngày thêm");
        tf_book_created.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_createdActionPerformed(evt);
            }
        });

        lb_book_created.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_book_created.setText("Ngày thêm");

        lb_librarian_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_librarian_name.setText("Thủ thư thêm sách");

        la_book_cost.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        la_book_cost.setText("Giá");

        tf_book_cost.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_book_cost.setText("Giá");
        tf_book_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_costActionPerformed(evt);
            }
        });

        cb_librarian_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cb_librarian_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thể loại sách" }));
        cb_librarian_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_librarian_nameActionPerformed(evt);
            }
        });

        bt_add_book.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        bt_add_book.setText("Thêm sách");
        bt_add_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_add_bookActionPerformed(evt);
            }
        });

        jMenu1.setText("Tìm kiếm sách");
        mb_mainmenu.add(jMenu1);

        jMenu2.setText("Edit");
        mb_mainmenu.add(jMenu2);

        setJMenuBar(mb_mainmenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(la_book_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_publishing_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_author_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_book_category, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(tf_book_name)
                            .addComponent(tf_author_name, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                            .addComponent(tf_publishing_name)
                            .addComponent(cb_book_category, 0, 1, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(la_book_cost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_book_created, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lb_librarian_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tf_book_created, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(cb_librarian_name, 0, 183, Short.MAX_VALUE)
                                    .addComponent(tf_book_cost)))
                            .addComponent(bt_add_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_create_book, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_create_book)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(la_book_name)
                    .addComponent(tf_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tf_book_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(la_book_cost))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_author_name)
                            .addComponent(tf_author_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_publishing_name)
                            .addComponent(tf_publishing_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_book_category)
                            .addComponent(cb_book_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_librarian_name)
                            .addComponent(cb_librarian_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_book_created)
                            .addComponent(tf_book_created, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bt_add_book, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_book_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_nameActionPerformed

    private void tf_publishing_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_publishing_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_publishing_nameActionPerformed

    private void tf_author_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_author_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_author_nameActionPerformed

    private void cb_book_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_book_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_book_categoryActionPerformed

    private void tf_book_createdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_createdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_createdActionPerformed

    private void tf_book_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_costActionPerformed

    private void cb_librarian_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_librarian_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_librarian_nameActionPerformed

    private void bt_add_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_add_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_add_bookActionPerformed

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
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateBookForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateBookForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_add_book;
    private javax.swing.JComboBox<String> cb_book_category;
    private javax.swing.JComboBox<String> cb_librarian_name;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel la_book_cost;
    private javax.swing.JLabel la_book_name;
    private javax.swing.JLabel lb_author_name;
    private javax.swing.JLabel lb_book_category;
    private javax.swing.JLabel lb_book_created;
    private javax.swing.JLabel lb_create_book;
    private javax.swing.JLabel lb_librarian_name;
    private javax.swing.JLabel lb_publishing_name;
    private javax.swing.JMenuBar mb_mainmenu;
    private javax.swing.JTextField tf_author_name;
    private javax.swing.JTextField tf_book_cost;
    private javax.swing.JTextField tf_book_created;
    private javax.swing.JTextField tf_book_name;
    private javax.swing.JTextField tf_publishing_name;
    // End of variables declaration//GEN-END:variables
}
