package skp.model;

/**
 *
 * @author yabsiraditya
 */

public class PenilaianModel {
    private String idpenilaian;
    private String idkaryawan;
    private String nama;
    private String jabatan;
    private double disiplin;
    private double kerjasama;
    private double etika;
    private double tanggungjawab;
    private double nilai;

    
    public PenilaianModel(String idpenilaian, String idkaryawan, String nama, String jabatan, double disiplin, double kerjasama, double etika, double tanggungjawab) {
        this.idpenilaian = idpenilaian;
        this.idkaryawan = idkaryawan;
        this.nama = nama;
        this.jabatan = jabatan;
        this.disiplin = disiplin;
        this.kerjasama = kerjasama;
        this.etika = etika;
        this.tanggungjawab = tanggungjawab;
    }
    

    public String getIdpenilaian() {
        return idpenilaian;
    }

    public void setIdpenilaian(String idpenilaian) {
        this.idpenilaian = idpenilaian;
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

    public void setNama(String namaKaryawan) {
        this.nama = nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    } 

    public double getDisiplin() {
        return disiplin;
    }

    public void setDisiplin(double disiplin) {
        this.disiplin = disiplin;
    }

    public double getKerjasama() {
        return kerjasama;
    }

    public void setKerjasama(double kerjasama) {
        this.kerjasama = kerjasama;
    }

    public double getEtika() {
        return etika;
    }

    public void setEtika(double etika) {
        this.etika = etika;
    }

    public double getTanggungjawab() {
        return tanggungjawab;
    }

    public void setTanggungjawab(double tanggungjawab) {
        this.tanggungjawab = tanggungjawab;
    }
    
    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        this.nilai = nilai;
    }
}
