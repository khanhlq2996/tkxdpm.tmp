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
import java.util.ArrayList;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;

/**
 *
 * @author DinhHuyen
 */
public class CopiesModal extends DataAccessHelper {

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

    public CopiesModal() {

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
     *
     * @return
     */
    public boolean themBanSao() throws ClassNotFoundException {
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
            return false;
        }
    }

    public void suaBanSao(int namXB) throws SQLException, ClassNotFoundException {
        connectDB();
        PreparedStatement ps = conn.prepareStatement(UPDATE_COPY);
        ps.setInt(1, namXB);
        ps.executeUpdate();
        closeDB();
    }

    public void xoaBanSao() throws SQLException, ClassNotFoundException {
        connectDB();
        PreparedStatement ps = conn.prepareStatement(DELETE_COPY);
        ps.setString(1, id_sach);
        ps.executeUpdate();
        closeDB();
    }

    public ResultSet loadDataS() throws ClassNotFoundException {
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

//    Connection con = DataAccessHelper.getConnection();
    static final String ADD_COPY_BOOK = "insert into sachbansao (MaSachBanSao, MaSachGoc, NgayNhapKho, NamXuatBan, TrangThai) values(?, ?, ?, ?, ?)";
    static final String GET_A_COPY_BOOK = "select MaSachBanSao,TenSach,TenTacGia,TenTheLoai,TenNXB, sachbansao.NamXuatBan  from sachgoc, sachbansao, theloaisach where sachgoc.idTheLoaiSach = theloaisach.idTheLoaiSach and sachgoc.MaSachGoc = sachbansao.MaSachGoc and MaSachBanSao = ? ";
    static final String UPDATE_BOOK_STATUS = "update sachbansao set TrangThai = ? where MaSachBanSao=?";
    static final String THEM_CHI_TIET_MUON = "insert into chitietmuon (idThongTinMuon, CacMaSach) values (?,?)";
    static final String THEM_THONG_TIN_MUON = "insert into thongtinmuon (MaThe, NgayMuon, NgayHenTra, SoSachMuon, TienCoc) values (?,?,?,?,?)";
    static final String GET_ALL_COPY_BOOK = "select MaSachBanSao from sachbansao";
    boolean status = false;// false: chưa mượn , true: đã mượn

    String maBanSao;


    public CopiesModal(String maBanSao, String maSachGoc, String name, String author, String nXB, int namXuatBan, String type, String ngayNhapKho) {
        super(maSachGoc, name, author, nXB, namXuatBan, type, ngayNhapKho);
        this.maBanSao = maBanSao;
    }

    public String getMaBanSao() {
        return maBanSao;
    }

    public void setMaBanSao(String maBanSao) {
        this.maBanSao = maBanSao;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public boolean addCopyBookToDataBase(CopiesModal copyBook) {

        PreparedStatement ps;
        try {
            ps = con.prepareStatement(ADD_COPY_BOOK);

            ps.setString(1, copyBook.getMaBanSao());
            ps.setString(2, copyBook.getMaSachGoc());
            ps.setString(3, copyBook.getNgayNhapKho());
            ps.setInt(4, copyBook.getNamXuatBan());
            ps.setString(5, copyBook.getStatus() + "");

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("CopyBook_Sub \n addCopyBook() lỗi :");
            e.printStackTrace();
        }
        return false;
    }

    public CopiesModal getACopyBook(String bookID) {

        PreparedStatement ps;
        CopiesModal copyBook = new CopiesModal();
        try {
            ps = con.prepareStatement(GET_A_COPY_BOOK);
            ps.setString(1, bookID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                String maBanSao = rs.getString("MaSachBanSao");
                String name = rs.getString("TenSach");
                String type = rs.getString("TenTheLoai");
                String author = rs.getString("TenTacGia");
                String NXB = rs.getString("TenNXB");
                int namXB = rs.getInt("NamXuatBan");

                copyBook.setMaBanSao(maBanSao);
                copyBook.setName(name);
                copyBook.setType(type);
                copyBook.setAuthor(author);
                copyBook.setnXB(NXB);
                copyBook.setNamXuatBan(namXB);

                return copyBook;
            }
        } catch (Exception e) {
            System.out.println("CopyBook_Sub \n getACopyBook() lỗi :" + e.getMessage());
        }
        return null;
    }

    public boolean addThongTinMuon(String maThe, String ngayMuon, String ngayHenTra, int soSachMuon, String tienCoc) {
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(THEM_THONG_TIN_MUON);
            ps.setString(1, maThe);
            ps.setString(2, ngayMuon);
            ps.setString(3, ngayHenTra);
            ps.setInt(4, soSachMuon);
            ps.setString(5, tienCoc);

            int success = ps.executeUpdate();

            System.out.println("success " + success);
            return true;

        } catch (SQLException ex) {
            System.out.println("MuonSach_Sub \n addThongTinMuon() error: " + ex.getMessage());
        }
        return false;
    }

    public boolean addChiTietMuon(int idThongTinMuon, String cacMaSach) {
        System.out.println("id thong tin muon " + idThongTinMuon);
        System.out.println("cac ma sach " + cacMaSach);
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(THEM_CHI_TIET_MUON);
            ps.setInt(1, idThongTinMuon);
            ps.setString(2, cacMaSach);

            int success = ps.executeUpdate();

            System.out.println("success " + success);
            return true;

        } catch (SQLException ex) {
            System.out.println("MuonSach_Sub \n addThongTinMuon() error: " + ex.getMessage());
        }
        return false;
    }

    public boolean updateBookStatus(String maSachBanSao, boolean trangThai) {

        PreparedStatement ps;

        try {
            ps = con.prepareStatement(UPDATE_BOOK_STATUS);
            ps.setString(1, trangThai + "");

            ps.setString(2, maSachBanSao);
            ps.executeUpdate();
            return true;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return false;
    }

    public ArrayList<CopiesModal> getAllCopyBook() {
        ArrayList<CopiesModal> arrayListCopyBook = new ArrayList<>();
        PreparedStatement ps;

        try {
            ps = con.prepareStatement(GET_ALL_COPY_BOOK);
            ResultSet rs = ps.executeQuery();
            while (rs != null && rs.next()) {
                CopiesModal copybook = new CopiesModal();
                String MaSachBanSao = rs.getString("MaSachBanSao");
                copybook.setMaBanSao(MaSachBanSao);
                arrayListCopyBook.add(copybook);

            }
        } catch (Exception ex) {
            System.out.println("Book_Sub /n getAllBook() error: " + ex.getMessage());
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(BookModal.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arrayListCopyBook;
    }

    public static void main(String[] args) {
        CopiesModal cpy = new CopiesModal();
        ArrayList<CopiesModal> arrayListCopyBook = new ArrayList<>();
        arrayListCopyBook = cpy.getAllCopyBook();

        System.out.print(" abc" + arrayListCopyBook.get(0).maBanSao);
    }
}
