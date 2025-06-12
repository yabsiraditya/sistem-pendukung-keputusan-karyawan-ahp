package skp.view;

import java.sql.Connection;
import java.sql.PreparedStatement;
import skp.util.DBConnection;
import java.sql.ResultSet;


/**
 *
 * @author yabsiraditya
 */

public class PanelDashboard extends javax.swing.JPanel {

    private static Connection conn = new DBConnection().getConnection();

    public PanelDashboard() {
        initComponents();
        loadData();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maindashboard = new skp.customs.CustomPanelRounded();
        cardkaryawan = new skp.customs.CustomPanelRounded();
        lblnama = new javax.swing.JLabel();
        lblicon = new javax.swing.JLabel();
        lbljumlahuser = new javax.swing.JLabel();
        cardkaryawan1 = new skp.customs.CustomPanelRounded();
        lblnama1 = new javax.swing.JLabel();
        lblicon1 = new javax.swing.JLabel();
        lbljumlahkaryawan = new javax.swing.JLabel();
        cardkaryawan2 = new skp.customs.CustomPanelRounded();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lbljumlahpenilaian = new javax.swing.JLabel();
        cardutama = new skp.customs.CustomPanelRounded();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new java.awt.CardLayout());

        maindashboard.setBackground(new java.awt.Color(255, 255, 255));
        maindashboard.setRoundBottomLeft(30);
        maindashboard.setRoundBottomRight(30);
        maindashboard.setRoundTopLeft(30);
        maindashboard.setRoundTopRight(30);

        cardkaryawan.setBackground(new java.awt.Color(77, 168, 218));
        cardkaryawan.setPreferredSize(new java.awt.Dimension(311, 135));
        cardkaryawan.setRoundBottomLeft(30);
        cardkaryawan.setRoundBottomRight(30);
        cardkaryawan.setRoundTopLeft(30);
        cardkaryawan.setRoundTopRight(30);

        lblnama.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblnama.setForeground(new java.awt.Color(255, 255, 255));
        lblnama.setText("User");

        lblicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/admin.png"))); // NOI18N

        lbljumlahuser.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lbljumlahuser.setForeground(new java.awt.Color(255, 255, 255));
        lbljumlahuser.setText("999");

