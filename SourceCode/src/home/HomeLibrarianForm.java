/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;


import readers.boundary.ViewListReaderForm;
import books.boundary.SearchBookForm;
import lendbooks.boundary.ViewListCardForm;
import librarians.boundary.ViewProfile;
import librarians.boundary.ListLibrarianForm;

/**
 *
 * @author khanh
 */
public class HomeLibrarianForm extends javax.swing.JFrame {

    /**
     * Creates new form HomeLibrarianForm
     */
    public HomeLibrarianForm() {
        initComponents();
    }
    
    private static String email;

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        HomeLibrarianForm.email = email;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnQlySach = new javax.swing.JButton();
        btnQlyThuThu = new javax.swing.JButton();
        btnThongTinThuThu = new javax.swing.JButton();
        btnQlyDocGia = new javax.swing.JButton();
        btnQlyMuonTra = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnQlySach.setText("Quản lý Sách");
        btnQlySach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQlySachActionPerformed(evt);
            }
        });

        btnQlyThuThu.setText("Quản lý TK Thủ thư");
        btnQlyThuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQlyThuThuActionPerformed(evt);
            }
        });

        btnThongTinThuThu.setText("Thông tin Tài khoản");
        btnThongTinThuThu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongTinThuThuActionPerformed(evt);
            }
        });

        btnQlyDocGia.setText("Quản lý TK Đọc Giả");
        btnQlyDocGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQlyDocGiaActionPerformed(evt);
            }
        });

        btnQlyMuonTra.setText("Quản lý Mượn - Trả sách");
        btnQlyMuonTra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQlyMuonTraActionPerformed(evt);
            }
        });

        btnLogOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnLogOut.setText("Đăng xuất");
        btnLogOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogOutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnQlyMuonTra, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQlyThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongTinThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQlySach, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQlyDocGia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(95, 95, 95))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQlySach, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThongTinThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnQlyThuThu, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnQlyDocGia, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnQlyMuonTra, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogOut, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnThongTinThuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongTinThuThuActionPerformed
        // TODO add your handling code here:
        ViewProfile viewProfile = new ViewProfile();
        viewProfile.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_btnThongTinThuThuActionPerformed

    private void btnQlySachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQlySachActionPerformed
        // TODO add your handling code here:
        SearchBookForm book = new SearchBookForm();
        book.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_btnQlySachActionPerformed

    private void btnQlyThuThuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQlyThuThuActionPerformed
        // TODO add your handling code here:
        ListLibrarianForm librarians = new ListLibrarianForm();
        librarians.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_btnQlyThuThuActionPerformed

    private void btnQlyDocGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQlyDocGiaActionPerformed
        // TODO add your handling code here:
        ViewListReaderForm readers = new ViewListReaderForm();
        readers.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_btnQlyDocGiaActionPerformed

    private void btnQlyMuonTraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQlyMuonTraActionPerformed
        // TODO add your handling code here:
        ViewListCardForm cards = new ViewListCardForm();
        cards.setVisible(true);        
        this.dispose();
    }//GEN-LAST:event_btnQlyMuonTraActionPerformed

    private void btnLogOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogOutActionPerformed
        // TODO add your handling code here:
        StartForm StartForm = new StartForm();
        StartForm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogOutActionPerformed

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
            java.util.logging.Logger.getLogger(HomeLibrarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HomeLibrarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HomeLibrarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HomeLibrarianForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HomeLibrarianForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnQlyDocGia;
    private javax.swing.JButton btnQlyMuonTra;
    private javax.swing.JButton btnQlySach;
    private javax.swing.JButton btnQlyThuThu;
    private javax.swing.JButton btnThongTinThuThu;
    // End of variables declaration//GEN-END:variables
}
