package skp.view;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import skp.view.*;
import skp.controller.*;
import skp.customs.*;
import skp.model.UserModel;

/**
 *
 * @author yabsiraditya
 */

public class PanelMenu extends javax.swing.JPanel {
    
    private JPanel panelmain;
    private UserModel user;
    
    private final Color ACTIVE_BG = new Color(240, 240, 240);
    private final Color HOVER_BG = new Color(250, 250, 250);
    private final Color NORMAL_BG = new Color(255, 255, 255);
    private final Color ACTIVE_LINE = new Color(77,168,218);


    public PanelMenu(JPanel panelmain, UserModel user) {
        initComponents();
        this.panelmain = panelmain;
        this.user = user;

        SessionController session = new SessionController();
        if (!session.getSessionUserRole().equals("admin")) {
            menuadmin.setVisible(false);
        }
        
        setActiveMenu("dashboard");
    }
    
    private void resetAllMenus() {
        menudashboard.setBackground(NORMAL_BG);
        panelline.setBackground(NORMAL_BG);
        
        menukaryawan.setBackground(NORMAL_BG);
        panelline2.setBackground(NORMAL_BG);
        
        menupenilaian.setBackground(NORMAL_BG);
        panelline3.setBackground(NORMAL_BG);
        
        menukriteria.setBackground(NORMAL_BG);
        panelline4.setBackground(NORMAL_BG);
        
        menuperingkat.setBackground(NORMAL_BG);
        panelline6.setBackground(NORMAL_BG);
        
        menulaporan.setBackground(NORMAL_BG);
        panelline9.setBackground(NORMAL_BG);
        
        menuadmin.setBackground(NORMAL_BG);
        panelline11.setBackground(NORMAL_BG);
        
    }
    
    public void setActiveMenu(String menuName) {
        resetAllMenus();
        
        switch(menuName.toLowerCase()) {
            case "dashboard":
                menudashboard.setBackground(ACTIVE_BG);
                panelline.setBackground(ACTIVE_LINE);
                break;
            case "karyawan":
                menukaryawan.setBackground(ACTIVE_BG);
                panelline2.setBackground(ACTIVE_LINE);
                break;
            case "penilaian":
                menupenilaian.setBackground(ACTIVE_BG);
                panelline3.setBackground(ACTIVE_LINE);
                break;
            case "kriteria":
                menukriteria.setBackground(ACTIVE_BG);
                panelline4.setBackground(ACTIVE_LINE);
                break;
            case "peringkat":
                menuperingkat.setBackground(ACTIVE_BG);
                panelline6.setBackground(ACTIVE_LINE);
                break; 
            case "laporan":
                menulaporan.setBackground(ACTIVE_BG);
                panelline9.setBackground(ACTIVE_LINE);
                break; 
            case "admin":
                menuadmin.setBackground(ACTIVE_BG);
                panelline11.setBackground(ACTIVE_LINE);
                break;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelmenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        menudashboard = new javax.swing.JPanel();
        panelline = new javax.swing.JPanel();
        btndashboard = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        menukaryawan = new javax.swing.JPanel();
        panelline2 = new javax.swing.JPanel();
        btnkaryawan = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        menupenilaian = new javax.swing.JPanel();
        panelline3 = new javax.swing.JPanel();
        btnpenilaian = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        menukriteria = new javax.swing.JPanel();
        panelline4 = new javax.swing.JPanel();
        btnkriteria = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        menuperingkat = new javax.swing.JPanel();
        panelline6 = new javax.swing.JPanel();
        btnperingkat = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        menulaporan = new javax.swing.JPanel();
        panelline9 = new javax.swing.JPanel();
        btnlaporan = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        menuadmin = new javax.swing.JPanel();
        panelline11 = new javax.swing.JPanel();
        btnadmin = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        menulogout = new javax.swing.JPanel();
        panelline12 = new javax.swing.JPanel();
        btnlogout = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setLayout(new java.awt.CardLayout());

        panelmenu.setBackground(new java.awt.Color(255, 255, 255));
        panelmenu.setMaximumSize(new java.awt.Dimension(300, 768));
        panelmenu.setMinimumSize(new java.awt.Dimension(300, 768));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel1.setText("Nama PT");

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 14)); // NOI18N
        jLabel2.setText("Menu");

