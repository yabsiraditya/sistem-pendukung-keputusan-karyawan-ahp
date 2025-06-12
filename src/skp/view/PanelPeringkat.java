package skp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import skp.controller.AlternatifController;
import skp.controller.AuthController;
import skp.controller.KaryawanController;
import skp.controller.KriteriaController;
import skp.controller.PenilaianController;
import skp.customs.CustomMessageDialog;
import skp.customs.CustomNotification;
import skp.customs.GlassPanePopup;
import skp.model.KaryawanModel;
import skp.model.KriteriaModel;
import skp.model.PenilaianModel;
import skp.util.PerhitunganAHP;

/**
 *
 * @author yabsiraditya
 */
public class PanelPeringkat extends javax.swing.JPanel {
    
    private JFrame parent;
    private KaryawanController kar;
    private List<String> karyawanId = new ArrayList<>();
    
    private AlternatifController alt = new AlternatifController(parent);
    private PerhitunganAHP ahp = new PerhitunganAHP();
    private PenilaianController pen = new PenilaianController(parent);
    private KriteriaController kri = new KriteriaController(parent);

    private final int noColumnIndex = 0;
    private final int noColumnWidth = 100;    
    
    public PanelPeringkat(JFrame parent) {
        this.parent = parent;
        kar = new KaryawanController(parent);

        initComponents();
        loadTable();
        setColumnWidth();
    }
    
    private void setColumnWidth() {
        TableColumnModel columnModel = tabelperingkat.getColumnModel();
        columnModel.getColumn(noColumnIndex).setPreferredWidth(noColumnWidth);
        columnModel.getColumn(noColumnIndex).setMaxWidth(noColumnWidth);
        columnModel.getColumn(noColumnIndex).setMinWidth(noColumnWidth);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenkel = new javax.swing.ButtonGroup();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        mainkaryawan = new skp.customs.CustomPanelRounded();
        viewkaryawan = new skp.customs.CustomPanelRounded();
        jLabel4 = new javax.swing.JLabel();
        btncalculate = new skp.customs.CustomButtonRounded();
        btndelete = new skp.customs.CustomButtonRounded();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelperingkat = new skp.customs.CustomTable();

        dateChooser1.setForeground(new java.awt.Color(0, 106, 113));

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new java.awt.CardLayout());

        mainkaryawan.setBackground(new java.awt.Color(255, 255, 255));
        mainkaryawan.setPreferredSize(new java.awt.Dimension(1026, 648));
        mainkaryawan.setRoundBottomLeft(30);
        mainkaryawan.setRoundBottomRight(30);
        mainkaryawan.setRoundTopLeft(30);
        mainkaryawan.setRoundTopRight(30);
        mainkaryawan.setLayout(new java.awt.CardLayout());

        viewkaryawan.setBackground(new java.awt.Color(255, 255, 255));
        viewkaryawan.setRoundBottomLeft(30);
        viewkaryawan.setRoundBottomRight(30);
        viewkaryawan.setRoundTopLeft(30);
        viewkaryawan.setRoundTopRight(30);

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Data Peringkat Karyawan");

