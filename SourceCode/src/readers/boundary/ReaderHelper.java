/*
 * Phần mềm quản lý thư viện
 * Nhóm 10 - Thiết kế và Xây dựng Phần mềm
 * Thành viên: Đinh Thị Thu Huyền, Nguyễn Thị Ngọc Huyền, Lê Quốc Khánh
 * Giảng viên hướng dẫn: Nguyễn Thị Thu Trang
 * Bản quyền thuộc về Nhóm 10
 */
package readers.boundary;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author khanh
 */
public class ReaderHelper {

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    public static final Pattern VALID_PASSWORD_REGEX = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{8,}$");
    public static final Pattern VALID_PHONE_NUMBER_REGEX = Pattern.compile("^([ .-]*[0-9]+[ .-]*)+$");

    /**
     * Hàm này để kiểm tra email có đúng định dạng
     *
     * @param emailStr là email string
     * @return boolean cho biết đúng định dạng hay không
     */
    public static boolean validateEmail(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
    }

    /**
     * Hàm này để kiểm tra số điện thoại có đúng định dạng
     *
     * @param phoneNumber là số điện thoại
     * @return boolean cho biết đúng định dạng hay không
     */
    public static boolean validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 0) {
            Matcher matcher = VALID_PHONE_NUMBER_REGEX.matcher(phoneNumber);
            return matcher.find();
        }
        return true;
    }

    /**
     * Hàm này để kiểm tra mật khẩu có đúng định dạng
     *
     * @param passStr là mật khẩu
     * @return boolean cho biết đúng định dạng hay không
     */
    public static boolean validatePassword(String passStr) {
        Matcher matcher = VALID_PASSWORD_REGEX.matcher(passStr);
        return matcher.find();
    }

    /**
     * Hàm này để mã hóa mật khẩu theo md5
     *
     * @param password là mật khẩu
     * @return String mật khẩu sau khi mã hóa md5
     */
    public static String MD5encrypt(String password) {
        StringBuffer sb = new StringBuffer();
        try {
            byte[] bytesOfMessage = password.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("MD5");
            byte[] thedigest = md.digest(bytesOfMessage);
            for (int i = 0; i < thedigest.length; i++) {
                sb.append(Integer.toString((thedigest[i] & 0xff) + 0x100, 16).substring(1));
            }
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sb.toString();
    }

    /**
     * Hàm này để chuyển số điện thoại thành định dạng có dấu chấm xen giữa 2 số
     * và loại bỏ các kí tự thùa
     *
     * @param phoneNumber là số điện thoại
     * @return String kết quả chuyển dưới dạng 09.74.01.17.03
     */
    public static String changePhoneNumberToNormalForm(String phoneNumber) {
        String phoneNumberNew = phoneNumber.replaceAll("[ .-]", "");
        String result = new String();
        StringBuilder str = new StringBuilder(phoneNumberNew);
        int i = 2;
        while (i < str.length()) {
            str.insert(i, ".");
            i += 3;
        }
        result = str.toString();
        return result;
    }

    /**
     * Hàm này để lấy Tên giới tính qua giá trị int của giới tính
     *
     * @param idGioiTinh là số điện thoại
     * @return String Tên giới tính
     */
    public int idGioiTinh(String idGioiTinh) {
        switch (idGioiTinh) {
            case "Nam":
                return 0;
            case "Nữ":
                return 1;
            default:
                return 3;
        }
    }

    /**
     * Hàm này để lấy giá trị int qua Tên giới tính của giới tính
     *
     * @param gioiTinh là số điện thoại
     * @return String Tên giới tính
     */
    public String getGioiTinh(int gioiTinh) {
        switch (gioiTinh) {
            case 0:
                return "Nam";
            case 1:
                return "Nữ";
            default:
                return "Giới tính khác";
        }
    }

    /**
     * Hàm này để Kiểm tra mật khẩu và xác nhận mật khẩu có trùng nhau không
     *
     * @param pass mật khẩu
     * @param cfPass xác nhận mật khẩu
     * @return boolean
     */
    public boolean checkConfirmPass(String pass, String cfPass) {
        if (pass.equals(cfPass)) {
            return true;
        } else {
            return false;
        }
    }
}
