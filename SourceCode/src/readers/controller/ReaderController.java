/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package readers.controller;

// Import Modal to Controller
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import readers.modal.ReaderModal;
import readers.boundary.ReaderHelper;

/**
 *
 * @author khanh
 */
public class ReaderController {

    ReaderModal reader = new ReaderModal();
    ReaderHelper readerHelper = new ReaderHelper();

    private static ReaderController me;

    /**
     * Hàm khởi tạo là private để không đối tượng nào bên ngoài có thể khởi tạo
     * tuỳ ý đối tượng của lớp này
     */
    public ReaderController() {
    }

    /**
     * Hàm này khởi tạo cho đối tượng dùng chung duy nhất của UserController nếu
     * đối tượng đố null
     *
     * @return đối tượng dùng chung duy nhất của UserController
     */
    public static ReaderController getInstance() {
        if (me == null) {
            me = new ReaderController();
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
    public boolean addReader(String email, String password, String hoten, String mssv, String sdt, int gioitinh, int trangthai) throws SQLException, ClassNotFoundException {
        reader.setEmail(email);
        reader.setPassword(readerHelper.MD5encrypt(password));
        reader.setHoten(hoten);
        reader.setMssv(mssv);
        reader.setSdt(sdt);
        reader.setGioitinh(gioitinh);
        reader.setTrangthai(trangthai);
        boolean run = reader.addUser();

        JOptionPane.showInputDialog(null, readerHelper.MD5encrypt(password));
        return run;
    }

    public boolean updateProfile(String email, String hoten, String mssv, String sdt, int gioitinh) throws SQLException, ClassNotFoundException {
        reader.setEmail(email);
        reader.setHoten(hoten);
        reader.setMssv(mssv);
        reader.setSdt(sdt);
        reader.setGioitinh(gioitinh);
        boolean run = reader.updateProfile(email);

//        JOptionPane.showInputDialog(null, readerHelper.MD5encrypt(password));
        return run;
    }

    public ReaderModal findByEmail(String email) throws SQLException, ClassNotFoundException {
        ReaderModal reader = new ReaderModal();
        if (reader.findByEmail(email)) {
            return reader;
        }
        return null;
    }

    public boolean changePassword(String email, String newPass) throws SQLException, ClassNotFoundException {
        ReaderModal reader = new ReaderModal();
        return  reader.changePassword(email, newPass);
    }
    
    public boolean checkPassword(String inputPass) {
        inputPass = readerHelper.MD5encrypt(inputPass);
        return inputPass.equals(reader.getPassword());
    }

    public int checkLog(String email, String pass) throws SQLException, ClassNotFoundException {
        return reader.checkLogin(email, pass);
    }

}
