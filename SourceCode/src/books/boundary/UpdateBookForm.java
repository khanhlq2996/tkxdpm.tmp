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
public class UpdateBookForm extends javax.swing.JFrame {

    /**
     * Creates new form UpdateBookForm
     */
    public UpdateBookForm() {
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

        lb_update_book = new javax.swing.JLabel();
        tf_book_name = new javax.swing.JTextField();
        la_book_name = new javax.swing.JLabel();
        lb_author_name = new javax.swing.JLabel();
        tf_author_name = new javax.swing.JTextField();
        tf_publishing_name = new javax.swing.JTextField();
        lb_publishing_name = new javax.swing.JLabel();
        lb_book_category = new javax.swing.JLabel();
        cb_book_category = new javax.swing.JComboBox<>();
        tf_book_cost = new javax.swing.JTextField();
        la_book_cost = new javax.swing.JLabel();
        bt_update_book = new javax.swing.JButton();
        lb_book_category1 = new javax.swing.JLabel();
        tf_publishing_name2 = new javax.swing.JTextField();
        tf_publishing_name1 = new javax.swing.JTextField();
        lb_publishing_name1 = new javax.swing.JLabel();
        lb_librarian_name = new javax.swing.JLabel();
        cb_librarian_name = new javax.swing.JComboBox<>();
        mb_mainmenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lb_update_book.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        lb_update_book.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lb_update_book.setText("CẬP NHẬT THÔNG TIN SÁCH");

        tf_book_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_book_name.setText("Tên sách");
        tf_book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_nameActionPerformed(evt);
            }
        });

        la_book_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        la_book_name.setText("Tên Sách");

        lb_author_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_author_name.setText("Tên Tác giả");

        tf_author_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_author_name.setText("Tên Tác giả");
        tf_author_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_author_nameActionPerformed(evt);
            }
        });

        tf_publishing_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_publishing_name.setText("Tên NXB");
        tf_publishing_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_publishing_nameActionPerformed(evt);
            }
        });

        lb_publishing_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_publishing_name.setText("Tên NXB");

        lb_book_category.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_book_category.setText("Thể loại sách");

        cb_book_category.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cb_book_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thể loại sách" }));
        cb_book_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_book_categoryActionPerformed(evt);
            }
        });

        tf_book_cost.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_book_cost.setText("Giá");
        tf_book_cost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_costActionPerformed(evt);
            }
        });

        la_book_cost.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        la_book_cost.setText("Giá");

        bt_update_book.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        bt_update_book.setText("Thêm sách");
        bt_update_book.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_update_bookActionPerformed(evt);
            }
        });

        lb_book_category1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_book_category1.setText("Ngày cập nhật");

        tf_publishing_name2.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_publishing_name2.setText("Ngày thêm");
        tf_publishing_name2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_publishing_name2ActionPerformed(evt);
            }
        });

        tf_publishing_name1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        tf_publishing_name1.setText("Ngày thêm");
        tf_publishing_name1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_publishing_name1ActionPerformed(evt);
            }
        });

        lb_publishing_name1.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_publishing_name1.setText("Ngày thêm");

        lb_librarian_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        lb_librarian_name.setText("Thủ thư thêm sách");

        cb_librarian_name.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        cb_librarian_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thể loại sách" }));
        cb_librarian_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_librarian_nameActionPerformed(evt);
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
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(la_book_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_publishing_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_author_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_book_category, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                            .addComponent(la_book_cost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cb_book_category, 0, 148, Short.MAX_VALUE)
                                .addComponent(tf_publishing_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_author_name, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tf_book_name))
                            .addComponent(tf_book_cost))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lb_publishing_name1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_librarian_name, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lb_book_category1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tf_publishing_name1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tf_publishing_name2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cb_librarian_name, 0, 183, Short.MAX_VALUE)
                            .addComponent(bt_update_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(25, 25, 25))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb_update_book, javax.swing.GroupLayout.PREFERRED_SIZE, 606, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(25, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lb_update_book)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(la_book_name)
                            .addComponent(tf_book_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
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
                            .addComponent(cb_book_category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tf_book_cost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(la_book_cost))
                        .addContainerGap(25, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_librarian_name)
                            .addComponent(cb_librarian_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_publishing_name1)
                            .addComponent(tf_publishing_name1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lb_book_category1)
                            .addComponent(tf_publishing_name2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bt_update_book, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_book_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_nameActionPerformed

    private void tf_author_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_author_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_author_nameActionPerformed

    private void tf_publishing_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_publishing_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_publishing_nameActionPerformed

    private void cb_book_categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_book_categoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_book_categoryActionPerformed

    private void tf_book_costActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_book_costActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_book_costActionPerformed

    private void bt_update_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_update_bookActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_update_bookActionPerformed

    private void tf_publishing_name2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_publishing_name2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_publishing_name2ActionPerformed

    private void tf_publishing_name1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_publishing_name1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_publishing_name1ActionPerformed

    private void cb_librarian_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_librarian_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb_librarian_nameActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_update_book;
    private javax.swing.JComboBox<String> cb_book_category;
    private javax.swing.JComboBox<String> cb_librarian_name;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JLabel la_book_cost;
    private javax.swing.JLabel la_book_name;
    private javax.swing.JLabel lb_author_name;
    private javax.swing.JLabel lb_book_category;
    private javax.swing.JLabel lb_book_category1;
    private javax.swing.JLabel lb_librarian_name;
    private javax.swing.JLabel lb_publishing_name;
    private javax.swing.JLabel lb_publishing_name1;
    private javax.swing.JLabel lb_update_book;
    private javax.swing.JMenuBar mb_mainmenu;
    private javax.swing.JTextField tf_author_name;
    private javax.swing.JTextField tf_book_cost;
    private javax.swing.JTextField tf_book_name;
    private javax.swing.JTextField tf_publishing_name;
    private javax.swing.JTextField tf_publishing_name1;
    private javax.swing.JTextField tf_publishing_name2;
    // End of variables declaration//GEN-END:variables
}
