class dataTamu{
    private int id;
    private String nama;
    private int nomorTelepon;
    private int usia;
    private String kebangsaan;
    

    public dataTamu(int id,String nama, int nomorTelepon, int usia) {
        this.id = id;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.usia = usia;
        
    }

    public void inputDataTamu() {
        System.out.println("Detail Reservasi Hotel");
        System.out.println("======================");
        System.out.println("ID Reservasi Anda: "+id);
        System.out.println("Nama Anda: "+nama);
        System.out.println("Nomor Telepon Anda: "+nomorTelepon);
        System.out.println("Usia Anda: "+usia+ " tahun "); 
    }
}