        javax.swing.GroupLayout cardkaryawanLayout = new javax.swing.GroupLayout(cardkaryawan);
        cardkaryawan.setLayout(cardkaryawanLayout);
        cardkaryawanLayout.setHorizontalGroup(
            cardkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardkaryawanLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbljumlahuser, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                    .addComponent(lblnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblicon)
                .addContainerGap())
        );
        cardkaryawanLayout.setVerticalGroup(
            cardkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardkaryawanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblnama, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbljumlahuser, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(cardkaryawanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardkaryawan1.setBackground(new java.awt.Color(77, 168, 218));
        cardkaryawan1.setPreferredSize(new java.awt.Dimension(311, 135));
        cardkaryawan1.setRoundBottomLeft(30);
        cardkaryawan1.setRoundBottomRight(30);
        cardkaryawan1.setRoundTopLeft(30);
        cardkaryawan1.setRoundTopRight(30);

        lblnama1.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        lblnama1.setForeground(new java.awt.Color(255, 255, 255));
        lblnama1.setText("Karyawan");

        lblicon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/karyawan.png"))); // NOI18N

        lbljumlahkaryawan.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lbljumlahkaryawan.setForeground(new java.awt.Color(255, 255, 255));
        lbljumlahkaryawan.setText("999");

        javax.swing.GroupLayout cardkaryawan1Layout = new javax.swing.GroupLayout(cardkaryawan1);
        cardkaryawan1.setLayout(cardkaryawan1Layout);
        cardkaryawan1Layout.setHorizontalGroup(
            cardkaryawan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardkaryawan1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardkaryawan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbljumlahkaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblnama1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(lblicon1)
                .addContainerGap())
        );
        cardkaryawan1Layout.setVerticalGroup(
            cardkaryawan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardkaryawan1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(lblnama1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbljumlahkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(cardkaryawan1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblicon1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardkaryawan2.setBackground(new java.awt.Color(77, 168, 218));
        cardkaryawan2.setPreferredSize(new java.awt.Dimension(311, 135));
        cardkaryawan2.setRoundBottomLeft(30);
        cardkaryawan2.setRoundBottomRight(30);
        cardkaryawan2.setRoundTopLeft(30);
        cardkaryawan2.setRoundTopRight(30);

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Penilaian");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/penilaian.png"))); // NOI18N

        lbljumlahpenilaian.setFont(new java.awt.Font("Montserrat", 1, 36)); // NOI18N
        lbljumlahpenilaian.setForeground(new java.awt.Color(255, 255, 255));
        lbljumlahpenilaian.setText("999");

        javax.swing.GroupLayout cardkaryawan2Layout = new javax.swing.GroupLayout(cardkaryawan2);
        cardkaryawan2.setLayout(cardkaryawan2Layout);
        cardkaryawan2Layout.setHorizontalGroup(
            cardkaryawan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardkaryawan2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(cardkaryawan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbljumlahpenilaian, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addContainerGap())
        );
        cardkaryawan2Layout.setVerticalGroup(
            cardkaryawan2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardkaryawan2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbljumlahpenilaian, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
            .addGroup(cardkaryawan2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        cardutama.setBackground(new java.awt.Color(245, 245, 245));
        cardutama.setRoundBottomLeft(30);
        cardutama.setRoundBottomRight(30);
        cardutama.setRoundTopLeft(30);
        cardutama.setRoundTopRight(30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/decision.png"))); // NOI18N

        javax.swing.GroupLayout cardutamaLayout = new javax.swing.GroupLayout(cardutama);
        cardutama.setLayout(cardutamaLayout);
        cardutamaLayout.setHorizontalGroup(
            cardutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardutamaLayout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        cardutamaLayout.setVerticalGroup(
            cardutamaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(cardutamaLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout maindashboardLayout = new javax.swing.GroupLayout(maindashboard);
        maindashboard.setLayout(maindashboardLayout);
        maindashboardLayout.setHorizontalGroup(
            maindashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maindashboardLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(maindashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addGroup(maindashboardLayout.createSequentialGroup()
                        .addComponent(cardkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(cardkaryawan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)
                        .addComponent(cardkaryawan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cardutama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        maindashboardLayout.setVerticalGroup(
            maindashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(maindashboardLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(maindashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cardkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardkaryawan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cardkaryawan2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cardutama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(maindashboard, "card2");
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private skp.customs.CustomPanelRounded cardkaryawan;
    private skp.customs.CustomPanelRounded cardkaryawan1;
    private skp.customs.CustomPanelRounded cardkaryawan2;
    private skp.customs.CustomPanelRounded cardutama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblicon;
    private javax.swing.JLabel lblicon1;
    private javax.swing.JLabel lbljumlahkaryawan;
    private javax.swing.JLabel lbljumlahpenilaian;
    private javax.swing.JLabel lbljumlahuser;
    private javax.swing.JLabel lblnama;
    private javax.swing.JLabel lblnama1;
    private skp.customs.CustomPanelRounded maindashboard;
    // End of variables declaration//GEN-END:variables

    private int jumlahUser() {
        int totalUser = 0;
        try {
            String sql = "SELECT COUNT(*) as total FROM user";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                totalUser = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalUser;
    }
    
    private int jumlahKaryawan() {
        int totalKaryawan = 0;
        try {
            String sql = "SELECT COUNT(*) as total FROM karyawan";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                totalKaryawan = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalKaryawan;
    }
    
    private int jumlahPenilaian() {
        int totalPenilaian = 0;
        try {
            String sql = "SELECT COUNT(*) as total FROM penilaian";
            PreparedStatement st = conn.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            if(rs.next()) {
                totalPenilaian = rs.getInt("total");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return totalPenilaian;
    }
    
    private void loadData() {
        lbljumlahuser.setText(String.valueOf(jumlahUser()));
        lbljumlahkaryawan.setText(String.valueOf(jumlahKaryawan()));
        lbljumlahpenilaian.setText(String.valueOf(jumlahPenilaian()));
    }
    
}