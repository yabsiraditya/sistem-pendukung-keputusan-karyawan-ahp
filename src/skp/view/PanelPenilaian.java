package skp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import skp.controller.AuthController;
import skp.controller.PenilaianController;
import skp.customs.CustomMessageDialog;
import skp.customs.CustomNotification;
import skp.customs.GlassPanePopup;
import skp.model.KaryawanModel;
import skp.model.PenilaianModel;

/**
 *
 * @author yabsiraditya
 */
public class PanelPenilaian extends javax.swing.JPanel {
    
    private JFrame parent;
    private PenilaianController pen;
    private List<String> penilaianID = new ArrayList<>();

    private final int noColumnIndex = 0;
    private final int noColumnWidth = 40;
    
    public PanelPenilaian(JFrame parent) {
        this.parent = parent;
        pen = new PenilaianController(parent);

        initComponents();
        loadTable();
        setColumnWidth();
    }

    private void setColumnWidth() {
        TableColumnModel columnModel = tabelpenilaian.getColumnModel();
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
        btnadd = new skp.customs.CustomButtonRounded();
        btndelete = new skp.customs.CustomButtonRounded();
        btncancel = new skp.customs.CustomButtonRounded();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelpenilaian = new skp.customs.CustomTable();
        txtsearch = new skp.customs.CustomTextfieldRounded();
        addkaryawan = new skp.customs.CustomPanelRounded();
        jLabel2 = new javax.swing.JLabel();
        btnsaveadd = new skp.customs.CustomButtonRounded();
        btncanceladd = new skp.customs.CustomButtonRounded();
        jLabel5 = new javax.swing.JLabel();
        txtid = new skp.customs.CustomTextfieldRounded();
        jLabel6 = new javax.swing.JLabel();
        txtidkaryawan = new skp.customs.CustomTextfieldRounded();
        jLabel7 = new javax.swing.JLabel();
        btndatakaryawan = new skp.customs.CustomButtonRounded();
        txtnama = new skp.customs.CustomTextfieldRounded();
        txtjabatan = new skp.customs.CustomTextfieldRounded();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        combodisiplin = new skp.customs.CustomComboboxSuggest();
        txtdisiplin = new skp.customs.CustomTextfieldRounded();
        txtkerjasama = new skp.customs.CustomTextfieldRounded();
        combokerjasama = new skp.customs.CustomComboboxSuggest();
        jLabel12 = new javax.swing.JLabel();
        txtetika = new skp.customs.CustomTextfieldRounded();
        comboetika = new skp.customs.CustomComboboxSuggest();
        jLabel13 = new javax.swing.JLabel();
        txttanggungjawab = new skp.customs.CustomTextfieldRounded();
        combotanggungjawab = new skp.customs.CustomComboboxSuggest();
        jLabel14 = new javax.swing.JLabel();

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
        jLabel4.setText("Data Penilaian Karyawan");

        btnadd.setBackground(new java.awt.Color(78, 51, 34));
        btnadd.setText("Tambah");
        btnadd.setFillClick(new java.awt.Color(62, 134, 173));
        btnadd.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnadd.setFillOver(new java.awt.Color(82, 191, 251));
        btnadd.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btnadd.setPreferredSize(new java.awt.Dimension(200, 45));
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
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

        btncancel.setBackground(new java.awt.Color(78, 51, 34));
        btncancel.setText("Batal");
        btncancel.setFillClick(new java.awt.Color(62, 134, 173));
        btncancel.setFillOriginal(new java.awt.Color(77, 168, 218));
        btncancel.setFillOver(new java.awt.Color(82, 191, 251));
        btncancel.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btncancel.setPreferredSize(new java.awt.Dimension(200, 45));
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        tabelpenilaian.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelpenilaian.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        tabelpenilaian.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelpenilaianMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelpenilaian);

