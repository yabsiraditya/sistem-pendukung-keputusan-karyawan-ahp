package skp.model;

/**
 *
 * @author yabsiraditya
 */

public class KaryawanModel {
    private String idkaryawan;
    private String nama;
    private String jabatan;
    private String jenkel;
    private String tgllahir;

    public KaryawanModel(String idkaryawan, String nama, String jabatan, String jenkel, String tgllahir) {
        this.idkaryawan = idkaryawan;
        this.nama = nama;
        this.jabatan = jabatan;
        this.jenkel = jenkel;
        this.tgllahir = tgllahir;
    }

    public String getIdkaryawan() {
        return idkaryawan;
    }

    public void setIdkaryawan(String idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJenkel() {
        return jenkel;
    }

    public void setJenkel(String jenkel) {
        this.jenkel = jenkel;
    }

    public String getTgllahir() {
        return tgllahir;
    }

    public void setTgllahir(String ttl) {
        this.tgllahir = tgllahir;
    }
    
    
}
