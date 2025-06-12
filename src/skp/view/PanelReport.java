package skp.view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.HashMap;

import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.swing.JRViewer;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;

/**
 *
 * @author yabsiraditya
 */
public class PanelReport extends javax.swing.JPanel {
    private JFrame parent;

    public PanelReport(JFrame parent) {
        this.parent = parent;

        initComponents();
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jenkel = new javax.swing.ButtonGroup();
        dateChooser1 = new com.raven.datechooser.DateChooser();
        mainkaryawan = new skp.customs.CustomPanelRounded();
        viewkaryawan = new skp.customs.CustomPanelRounded();
        jLabel4 = new javax.swing.JLabel();
        btnprint = new skp.customs.CustomButtonRounded();
        btnpriview = new skp.customs.CustomButtonRounded();
        btnbatal = new skp.customs.CustomButtonRounded();
        panelpreview = new javax.swing.JScrollPane();
        combolaporan = new skp.customs.CustomComboboxSuggest();

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
        jLabel4.setText("Data Laporan");

        btnprint.setBackground(new java.awt.Color(78, 51, 34));
        btnprint.setText("Print");
        btnprint.setFillClick(new java.awt.Color(62, 134, 173));
        btnprint.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnprint.setFillOver(new java.awt.Color(82, 191, 251));
        btnprint.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btnprint.setPreferredSize(new java.awt.Dimension(200, 45));
        btnprint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnprintActionPerformed(evt);
            }
        });

        btnpriview.setBackground(new java.awt.Color(78, 51, 34));
        btnpriview.setText("Preview");
        btnpriview.setFillClick(new java.awt.Color(62, 134, 173));
        btnpriview.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnpriview.setFillOver(new java.awt.Color(82, 191, 251));
        btnpriview.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btnpriview.setPreferredSize(new java.awt.Dimension(200, 45));
        btnpriview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpriviewActionPerformed(evt);
            }
        });

        btnbatal.setBackground(new java.awt.Color(78, 51, 34));
        btnbatal.setText("Batal");
        btnbatal.setFillClick(new java.awt.Color(62, 134, 173));
        btnbatal.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnbatal.setFillOver(new java.awt.Color(82, 191, 251));
        btnbatal.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btnbatal.setPreferredSize(new java.awt.Dimension(200, 45));
        btnbatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnbatalActionPerformed(evt);
            }
        });

        combolaporan.setEditable(false);
        combolaporan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Pilih Laporan--", "Data Karyawan", "Data Penilaian", "Data Kriteria", "Data Peringkat", "Surat Karyawan Teladan" }));
        combolaporan.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        combolaporan.setMinimumSize(new java.awt.Dimension(199, 45));

        javax.swing.GroupLayout viewkaryawanLayout = new javax.swing.GroupLayout(viewkaryawan);
        viewkaryawan.setLayout(viewkaryawanLayout);
        viewkaryawanLayout.setHorizontalGroup(
            viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewkaryawanLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addGroup(viewkaryawanLayout.createSequentialGroup()
                        .addComponent(combolaporan, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnpriview, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(panelpreview, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        viewkaryawanLayout.setVerticalGroup(
            viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewkaryawanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combolaporan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnprint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnbatal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnpriview, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(panelpreview, javax.swing.GroupLayout.PREFERRED_SIZE, 495, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        mainkaryawan.add(viewkaryawan, "card2");

        add(mainkaryawan, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnprintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnprintActionPerformed
        File reportFile = new File(".");
        String dirr = "";
        int cb = combolaporan.getSelectedIndex();
        if (cb == 1) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT " +
                    "    karyawan.`idkaryawan` AS karyawan_idkaryawan, " +
                    "    karyawan.`nama` AS karyawan_nama, " +
                    "    karyawan.`jabatan` AS karyawan_jabatan, " +
                    "    karyawan.`jenkel` AS karyawan_jenkel, " +
                    "    karyawan.`tgllahir` AS karyawan_tgllahir " +
                    "FROM `karyawan` karyawan";
                
                dirr = reportFile.getCanonicalPath() + "/src/skp/reports/";
                JasperDesign design = JRXmlLoader.load(new File(dirr, "ReportKaryawan.jrxml"));
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JFrame frame = new JFrame("Report Karyawan");
                frame.getContentPane().add(new JRViewer(jp));
                frame.setSize(1000, 650);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            } catch (SQLException | IOException | JRException ex) {
                JOptionPane.showMessageDialog(null, "\nGagal Mencetak\n" + ex,
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (cb == 2) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT " +
                    "    p.idpenilaian AS penilaian_idpenilaian, " +
                    "    p.idkaryawan AS penilaian_idkaryawan, " +
                    "    k.nama AS karyawan_nama, " +
                    "    k.jabatan AS karyawan_jabatan, " +
                    "    p.disiplin AS penilaian_disiplin, " +
                    "    p.kerjasama AS penilaian_kerjasama, " +
                    "    p.etika AS penilaian_etika, " +
                    "    p.tanggungjawab AS penilaian_tanggungjawab " +
                    "FROM penilaian p " +
                    "JOIN karyawan k ON p.idkaryawan = k.idkaryawan;";
                
                dirr = reportFile.getCanonicalPath() + "/src/skp/reports/";
                JasperDesign design = JRXmlLoader.load(new File(dirr, "ReportPenilaian.jrxml"));
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JFrame frame = new JFrame("Report Karyawan");
                frame.getContentPane().add(new JRViewer(jp));
                frame.setSize(1000, 650);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            } catch (SQLException | IOException | JRException ex) {
                JOptionPane.showMessageDialog(null, "\nGagal Mencetak\n" + ex,
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (cb == 3) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT" +
                    "     kriteria.`idkriteria` AS kriteria_idkriteria, " +
                    "     kriteria.`nama` AS kriteria_nama, " +
                    "     kriteria.`bobot` AS kriteria_bobot " +
                    "FROM" +
                    "     `kriteria` kriteria";

                dirr = reportFile.getCanonicalPath() + "/src/skp/reports/";
                JasperDesign design = JRXmlLoader.load(new File(dirr, "ReportKriteria.jrxml"));
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JFrame frame = new JFrame("Report Karyawan");
                frame.getContentPane().add(new JRViewer(jp));
                frame.setSize(1000, 650);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);

            } catch (SQLException | IOException | JRException ex) {
                JOptionPane.showMessageDialog(null, "\nGagal Mencetak\n" + ex,
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (cb == 4) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT" +
                    "    p.idperingkat AS peringkat_idperingkat, " +
                    "    p.idkaryawan AS peringkat_idkaryawan, " +
                    "    k.nama AS karyawan_nama, " +
                    "    k.jabatan AS karyawan_jabatan, " +
                    "    p.score AS peringkat_score " +
                    "FROM" +
                    "    peringkat p " +
                    "JOIN" +
                    "    karyawan k ON p.idkaryawan = k.idkaryawan " +
                    "ORDER BY" +
                    "    p.score DESC ";
                
                dirr = reportFile.getCanonicalPath() + "/src/skp/reports/";
                JasperDesign design = JRXmlLoader.load(new File(dirr, "ReportPeringkat.jrxml"));
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JFrame frame = new JFrame("Report Karyawan");
                frame.getContentPane().add(new JRViewer(jp));
                frame.setSize(1000, 650);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            } catch (SQLException | IOException | JRException ex) {
                JOptionPane.showMessageDialog(null, "\nGagal Mencetak\n" + ex,
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }
        if (cb == 5) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT" +
                    "    p.idperingkat AS peringkat_idperingkat, " +
                    "    p.idkaryawan AS peringkat_idkaryawan, " +
                    "    k.nama AS karyawan_nama, " +
                    "    k.jabatan AS karyawan_jabatan, " +
                    "    p.score AS peringkat_score " +
                    "FROM" +
                    "    peringkat p " +
                    "JOIN" +
                    "    karyawan k ON p.idkaryawan = k.idkaryawan " +
                    "ORDER BY" +
                    "    p.score DESC " +
                    "LIMIT 1";
                               
                dirr = reportFile.getCanonicalPath() + "/src/skp/reports/";
                JasperDesign design = JRXmlLoader.load(new File(dirr, "ReportTeladan.jrxml"));
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jp = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JFrame frame = new JFrame("Report Karyawan");
                frame.getContentPane().add(new JRViewer(jp));
                frame.setSize(1000, 650);
                frame.setLocationRelativeTo(null);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setVisible(true);
            } catch (SQLException | IOException | JRException ex) {
                JOptionPane.showMessageDialog(null, "\nGagal Mencetak\n" + ex,
                    "Kesalahan", JOptionPane.ERROR_MESSAGE);
            }
        }        
    }//GEN-LAST:event_btnprintActionPerformed

    private void btnbatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnbatalActionPerformed
        panelView();
    }//GEN-LAST:event_btnbatalActionPerformed

    private void btnpriviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpriviewActionPerformed
        int cb = combolaporan.getSelectedIndex();
        if (cb == 1) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }                
                String sql = 
                    "SELECT " +
                    "    karyawan.`idkaryawan` AS karyawan_idkaryawan, " +
                    "    karyawan.`nama` AS karyawan_nama, " +
                    "    karyawan.`jabatan` AS karyawan_jabatan, " +
                    "    karyawan.`jenkel` AS karyawan_jenkel, " +
                    "    karyawan.`tgllahir` AS karyawan_tgllahir " +
                    "FROM `karyawan` karyawan";

                File reportFile = new File(".");
                String dirr = reportFile.getCanonicalPath() + "/src/skp/reports/ReportKaryawan.jrxml";
                JasperDesign design = JRXmlLoader.load(dirr);
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JRViewer viewer = new JRViewer(jasperPrint);
                panelpreview.setViewportView(viewer);
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
        if (cb == 2) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT " +
                    "    p.idpenilaian AS penilaian_idpenilaian, " +
                    "    p.idkaryawan AS penilaian_idkaryawan, " +
                    "    k.nama AS karyawan_nama, " +
                    "    k.jabatan AS karyawan_jabatan, " +
                    "    p.disiplin AS penilaian_disiplin, " +
                    "    p.kerjasama AS penilaian_kerjasama, " +
                    "    p.etika AS penilaian_etika, " +
                    "    p.tanggungjawab AS penilaian_tanggungjawab " +
                    "FROM penilaian p " +
                    "JOIN karyawan k ON p.idkaryawan = k.idkaryawan;";

                File reportFile = new File(".");
                String dirr = reportFile.getCanonicalPath() + "/src/skp/reports/ReportPenilaian.jrxml";
                JasperDesign design = JRXmlLoader.load(dirr);
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JRViewer viewer = new JRViewer(jasperPrint);
                panelpreview.setViewportView(viewer);
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }  
        if (cb == 3) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT" +
                    "     kriteria.`idkriteria` AS kriteria_idkriteria, " +
                    "     kriteria.`nama` AS kriteria_nama, " +
                    "     kriteria.`bobot` AS kriteria_bobot " +
                    "FROM" +
                    "     `kriteria` kriteria";

                File reportFile = new File(".");
                String dirr = reportFile.getCanonicalPath() + "/src/skp/reports/ReportKriteria.jrxml";
                JasperDesign design = JRXmlLoader.load(dirr);
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JRViewer viewer = new JRViewer(jasperPrint);
                panelpreview.setViewportView(viewer);
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }    
        if (cb == 4) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT" +
                    "    p.idperingkat AS peringkat_idperingkat, " +
                    "    p.idkaryawan AS peringkat_idkaryawan, " +
                    "    k.nama AS karyawan_nama, " +
                    "    k.jabatan AS karyawan_jabatan, " +
                    "    p.score AS peringkat_score " +
                    "FROM" +
                    "    peringkat p " +
                    "JOIN" +
                    "    karyawan k ON p.idkaryawan = k.idkaryawan " +
                    "ORDER BY" +
                    "    p.score DESC ";

                File reportFile = new File(".");
                String dirr = reportFile.getCanonicalPath() + "/src/skp/reports/ReportPeringkat.jrxml";
                JasperDesign design = JRXmlLoader.load(dirr);
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JRViewer viewer = new JRViewer(jasperPrint);
                panelpreview.setViewportView(viewer);
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }  
        if (cb == 5) {
            try {
                Connection cone = skp.util.DBConnection.getConnection();
                if (cone == null) {
                    throw new SQLException("Koneksi ke database gagal.");
                }
                String sql = 
                    "SELECT" +
                    "    p.idperingkat AS peringkat_idperingkat, " +
                    "    p.idkaryawan AS peringkat_idkaryawan, " +
                    "    k.nama AS karyawan_nama, " +
                    "    k.jabatan AS karyawan_jabatan, " +
                    "    p.score AS peringkat_score " +
                    "FROM" +
                    "    peringkat p " +
                    "JOIN" +
                    "    karyawan k ON p.idkaryawan = k.idkaryawan " +
                    "ORDER BY" +
                    "    p.score DESC " +
                    "LIMIT 1";

                File reportFile = new File(".");
                String dirr = reportFile.getCanonicalPath() + "/src/skp/reports/ReportTeladan.jrxml";
                JasperDesign design = JRXmlLoader.load(dirr);
                JasperReport jr = JasperCompileManager.compileReport(design);
                Statement stat = cone.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                JRResultSetDataSource rsDataSource = new JRResultSetDataSource(rs);
                JasperPrint jasperPrint = JasperFillManager.fillReport(jr, new HashMap<>(), rsDataSource);
                JRViewer viewer = new JRViewer(jasperPrint);
                panelpreview.setViewportView(viewer);
            } catch (Exception ex) {
                Logger.getLogger(getClass().getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
            }
        }
    }//GEN-LAST:event_btnpriviewActionPerformed

    private void panelView() {
        mainkaryawan.removeAll();
        mainkaryawan.add(new PanelReport(parent));
        mainkaryawan.repaint();
        mainkaryawan.revalidate();    
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private skp.customs.CustomButtonRounded btnbatal;
    private skp.customs.CustomButtonRounded btnprint;
    private skp.customs.CustomButtonRounded btnpriview;
    private skp.customs.CustomComboboxSuggest combolaporan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.ButtonGroup jenkel;
    private skp.customs.CustomPanelRounded mainkaryawan;
    private javax.swing.JScrollPane panelpreview;
    private skp.customs.CustomPanelRounded viewkaryawan;
    // End of variables declaration//GEN-END:variables
}