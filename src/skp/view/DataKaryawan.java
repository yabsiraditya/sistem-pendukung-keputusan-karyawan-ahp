package skp.view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import skp.controller.KaryawanController;
import skp.customs.ScrollBarWin11UI;
import skp.model.KaryawanModel;

/**
 *
 * @author yabsiraditya
 */

public class DataKaryawan extends javax.swing.JDialog {
    
    private JFrame parent;
    private KaryawanController kar;
    private KaryawanModel selectedKaryawan;

    private List<String> karyawanId = new ArrayList<>();


    public DataKaryawan(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        this.parent = (JFrame) parent;
        kar = new KaryawanController((JFrame) parent);

        initComponents();
        
        loadTable();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabelkaryawan = new skp.customs.CustomTable();
        txtsearch = new skp.customs.CustomTextfieldRounded();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Data Karyawan");

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
        txtsearch.setText("Search");
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 608, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(12, 12, 12)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtsearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtsearchMouseClicked
        txtsearch.setText("");
    }//GEN-LAST:event_txtsearchMouseClicked

    private void tabelkaryawanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelkaryawanMouseClicked
        selectData();
    }//GEN-LAST:event_tabelkaryawanMouseClicked

    private void txtsearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyTyped
        searchData(txtsearch.getText().trim());
    }//GEN-LAST:event_txtsearchKeyTyped
    
    private void loadTable() {
        karyawanId.clear();
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "NIP", "Nama", "Jabatan"}, 0);
        List<KaryawanModel> listkaryawan = kar.getAllKaryawan();
        int no = 1;
        for (KaryawanModel karyawan : listkaryawan) {
            karyawanId.add(karyawan.getIdkaryawan());
            model.addRow(new Object[]{
                no++,
                karyawan.getIdkaryawan(),
                karyawan.getNama(),
                karyawan.getJabatan(),
            });
        }
        tabelkaryawan.setModel(model);
    }

    private void searchData(String keyword) {
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "NIP", "Nama", "Jabatan"}, 0);
        List<KaryawanModel> listkaryawan = kar.getAllKaryawan();
        karyawanId.clear();
        int no = 1;
        for (KaryawanModel karyawan : listkaryawan) {
            karyawanId.add(karyawan.getIdkaryawan());
            if (karyawan.getIdkaryawan().toLowerCase().contains(keyword.toLowerCase()) || 
                karyawan.getNama().toLowerCase().contains(keyword.toLowerCase()) ||
                karyawan.getJabatan().toLowerCase().contains(keyword.toLowerCase())) {
                model.addRow(new Object[]{
                    no++,
                    karyawan.getIdkaryawan(),
                    karyawan.getNama(),
                    karyawan.getJabatan(),
                });
            }
        }
        tabelkaryawan.setModel(model);
    }
    
    private void selectData() {
        int row = tabelkaryawan.getSelectedRow();
        if (row >= 0) {
            String id = tabelkaryawan.getValueAt(row, 1).toString();
            String nama = tabelkaryawan.getValueAt(row, 2).toString();
            String jabatan = tabelkaryawan.getValueAt(row, 3).toString();

            selectedKaryawan = new KaryawanModel(id, nama, jabatan, "", "");

            dispose();
        }
    }
    
    public KaryawanModel getSelectedKaryawan() {
        return selectedKaryawan;
    }
    
    public static void main(String args[]) {
        //Custom Scroll Pane
        UIDefaults ui = UIManager.getDefaults();
        
        ui.put("ScrollBarUI", ScrollBarWin11UI.class.getCanonicalName());
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DataKaryawan dialog = new DataKaryawan(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane4;
    private skp.customs.CustomTable tabelkaryawan;
    private skp.customs.CustomTextfieldRounded txtsearch;
    // End of variables declaration//GEN-END:variables
}
