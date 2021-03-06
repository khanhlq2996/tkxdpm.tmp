/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.boundary;

/**
 *
 * @author khanh
 */
public class SearchBookForm extends javax.swing.JFrame {

    /**
     * Creates new form SearchBookForm
     */
    public SearchBookForm() {
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

        la_book_name = new javax.swing.JLabel();
        tf_book_name = new javax.swing.JTextField();
        lb_publishing_name = new javax.swing.JLabel();
        tf_publishing_name = new javax.swing.JTextField();
        tf_author_name = new javax.swing.JTextField();
        lb_author_name = new javax.swing.JLabel();
        lb_book_category = new javax.swing.JLabel();
        cb_book_category = new javax.swing.JComboBox<>();
        bt_search = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_result_search = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        mb_mainmenu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        la_book_name.setText("Tên Sách");

        tf_book_name.setText("Tên sách");
        tf_book_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_book_nameActionPerformed(evt);
            }
        });

        lb_publishing_name.setText("Tên NXB");

        tf_publishing_name.setText("Tên NXB");
        tf_publishing_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_publishing_nameActionPerformed(evt);
            }
        });

        tf_author_name.setText("Tên Tác giả");
        tf_author_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_author_nameActionPerformed(evt);
            }
        });

        lb_author_name.setText("Tên Tác giả");

        lb_book_category.setText("Thể loại sách");

        cb_book_category.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thể loại sách" }));
        cb_book_category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_book_categoryActionPerformed(evt);
            }
        });

        bt_search.setBackground(new java.awt.Color(0, 51, 255));
        bt_search.setText("Tìm kiếm");
        bt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_searchActionPerformed(evt);
            }
        });

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
        tb_result_search.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TÌM KIẾM SÁCH");

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
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_publishing_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                                .addComponent(cb_book_category, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lb_author_name)
                                .addGap(31, 31, 31)
                                .addComponent(tf_author_name, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                        .addComponent(bt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(20, 20, 20)
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
                .addGap(18, 30, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void bt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bt_searchActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_search;
    private javax.swing.JComboBox<String> cb_book_category;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel la_book_name;
    private javax.swing.JLabel lb_author_name;
    private javax.swing.JLabel lb_book_category;
    private javax.swing.JLabel lb_publishing_name;
    private javax.swing.JMenuBar mb_mainmenu;
    private javax.swing.JTable tb_result_search;
    private javax.swing.JTextField tf_author_name;
    private javax.swing.JTextField tf_book_name;
    private javax.swing.JTextField tf_publishing_name;
    // End of variables declaration//GEN-END:variables
}
