package skp.model;

/**
 *
 * @author yabsiraditya
 */

public class KriteriaModel {
    private String idKriteria;
    private String nama;
    private double bobot;

    public KriteriaModel(String idKriteria, String nama, double bobot) {
        this.idKriteria = idKriteria;
        this.nama = nama;
        this.bobot = bobot;
    }

    public String getIdKriteria() {
        return idKriteria;
    }

    public void setIdKriteria(String idKriteria) {
        this.idKriteria = idKriteria;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public double getBobot() {
        return bobot;
    }

    public void setBobot(double bobot) {
        this.bobot = bobot;
    }
}

