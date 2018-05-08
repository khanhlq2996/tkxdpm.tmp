package entity;

import java.io.File;
import java.sql.*;


/**
 * Class này giúp tạo hoặc đóng kết nối với cơ sở dữ liệu
 * @author CoTrang-Lecture
 */
public class DataAccessHelper {

    private final String GET_COUNT = "select count(*) from ";
    private static String dbPath = "jdbc:mysql://localhost/test?" +
                                   "user=minty&password=greatsqldb";
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