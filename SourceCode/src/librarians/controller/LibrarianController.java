/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package librarians.controller;

// Import Modal to Controller
import java.sql.SQLException;
import javax.swing.JOptionPane;
import librarians.boundary.LibrarianHelper;
import librarians.modal.LibrarianModal;
import readers.boundary.ReaderHelper;
import readers.controller.ReaderController;
import readers.modal.ReaderModal;

/**
 *
 * @author khanh
 */
public class LibrarianController {
    LibrarianModal librarian = new LibrarianModal();
    LibrarianHelper librarianHelper = new LibrarianHelper();

    private static LibrarianController me;

    /**
     * Hàm khởi tạo là private để không đối tượng nào bên ngoài có thể khởi tạo
     * tuỳ ý đối tượng của lớp này
     */
    public LibrarianController() {
    }

    /**
     * Hàm này khởi tạo cho đối tượng dùng chung duy nhất của UserController nếu
     * đối tượng đố null
     *
     * @return đối tượng dùng chung duy nhất của UserController
     */
    public static LibrarianController getInstance() {
        if (me == null) {
            me = new LibrarianController();
        }
        return me;
    }

    /**
     * Hàm này để đăng ký người dùng
     *
     * @return đúng sai, có đăng kí được hay k
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    public boolean addReader(String email, String password, String hoten, String sdt, int gioitinh, int trangthai) throws SQLException, ClassNotFoundException {
        librarian.setEmail(email);
        librarian.setPassword(librarianHelper.MD5encrypt(password));
        librarian.setHoten(hoten);
        librarian.setSdt(sdt);
        librarian.setGioitinh(gioitinh);
        librarian.setTrangthai(trangthai);
        boolean run = librarian.addUser();

        JOptionPane.showInputDialog(null, librarianHelper.MD5encrypt(password));
        return run;
    }

    public boolean updateProfile(String email, String hoten, String sdt, int gioitinh) throws SQLException, ClassNotFoundException {
        librarian.setEmail(email);
        librarian.setHoten(hoten);
        librarian.setSdt(sdt);
        librarian.setGioitinh(gioitinh);
        boolean run = librarian.updateProfile(email);

//        JOptionPane.showInputDialog(null, readerHelper.MD5encrypt(password));
        return run;
    }

    public LibrarianModal findByEmail(String email) throws SQLException, ClassNotFoundException {
        LibrarianModal librarian = new LibrarianModal();
        if (librarian.findByEmail(email)) {
            return librarian;
        }
        return null;
    }

    public boolean changePassword(String email, String newPass) throws SQLException, ClassNotFoundException {
        LibrarianModal librarian = new LibrarianModal();
        return  librarian.changePassword(email, newPass);
    }
    
    public boolean checkPassword(String inputPass) {
        inputPass = librarianHelper.MD5encrypt(inputPass);
        return inputPass.equals(librarian.getPassword());
    }

    public int checkLog(String email, String pass) throws SQLException, ClassNotFoundException {
        return librarian.checkLogin(email, pass);
    }
}
