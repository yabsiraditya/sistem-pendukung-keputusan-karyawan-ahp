package skp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import skp.controller.AuthController;
import skp.controller.KaryawanController;
import skp.customs.CustomMessageDialog;
import skp.customs.GlassPanePopup;
import skp.model.KaryawanModel;

/**
 *
 * @author yabsiraditya
 */
public class PanelKaryawan extends javax.swing.JPanel {
    
    private JFrame parent;
    private KaryawanController kar;
    private List<String> karyawanId = new ArrayList<>();

    private final int noColumnIndex = 0;
    private final int noColumnWidth = 40;    
    
    public PanelKaryawan(JFrame parent) {
        this.parent = parent;
        kar = new KaryawanController(parent);

        initComponents();
        loadTable();
        setColumnWidth();
    }
    
    private void setColumnWidth() {
        TableColumnModel columnModel = tabelkaryawan.getColumnModel();
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
        tabelkaryawan = new skp.customs.CustomTable();
        txtsearch = new skp.customs.CustomTextfieldRounded();
        addkaryawan = new skp.customs.CustomPanelRounded();
        jLabel2 = new javax.swing.JLabel();
        btnsaveadd = new skp.customs.CustomButtonRounded();
        btncanceladd = new skp.customs.CustomButtonRounded();
        jLabel5 = new javax.swing.JLabel();
        txtid = new skp.customs.CustomTextfieldRounded();
        jLabel6 = new javax.swing.JLabel();
        txtnama = new skp.customs.CustomTextfieldRounded();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        combojabatan = new skp.customs.CustomComboboxSuggest();
        rblaki = new skp.customs.CustomRadioButton();
        rbperempuan = new skp.customs.CustomRadioButton();
        txttgllahir = new skp.customs.CustomTextfieldRounded();

        dateChooser1.setForeground(new java.awt.Color(78, 51, 34));
        dateChooser1.setTextRefernce(txttgllahir);

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
        jLabel4.setText("Data Karyawan");

        btnadd.setBackground(new java.awt.Color(77, 168, 218));
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

        btndelete.setBackground(new java.awt.Color(77, 168, 218));
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

        btncancel.setBackground(new java.awt.Color(77, 168, 218));
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

        tabelkaryawan.setModel(new javax.swing.table.DefaultTableModel(
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
        tabelkaryawan.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        tabelkaryawan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelkaryawanMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabelkaryawan);

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
        jLabel2.setText("Tambah Data Karyawan");

        btnsaveadd.setBackground(new java.awt.Color(77, 168, 218));
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

        btncanceladd.setBackground(new java.awt.Color(77, 168, 218));
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
        jLabel5.setText("NIP");

        txtid.setEditable(false);
        txtid.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtid.setEnabled(false);
        txtid.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtid.setPreferredSize(new java.awt.Dimension(235, 45));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel6.setText("Nama");

        txtnama.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtnama.setPreferredSize(new java.awt.Dimension(235, 45));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel7.setText("Jabatan");

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel8.setText("Jenis Kelamin");

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel9.setText("Tanggal Lahir");

        combojabatan.setEditable(false);
        combojabatan.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Personal Asisten", "Operasional", "Mekanikal & Elektrikal", "Information Technology (IT)", "Office Boy" }));
        combojabatan.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        combojabatan.setPreferredSize(new java.awt.Dimension(195, 45));

        rblaki.setBackground(new java.awt.Color(77, 168, 218));
        jenkel.add(rblaki);
        rblaki.setText("Laki - Laki");
        rblaki.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N

        rbperempuan.setBackground(new java.awt.Color(77, 168, 218));
        jenkel.add(rbperempuan);
        rbperempuan.setText("Perempuan");
        rbperempuan.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N

        txttgllahir.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N

        javax.swing.GroupLayout addkaryawanLayout = new javax.swing.GroupLayout(addkaryawan);
        addkaryawan.setLayout(addkaryawanLayout);
        addkaryawanLayout.setHorizontalGroup(
            addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addkaryawanLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtnama, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(combojabatan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addComponent(btnsaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncanceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8)
                    .addGroup(addkaryawanLayout.createSequentialGroup()
                        .addComponent(rblaki, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(rbperempuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9)
                    .addComponent(txttgllahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        addkaryawanLayout.setVerticalGroup(
            addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addkaryawanLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtnama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(combojabatan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rblaki, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbperempuan, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txttgllahir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(addkaryawanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncanceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        mainkaryawan.add(addkaryawan, "card2");

        add(mainkaryawan, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        panelAdd();
        txtid.setText(kar.generateKaryawanId());
        if(btnadd.getText().equals("Ubah")) {
            dataTable();
            btnsaveadd.setText("Perbarui");
        }
    }//GEN-LAST:event_btnaddActionPerformed

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

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        deleteData();
    }//GEN-LAST:event_btndeleteActionPerformed

    private void tabelkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkaryawanMouseClicked
        if(btnadd.getText().equals("Tambah")) {
            btnadd.setText("Ubah");
            btndelete.setVisible(true);
            btncancel.setVisible(true);
        }
    }//GEN-LAST:event_tabelkaryawanMouseClicked

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        loadTable();
        panelView();
    }//GEN-LAST:event_btncancelActionPerformed

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
        searchData(txtsearch.getText().trim());
    }//GEN-LAST:event_txtsearchKeyTyped

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        txtsearch.setText("");
    }//GEN-LAST:event_txtsearchMouseClicked

    
    private void panelView() {
        mainkaryawan.removeAll();
        mainkaryawan.add(new PanelKaryawan(parent));
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
        combojabatan.setSelectedIndex(0);
        jenkel.clearSelection();
        txttgllahir.setText("");
    }
    
    private void dataTable() {
        viewkaryawan.setVisible(false);
        addkaryawan.setVisible(true);
        jLabel2.setText("Perbarui Data Karyawan");
        int row = tabelkaryawan.getSelectedRow();
        if (row >= 0) {
            txtid.setText(tabelkaryawan.getValueAt(row, 1).toString());
            txtnama.setText(tabelkaryawan.getValueAt(row, 2).toString());
            combojabatan.setSelectedItem(tabelkaryawan.getValueAt(row, 3).toString());
            String jenkel = tabelkaryawan.getValueAt(row, 4).toString();
            if(jenkel.equals("Laki - Laki")) {
                rblaki.setSelected(true);
            } else if(jenkel.equals("Perempuan")) {
                rbperempuan.setSelected(true);
            }
            txttgllahir.setText(tabelkaryawan.getValueAt(row, 5).toString());
        }
    }
    
    private void insertData() {
        String nama = txtnama.getText().trim();
        String jabatan = (String) combojabatan.getSelectedItem();
        String jenkel = "";
            if (rblaki.isSelected()) {
                jenkel = rblaki.getText();
            } else if (rbperempuan.isSelected()) {
                jenkel = rbperempuan.getText();
            }
        String tgllahir = txttgllahir.getText();
        KaryawanModel karyawan = new KaryawanModel("", nama, jabatan, jenkel, tgllahir);
        boolean success = kar.CreateKaryawan(karyawan);
        if (success) {
            resetForm();
            loadTable();
            panelView();
        }
    }
    
    private void loadTable() {
        btndelete.setVisible(false);
        btncancel.setVisible(false);
        karyawanId.clear();
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "NIP", "Nama", "Jabatan", "Jenis Kelamin", "Tanggal Lahir"}, 0);
        List<KaryawanModel> listkaryawan = kar.getAllKaryawan();
        int no = 1;
        for (KaryawanModel karyawan : listkaryawan) {
            karyawanId.add(karyawan.getIdkaryawan());
            model.addRow(new Object[]{
                no++,
                karyawan.getIdkaryawan(),
                karyawan.getNama(),
                karyawan.getJabatan(),
                karyawan.getJenkel(),
                karyawan.getTgllahir(),
            });
        }
        tabelkaryawan.setModel(model);
    }
    
    private void updateData() {
        int selectedRow = tabelkaryawan.getSelectedRow();
        if (selectedRow >= 0) {
            String id = txtid.getText().trim();
            String nama = txtnama.getText().trim();
            String jabatan = (String) combojabatan.getSelectedItem();
            String jenkel = "";
                if (rblaki.isSelected()) {
                    jenkel = rblaki.getText();
                } else if (rbperempuan.isSelected()) {
                    jenkel = rbperempuan.getText();
                }
            String tgllahir = txttgllahir.getText();
            KaryawanModel karyawan = new KaryawanModel(id, nama, jabatan, jenkel, tgllahir);
            boolean success = kar.updateKaryawan(karyawan);
            if (success) {
                resetForm();
                loadTable();
                panelView();
            }
        }
    }
    
    private void deleteData() {
        int selectedRow = tabelkaryawan.getSelectedRow();
        if (selectedRow >= 0) {
            String selectedKaryawanId = karyawanId.get(selectedRow);
            CustomMessageDialog obj = new CustomMessageDialog();
            obj.setTitle("Hapus Akun");
            obj.setMessage("Apakah anda yakin ingin menghapus akun?");
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    boolean success = kar.deleteKaryawan(selectedKaryawanId);
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
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "NIP", "Nama", "Jabatan", "Jenis Kelamin", "Tanggal Lahir"}, 0);
        List<KaryawanModel> listkaryawan = kar.getAllKaryawan();
        karyawanId.clear();
        int no = 1;
        for (KaryawanModel karyawan : listkaryawan) {
            karyawanId.add(karyawan.getIdkaryawan());
            if (karyawan.getIdkaryawan().toLowerCase().contains(keyword.toLowerCase()) || 
                karyawan.getNama().toLowerCase().contains(keyword.toLowerCase()) ||
                karyawan.getJabatan().toLowerCase().contains(keyword.toLowerCase()) ||
                karyawan.getJenkel().toLowerCase().contains(keyword.toLowerCase())) {
                model.addRow(new Object[]{
                    no++,
                    karyawan.getIdkaryawan(),
                    karyawan.getNama(),
                    karyawan.getJabatan(),
                    karyawan.getJenkel(),
                    karyawan.getTgllahir(),
                });
            }
        }
        tabelkaryawan.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private skp.customs.CustomPanelRounded addkaryawan;
    private skp.customs.CustomButtonRounded btnadd;
    private skp.customs.CustomButtonRounded btncancel;
    private skp.customs.CustomButtonRounded btncanceladd;
    private skp.customs.CustomButtonRounded btndelete;
    private skp.customs.CustomButtonRounded btnsaveadd;
    private skp.customs.CustomComboboxSuggest combojabatan;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.ButtonGroup jenkel;
    private skp.customs.CustomPanelRounded mainkaryawan;
    private skp.customs.CustomRadioButton rblaki;
    private skp.customs.CustomRadioButton rbperempuan;
    private skp.customs.CustomTable tabelkaryawan;
    private skp.customs.CustomTextfieldRounded txtid;
    private skp.customs.CustomTextfieldRounded txtnama;
    private skp.customs.CustomTextfieldRounded txtsearch;
    private skp.customs.CustomTextfieldRounded txttgllahir;
    private skp.customs.CustomPanelRounded viewkaryawan;
    // End of variables declaration//GEN-END:variables
}