/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package entity;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import common.Constants;
import static entity.DataAccessHelper.conn;
/**
 *
 * @author khanh
 */
public class LibrarianModal extends DataAccessHelper{
    private final String GET_LOGIN = "Select * from Librarian where email=? and password=?";
    private final String SEARCH_LIBRARIAN_BY_EMAIL = "select * from Librarian where email=?";
    private final String ADD_LIBRARIAN = "INSERT INTO Lbrarian (email,password,name,birth,gender,address,phone)";
    private final String SEARCH_LIBRARIAN = "select id_librarian,name,phone,email from Librarian where id_reader = ?, name = ?, phone = ?, email=? ";
    private final String UPDATE_PASS = "update Librarian set password = ?,requestToChange=? where email = ?";
    private final String UPDATE_PROFILE = "update Librarian set password = ?,name = ?,birth = ?,gender=?,address=?,phone=?,email=? where email=?";
    
    private String email;
    private String password;
    private String id_librarian;
    private String name;
    private String birth;
    private String gender;
    private String address;
    private String phone;
    private boolean requestToChange;
    private boolean status;

    
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

    public String getId_librarian() {
        return id_librarian;
    }

    public void setId_librarian(String id_librarian) {
        this.id_librarian = id_librarian;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirth() {
        return birth;
    }

    public void setBirth(String birth) {
        this.birth = birth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public boolean getRequestToChange() {
        return requestToChange;
    }
    
    public void setRequestToChange(boolean requestToChange) {
        this.requestToChange = requestToChange;
    }
    
    public boolean getStatus() {
        return status;
    }
    
    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public int checkLogin(String email, String password) throws SQLException, ClassNotFoundException {
        if(findByEmail(email)){
            connectDB();
            PreparedStatement ps = conn.prepareStatement(GET_LOGIN);
            ps.setString(1, email);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            if(rs != null && rs.next()){
                if(rs.getBoolean("status")){
                    closeDB();
                    return Constants.LOGIN_BLOCKED;
                }else if(rs.getBoolean("requestToChange")){
                    closeDB();
                    return Constants.LOGIN_CHANGE_PASSWORD;
                }else{
                    closeDB();
                    return Constants.LOGIN_SUCCESS;
                }
                     
            }else{
                closeDB();
                return Constants.LOGIN_WRONG_PASSWORD;
            }
        }
        return Constants.LOGIN_WRONG_EMAIL;
    } 
    
    public void updatePassword(String email,String password) throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(UPDATE_PASS);
        ps.setString(1, password);
        ps.setInt(2, 0);
        ps.setString(3, email);
        ps.executeUpdate();
        closeDB();
    }
    
    public boolean addLibrarian() throws SQLException, ClassNotFoundException {
        connectDB();
        PreparedStatement ps;
        ps = conn.prepareStatement(SEARCH_LIBRARIAN_BY_EMAIL);
        ps.setString(1, email);
        ResultSet rs = ps.executeQuery();
        if (rs != null && rs.next()){
            closeDB();
            return false;
        }else{
            ps = conn.prepareStatement(ADD_LIBRARIAN);
            ps.setString(1, email);
            ps.setString(2, password);
            ps.setString(3, name);
            ps.setString(4, birth);
            ps.setString(5, gender);
            ps.setString(6, address);
            ps.setString(7, phone);
            ps.setBoolean(8, requestToChange);
            ps.setBoolean(9, status);
            ps.executeUpdate();
        }
        closeDB();
        return true;
    }
    
    public ArrayList<Librarian> searchLibrarian(String id_librarian, String name, String phone, String email) throws SQLException, ClassNotFoundException {
        ArrayList<Librarian> librarians = new ArrayList<Librarian>();
        ResultSet rs;
        String queryForId_librarian = "and id_librarian like ?";
        String queryForName = "and name like ? ";
        String queryForPhone = "and phone like ?";
        String queryForEmail = "and email like ?";
        String query = SEARCH_LIBRARIAN;
        if(!id_librarian.isEmpty())
            query+=queryForId_librarian;
        if(!name.isEmpty())
            query+=queryForName;
        if(!phone.isEmpty())
            query+=queryForPhone;
        if(!email.isEmpty())
            query+=queryForEmail;
        connectDB();
        PreparedStatement ps = conn.prepareStatement(query);
        int count=1;
        if(!id_librarian.isEmpty()){
            ps.setString(count, "%"+id_librarian+"%");
            count++;
        }
        if(!name.isEmpty()){
            ps.setString(count, "%"+name+"%");
            count++;
        }
        if(!phone.isEmpty()){
            ps.setString(count, "%"+phone+"%");
            count++;
        }
        if(!email.isEmpty()){
            ps.setString(count, "%"+email+"%");
            count++;
        }
        rs = ps.executeQuery();
        while(rs.next()){
            LibrarianModal librarian = new LibrarianModal();
            librarian.setId_librarian(rs.getString("id_librarian"));
            librarian.setName(rs.getString("name"));
            librarian.setPhone(rs.getString("phone"));
            librarian.setEmail(rs.getString("email"));
            librarians.add(librarian);
        }
        closeDB();
        return librarians;
    }
    
    public boolean findByEmail(String email) throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(SEARCH_LIBRARIAN_BY_EMAIL);
        ps.setString(1, email);
        ps.executeQuery();
        ResultSet rs = ps.executeQuery();
        if(rs !=null && rs.next()){
            this.setName(rs.getString("name"));
            this.setEmail(rs.getString("email"));
            this.setPhone(rs.getString("phone"));
            this.setBirth(rs.getString("birth"));
            this.setPassword(rs.getString("password"));
            this.setGender(rs.getString("gender"));
            closeDB();
            return true;
        }
        closeDB();
        return false;
        
    }
    
    public void updateProfile(String oldEmail) throws SQLException, ClassNotFoundException{
        connectDB();
        PreparedStatement ps = conn.prepareStatement(UPDATE_PROFILE);
        ps.setString(1, password);
        ps.setString(2, email);
        ps.setString(3, gender);
        ps.setString(4, name);
        ps.setString(5, phone);
        ps.setString(6, address);
        ps.setString(7, birth);
        ps.setBoolean(8, requestToChange);
        ps.setBoolean(9, status);
        ps.setString(10, oldEmail);
        ps.executeUpdate();
        closeDB();
    }
}
