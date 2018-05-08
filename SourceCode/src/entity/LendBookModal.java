/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package entity;
import static entity.DataAccessHelper.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.*;
import java.util.*;


/**
 * Class này quản lý các thông tin liên quan đến thẻ mượn trả sách.
 * @author khanh
 * Create: 08/05/2018
 * Update: 08/05/2018
 */
public class LendBookModal extends DataAccessHelper{
    // Khai báo cấu trúc truy vấn SQL
    private final String GET_DETAIL_LENDBOOK = "SELECT * FROM lendbook WHERE id_card=?";
    private final String GET_LIST_LENDBOOK_BY_READER = "SELECT * FROM ... WHERE ...=?";
    private final String GET_LIST_LENDBOOK_BY_LIBRARIAN = "SELECT * FROM ... WHERE ...=?";
    private final String GET_LIST_LENDBOOK_BY_BORROWEDDAY = "SELECT * FROM ... WHERE ...=?";
    private final String GET_LIST_LENDBOOK_BY_PAYDAY = "SELECT * FROM ... WHERE ...=?";
    
    
    
    // Khai báo các biến cần sử dụng 
    private String idLendBook;
    private String book;
    private String reader;
    private String librarian;
    private DateTimeException borrowedDay;
    private DateTimeException payDay;
    private boolean status;
    
    public String getIdLendBook() {
        return idLendBook;
    }

    public void setIdLendBook(String idLendBook) {
        this.idLendBook = idLendBook;
    }
    
    public String getBook() {
        return book;
    }

    public void setBook(String book) {
        this.book = book;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public String getLibrarian() {
        return librarian;
    }

    public void setLibrarian(String librarian) {
        this.librarian = librarian;
    }

    public DateTimeException getBorrowedDay() {
        return borrowedDay;
    }

    public void setBorrowedDay(DateTimeException borrowedDay) {
        this.borrowedDay = borrowedDay;
    }

    public DateTimeException getReturnDay() {
        return payDay;
    }

    public void setReturnDay(DateTimeException returnDay) {
        this.payDay = returnDay;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    /**
     * Phương thức này sẽ lấy thông tin của MỘT bản ghi Thẻ mượn theo ID
     * Phương thức này được sử dụng cho chức năng xem chi tiết trong giao diện Danh sách Thẻ mượn    * @param lastName tên
     * @param id_card id thẻ mượn
     * @return Array user;
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     * @author khanh
     * Create: 08/05/2018
     * Update: 08/05/2018
     */
    public void getDetailLendBook(String id_card)  throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(GET_DETAIL_LENDBOOK);        
        ps.setString(1, id_card);
        ps.executeQuery();
        ResultSet rs = ps.executeQuery();
    }
    
    
    /**
     * Phương thức này sẽ Thêm một thẻ mượn sách mới
     * Phương thức này được sử dụng cho chức năng xem chi tiết trong giao diện Danh sách Thẻ mượn
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     * @author khanh
     * Create: 08/05/2018
     * Update: 08/05/2018
     */
    public void addLendBook(String idCard, String idReader, String Librarian, DateTimeException borrowedDay, DateTimeException payDay, String idBook, float deposit)  throws SQLException, ClassNotFoundException{
    
        
    }
    
}
