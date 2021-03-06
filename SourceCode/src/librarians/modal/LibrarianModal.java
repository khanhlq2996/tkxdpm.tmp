/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package librarians.modal;

import entity.modal.DataAccessHelper;
import static entity.modal.DataAccessHelper.conn;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import readers.modal.ReaderModal;

/**
 *
 * @author khanh
 */
public class LibrarianModal extends DataAccessHelper{
    private final String GET_LOGIN = "SELECT * FROM thuthu WHERE email=? AND password=?";
    private final String SEARCH_USER_BY_EMAIL = "SELECT * FROM thuthu WHERE email = ?";
    private final String ADD_USER = "INSERT INTO thuthu (email,password,hoten,sdt,gioitinh,trangthai) VALUES (?,?,?,?,?,?)";
    //    private final String SEARCH_USER = "select firstName,lastName,User.email,roleName,birthday,phoneNumber from User,Role,UserRole where User.email = UserRole.email and Role.roleId = UserRole.roleId";
    private final String UPDATE_PASS = "UPDATE thuthu SET password = ? where email = ?";
    private final String UPDATE_PROFILE ="UPDATE thuthu SET email=?,hoten=?,sdt=?,gioitinh=? WHERE email = ?";
    
    private String email;
    private String password;
    private String hoten;
    private String sdt;
    private int gioitinh;
    private int trangthai;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public int getGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(int gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getTrangthai() {
        return trangthai;
    }

    public void setTrangthai(int trangthai) {
        this.trangthai = trangthai;
    }

     /**
     *Hàm này kiểm tra xem email và pass word có khớp với csdl không
     * và kiểm tra các trạng thài khóa hoặc yêu cầu thay đổi pass của người dùng.
     * @param email là email người dùng
     * @param password là mật khẩu người dùng
     * @return int return là : 0. tài khoản bị khóa, 1 yêu cầu thay đổi pass
     * 2 là đúng, 3 là sai mật khẩu, 4 là email không tồn tại.
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */ 
    public boolean changePassword(String emai, String password) throws SQLException, ClassNotFoundException {
        connectDB();
        try {
            connectDB();            
            PreparedStatement ps = conn.prepareStatement(UPDATE_PASS);
            ps.setString(1, password);
            ps.setString(2, emai);
            ps.executeUpdate();
            closeDB();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {   
            Logger.getLogger(ReaderModal.class.getName()).log(Level.SEVERE, null, ex);
            return false;    
        }
    }
    
    
    /**
     *Hàm này kiểm tra xem email và pass word có khớp với csdl không
     * và kiểm tra các trạng thài khóa hoặc yêu cầu thay đổi pass của người dùng.
     * @param email là email người dùng
     * @param password là mật khẩu người dùng
     * @return int return là : 0. tài khoản bị khóa, 1 yêu cầu thay đổi pass
     * 2 là đúng, 3 là sai mật khẩu, 4 là email không tồn tại.
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */ 
    public int checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
        if(findByEmail(email)){
            connectDB();
            PreparedStatement ps = conn.prepareStatement(GET_LOGIN);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if (rs != null && rs.next()) {
                if(rs.getInt("trangthai") == 0){
                    closeDB();
                    return 0; // bị khóa
                }else{
                    closeDB();
                    return 1; // đăng nhập thành công
                }
            }else{
                closeDB();
                return 2; // sai mật khẩu
            }
        }
        return 3; // email không tồn tại
    }
    
        
    /**
     *Tìm người dùng theo email
     * @param email email
     * @return boolean nếu user tồn tại return true, ngược lại thì return false;
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */ 
    public boolean findByEmail(String email) throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(SEARCH_USER_BY_EMAIL);
        ps.setString(1, email);
        ps.executeQuery();
        ResultSet rs = ps.executeQuery();
        if(rs !=null && rs.next()){
            this.setEmail(rs.getString("email"));
            this.setPassword(rs.getString("password"));
            this.setHoten(rs.getString("hoten"));
            this.setSdt(rs.getString("sdt"));
            this.setGioitinh(rs.getInt("gioitinh"));
            this.setTrangthai(rs.getInt("trangthai"));
            closeDB();
            return true;
        }
        closeDB();
        return false;
        
    }
    
    
    /**
     *Thêm mới người dùng
     * @param ip_status
     * @return boolean cho thấy có sửa được trong cá sở dữ liệu không, nếu không, do lỗi sql.
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */ 
    public boolean addUser() throws SQLException, ClassNotFoundException {   
        try {
            connectDB();
            PreparedStatement ps;   
            
            ps = conn.prepareStatement(ADD_USER);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, hoten);
            ps.setString(4, sdt);
            ps.setInt(5, gioitinh);
            ps.setInt(6, trangthai);
            ps.executeUpdate();
            closeDB();
            System.out.println("Thanh cong");
            return true;
        } catch (SQLException | ClassNotFoundException ex) {   
            Logger.getLogger(ReaderModal.class.getName()).log(Level.SEVERE, null, ex);
            return false;    
        }
    }
    
    
    /**
     * Cập nhật thông  người dùng
     * @return boolean cho thấy có sửa được trotinng cá sở dữ liệu không, nếu không, do lỗi sql.
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    public boolean updateProfile(String oldEmail) throws SQLException, ClassNotFoundException{
        try {
            connectDB();
            PreparedStatement ps = conn.prepareStatement(UPDATE_PROFILE);
            ps.setString(1, email);
            ps.setString(2, hoten);
            ps.setString(3, sdt);
            ps.setInt(4, gioitinh);
            ps.setString(5, oldEmail);
            ps.executeUpdate();
            closeDB();
            return true;
        } catch (SQLException | ClassNotFoundException ex) {   
            Logger.getLogger(ReaderModal.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
