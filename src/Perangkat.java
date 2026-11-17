public class Perangkat {
    private String kode;
    private String nama;
    private String kategori;
    private int stokTotal;
    private int stokTersedia;

    public Perangkat(String kode, String nama, String kategori, int stokTotal) {
        this.kode = kode;
        this.nama = nama;
        this.kategori = kategori;
        this.stokTotal = stokTotal;
        this.stokTersedia = stokTotal;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public String getKategori() {
        return kategori;
    }

    public int getStokTotal() {
        return stokTotal;
    }

    public int getStokTersedia() {
        return stokTersedia;
    }

    public void pinjam(int jumlah) {
        stokTersedia = stokTersedia - jumlah;
    }

    public void kembalikan(int jumlah) {
        stokTersedia = stokTersedia + jumlah;
    }
}