/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package lendbooks.modal;
import entity.DataAccessHelper;
import static entity.DataAccessHelper.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
import java.sql.Date;


/**
 * Class này quản lý các thông tin liên quan đến thẻ mượn trả sách.
 * @author khanh
 * Create: 08/05/2018
 * Update: 08/05/2018
 */
public class LendBookModal extends DataAccessHelper{
    // Khai báo cấu trúc truy vấn SQL
    private final String GET_DETAIL_LENDBOOK = "SELECT * FROM lendbook WHERE id_card=?";
    private final String GET_LIST_LENDBOOK_BY_ATTRIBUTE = "SELECT * FROM lendbook WHERE ? like ?";
    private final String ADD_LENDBOOK = "INSERT INTO lendbook (id_book,id_reader,id_librarian,borrowd_day,pay_appointment_day,deposit,created,status) VALUES (?,?,?,?,?,?,?,?)";;
    private final String UPDATE_LENDBOOK = "INSERT INTO lendbook (id_book,id_reader,id_librarian,borrowd_day,pay_appointment_day,pay_day,deposit,mulct,created,updated,status) VALUES (?,?,?,?,?,?,?,?,?,?,?)";;
    
    
    
    // Khai báo các biến cần sử dụng 
    private String idCard;
    private String idBook;
    private String idReader;
    private String idLibrarian;
    private Date borrowedDay;
    private Date payAppointmentDay;
    private Date payDay;
    private float deposit;
    private float mulct;
    private Date created;
    private Date updated;
    private int status;    

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getIdBook() {
        return idBook;
    }

    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }

    public String getIdReader() {
        return idReader;
    }

    public void setIdReader(String idReader) {
        this.idReader = idReader;
    }

    public String getIdLibrarian() {
        return idLibrarian;
    }

    public void setIdLibrarian(String idLibrarian) {
        this.idLibrarian = idLibrarian;
    }

    public Date getBorrowedDay() {
        return borrowedDay;
    }

    public void setBorrowedDay(Date borrowedDay) {
        this.borrowedDay = borrowedDay;
    }

    public Date getPayAppointmentDay() {
        return payAppointmentDay;
    }

    public void setPayAppointmentDay(Date payAppointmentDay) {
        this.payAppointmentDay = payAppointmentDay;
    }

    public Date getPayDay() {
        return payDay;
    }

    public void setPayDay(Date payDay) {
        this.payDay = payDay;
    }

    public float getDeposit() {
        return deposit;
    }

    public void setDeposit(float deposit) {
        this.deposit = deposit;
    }

    public float getMulct() {
        return mulct;
    }

    public void setMulct(float mulct) {
        this.mulct = mulct;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    
    /**
     * Phương thức này sẽ lấy thông tin của MỘT bản ghi Thẻ mượn theo ID
     * Phương thức này được sử dụng cho chức năng xem chi tiết trong giao diện Danh sách Thẻ mượn    * @param lastName tên
     * @param id_card id thẻ mượn
     * @return boolean;
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     * @author khanh
     * Create: 08/05/2018
     * Update: 08/05/2018
     */
    public boolean getDetailLendBook(String id_card)  throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(GET_DETAIL_LENDBOOK);        
        ps.setString(1, id_card);
        ps.executeQuery();
        ResultSet rs = ps.executeQuery();
        if (rs != null && rs.next()) {            
            closeDB();  
            return false;
        } else {
            closeDB();
            return true;
        }
    }
    
   
    /**
     * Phương thức này sẽ Thêm một thẻ mượn sách mới
     * Phương thức này được sử dụng cho chức năng xem chi tiết trong giao diện Danh sách Thẻ mượn
     * @param idBook mã sách cẫn mượn
     * @param idReader mã đọc giả muốn mượn
     * @param idLibrarian mã thủ thủ cho mượn
     * @param payAppointmentDay ngày mượn
     * @param payAppointmentDay hạn phải trả
     * @param deposit tiền đặt cọc
     * @param created ngày khởi tạo phiếu
     * @return boolean 
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     * @author khanh
     * Create: 08/05/2018
     * Update: 08/05/2018
     */  
    public boolean addLendBook()  throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps;
        ps = conn.prepareStatement(ADD_LENDBOOK);
        ps.setString(1, this.idBook);
        ps.setString(2, this.idReader);
        ps.setString(3, this.idLibrarian);
        ps.setString(4, this.idLibrarian);
        ps.setDate(5, this.payAppointmentDay);
        ps.setFloat(6, this.deposit);
        ps.setDate(7, this.updated);
        ps.setInt(8, 1);
        closeDB();
        return true;
    }
    
        
    /**
     * Phương thức này sẽ Thêm một thẻ mượn sách mới
     * Phương thức này được sử dụng cho chức năng xem chi tiết trong giao diện Danh sách Thẻ mượn
     * @param id_book mã sách cẫn mượn
     * @param id_reader mã đọc giả muốn mượn
     * @param id_librarian mã thủ thủ cho mượn
     * @param borrowd_day ngày mượn
     * @param pay_appointment_day hạn phải trả
     * @param pay_day ngày trả
     * @param deposit tiền đặt cọc
     * @param mulct tiền phạt
     * @param created ngày khởi tạo phiếu
     * @param updated ngày khởi tạo phiếu
     * @param status ngày khởi tạo phiếu
     * @return boolean 
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     * @author khanh
     * Create: 08/05/2018
     * Update: 08/05/2018
     */    
    public boolean updateLendBook(String id_book, String id_reader, String id_librarian, Date borrowd_day, Date pay_appointment_day, Date pay_day, float deposit, float mulct, Date created, Date updated, int status)  throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps;
        ps = conn.prepareStatement(ADD_LENDBOOK);
        ps.setString(1, id_book);
        ps.setString(2, id_reader);
        ps.setString(3, id_librarian);
        ps.setDate(4, borrowd_day);
        ps.setDate(5, pay_appointment_day);
        ps.setDate(6, pay_day);
        ps.setFloat(7, deposit);
        ps.setFloat(8, mulct);
        ps.setDate(9, created);
        ps.setDate(10, updated);
        ps.setInt(11, status);
        closeDB();
        return true;
    }
    
    /**
     * Tìm kiếm phiếu mượn theo thuộc tính
     * @param key_value từ khóa
     * @param type_search tìm kiếm theo
     * @return cards danh sách thẻ mượn
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     * @author khanh
     * Create: 08/05/2018
     * Update: 09/05/2018
    */ 
    public ArrayList<LendBookModal> searchLendBook(String key_value,String type_search) throws SQLException, ClassNotFoundException{
        ArrayList<LendBookModal> cards = new ArrayList<>();
        ResultSet rs;
        connectDB();
        PreparedStatement ps = conn.prepareStatement(GET_LIST_LENDBOOK_BY_ATTRIBUTE);
        ps.setString(2, type_search);       
        ps.setString(1, key_value); 
        rs = ps.executeQuery();
        while(rs.next()){
            LendBookModal card = new LendBookModal();
            card.setIdBook(rs.getString("idBook"));
            card.setIdReader(rs.getString("idReader"));
            card.setIdLibrarian(rs.getString("idLibrarian"));
            card.setBorrowedDay(rs.getDate("borrowedDay"));
            card.setPayAppointmentDay(rs.getDate("payAppointmentDay"));
            card.setPayDay(rs.getDate("payDay"));
            card.setDeposit(rs.getFloat("deposit"));
            card.setMulct(rs.getFloat("mulct"));
            card.setCreated(rs.getDate("created"));
            card.setUpdated(rs.getDate("update"));
            card.setStatus(rs.getInt("staus"));
            cards.add(card);
        }
        closeDB();
        return cards;
    }
}