        btncalculate.setBackground(new java.awt.Color(78, 51, 34));
        btncalculate.setText("Hitung Peringkat");
        btncalculate.setFillClick(new java.awt.Color(62, 134, 173));
        btncalculate.setFillOriginal(new java.awt.Color(77, 168, 218));
        btncalculate.setFillOver(new java.awt.Color(82, 191, 251));
        btncalculate.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btncalculate.setPreferredSize(new java.awt.Dimension(200, 45));
        btncalculate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncalculateActionPerformed(evt);
            }
        });

        btndelete.setBackground(new java.awt.Color(78, 51, 34));
        btndelete.setText("Hapus");
        btndelete.setFillClick(new java.awt.Color(62, 134, 173));
        btndelete.setFillOriginal(new java.awt.Color(77, 168, 218));
        btndelete.setFillOver(new java.awt.Color(82, 191, 251));
        btndelete.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btndelete.setPreferredSize(new java.awt.Dimension(200, 45));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });

        tabelperingkat.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabelperingkat.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        jScrollPane4.setViewportView(tabelperingkat);

        javax.swing.GroupLayout viewkaryawanLayout = new javax.swing.GroupLayout(viewkaryawan);
        viewkaryawan.setLayout(viewkaryawanLayout);
        viewkaryawanLayout.setHorizontalGroup(
            viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewkaryawanLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(viewkaryawanLayout.createSequentialGroup()
                        .addComponent(btncalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        viewkaryawanLayout.setVerticalGroup(
            viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewkaryawanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btncalculate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        mainkaryawan.add(viewkaryawan, "card2");

        add(mainkaryawan, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btncalculateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncalculateActionPerformed
        calculateData();
    }//GEN-LAST:event_btncalculateActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btndeleteActionPerformed
    
    private void panelView() {
        mainkaryawan.removeAll();
        mainkaryawan.add(new PanelPeringkat(parent));
        mainkaryawan.repaint();
        mainkaryawan.revalidate();    
    }
   
    // cek apakah bobot kriteria tersedia
    private boolean validateKriteriaBobot(List<KriteriaModel> kriteriaList) {
        if (kriteriaList == null || kriteriaList.isEmpty()) {
            showError("Tidak ada kriteria yang tersedia");
            return false;
        }

        for (KriteriaModel kriteria : kriteriaList) {
            try {
                Double bobot = kriteria.getBobot();
                if (bobot == null || bobot == 0) {
                    showError("Bobot kriteria kosong. Silakan isi dahulu.");
                    return false;
                }
            } catch (Exception e) {
                showError("Error saat memeriksa bobot kriteria: " + e.getMessage());
                return false;
            }
        }
        return true;
    }
    
    private double[][] hitungBobotAlternatif(List<KaryawanModel> karyawanList, List<KriteriaModel> kriteriaList) {
        int nAlternatif = karyawanList.size();
        int nKriteria = kriteriaList.size();
        
        double[][] bobotAlternatifPerKriteria = new double[nAlternatif][nKriteria];

        for (int k = 0; k < nKriteria; k++) {
            String idKriteria = kriteriaList.get(k).getIdKriteria();
            System.out.println("\n=== Perhitungan untuk Kriteria: " + idKriteria + " ===");

            double[] nilai = new double[nAlternatif];
            boolean allZero = true;
            for (int i = 0; i < nAlternatif; i++) {
                PenilaianModel p = pen.getNilai(karyawanList.get(i).getIdkaryawan(), idKriteria);
                nilai[i] = (p != null) ? p.getNilai() : 0;
                if (nilai[i] != 0) allZero = false;
            }

            System.out.println("Nilai awal alternatif:");
            for (int i = 0; i < nAlternatif; i++) {
                System.out.println(" - " + karyawanList.get(i).getNama() + ": " + nilai[i]);
            }

            if (allZero) {
                System.out.println("Semua nilai 0, bobot dibagi rata");
                for (int i = 0; i < nAlternatif; i++) {
                    bobotAlternatifPerKriteria[i][k] = 1.0 / nAlternatif;
                    System.out.println(" - " + karyawanList.get(i).getNama() + " => Bobot: " + bobotAlternatifPerKriteria[i][k]);
                }
                continue;
            }

            // matriks perbandingan AHP
            double[][] matriksAlt = new double[nAlternatif][nAlternatif];
            System.out.println("\nMatriks Perbandingan Alternatif:");
            for (int i = 0; i < nAlternatif; i++) {
                for (int j = 0; j < nAlternatif; j++) {
                    if (nilai[i] == 0 && nilai[j] == 0) {
                        matriksAlt[i][j] = 1.0;
                    } else if (nilai[j] == 0) {
                        matriksAlt[i][j] = 9.0;
                    } else {
                        matriksAlt[i][j] = nilai[i] / nilai[j];
                    }
                    System.out.printf("%.3f\t", matriksAlt[i][j]);
                }
                System.out.println();
            }

            // hitung jumlah per kolom
            double[] jumlahKolom = new double[nAlternatif];
            for (int j = 0; j < nAlternatif; j++) {
                for (int i = 0; i < nAlternatif; i++) {
                    jumlahKolom[j] += matriksAlt[i][j];
                }
            }

            System.out.println("\nJumlah per kolom:");
            for (int j = 0; j < nAlternatif; j++) {
                System.out.printf("Kolom %d: %.3f\n", j + 1, jumlahKolom[j]);
            }

            // matriks normalisasi
            double[][] matriksNorm = new double[nAlternatif][nAlternatif];
            System.out.println("\nMatriks Normalisasi:");
            for (int i = 0; i < nAlternatif; i++) {
                for (int j = 0; j < nAlternatif; j++) {
                    matriksNorm[i][j] = matriksAlt[i][j] / jumlahKolom[j];
                    System.out.printf("%.3f\t", matriksNorm[i][j]);
                }
                System.out.println();
            }

            // hitung bobot alternatif
            System.out.println("\nBobot per Alternatif:");
            for (int i = 0; i < nAlternatif; i++) {
                double sum = 0;
                for (int j = 0; j < nAlternatif; j++) {
                    sum += matriksNorm[i][j];
                }
                double bobot = sum / nAlternatif;
                bobotAlternatifPerKriteria[i][k] = bobot;
                System.out.printf(" - %s => %.3f\n", karyawanList.get(i).getNama(), bobot);
            }
        }

        return bobotAlternatifPerKriteria;
    }

    private void calculateData() {
        // cek apakah bobot kriteria tersedia
        List<KriteriaModel> kriteriaList = kri.getAllKriteria();
        if (kriteriaList.isEmpty()) {
            showError("Tidak ada kriteria yang tersedia");
            return;
        }
        
        if (!validateKriteriaBobot(kriteriaList)) {
            return;
        }
        
        int jumlahKriteria = kriteriaList.size();
        if (jumlahKriteria == 0) {
            System.out.println("Tidak ada kriteria yang tersedia");
            return;
        }

        // Hitung bobot kriteria
        double[][] matriksPerbandingan = kri.getMatrix();
        ahp.setPairwiseComparisonMatrix(matriksPerbandingan);
        ahp.calculatePriorityVector();
        double[] bobotKriteria = ahp.getPriorityVector();

        System.out.println("\n=== Bobot Kriteria ===");
        for (int i = 0; i < jumlahKriteria; i++) {
            System.out.printf(" - %s: %.3f\n", kriteriaList.get(i).getNama(), bobotKriteria[i]);
        }
        
        // cek data karyawan apakah tersedia
        List<KaryawanModel> karyawanList = pen.getKaryawanNilai();
        int jumlahKaryawan = karyawanList.size();
        if (jumlahKaryawan == 0) {
            showError("Tidak ada nilai karyawan yang tersedia");
            System.out.println("Tidak ada karyawan yang tersedia");
            return;
        }

        // hitung bobot alternatif
        double[][] bobotAlternatifPerKriteria = hitungBobotAlternatif(karyawanList, kriteriaList);

        // hitung skor akhir dan simpan
        alt.deleteAllPeringkat();
        System.out.println("\n=== Skor Akhir Setiap Karyawan ===");
        for (int i = 0; i < jumlahKaryawan; i++) {
            double score = 0;
            System.out.printf("\n> %s:\n", karyawanList.get(i).getNama());
            for (int j = 0; j < jumlahKriteria; j++) {
                double kontribusi = bobotAlternatifPerKriteria[i][j] * bobotKriteria[j];
                System.out.printf("  - %s: %.3f x %.3f = %.3f\n", kriteriaList.get(j).getNama(), bobotAlternatifPerKriteria[i][j], bobotKriteria[j], kontribusi);
                score += kontribusi;
            }
            System.out.printf("  => Total Skor: %.3f\n", score);
            String roundedScoreStr = String.format("%.3f", score);
            alt.insertPeringkat(karyawanList.get(i).getIdkaryawan(), Double.parseDouble(roundedScoreStr));
        }
        showSuccess("Perhitungan peringkat berhasil dilakukan!");
        loadTable();
    }
    
    private void loadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.setColumnIdentifiers(new Object[]{"Peringkat", "NIP", "Nama", "Jabatan",  "Skor"});
        List<KaryawanModel> karyawanList = kar.getAllKaryawan();
        List<Object[]> data = alt.getPeringkat(); // kamu perlu bikin method ini di AlternatifController

        int no = 1;
        for (Object[] row : data) {
            String id = (String) row[0];
            String nama = (String) row[1];
            String jabatan = (String) row[2];
            double skor = (Double) row[3];
            model.addRow(new Object[]{no++, id, nama, jabatan, String.format("%.3f", skor)});
        }

        tabelperingkat.setModel(model);
        setColumnWidth();
    }
    
    
    private void deleteData() {
        CustomMessageDialog obj = new CustomMessageDialog();
        obj.setTitle("Hapus Peringkat");
        obj.setMessage("Apakah anda yakin ingin menghapus peringkat?");
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                alt.deleteAllPeringkat();
                loadTable();
                showSuccess("Semua data peringkat berhasil dihapus!");
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj); 
    }
    
    public void showSuccess(String message) {
        CustomNotification panel = new CustomNotification(parent, CustomNotification.Type.SUCCESS, CustomNotification.Location.BOTTOM_RIGHT, message);
    panel.showNotification();
    }

    public void showWarning(String message) {
        CustomNotification panel = new CustomNotification(parent, CustomNotification.Type.INFO, CustomNotification.Location.BOTTOM_RIGHT, message);
        panel.showNotification();
    }

    public void showError(String message) {
        CustomNotification panel = new CustomNotification(parent, CustomNotification.Type.WARNING, CustomNotification.Location.BOTTOM_RIGHT, message);
        panel.showNotification();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private skp.customs.CustomButtonRounded btncalculate;
    private skp.customs.CustomButtonRounded btndelete;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.ButtonGroup jenkel;
    private skp.customs.CustomPanelRounded mainkaryawan;
    private skp.customs.CustomTable tabelperingkat;
    private skp.customs.CustomPanelRounded viewkaryawan;
    // End of variables declaration//GEN-END:variables
}