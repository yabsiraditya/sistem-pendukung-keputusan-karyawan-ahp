package skp.model;

/**
 *
 * @author yabsiraditya
 */

public class AlternatifModel {
    private String idperingkat;
    private String idkaryawan;
    private double score;

    public AlternatifModel(String idperingkat, String idkaryawan, double score) {
        this.idperingkat = idperingkat;
        this.idkaryawan = idkaryawan;
        this.score = score;
    }
    
    public String getIdperingkat() {
        return idperingkat;
    }

    public void setIdperingkat(String idperingkat) {
        this.idperingkat = idperingkat;
    }

    public String getIdkaryawan() {
        return idkaryawan;
    }

    public void setIdkaryawan(String idkaryawan) {
        this.idkaryawan = idkaryawan;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }
}
