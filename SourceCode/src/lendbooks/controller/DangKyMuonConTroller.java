/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendbooks.controller;

import entity.modal.DataAccessHelper;
import books.modal.BookModal;
import books.modal.CopiesModal;
import lendbooks.modal.DangKyMuon;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Phuong
 */
public class DangKyMuonConTroller {

    DangKyMuon dangkimuon = new DangKyMuon();
    static final int MaThe = 12347;
    Connection con = DataAccessHelper.getConnection();
    CopiesModal copy = new CopiesModal();

    static final String ADD_REGISTER = "insert into dangkimuon ( MaSachMuon,NgayDangKi, NgayDenLay, MaThe) values(?, ?, ?, ?)";
    //     static final String SELECT_IDREGISTER = " select "
    static final String DELETE_REGISTER = " delete from dangkimuon where  idDangKiMuon=?";

    public void getListBorrowed(JTable table) {
        ArrayList<DangKyMuon> listdangky = dangkimuon.getRegisterBorrowed(MaThe);
        // tao vec to chi vao cot
        Vector cols = new Vector();
        cols.addElement("Mã đăng kí mượn");

        cols.addElement("Mã Sách Mượn");
        cols.addElement("Tên sách");
        cols.addElement("Tác giả");
        cols.addElement("Nhà Xuất Bản");
        cols.addElement("Ngày đăng kí");
        cols.addElement("Ngày đến lấy");

        Vector datadangki = new Vector();
        for (DangKyMuon dangkimuon : listdangky) {
            Vector dangkiAttribute = new Vector();
//            bookAttribute.addElement(++STT);
            dangkiAttribute.addElement(dangkimuon.getIđangKiMuon());
            dangkiAttribute.addElement(dangkimuon.getMaSachMuon());
            dangkiAttribute.addElement(dangkimuon.getTenSach());
            dangkiAttribute.addElement(dangkimuon.getTacGia());
            dangkiAttribute.addElement(dangkimuon.getTenNXB());
            dangkiAttribute.addElement(dangkimuon.getNgayDangKy());
            dangkiAttribute.addElement(dangkimuon.getNgayDenLay());

            datadangki.add(dangkiAttribute);
        }

        table.setModel(new DefaultTableModel(datadangki, cols));

    }

    public boolean RegisterBorrow(int MaSachMuon, String NgayDangKi, String NgayDenLay, int MaThe) {

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(ADD_REGISTER);

            ps.setInt(1, MaSachMuon);
            ps.setString(2, NgayDangKi);
            ps.setString(3, NgayDenLay);
            ps.setInt(4, MaThe);
            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("addregister error :");
            e.printStackTrace();
        }
        return false;
    }

    public boolean CancelRegisterBorrowed(int idDangkiMuon) {
//         if(listdangky.get(i))
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(DELETE_REGISTER);
            ps.setInt(1, idDangkiMuon);
            int rs = ps.executeUpdate();
            if (rs > 0) {
                return true;
            }
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(DangKyMuonConTroller.class.getName()).log(Level.SEVERE, null, ex);
        }

        return false;

    }

    public static void main(String[] args) {
        DangKyMuonConTroller c = new DangKyMuonConTroller();

        if (c.CancelRegisterBorrowed(22) == true) {
            System.out.print(" test");
        } else {
            System.out.print(" false");
        }
    }

    public void getCombobox(JComboBox combobox) {

        ArrayList<CopiesModal> listcopybook = copy.getAllCopyBook();
        Vector datadangki = new Vector();
        for (CopiesModal book : listcopybook) {
            Vector dangkiAttribute = new Vector();
//          bookAttribute.addElement(++STT);
            dangkiAttribute.addElement(book.getMaBanSao());
            datadangki.add(dangkiAttribute);
        }

        combobox.setModel(new DefaultComboBoxModel(datadangki));

    }

}
