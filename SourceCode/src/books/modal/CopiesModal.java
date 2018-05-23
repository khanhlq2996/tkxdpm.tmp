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
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author DinhHuyen
 */
public class CopiesModal extends DataAccessHelper{
    private String id_bansao;
    private String id_sach;
    private String ngayNhap;
    private int giaBanSao;
    private String tinhTrang;
    
    private final String ADD_COPY = "INSERT INTO bansao (id_bansao, id_sach, ngayNhap, giaBanSao, tinhTrang) VALUES (?,?,?,?,?);";
    private final String UPDATE_COPY = "UPDATE bansao namXB = ? where maSach = ? ";
    private final String DELETE_COPY = "DELETE bansao where maSach = ?";

    public CopiesModal(String idbansao, String idsach, String ngayNhap, int giaBanSao, String tinhTrang) {
        this.id_bansao = idbansao;
        this.id_sach = idsach;
        this.ngayNhap = ngayNhap;
        this.giaBanSao = giaBanSao;
        this.tinhTrang = tinhTrang;
    }

    public CopiesModal(){
        
    }

    public String getId_bansao() {
        return id_bansao;
    }

    public void setId_bansao(String id_bansao) {
        this.id_bansao = id_bansao;
    }

    public String getId_sach() {
        return id_sach;
    }

    public void setId_sach(String id_sach) {
        this.id_sach = id_sach;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    
    
    public String getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getGiaBanSao() {
        return giaBanSao;
    }

    public void setGiaBanSao(int giaBanSao) {
        this.giaBanSao = giaBanSao;
    }
    
    /**
     * Ham them ban sao vao bang ban sao
     * @return 
     */
    
    public boolean themBanSao() throws ClassNotFoundException{
        try {
            connectDB();
            PreparedStatement ps;
            
            ps = conn.prepareStatement(ADD_COPY);
            ps.setString(1, id_bansao);
            ps.setString(2, id_sach);
            ps.setString(3, ngayNhap);
            ps.setInt(4, giaBanSao);
            ps.setString(5, tinhTrang);
            ps.executeUpdate();
            closeDB();
            System.out.println("Them ban sao thanh cog");
            return true;
        } catch (SQLException ex) {
          
            Logger.getLogger(CopiesModal.class.getName()).log(Level.SEVERE, null, ex);
        return  false;
        }
    }
    
    public void suaBanSao(int namXB ) throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(UPDATE_COPY);
        ps.setInt(1, namXB);
        ps.executeUpdate();
        closeDB();
    }
    
    public void xoaBanSao() throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(DELETE_COPY);
        ps.setString(1, id_sach);
        ps.executeUpdate();
        closeDB();
    }
    
    public ResultSet loadDataS() throws ClassNotFoundException{
        try {
            String sql = "select * from bansao;";
            connectDB();
            PreparedStatement pst = conn.prepareStatement(sql);
           
            return pst.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(CopiesModal.class.getName()).log(Level.SEVERE, null, ex);
       return null;
        }
    
    }
    
    
     public void loadComoBox(JComboBox jComboBox) throws ClassNotFoundException {
         
        try {
            String sql = "select id_sach from sach group by id_sach;";
            PreparedStatement pst = null;
            
            connectDB();
            pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                jComboBox.addItem(rs.getString("id_sach"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CopiesModal.class.getName()).log(Level.SEVERE, null, ex);
        }

       

    }
}
