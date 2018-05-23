/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package books.modal;
import entity.modal.DataAccessHelper;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DinhHuyen
 */
public class BookModal extends DataAccessHelper{
    private String id_sach;
    private String tenSach;
    private String theLoai;
    private String NXB;
    private String tacGia;
    private String ngayNhap;
    private int namXB;
    
    private final String ADD_BOOK = "INSERT INTO sach (id_sach, tenSach, theLoai, tenNXB, tacGia, ngayNhap, namXB) VALUES(?,?,?,?,?,?,?)";
    private final String UPDATE_BOOK = "UPDATE sach set tenSach = ?, theLoai = ?, NXB = ?, tacGia = ?, namXB = ? where id_sach = ?";
    private final String DELETE_BOOK = "DELETE sach where id_sach = ?";
    private final String SELECT_BOOK = "SELECT id_sach from sach";

    public BookModal(String id_sach, String tenSach, String theLoai, String nxb, String tacGia, String ngayNhap, int namXB) {
        this.id_sach = id_sach;
        this.tenSach = tenSach;
        this.theLoai = theLoai;
        this.NXB = nxb;
        this.tacGia = tacGia;
        this.ngayNhap = ngayNhap;
        this.namXB = namXB;
    }

    public BookModal() {
    }

    public String getId_sach() {
        return id_sach;
    }

    public void setId_sach(String id_sach) {
        this.id_sach = id_sach;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTheLoai() {
        return theLoai;
    }

    public void setTheLoai(String theLoai) {
        this.theLoai = theLoai;
    }

    

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }
    
    

    
    /**
     * Ham nay de them sach vao bang sach
     * @return 
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    
    public boolean themSach() throws ClassNotFoundException {
        try {
            connectDB();
            PreparedStatement ps;
            
            ps = conn.prepareStatement(ADD_BOOK);
            ps.setString(1, id_sach);
            ps.setString(2, tenSach);
            ps.setString(3, theLoai);
            ps.setString(4, NXB);
            ps.setString(5, tacGia);
             ps.setString(6, ngayNhap);
            ps.setInt(7, namXB);
            ps.executeUpdate();
            closeDB();
            System.out.println("Thanh cong");
            return true;
        } catch (SQLException ex) {
            
            Logger.getLogger(BookModal.class.getName()).log(Level.SEVERE, null, ex);
            return false;    
        }
    }
    
    public ResultSet loadData() throws ClassNotFoundException{
        try {
            String sql = "select * from sach;";
            connectDB();
            PreparedStatement pst = conn.prepareStatement(sql);
           
            return pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(BookModal.class.getName()).log(Level.SEVERE, null, ex);
       return null;
        }
    
    }
    
    /**
     * Ham nay de cap nhat sach trong bang sach
     * @param tenSach
     * @param theLoai
     * @param tenNXB
     * @param tacGia
     * @param namXB
     * @param soLuong
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    
    public void suaSach(String tenSach,String theLoai, String tenNXB, String tacGia, int namXB) throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(UPDATE_BOOK);
        ps.setString(1, tenSach);
        ps.setString(2, theLoai);
        ps.setString(3, tenNXB);
        ps.setString(4, tacGia);
        ps.setInt(5, namXB);
        ps.executeUpdate();
        closeDB();
    }
    
    /**
     * Ham nay de xoa sach trong bang sach
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    
    public void xoaSach() throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(DELETE_BOOK);
        ps.setString(1, id_sach);
        ps.executeUpdate();
        closeDB();
    }
    
    /**
     * Ham lay gia tri lon nhat cua ma sach trong bang sach
     * @return id_ sach lon nhat
     * @throws SQLException
     * @throws ClassNotFoundException 
     */
    
    public String idBookMax() throws SQLException, ClassNotFoundException {
            String idBookMax = "SELECT MAX(id_sach) as id_sach from sach;";
            String id_sach = "";
            connectDB();
            PreparedStatement pst = conn.prepareStatement(idBookMax);
            ResultSet rs = pst.executeQuery();
            while(rs.next()){
                id_sach = rs.getString("id_sach");
            }
            return id_sach;
    }
    
}

