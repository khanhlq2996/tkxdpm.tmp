/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package books.controller;

// Import Modal to Controller
import books.modal.BookModal;
import books.modal.CopiesModal;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author khanh
 */
public class BookController {
    public void addBook(String id_sach, String tenSach, String theLoai, String NXB, String tacGia, String ngayNhap,int namXB) throws ClassNotFoundException{
        BookModal sach = new BookModal();
        sach.themSach();
    }
    
     public void addCopy(String id_copy, String id_book, int amount, String created, String status) throws ClassNotFoundException{
        CopiesModal bs = new CopiesModal();
        bs.themBanSao();
    }
    
    
    public boolean dulieuBangSach(JTable jTable) throws ClassNotFoundException{
        BookModal book = new BookModal();
        if(!book.loadData().equals(null)){
        jTable.setModel(DbUtils.resultSetToTableModel(book.loadData()));
        return true;
        }else{
        return  false;
        }
    }
    
    public boolean dulieuBangCopy(JTable jTable) throws ClassNotFoundException{
        CopiesModal copy = new CopiesModal();
        if(!copy.loadDataS().equals(null)){
        jTable.setModel(DbUtils.resultSetToTableModel(copy.loadDataS()));
        return true;
        }else{
        return  false;
        }
    }
    
    public String ngayHienTai(){
        Calendar cal = Calendar.getInstance();
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int month = cal.get(Calendar.MONTH) + 1;
        int year = cal.get(Calendar.YEAR);
        return (year + "-" + month + "-" + day); 
    }
    
    public  String idauto(int k) {
        BookModal book = new BookModal();
        int soSachTrongKho;
        char[] soSach = new char[6];
        try {
            soSach = book.idBookMax().toCharArray();
        } catch (SQLException | ClassNotFoundException ex ){
            Logger.getLogger(BookController.class.getName()).log(Level.SEVERE, null, ex);
        }
        soSachTrongKho = Integer.parseInt(String.valueOf(soSach[1])) * 1000 + Integer.parseInt(String.valueOf(soSach[2])) * 100 + Integer.parseInt(String.valueOf(soSach[3])) * 10 + Integer.parseInt(String.valueOf(soSach[4])) + k;
        if (soSachTrongKho < 10 && soSachTrongKho > 0) {
            return String.valueOf("S000" + soSachTrongKho);
        } else if (soSachTrongKho < 100 && soSachTrongKho >= 10) {
            return String.valueOf("S00" + soSachTrongKho);
        } else if (soSachTrongKho < 1000 && soSachTrongKho >= 100) {
            return String.valueOf("S0" + soSachTrongKho);
        }
        return null;
    }
}
