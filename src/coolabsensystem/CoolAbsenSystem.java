package coolabsensystem;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Harun Nurahman
 */
public class CoolAbsenSystem {
public static Connection getKoneksi(String host, String port, String username, String password, String db) {
        String konString = "jdbc:mysql://" + host + ":" + port + "/" + db;
        Connection koneksi = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            koneksi = DriverManager.getConnection(konString, username, password);
            System.out.println("Koneksi Berhasil");
        } catch (Exception ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Koneksi Database Error");
            koneksi = null;
        }
        return koneksi;
    }
}