/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package entity;

import java.io.File;
import java.sql.*;


/**
 * Class này giúp tạo hoặc đóng kết nối với cơ sở dữ liệu
 * @author CoTrang-Lecture
 */
public class DataAccessHelper {

    private final String GET_COUNT = "select count(*) from ";
    private static String dbPath = "jdbc:mysql://156.67.222.40:3306/u514628801_qltv?" +
                                   "user=u514628801_qltv&password=123456a@";
    public static Connection conn = null;
    
    /**
     *Hàm này để tạo kết nối với cơ sở dữ liệu
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    public void connectDB() throws SQLException, ClassNotFoundException {
            Class.forName("com.mysql.jdbc.Driver"); 
            conn = DriverManager.getConnection(dbPath);
    }
    /**
     *Hàm này để đóng kết nối cơ sở dữ liệu
     * @throws ClassNotFoundException
     * @throws SQLException
     * @see ClassNotFoundException
     * @see SQLException
     */
    public void closeDB() throws SQLException {
        if (conn != null)
        	conn.close();
    }
    /**
     * Hàm này để đếm tổng số bản ghi của 1 bảng trong cơ sở dữ liệu
    * @param table là tên bảng
    * @return int là số bản ghi
    * @throws ClassNotFoundException
    * @throws SQLException
    * @see ClassNotFoundException
    * @see SQLException
    */
    public int countRecord(String table) throws SQLException, ClassNotFoundException{
        int numberOfRows=0;
        connectDB();
        PreparedStatement ps = conn.prepareStatement(GET_COUNT+table);
        ResultSet rs = ps.executeQuery();
        while  (rs.next()) {
           numberOfRows = rs.getInt(1);
        }
        closeDB();
        return numberOfRows;
    }
   
    public void  setDbPath(String dbPath){
        this.dbPath=dbPath;
    }
}
