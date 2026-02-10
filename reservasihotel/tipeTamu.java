class tipeTamu extends dataTamu{
    private int jenisKamar;
    private int nomorKamar;
    private int lamaMenginap;
    private String tanggalCheckIn;
    private String tanggalCheckOut;
    private double hargaPerhari;
    
    
    public tipeTamu(int id,String nama, int nomorTelepon,int usia,
        int jenisKamar,int nomorKamar,int lamaMenginap,String tanggalCheckIn, String tanggalCheckOut, double hargaPerhari) {
             super(id,nama,nomorTelepon,usia);
             
             this.jenisKamar = jenisKamar;
             this.nomorKamar = nomorKamar;
             this.lamaMenginap = lamaMenginap;
             this.tanggalCheckIn = tanggalCheckIn;
             this.tanggalCheckOut = tanggalCheckOut;
             this.hargaPerhari = hargaPerhari;
   
    }
    double hitungTotalPembayaran() {
        return lamaMenginap * hargaPerhari;
    }
    public void inputDataTamu(){
        super.inputDataTamu();
        
        double totalHarga = hitungTotalPembayaran();
        System.out.println("Jenis kamar: "+jenisKamar);
        System.out.println("Nomor Kamar: " + nomorKamar);
        System.out.println("Lama menginap: "+lamaMenginap + " hari ");
        System.out.println("Tanggal Check-In (format: dd/mm/yyyy): "+tanggalCheckIn);
        System.out.println("Tanggal Check-Out (format: dd/mm/yyyy): "+tanggalCheckOut);  
        System.out.println("Harga Per Hari: " + hargaPerhari);
        System.out.println("Total Harga: Rp" + totalHarga);
        System.out.println();
        
    }
}