/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lendbooks.modal;


import entity.modal.DataAccessHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Nguyen Phuong
 */
public class DangKyMuon {
    Connection con = DataAccessHelper.getConnection();  
    
    
    String MaSachGoc,TenSach,TenTacGia,TenNXB,TenTheLoai,NgayDangKy ,NgayDenLay ;
    int MaSachMuon , MaThe ,NamXuatBan, idDangKiMuon;
    
    
    
    static final String ADD_REGISTER = "insert into dangkimuon (NgayDangKi, NgayDenLay, MaSachMuon, MaThe) values(?, ?, ?, ?)";
    static final String GET_REGISTER = " select idDangKiMuon ,MaSachMuon , TenSach, NgayDangKi,NgayDenLay, TenTacGia , sachgoc.TenNXB from dangkimuon, sachbansao,sachgoc where dangkimuon.MaSachMuon = sachbansao.MaSachBanSao and sachgoc.MaSachGoc = sachbansao.MaSachGoc and dangkimuon.MaThe = ? ";
    
    public DangKyMuon(int idDangKiMuon ,int MaSachMuon,String NgayDangKy,String TenTacGia, String TenNXB ,String NgayDenLay, int MaThe){
       
        this.MaSachMuon = MaSachMuon ;
        this.NgayDangKy = NgayDangKy;
        this.NgayDenLay = NgayDenLay;
        this.MaThe = MaThe ;
        this.TenTacGia = TenTacGia ;
        this.TenNXB = TenNXB ;
        this.idDangKiMuon = idDangKiMuon;
    }

    public DangKyMuon() {
       
    }
    
    
    public String getMaSachGoc (){
        return MaSachGoc ;
    }
    
    public int getMaSachMuon(){
        return MaSachMuon ;
    }
    public String getTenSach(){
        return TenSach;
    }
    public String getTacGia(){
        return TenTacGia;
    }
    public String getTenNXB(){
        return TenNXB ;
    }
    public String getTenTheLoai(){
        return TenTheLoai ;
    }
    public int getNamXuatBan(){
        return NamXuatBan ;
    }
    public String getNgayDangKy(){
        return NgayDangKy ;
    }
    public String getNgayDenLay(){
        return NgayDenLay ;
    }
    
    public int getMaThe(){
        return MaThe;
    }
    public int getIđangKiMuon(){
        return idDangKiMuon;
    }
    
    
     public void setMaSachGoc (){
        this.MaSachGoc = MaSachGoc ;
    }
    
    public void setMaSachMuon(int MaSachMuon){
        this.MaSachMuon= MaSachMuon ;
    }
    public void setTenSach(String TenSach){
        this.TenSach= TenSach;
    }
    public void setTacGia(String TenTacGia){
        this.TenTacGia= TenTacGia;
    }
    public void setTenNXB(String TenNXB){
        this.TenNXB= TenNXB ;
    }
    public void setTenTheLoai(String TenTheLoai){
        this.TenTheLoai= TenTheLoai ;
    }
    public void setNamXuatBan(){
        this.NamXuatBan= NamXuatBan ;
    }
    public void setNgayDangKy(String NgayDangKy){
        this.NgayDangKy= NgayDangKy ;
    }
    public void setNgayDenLay(String NgayDenLay){
        this.NgayDenLay= NgayDenLay ;
    }
    public void setMaThe(){
        this.MaThe = MaThe ;
    }
    public void setIdDangKiMuon(int idDangKiMuon){
        this.idDangKiMuon = idDangKiMuon ;
    }
    
   
    
    /**
     * 
     * @param mathe
     * @param dangkimuon
     * @return 
     */
  

    public ArrayList<DangKyMuon> getRegisterBorrowed(int mathe) {
       PreparedStatement ps;
       ArrayList<DangKyMuon> listdangkymuon = new ArrayList<DangKyMuon>();
        try {
            ps = con.prepareStatement(GET_REGISTER);
            ps.setInt(1, mathe);
            ResultSet rs = ps.executeQuery();
             while (rs != null && rs.next()){
                
                DangKyMuon dangkymuon = new DangKyMuon();
                int idDangKiMuon = rs.getInt("idDangKiMuon");
                int MaSachMuon = rs.getInt("MaSachMuon");
                String TenSach = rs.getString("TenSach");
                String TenNXB = rs.getString("TenNXB");
                String TenTacGia = rs.getString("TenTacGia");
                String NgayDangKi = rs.getString("NgayDangKi");
                String NgayDenLay = rs.getString("NgayDenLay");
             

                dangkymuon.setIdDangKiMuon(idDangKiMuon);
                dangkymuon.setMaSachMuon(MaSachMuon);
                dangkymuon.setTenSach(TenSach);
                dangkymuon.setTenNXB(TenNXB);
                dangkymuon.setTacGia(TenTacGia);
                
                dangkymuon.setNgayDangKy(NgayDangKi);
                dangkymuon.setNgayDenLay(NgayDenLay);

                listdangkymuon.add(dangkymuon);
            }
        } catch (Exception ex) {
            System.out.println("Book_Sub /n getAllBook() error: " + ex.getMessage());
        
        }
        return listdangkymuon;
    }
    
  
   
   public String[] getDataTable(JTable table){
         	int i = table.getSelectedRow();
	    if(i >= 0){
	    	TableModel model = (TableModel) table.getModel();
	        String[] input = new String[table.getColumnCount()];
	        for (int j = 0; j < input.length; j++) {

	            if(model.getValueAt(i, j) != null )input[j] = model.getValueAt(i, j).toString();
	            else input[j] = "";
	        }
	        return input;
	    }
	    return null;
		
         
     }
}
