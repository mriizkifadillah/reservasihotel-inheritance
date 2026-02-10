import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Tamu{
    static koneksi konek = new koneksi();
    public void Tamu(){
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Masukkan nama: ");
        String nama = sc.nextLine();
        
        System.out.print("Masukkan nomor telepon: ");
        int nomorTelepon = sc.nextInt();
        
        System.out.print("Masukkan usia anda: ");
        int usia = sc.nextInt();
        
        System.out.println("================================================");
        System.out.println("||    Jenis Kamar      ||          Harga      ||");
        System.out.println("|| 1. Standard Room    ||   Rp. 300.000/malam ||");
        System.out.println("|| 2. Deluxe Room      ||   Rp. 350.000/malam ||");
        System.out.println("|| 3. Suite Room       ||   Rp. 450.000/malam ||");
        System.out.println("|| 4. Executive Room   ||   Rp. 550.000/malam ||");
        System.out.println("================================================");
        System.out.print("Masukkan jenis kamar: "); 
        int jenisKamar = sc.nextInt();
        
        System.out.print("Masukkan nomor kamar: ");
        int nomorKamar = sc.nextInt();
        
        System.out.print("Lama menginap: ");
        int lamaMenginap = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Masukkan Tanggal Check-In (format: dd/mm/yyyy): ");
        String tanggalCheckIn = sc.nextLine();
        
        System.out.print("Masukkan Tanggal Check-Out (format: dd/mm/yyyy): ");
        String tanggalCheckOut = sc.nextLine();
        
        System.out.print("Harga Perhari: ");
        double hargaPerhari = sc.nextDouble();
       
        System.out.println();
                
        tipeTamu tipeTamu = new tipeTamu(id,nama,nomorTelepon,usia,jenisKamar,nomorKamar,lamaMenginap,tanggalCheckIn,tanggalCheckOut,hargaPerhari);

        tipeTamu.inputDataTamu();
        
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        try {
            String url = "jdbc:mysql://localhost/reservasihotel";
            String user = "root";
            String password = "";

            connection = DriverManager.getConnection(url, user, password);

            String sql = "INSERT INTO reservasi (id, nama, nomor_telepon, usia, jenis_kamar, nomor_kamar, lama_menginap, tanggal_check_in, tanggal_check_out, harga_perhari) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setInt(1, id);
            preparedStatement.setString(2, nama);
            preparedStatement.setInt(3, nomorTelepon); 
            preparedStatement.setInt(4, usia);
            preparedStatement.setInt(5, jenisKamar);
            preparedStatement.setInt(6, nomorKamar);
            preparedStatement.setInt(7, lamaMenginap);
            preparedStatement.setString(8, tanggalCheckIn);
            preparedStatement.setString(9, tanggalCheckOut);
            preparedStatement.setDouble(10, hargaPerhari);

            preparedStatement.executeUpdate();

            System.out.println("Data tamu berhasil disimpan ke database.");
        } catch (SQLException e) {
            System.out.println("Gagal menyimpan data tamu ke database: " + e.getMessage());
        } finally {
            try {
                if (preparedStatement != null) preparedStatement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Gagal menutup koneksi: " + e.getMessage());
            }
        }
    }
}