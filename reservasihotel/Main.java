import java.io.*;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int menuProgram;

        do {
            System.out.println();
            System.out.println("1. Cek Fasilitas Hotel");
            System.out.println("2. Pesan Hotel");
            System.out.println("3. Keluar");
            System.out.println();
            System.out.print("Masukkan pilihan anda: ");
            menuProgram = scanner.nextInt();

            switch (menuProgram) {
                case 1:
                    Fasilitas.displayFasilitas();
                    break;
                case 2: 
                    Tamu pesanan = new Tamu();
                    pesanan.Tamu();
                    break;
                case 3:
                    System.out.println("Terima kasih telah menggunakan layanan kami!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan masukkan pilihan yang benar.");
            }
        } while (menuProgram != 3);
    }
}