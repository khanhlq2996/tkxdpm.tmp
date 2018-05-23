/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package readers.boundary;

import home.HomeReaderForm;
import home.StartForm;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import readers.controller.ReaderController;

/**
 *
 * @author khanh
 */
public class ReaderLoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public ReaderLoginForm() {
        setTitle("Đăng nhập - Đọc giả");
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

        jLabel1 = new javax.swing.JLabel();
        lbEmail = new javax.swing.JLabel();
        tfEmail = new javax.swing.JTextField();
        lbMatKhau = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        pwfMatKhau = new javax.swing.JPasswordField();
        btnDangky = new javax.swing.JButton();
        btnGoStartForm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ĐĂNG NHẬP");

        lbEmail.setText("Email");

        lbMatKhau.setText("Mật khẩu");

        btnDangNhap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Male.png"))); // NOI18N
        btnDangNhap.setText("Đăng nhập");
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnDangky.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create.png"))); // NOI18N
        btnDangky.setText("Đăng ký tài khoản mới");
        btnDangky.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangkyActionPerformed(evt);
            }
        });

        btnGoStartForm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnGoStartForm.setText("Trang chủ");
        btnGoStartForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoStartFormActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(118, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbMatKhau)
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfEmail)
                                    .addComponent(pwfMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE)))
                            .addComponent(lbEmail))
                        .addGap(104, 104, 104))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnDangky, javax.swing.GroupLayout.DEFAULT_SIZE, 340, Short.MAX_VALUE))
                        .addGap(103, 103, 103))))
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnGoStartForm)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnGoStartForm)
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbMatKhau)
                    .addComponent(pwfMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDangky)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        // TODO add your handling code here:
        try {
            // Khởi tạo đối tượng mới
            ReaderController reader = new ReaderController();

            // Gọi đối tượng kiểm tra các giá trị thông thường
            ReaderHelper readerHelper = new ReaderHelper();

            // Thực thi thêm bản ghi mới
            int log = reader.checkLog(
                    tfEmail.getText(),
                    readerHelper.MD5encrypt(pwfMatKhau.getText())
            );

            switch (log) {
                case 0:
                    JOptionPane.showMessageDialog(null, "Tài khoản của bạn chưa được kích hoạt, vui lòng liên hệ QTV!");
                    return;
                case 1:
                    JOptionPane.showMessageDialog(null, "Đăng nhập thành công!");
                    HomeReaderForm home = new HomeReaderForm();
                    home.setVisible(true);
                    this.dispose();
                    return;
                case 2:
                    JOptionPane.showMessageDialog(null, "Sai mật khẩu!");
                    return;
                case 3:
                    JOptionPane.showMessageDialog(null, "Email không tôn tại!");
                    return;
            }

        } catch (SQLException ex) {
            Logger.getLogger(CreateReaderForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(CreateReaderForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void btnDangkyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangkyActionPerformed
        // TODO add your handling code here:
        RegisterForm register = new RegisterForm();
        register.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnDangkyActionPerformed

    private void btnGoStartFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGoStartFormActionPerformed
        // TODO add your handling code here:
        StartForm StartForm = new StartForm();
        StartForm.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnGoStartFormActionPerformed

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
            java.util.logging.Logger.getLogger(ReaderLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReaderLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReaderLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReaderLoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReaderLoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JButton btnDangky;
    private javax.swing.JButton btnGoStartForm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbMatKhau;
    private javax.swing.JPasswordField pwfMatKhau;
    private javax.swing.JTextField tfEmail;
    // End of variables declaration//GEN-END:variables
}