        txtsearch.setForeground(new java.awt.Color(102, 102, 102));
        txtsearch.setText("Cari Data Karyawan");
        txtsearch.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtsearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtsearchMouseClicked(evt);
            }
        });
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtsearchKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout viewkaryawanLayout = new javax.swing.GroupLayout(viewkaryawan);
        viewkaryawan.setLayout(viewkaryawanLayout);
        viewkaryawanLayout.setHorizontalGroup(
            viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewkaryawanLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewkaryawanLayout.createSequentialGroup()
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        viewkaryawanLayout.setVerticalGroup(
            viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewkaryawanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(viewkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainkaryawan.add(viewkaryawan, "card2");

        addkaryawan.setBackground(new java.awt.Color(255, 255, 255));
        addkaryawan.setRoundBottomLeft(30);
        addkaryawan.setRoundBottomRight(30);
        addkaryawan.setRoundTopLeft(30);
        addkaryawan.setRoundTopRight(30);

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Tambah Penilaian Karyawan");

        btnsaveadd.setText("Simpan");
        btnsaveadd.setFillClick(new java.awt.Color(62, 134, 173));
        btnsaveadd.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnsaveadd.setFillOver(new java.awt.Color(82, 191, 251));
        btnsaveadd.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btnsaveadd.setPreferredSize(new java.awt.Dimension(200, 45));
        btnsaveadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveaddActionPerformed(evt);
            }
        });

        btncanceladd.setText("Batal");
        btncanceladd.setFillClick(new java.awt.Color(62, 134, 173));
        btncanceladd.setFillOriginal(new java.awt.Color(77, 168, 218));
        btncanceladd.setFillOver(new java.awt.Color(82, 191, 251));
        btncanceladd.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btncanceladd.setPreferredSize(new java.awt.Dimension(200, 45));
        btncanceladd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncanceladdActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel5.setText("ID Penilaian");

        txtid.setEditable(false);
        txtid.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtid.setEnabled(false);
        txtid.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtid.setPreferredSize(new java.awt.Dimension(235, 45));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel6.setText("ID Karyawan");

        txtidkaryawan.setEditable(false);
        txtidkaryawan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtidkaryawan.setEnabled(false);
        txtidkaryawan.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtidkaryawan.setPreferredSize(new java.awt.Dimension(235, 45));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel7.setText("Nama Karyawan");

        btndatakaryawan.setText("Cari");
        btndatakaryawan.setFillClick(new java.awt.Color(62, 134, 173));
        btndatakaryawan.setFillOriginal(new java.awt.Color(77, 168, 218));
        btndatakaryawan.setFillOver(new java.awt.Color(82, 191, 251));
        btndatakaryawan.setFont(new java.awt.Font("Montserrat Medium", 1, 16)); // NOI18N
        btndatakaryawan.setPreferredSize(new java.awt.Dimension(200, 45));
        btndatakaryawan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndatakaryawanActionPerformed(evt);
            }
        });

        txtnama.setEditable(false);
        txtnama.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtnama.setEnabled(false);
        txtnama.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtnama.setPreferredSize(new java.awt.Dimension(235, 45));

        txtjabatan.setEditable(false);
        txtjabatan.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtjabatan.setEnabled(false);
        txtjabatan.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtjabatan.setPreferredSize(new java.awt.Dimension(235, 45));

        jLabel10.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel10.setText("Jabatan");

        jLabel11.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel11.setText("Disiplin");

        combodisiplin.setEditable(false);
        combodisiplin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Disiplin --", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        combodisiplin.setToolTipText("");
        combodisiplin.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        combodisiplin.setPreferredSize(new java.awt.Dimension(195, 45));
        combodisiplin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combodisiplinActionPerformed(evt);
            }
        });

        txtdisiplin.setEditable(false);
        txtdisiplin.setBackground(new java.awt.Color(255, 255, 255));
        txtdisiplin.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtdisiplin.setEnabled(false);
        txtdisiplin.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtdisiplin.setPreferredSize(new java.awt.Dimension(235, 45));

        txtkerjasama.setEditable(false);
        txtkerjasama.setBackground(new java.awt.Color(255, 255, 255));
        txtkerjasama.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtkerjasama.setEnabled(false);
        txtkerjasama.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtkerjasama.setPreferredSize(new java.awt.Dimension(235, 45));

        combokerjasama.setEditable(false);
        combokerjasama.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Kerjasama --", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        combokerjasama.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        combokerjasama.setPreferredSize(new java.awt.Dimension(195, 45));
        combokerjasama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combokerjasamaActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel12.setText("Kerjasama");

        txtetika.setEditable(false);
        txtetika.setBackground(new java.awt.Color(255, 255, 255));
        txtetika.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtetika.setEnabled(false);
        txtetika.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtetika.setPreferredSize(new java.awt.Dimension(235, 45));

        comboetika.setEditable(false);
        comboetika.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Etika --", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        comboetika.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        comboetika.setPreferredSize(new java.awt.Dimension(195, 45));
        comboetika.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboetikaActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel13.setText("Etika");

        txttanggungjawab.setEditable(false);
        txttanggungjawab.setBackground(new java.awt.Color(255, 255, 255));
        txttanggungjawab.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txttanggungjawab.setEnabled(false);
        txttanggungjawab.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txttanggungjawab.setPreferredSize(new java.awt.Dimension(235, 45));

        combotanggungjawab.setEditable(false);
        combotanggungjawab.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-- Tanggung Jawab --", "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
        combotanggungjawab.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        combotanggungjawab.setPreferredSize(new java.awt.Dimension(195, 45));
        combotanggungjawab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotanggungjawabActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel14.setText("Tanggung Jawab");

        javax.swing.GroupLayout addkaryawanLayout = new javax.swing.GroupLayout(addkaryawan);
        addkaryawan.setLayout(addkaryawanLayout);
        addkaryawanLayout.setHorizontalGroup(
            addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addkaryawanLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, addkaryawanLayout.createSequentialGroup()
                        .addComponent(btnsaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncanceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(addkaryawanLayout.createSequentialGroup()
                                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGap(127, 127, 127))
                                .addGroup(addkaryawanLayout.createSequentialGroup()
                                    .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel5)
                                        .addGroup(addkaryawanLayout.createSequentialGroup()
                                            .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(txtidkaryawan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(btndatakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtjabatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(addkaryawanLayout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(466, 466, 466)))
                        .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel14)
                            .addGroup(addkaryawanLayout.createSequentialGroup()
                                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(combotanggungjawab, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                                    .addComponent(combodisiplin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtdisiplin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtetika, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txttanggungjawab, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtkerjasama, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addkaryawanLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel12)
                                    .addComponent(combokerjasama, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(addkaryawanLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(396, 396, 396)
                                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(comboetika, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(85, 85, 85)))
                .addContainerGap(144, Short.MAX_VALUE))
        );
        addkaryawanLayout.setVerticalGroup(
            addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addkaryawanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combodisiplin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdisiplin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidkaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btndatakaryawan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combokerjasama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtkerjasama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(comboetika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtetika, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtjabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combotanggungjawab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txttanggungjawab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 175, Short.MAX_VALUE)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncanceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        mainkaryawan.add(addkaryawan, "card2");

        add(mainkaryawan, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btncanceladdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncanceladdActionPerformed
        panelView();
        loadTable();
        resetForm();
    }//GEN-LAST:event_btncanceladdActionPerformed

    private void btnsaveaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveaddActionPerformed
        if(btnsaveadd.getText().equals("Tambah")){
            btnsaveadd.setText("Simpan");
        } else if (btnsaveadd.getText().equals("Simpan")) {
            insertData();
        } else if (btnsaveadd.getText().equals("Perbarui")) {
            updateData();
        }
    }//GEN-LAST:event_btnsaveaddActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
        searchData(txtsearch.getText().trim());
    }//GEN-LAST:event_txtsearchKeyTyped

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        txtsearch.setText("");
    }//GEN-LAST:event_txtsearchMouseClicked

    private void tabelpenilaianMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelpenilaianMouseClicked
        if(btnadd.getText().equals("Tambah")) {
            btnadd.setText("Ubah");
            btndelete.setVisible(true);
            btncancel.setVisible(true);
        }
    }//GEN-LAST:event_tabelpenilaianMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        loadTable();
        panelView();
    }//GEN-LAST:event_btncancelActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        panelAdd();
        txtid.setText(pen.generatePenilaianId());
        if(btnadd.getText().equals("Ubah")) {
            dataTable();
            btnsaveadd.setText("Perbarui");
        }
    }//GEN-LAST:event_btnaddActionPerformed

    private void btndatakaryawanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndatakaryawanActionPerformed
        setKaryawan();
    }//GEN-LAST:event_btndatakaryawanActionPerformed

    private void combodisiplinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combodisiplinActionPerformed
        updateNilaiKriteria();
    }//GEN-LAST:event_combodisiplinActionPerformed

    private void combokerjasamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combokerjasamaActionPerformed
        updateNilaiKriteria();
    }//GEN-LAST:event_combokerjasamaActionPerformed

    private void comboetikaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboetikaActionPerformed
        updateNilaiKriteria();
    }//GEN-LAST:event_comboetikaActionPerformed

    private void combotanggungjawabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotanggungjawabActionPerformed
        updateNilaiKriteria();
    }//GEN-LAST:event_combotanggungjawabActionPerformed
    
    private void panelView() {
        mainkaryawan.removeAll();
        mainkaryawan.add(new PanelPenilaian(parent));
        mainkaryawan.repaint();
        mainkaryawan.revalidate();    
    }
    
    private void panelAdd() {
        mainkaryawan.removeAll();
        mainkaryawan.add(addkaryawan);
        mainkaryawan.repaint();
        mainkaryawan.revalidate();    
    }
    
    private void resetForm() {
        txtnama.setText("");
        txtidkaryawan.setText("");
        txtjabatan.setText("");
        combodisiplin.setSelectedIndex(0);
        combokerjasama.setSelectedIndex(0);
        comboetika.setSelectedIndex(0);
        combotanggungjawab.setSelectedIndex(0);
    }
    
    private void dataTable() {
        viewkaryawan.setVisible(false);
        btndatakaryawan.setEnabled(false);
        addkaryawan.setVisible(true);
        jLabel2.setText("Perbarui Penilaian Karyawan");
        int row = tabelpenilaian.getSelectedRow();
        if (row >= 0) {
            txtid.setText(tabelpenilaian.getValueAt(row, 1).toString());
            txtidkaryawan.setText(tabelpenilaian.getValueAt(row, 2).toString());
            txtnama.setText(tabelpenilaian.getValueAt(row, 3).toString());
            txtjabatan.setText(tabelpenilaian.getValueAt(row, 4).toString());
            txtdisiplin.setText(tabelpenilaian.getValueAt(row, 5).toString());
            txtkerjasama.setText(tabelpenilaian.getValueAt(row, 6).toString());
            txtetika.setText(tabelpenilaian.getValueAt(row, 7).toString());
            txttanggungjawab.setText(tabelpenilaian.getValueAt(row, 8).toString());
        }
    }
    
    private void setKaryawan() {
        DataKaryawan dialog = new DataKaryawan(parent, true);
        dialog.setLocationRelativeTo(parent);
        dialog.setVisible(true);

        KaryawanModel selected = dialog.getSelectedKaryawan();
        if (selected != null) {
            txtidkaryawan.setText(selected.getIdkaryawan());
            txtnama.setText(selected.getNama());
            txtjabatan.setText(selected.getJabatan());
        }
    }
    
    private void updateNilaiKriteria() {
        try {
            if (!"-- Disiplin --".equals(combodisiplin.getSelectedItem())) {
                double disiplin = Double.parseDouble(combodisiplin.getSelectedItem().toString());
                txtdisiplin.setText(String.valueOf(disiplin));
            } else {
                txtdisiplin.setText("");
            }

            if (!"-- Kerjasama --".equals(combokerjasama.getSelectedItem())) {
                double kerjasama = Double.parseDouble(combokerjasama.getSelectedItem().toString());
                txtkerjasama.setText(String.valueOf(kerjasama));
            } else {
                txtkerjasama.setText("");
            }

            if (!"-- Etika --".equals(comboetika.getSelectedItem())) {
                double etika = Double.parseDouble(comboetika.getSelectedItem().toString());
                txtetika.setText(String.valueOf(etika));
            } else {
                txtetika.setText("");
            }

            if (!"-- Tanggung Jawab --".equals(combotanggungjawab.getSelectedItem())) {
                double tanggungJawab = Double.parseDouble(combotanggungjawab.getSelectedItem().toString());
                txttanggungjawab.setText(String.valueOf(tanggungJawab));
            } else {
                txttanggungjawab.setText("");
            }
        } catch (NumberFormatException e) {
            System.err.println("Error parsing value: " + e.getMessage());
        }
    }
    
    private void insertData() {
        String idKaryawan = txtidkaryawan.getText().trim();
        String disiplinStr = txtdisiplin.getText().trim();
        String kerjasamaStr = txtkerjasama.getText().trim();
        String etikaStr = txtetika.getText().trim();
        String tanggungjawabStr = txttanggungjawab.getText().trim();

        if (idKaryawan.isEmpty() || disiplinStr.isEmpty() || kerjasamaStr.isEmpty() ||
            etikaStr.isEmpty() || tanggungjawabStr.isEmpty()) {
            showError("Semua field harus diisi!");
            return;
        }
        
        double disiplin = Double.parseDouble(disiplinStr);
        double kerjasama = Double.parseDouble(kerjasamaStr);
        double etika = Double.parseDouble(etikaStr);
        double tanggungjawab = Double.parseDouble(tanggungjawabStr);
        
        PenilaianModel penilaian = new PenilaianModel("", idKaryawan, "", "", disiplin, kerjasama, etika, tanggungjawab);
        boolean success = pen.createPenilaian(penilaian);
        if (success) {
            resetForm();
            loadTable();
            panelView();
        }
    }
    
    private void loadTable() {
        btndelete.setVisible(false);
        btncancel.setVisible(false);
        penilaianID.clear();
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "Id Penilaian", "NIP", "Nama", "Jabatan", "Disiplin", "Kerja Sama", "Etika", "Tanggung Jawab"}, 0);
        List<PenilaianModel> listpenilaian = pen.getAllPenilaian();
        int no = 1;
        for (PenilaianModel penilaian : listpenilaian) {
            penilaianID.add(penilaian.getIdpenilaian());
            model.addRow(new Object[]{
                no++,
                penilaian.getIdpenilaian(),
                penilaian.getIdkaryawan(),
                penilaian.getNama(),
                penilaian.getJabatan(),
                penilaian.getDisiplin(),
                penilaian.getKerjasama(),
                penilaian.getEtika(),
                penilaian.getTanggungjawab()
            });
        }
        tabelpenilaian.setModel(model);
    }
    
    private void updateData() {
        int selectedRow = tabelpenilaian.getSelectedRow();
        if (selectedRow >= 0) {
            String id = txtid.getText().trim();
            String idkarywan = txtidkaryawan.getText().trim();
            String nama = txtnama.getText().trim();
            String jabatan = txtjabatan.getText().trim();
            double disiplin = Double.parseDouble(txtdisiplin.getText().trim());
            double kerjasama = Double.parseDouble(txtkerjasama.getText().trim());
            double etika = Double.parseDouble(txtetika.getText().trim());
            double tanggungjawab = Double.parseDouble(txttanggungjawab.getText().trim());
            PenilaianModel penilaian = new PenilaianModel(id, idkarywan, nama, jabatan, disiplin, kerjasama, etika, tanggungjawab);
            boolean success = pen.updatePenilaian(penilaian);
            if (success) {
                resetForm();
                loadTable();
                panelView();
            }
        }
    }
    
    private void deleteData() {
        int selectedRow = tabelpenilaian.getSelectedRow();
        if (selectedRow >= 0) {
            String selectedPenilaianId = penilaianID.get(selectedRow);
            CustomMessageDialog obj = new CustomMessageDialog();
            obj.setTitle("Hapus Akun");
            obj.setMessage("Apakah anda yakin ingin menghapus penilaian?");
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    boolean success = pen.deletePenilaian(selectedPenilaianId);
                    if (success) {
                        loadTable();
                        panelView();
                    }
                    GlassPanePopup.closePopupLast();
                }
            });
            GlassPanePopup.showPopup(obj);
        }  
    }
    
    
    private void searchData(String keyword) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "Id Penilaian", "NIP", "Nama", "Jabatan", "Disiplin", "Kerjasama", "Etika", "Tanggung Jawab"}, 0);
        List<PenilaianModel> listpenilaian = pen.getAllPenilaian();
        int no = 1;
        for (PenilaianModel penilaian : listpenilaian) {
            penilaianID.add(penilaian.getIdpenilaian());
            if (penilaian.getIdpenilaian().toLowerCase().contains(keyword.toLowerCase()) || 
                penilaian.getIdkaryawan().toLowerCase().contains(keyword.toLowerCase()) ||
                penilaian.getNama().toLowerCase().contains(keyword.toLowerCase()) ||
                penilaian.getJabatan().toLowerCase().contains(keyword.toLowerCase())) {
                model.addRow(new Object[]{
                no++,
                penilaian.getIdpenilaian(),
                penilaian.getIdkaryawan(),
                penilaian.getNama(),
                penilaian.getJabatan(),
                penilaian.getDisiplin(),
                penilaian.getKerjasama(),
                penilaian.getEtika(),
                penilaian.getTanggungjawab()
            });
            }
        }
        tabelpenilaian.setModel(model);
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
    private skp.customs.CustomPanelRounded addkaryawan;
    private skp.customs.CustomButtonRounded btnadd;
    private skp.customs.CustomButtonRounded btncancel;
    private skp.customs.CustomButtonRounded btncanceladd;
    private skp.customs.CustomButtonRounded btndatakaryawan;
    private skp.customs.CustomButtonRounded btndelete;
    private skp.customs.CustomButtonRounded btnsaveadd;
    private skp.customs.CustomComboboxSuggest combodisiplin;
    private skp.customs.CustomComboboxSuggest comboetika;
    private skp.customs.CustomComboboxSuggest combokerjasama;
    private skp.customs.CustomComboboxSuggest combotanggungjawab;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.ButtonGroup jenkel;
    private skp.customs.CustomPanelRounded mainkaryawan;
    private skp.customs.CustomTable tabelpenilaian;
    private skp.customs.CustomTextfieldRounded txtdisiplin;
    private skp.customs.CustomTextfieldRounded txtetika;
    private skp.customs.CustomTextfieldRounded txtid;
    private skp.customs.CustomTextfieldRounded txtidkaryawan;
    private skp.customs.CustomTextfieldRounded txtjabatan;
    private skp.customs.CustomTextfieldRounded txtkerjasama;
    private skp.customs.CustomTextfieldRounded txtnama;
    private skp.customs.CustomTextfieldRounded txtsearch;
    private skp.customs.CustomTextfieldRounded txttanggungjawab;
    private skp.customs.CustomPanelRounded viewkaryawan;
    // End of variables declaration//GEN-END:variables
}