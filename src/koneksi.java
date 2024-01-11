
import java.sql.*;
import javax.swing.JOptionPane;
public class koneksi {
    Connection mahasiswa;
    public static Connection BukaKoneksi(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection mahasiswa = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_mahasiswa","root","");
            return mahasiswa;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
