public class Peminjaman {
    private String kode;
    private String namaPeminjam;
    private String nim;
    private Perangkat perangkat;
    private int jumlah;
    private boolean sudahKembali;

    public Peminjaman(String kode, String namaPeminjam, String nim, Perangkat perangkat, int jumlah) {
        this.kode = kode;
        this.namaPeminjam = namaPeminjam;
        this.nim = nim;
        this.perangkat = perangkat;
        this.jumlah = jumlah;
        this.sudahKembali = false;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaPeminjam() {
        return namaPeminjam;
    }

    public String getNim() {
        return nim;
    }

    public Perangkat getPerangkat() {
        return perangkat;
    }

    public int getJumlah() {
        return jumlah;
    }

    public boolean isSudahKembali() {
        return sudahKembali;
    }

    public void tandaiKembali() {
        sudahKembali = true;
        perangkat.kembalikan(jumlah);
    }
}