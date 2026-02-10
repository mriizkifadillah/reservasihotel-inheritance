import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class koneksi{
    public static Connection konek;

    public static Connection bukaKoneksi() {
        try {
            String url = "jdbc:mysql://localhost/reservasihotel";
            String user = "root"; 
            String password = ""; 

            Class.forName("com.mysql.cj.jdbc.Driver");
            konek = DriverManager.getConnection(url, user, password);
            System.out.println("Berhasil koneksi");
            return konek;
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Gagal koneksi: " + e.getMessage());
            return null;
        }
    }

    public static void tutupKoneksi() {
        try {
            if (konek != null) {
                konek.close();
                System.out.println("Koneksi ditutup");
            }
        } catch (SQLException e) {
            System.out.println("Gagal menutup koneksi: " + e.getMessage());
        }
    }
}