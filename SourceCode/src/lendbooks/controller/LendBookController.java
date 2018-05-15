/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package lendbooks.controller;

// Import Modal to Controller
import lendbooks.modal.LendBookModal;
import java.sql.Date;
import java.sql.SQLException;


/**
 *
 * @author khanh
 */
public class LendBookController {
    LendBookModal lendBook = new LendBookModal();
    
    private static LendBookController this_lendBook;
    
    private LendBookController(){
        
    }
    
    public boolean addLendBook(LendBookModal lendBook)  throws ClassNotFoundException, SQLException{
        return lendBook.addLendBook();
    }
    
}