        menudashboard.setBackground(new java.awt.Color(255, 255, 255));
        menudashboard.setPreferredSize(new java.awt.Dimension(284, 45));

        panelline.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panellineLayout = new javax.swing.GroupLayout(panelline);
        panelline.setLayout(panellineLayout);
        panellineLayout.setHorizontalGroup(
            panellineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panellineLayout.setVerticalGroup(
            panellineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btndashboard.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btndashboard.setText("Dashboard");
        btndashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btndashboardMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btndashboardMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btndashboardMouseExited(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/iconpc.png"))); // NOI18N

        javax.swing.GroupLayout menudashboardLayout = new javax.swing.GroupLayout(menudashboard);
        menudashboard.setLayout(menudashboardLayout);
        menudashboardLayout.setHorizontalGroup(
            menudashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menudashboardLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(btndashboard, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menudashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menudashboardLayout.createSequentialGroup()
                    .addComponent(panelline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
        menudashboardLayout.setVerticalGroup(
            menudashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btndashboard, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menudashboardLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menukaryawan.setBackground(new java.awt.Color(255, 255, 255));
        menukaryawan.setPreferredSize(new java.awt.Dimension(284, 45));

        panelline2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelline2Layout = new javax.swing.GroupLayout(panelline2);
        panelline2.setLayout(panelline2Layout);
        panelline2Layout.setHorizontalGroup(
            panelline2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelline2Layout.setVerticalGroup(
            panelline2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btnkaryawan.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnkaryawan.setText("Karyawan");
        btnkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkaryawanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkaryawanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkaryawanMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/iconkaryawan.png"))); // NOI18N

        javax.swing.GroupLayout menukaryawanLayout = new javax.swing.GroupLayout(menukaryawan);
        menukaryawan.setLayout(menukaryawanLayout);
        menukaryawanLayout.setHorizontalGroup(
            menukaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menukaryawanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(btnkaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
            .addGroup(menukaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menukaryawanLayout.createSequentialGroup()
                    .addComponent(panelline2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
        menukaryawanLayout.setVerticalGroup(
            menukaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btnkaryawan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menukaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelline2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menupenilaian.setBackground(new java.awt.Color(255, 255, 255));
        menupenilaian.setPreferredSize(new java.awt.Dimension(284, 45));

        panelline3.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelline3Layout = new javax.swing.GroupLayout(panelline3);
        panelline3.setLayout(panelline3Layout);
        panelline3Layout.setHorizontalGroup(
            panelline3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelline3Layout.setVerticalGroup(
            panelline3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btnpenilaian.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnpenilaian.setText("Penilaian");
        btnpenilaian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnpenilaianMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnpenilaianMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnpenilaianMouseExited(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/iconnilai.png"))); // NOI18N

        javax.swing.GroupLayout menupenilaianLayout = new javax.swing.GroupLayout(menupenilaian);
        menupenilaian.setLayout(menupenilaianLayout);
        menupenilaianLayout.setHorizontalGroup(
            menupenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menupenilaianLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(btnpenilaian, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
            .addGroup(menupenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menupenilaianLayout.createSequentialGroup()
                    .addComponent(panelline3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
        menupenilaianLayout.setVerticalGroup(
            menupenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btnpenilaian, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menupenilaianLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelline3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menukriteria.setBackground(new java.awt.Color(255, 255, 255));
        menukriteria.setPreferredSize(new java.awt.Dimension(284, 45));

        panelline4.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelline4Layout = new javax.swing.GroupLayout(panelline4);
        panelline4.setLayout(panelline4Layout);
        panelline4Layout.setHorizontalGroup(
            panelline4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelline4Layout.setVerticalGroup(
            panelline4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btnkriteria.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnkriteria.setText("Kriteria");
        btnkriteria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnkriteriaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnkriteriaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnkriteriaMouseExited(evt);
            }
        });

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/iconkriteria.png"))); // NOI18N

        javax.swing.GroupLayout menukriteriaLayout = new javax.swing.GroupLayout(menukriteria);
        menukriteria.setLayout(menukriteriaLayout);
        menukriteriaLayout.setHorizontalGroup(
            menukriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menukriteriaLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addComponent(btnkriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
            .addGroup(menukriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menukriteriaLayout.createSequentialGroup()
                    .addComponent(panelline4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
        menukriteriaLayout.setVerticalGroup(
            menukriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btnkriteria, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menukriteriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelline4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuperingkat.setBackground(new java.awt.Color(255, 255, 255));
        menuperingkat.setPreferredSize(new java.awt.Dimension(284, 45));

        panelline6.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelline6Layout = new javax.swing.GroupLayout(panelline6);
        panelline6.setLayout(panelline6Layout);
        panelline6Layout.setHorizontalGroup(
            panelline6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelline6Layout.setVerticalGroup(
            panelline6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btnperingkat.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnperingkat.setText("Peringkat");
        btnperingkat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnperingkatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnperingkatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnperingkatMouseExited(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/iconrank.png"))); // NOI18N

        javax.swing.GroupLayout menuperingkatLayout = new javax.swing.GroupLayout(menuperingkat);
        menuperingkat.setLayout(menuperingkatLayout);
        menuperingkatLayout.setHorizontalGroup(
            menuperingkatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuperingkatLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(btnperingkat, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
            .addGroup(menuperingkatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuperingkatLayout.createSequentialGroup()
                    .addComponent(panelline6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
        menuperingkatLayout.setVerticalGroup(
            menuperingkatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btnperingkat, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuperingkatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelline6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menulaporan.setBackground(new java.awt.Color(255, 255, 255));
        menulaporan.setPreferredSize(new java.awt.Dimension(284, 45));

        panelline9.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelline9Layout = new javax.swing.GroupLayout(panelline9);
        panelline9.setLayout(panelline9Layout);
        panelline9Layout.setHorizontalGroup(
            panelline9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelline9Layout.setVerticalGroup(
            panelline9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btnlaporan.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnlaporan.setText("Laporan");
        btnlaporan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlaporanMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlaporanMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlaporanMouseExited(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/iconreport.png"))); // NOI18N

        javax.swing.GroupLayout menulaporanLayout = new javax.swing.GroupLayout(menulaporan);
        menulaporan.setLayout(menulaporanLayout);
        menulaporanLayout.setHorizontalGroup(
            menulaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menulaporanLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(btnlaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
            .addGroup(menulaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menulaporanLayout.createSequentialGroup()
                    .addComponent(panelline9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
        menulaporanLayout.setVerticalGroup(
            menulaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btnlaporan, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menulaporanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelline9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuadmin.setBackground(new java.awt.Color(255, 255, 255));
        menuadmin.setPreferredSize(new java.awt.Dimension(284, 45));

        panelline11.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelline11Layout = new javax.swing.GroupLayout(panelline11);
        panelline11.setLayout(panelline11Layout);
        panelline11Layout.setHorizontalGroup(
            panelline11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelline11Layout.setVerticalGroup(
            panelline11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btnadmin.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnadmin.setText("Admin");
        btnadmin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnadminMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnadminMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnadminMouseExited(evt);
            }
        });

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/iconadmin.png"))); // NOI18N

        javax.swing.GroupLayout menuadminLayout = new javax.swing.GroupLayout(menuadmin);
        menuadmin.setLayout(menuadminLayout);
        menuadminLayout.setHorizontalGroup(
            menuadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuadminLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(btnadmin, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE))
            .addGroup(menuadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menuadminLayout.createSequentialGroup()
                    .addComponent(panelline11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
        menuadminLayout.setVerticalGroup(
            menuadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btnadmin, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menuadminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelline11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menulogout.setBackground(new java.awt.Color(255, 255, 255));
        menulogout.setPreferredSize(new java.awt.Dimension(284, 45));

        panelline12.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelline12Layout = new javax.swing.GroupLayout(panelline12);
        panelline12.setLayout(panelline12Layout);
        panelline12Layout.setHorizontalGroup(
            panelline12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        panelline12Layout.setVerticalGroup(
            panelline12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        btnlogout.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        btnlogout.setText("Logout");
        btnlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnlogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnlogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnlogoutMouseExited(evt);
            }
        });

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/logout.png"))); // NOI18N

        javax.swing.GroupLayout menulogoutLayout = new javax.swing.GroupLayout(menulogout);
        menulogout.setLayout(menulogoutLayout);
        menulogoutLayout.setHorizontalGroup(
            menulogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menulogoutLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(btnlogout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(menulogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(menulogoutLayout.createSequentialGroup()
                    .addComponent(panelline12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 279, Short.MAX_VALUE)))
        );
        menulogoutLayout.setVerticalGroup(
            menulogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
            .addComponent(btnlogout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(menulogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(panelline12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel12.setText("LOGO");

        javax.swing.GroupLayout panelmenuLayout = new javax.swing.GroupLayout(panelmenu);
        panelmenu.setLayout(panelmenuLayout);
        panelmenuLayout.setHorizontalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 258, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(menulaporan, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(menuperingkat, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(menukriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(menupenilaian, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(menukaryawan, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(menudashboard, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(menulogout, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                    .addComponent(menuadmin, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelmenuLayout.setVerticalGroup(
            panelmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelmenuLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(15, 15, 15)
                .addComponent(menudashboard, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menukaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menupenilaian, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menukriteria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuperingkat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menulaporan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(menuadmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78)
                .addComponent(menulogout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        add(panelmenu, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btndashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashboardMouseClicked
        setActiveMenu("dashboard");

        panelmain.removeAll();
        panelmain.add(new PanelDashboard());
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_btndashboardMouseClicked

    private void btndashboardMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashboardMouseEntered
        if (!menudashboard.getBackground().equals(ACTIVE_BG)) {
            menudashboard.setBackground(HOVER_BG);
        }
    }//GEN-LAST:event_btndashboardMouseEntered

    private void btndashboardMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btndashboardMouseExited
        if (!menudashboard.getBackground().equals(ACTIVE_BG)) {
            menudashboard.setBackground(NORMAL_BG);
        }
    }//GEN-LAST:event_btndashboardMouseExited

    private void btnkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkaryawanMouseClicked
        setActiveMenu("karyawan");
        
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        panelmain.removeAll();
        panelmain.add(new PanelKaryawan(parentFrame));
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_btnkaryawanMouseClicked

    private void btnkaryawanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkaryawanMouseEntered
        if (!menukaryawan.getBackground().equals(ACTIVE_BG)) {
            menukaryawan.setBackground(HOVER_BG);
        }
    }//GEN-LAST:event_btnkaryawanMouseEntered

    private void btnkaryawanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkaryawanMouseExited
        if (!menukaryawan.getBackground().equals(ACTIVE_BG)) {
            menukaryawan.setBackground(NORMAL_BG);
        }
    }//GEN-LAST:event_btnkaryawanMouseExited

    private void btnpenilaianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpenilaianMouseClicked
        setActiveMenu("penilaian");
        
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        panelmain.removeAll();
        panelmain.add(new PanelPenilaian(parentFrame));
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_btnpenilaianMouseClicked

    private void btnpenilaianMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpenilaianMouseEntered
        if (!menupenilaian.getBackground().equals(ACTIVE_BG)) {
            menupenilaian.setBackground(HOVER_BG);
        }
    }//GEN-LAST:event_btnpenilaianMouseEntered

    private void btnpenilaianMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnpenilaianMouseExited
        if (!menupenilaian.getBackground().equals(ACTIVE_BG)) {
            menupenilaian.setBackground(NORMAL_BG);
        }
    }//GEN-LAST:event_btnpenilaianMouseExited

    private void btnkriteriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkriteriaMouseClicked
        setActiveMenu("kriteria");
        
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        panelmain.removeAll();
        panelmain.add(new PanelKriteria(parentFrame));
        panelmain.repaint();
        panelmain.revalidate();    }//GEN-LAST:event_btnkriteriaMouseClicked

    private void btnkriteriaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkriteriaMouseEntered
        if (!menukriteria.getBackground().equals(ACTIVE_BG)) {
            menukriteria.setBackground(HOVER_BG);
        }
    }//GEN-LAST:event_btnkriteriaMouseEntered

    private void btnkriteriaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnkriteriaMouseExited
        if (!menukriteria.getBackground().equals(ACTIVE_BG)) {
            menukriteria.setBackground(NORMAL_BG);
        }
    }//GEN-LAST:event_btnkriteriaMouseExited

    private void btnperingkatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperingkatMouseClicked
        setActiveMenu("peringkat");
        
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        panelmain.removeAll();
        panelmain.add(new PanelPeringkat(parentFrame));
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_btnperingkatMouseClicked

    private void btnperingkatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperingkatMouseEntered
        if (!menuperingkat.getBackground().equals(ACTIVE_BG)) {
            menuperingkat.setBackground(HOVER_BG);
        }
    }//GEN-LAST:event_btnperingkatMouseEntered

    private void btnperingkatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnperingkatMouseExited
        if (!menukriteria.getBackground().equals(ACTIVE_BG)) {
            menukriteria.setBackground(NORMAL_BG);
        }
    }//GEN-LAST:event_btnperingkatMouseExited

    private void btnlaporanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlaporanMouseClicked
        setActiveMenu("laporan");
        
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        panelmain.removeAll();
        panelmain.add(new PanelReport(parentFrame));
        panelmain.repaint();
        panelmain.revalidate();    }//GEN-LAST:event_btnlaporanMouseClicked

    private void btnlaporanMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlaporanMouseEntered
        if (!menulaporan.getBackground().equals(ACTIVE_BG)) {
            menulaporan.setBackground(HOVER_BG);
        }
    }//GEN-LAST:event_btnlaporanMouseEntered

    private void btnlaporanMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlaporanMouseExited
        if (!menulaporan.getBackground().equals(ACTIVE_BG)) {
            menulaporan.setBackground(NORMAL_BG);
        }
    }//GEN-LAST:event_btnlaporanMouseExited

    private void btnadminMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadminMouseClicked
        setActiveMenu("admin");
        
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        panelmain.removeAll();
        panelmain.add(new PanelUser(parentFrame));
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_btnadminMouseClicked

    private void btnadminMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadminMouseEntered
        if (!menuadmin.getBackground().equals(ACTIVE_BG)) {
            menuadmin.setBackground(HOVER_BG);
        }
    }//GEN-LAST:event_btnadminMouseEntered

    private void btnadminMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnadminMouseExited
        if (!menuadmin.getBackground().equals(ACTIVE_BG)) {
            menuadmin.setBackground(NORMAL_BG);
        }
    }//GEN-LAST:event_btnadminMouseExited

    private void btnlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseClicked
        menulogout.setBackground(ACTIVE_BG);
        
        JFrame parentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
        if (parentFrame != null) {
            AuthController auth = new AuthController(parentFrame);
            auth.logoutUser();
        }
    }//GEN-LAST:event_btnlogoutMouseClicked

    private void btnlogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseEntered
        menulogout.setBackground(HOVER_BG);
    }//GEN-LAST:event_btnlogoutMouseEntered

    private void btnlogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnlogoutMouseExited
        menulogout.setBackground(NORMAL_BG);
    }//GEN-LAST:event_btnlogoutMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnadmin;
    private javax.swing.JLabel btndashboard;
    private javax.swing.JLabel btnkaryawan;
    private javax.swing.JLabel btnkriteria;
    private javax.swing.JLabel btnlaporan;
    private javax.swing.JLabel btnlogout;
    private javax.swing.JLabel btnpenilaian;
    private javax.swing.JLabel btnperingkat;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel menuadmin;
    private javax.swing.JPanel menudashboard;
    private javax.swing.JPanel menukaryawan;
    private javax.swing.JPanel menukriteria;
    private javax.swing.JPanel menulaporan;
    private javax.swing.JPanel menulogout;
    private javax.swing.JPanel menupenilaian;
    private javax.swing.JPanel menuperingkat;
    private javax.swing.JPanel panelline;
    private javax.swing.JPanel panelline11;
    private javax.swing.JPanel panelline12;
    private javax.swing.JPanel panelline2;
    private javax.swing.JPanel panelline3;
    private javax.swing.JPanel panelline4;
    private javax.swing.JPanel panelline6;
    private javax.swing.JPanel panelline9;
    private javax.swing.JPanel panelmenu;
    // End of variables declaration//GEN-END:variables
}
