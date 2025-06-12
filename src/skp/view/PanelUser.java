package skp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
import skp.controller.AuthController;
import skp.customs.CustomMessageDialog;
import skp.customs.GlassPanePopup;
import skp.model.UserModel;

/**
 *
 * @author yabsiraditya
 */
public class PanelUser extends javax.swing.JPanel {
    
    private JFrame parent;
    private AuthController auth;
    private List<Integer> userId = new ArrayList<>();
    
    private final int noColumnIndex = 0;
    private final int noColumnWidth = 40;
    
    public PanelUser(JFrame parent) {
        this.parent = parent;
        auth = new AuthController(parent);

        initComponents();
        loadTable();
        setColumnWidth();
    }
    
    private void setColumnWidth() {
        TableColumnModel columnModel = tableuser.getColumnModel();
        columnModel.getColumn(noColumnIndex).setPreferredWidth(noColumnWidth);
        columnModel.getColumn(noColumnIndex).setMaxWidth(noColumnWidth);
        columnModel.getColumn(noColumnIndex).setMinWidth(noColumnWidth);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainuser = new skp.customs.CustomPanelRounded();
        viewuser = new skp.customs.CustomPanelRounded();
        jLabel4 = new javax.swing.JLabel();
        btnadd = new skp.customs.CustomButtonRounded();
        btndelete = new skp.customs.CustomButtonRounded();
        btncancel = new skp.customs.CustomButtonRounded();
        jScrollPane4 = new javax.swing.JScrollPane();
        tableuser = new skp.customs.CustomTable();
        txtsearch = new skp.customs.CustomTextfieldRounded();
        adduser = new skp.customs.CustomPanelRounded();
        jLabel2 = new javax.swing.JLabel();
        btnsaveadd = new skp.customs.CustomButtonRounded();
        btncanceladd = new skp.customs.CustomButtonRounded();
        jLabel5 = new javax.swing.JLabel();
        txtid = new skp.customs.CustomTextfieldRounded();
        jLabel6 = new javax.swing.JLabel();
        txtname = new skp.customs.CustomTextfieldRounded();
        jLabel7 = new javax.swing.JLabel();
        txtusername = new skp.customs.CustomTextfieldRounded();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        comborole = new skp.customs.CustomComboboxSuggest();
        txtpassword = new skp.customs.CustomJpasswordRounded();

        setBackground(new java.awt.Color(245, 245, 245));
        setLayout(new java.awt.CardLayout());

        mainuser.setBackground(new java.awt.Color(255, 255, 255));
        mainuser.setPreferredSize(new java.awt.Dimension(1026, 648));
        mainuser.setRoundBottomLeft(30);
        mainuser.setRoundBottomRight(30);
        mainuser.setRoundTopLeft(30);
        mainuser.setRoundTopRight(30);
        mainuser.setLayout(new java.awt.CardLayout());

        viewuser.setBackground(new java.awt.Color(255, 255, 255));
        viewuser.setRoundBottomLeft(30);
        viewuser.setRoundBottomRight(30);
        viewuser.setRoundTopLeft(30);
        viewuser.setRoundTopRight(30);

        jLabel4.setFont(new java.awt.Font("Montserrat Medium", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 102, 102));
        jLabel4.setText("Data User");

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

        tableuser.setModel(new javax.swing.table.DefaultTableModel(
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
        tableuser.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        tableuser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableuserMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tableuser);

        txtsearch.setForeground(new java.awt.Color(102, 102, 102));
        txtsearch.setText("Cari Data User");
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

        javax.swing.GroupLayout viewuserLayout = new javax.swing.GroupLayout(viewuser);
        viewuser.setLayout(viewuserLayout);
        viewuserLayout.setHorizontalGroup(
            viewuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewuserLayout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(viewuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(viewuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(viewuserLayout.createSequentialGroup()
                            .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        viewuserLayout.setVerticalGroup(
            viewuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(viewuserLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(viewuserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btndelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        mainuser.add(viewuser, "card2");

        adduser.setBackground(new java.awt.Color(255, 255, 255));
        adduser.setRoundBottomLeft(30);
        adduser.setRoundBottomRight(30);
        adduser.setRoundTopLeft(30);
        adduser.setRoundTopRight(30);

        jLabel2.setFont(new java.awt.Font("Montserrat Medium", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 102, 102));
        jLabel2.setText("Tambah Data User");

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
        jLabel5.setText("ID User");

        txtid.setEditable(false);
        txtid.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtid.setEnabled(false);
        txtid.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtid.setPreferredSize(new java.awt.Dimension(235, 45));

        jLabel6.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel6.setText("Nama");

        txtname.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtname.setPreferredSize(new java.awt.Dimension(235, 45));

        jLabel7.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel7.setText("Username");

        txtusername.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        txtusername.setPreferredSize(new java.awt.Dimension(235, 45));

        jLabel8.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel8.setText("Password");

        jLabel9.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel9.setText("Role");

        comborole.setEditable(false);
        comborole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "staff" }));
        comborole.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        comborole.setPreferredSize(new java.awt.Dimension(195, 45));

        txtpassword.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N

        javax.swing.GroupLayout adduserLayout = new javax.swing.GroupLayout(adduser);
        adduser.setLayout(adduserLayout);
        adduserLayout.setHorizontalGroup(
            adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adduserLayout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addGroup(adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(txtusername, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(txtname, javax.swing.GroupLayout.DEFAULT_SIZE, 984, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addGroup(adduserLayout.createSequentialGroup()
                        .addComponent(btnsaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncanceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtid, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(comborole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtpassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        adduserLayout.setVerticalGroup(
            adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adduserLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comborole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
                .addGroup(adduserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsaveadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncanceladd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        mainuser.add(adduser, "card2");

        add(mainuser, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        panelAdd();
        txtid.setText(auth.generateUserId());
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

    private void tableuserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableuserMouseClicked
        if(btnadd.getText().equals("Tambah")) {
            btnadd.setText("Ubah");
            btndelete.setVisible(true);
            btncancel.setVisible(true);
        }
    }//GEN-LAST:event_tableuserMouseClicked

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
        mainuser.removeAll();
        mainuser.add(new PanelUser(parent));
        mainuser.repaint();
        mainuser.revalidate();    
    }
    
    private void panelAdd() {
        mainuser.removeAll();
        mainuser.add(adduser);
        mainuser.repaint();
        mainuser.revalidate();    
    }
    
    private void resetForm() {
        txtname.setText("");
        txtusername.setText("");
        txtpassword.setText("");
        comborole.setSelectedIndex(0);
    }
    
    private void dataTable() {
        viewuser.setVisible(false);
        adduser.setVisible(true);

        jLabel2.setText("Perbarui Data User");

        int row = tableuser.getSelectedRow();
        if (row >= 0) {
            int userIdSelected = userId.get(row);
            txtid.setText(String.valueOf(userIdSelected));
            txtname.setText(tableuser.getValueAt(row, 1).toString());
            txtusername.setText(tableuser.getValueAt(row, 2).toString());
            txtpassword.setText("");
            comborole.setSelectedItem(tableuser.getValueAt(row, 3).toString());
        }
    }
    
    private void insertData() {
        String name = txtname.getText().trim();
        String username = txtusername.getText().trim();
        String password = txtpassword.getText().trim();
        String role = (String) comborole.getSelectedItem();
        UserModel user = new UserModel(0, name, username, password, role);
        boolean success = auth.CreateUser(user);
        if (success) {
            resetForm();
            loadTable();
            panelView();
        }
    }
    
    private void loadTable() {
        btndelete.setVisible(false);
        btncancel.setVisible(false);
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "Nama", "Username", "Role"}, 0);
        List<UserModel> users = auth.getAllUsers();
        userId.clear();
        int no = 1;
        for (UserModel user : users) {
            model.addRow(new Object[]{
                no++,
                user.getName(),
                user.getUsername(),
                user.getRole()
            });
            userId.add(user.getId());
        }
        tableuser.setModel(model);
    }
    
    private void updateData() {
        int selectedRow = tableuser.getSelectedRow();
        if (selectedRow >= 0) {
            int id = userId.get(selectedRow);
            String name = txtname.getText().trim();
            String username = txtusername.getText().trim();
            String password = txtpassword.getText().trim();
            String role = (String) comborole.getSelectedItem();
            if (password.isEmpty()) {
                List<UserModel> allUsers = auth.getAllUsers();
                for (UserModel u : allUsers) {
                    if (u.getId() == id) {
                        password = u.getPassword();
                        break;
                    }
                }
            }
            UserModel user = new UserModel(id, name, username, password, role);
            boolean success = auth.updateUser(user);
            if (success) {
                resetForm();
                loadTable();
                panelView();
            }
        }
    }
    
    private void deleteData() {
        int selectedRow = tableuser.getSelectedRow();
        if (selectedRow >= 0) {
            int selectedUserId = userId.get(selectedRow);
            CustomMessageDialog obj = new CustomMessageDialog();
            obj.setTitle("Hapus Akun");
            obj.setMessage("Apakah anda yakin ingin menghapus akun?");
            obj.eventOK(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent ae) {
                    boolean success = auth.deleteUser(selectedUserId);
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
        DefaultTableModel model = new DefaultTableModel(new String[]{"No", "Nama", "Username", "Role"}, 0);
        List<UserModel> users = auth.getAllUsers();
        userId.clear();
        int no = 1;
        for (UserModel user : users) {
            if (user.getName().toLowerCase().contains(keyword.toLowerCase()) || 
                user.getUsername().toLowerCase().contains(keyword.toLowerCase()) ||
                user.getRole().toLowerCase().contains(keyword.toLowerCase())) {
                model.addRow(new Object[]{
                    no++,
                    user.getName(),
                    user.getUsername(),
                    user.getRole()
                });
                userId.add(user.getId());
            }
        }
        tableuser.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private skp.customs.CustomPanelRounded adduser;
    private skp.customs.CustomButtonRounded btnadd;
    private skp.customs.CustomButtonRounded btncancel;
    private skp.customs.CustomButtonRounded btncanceladd;
    private skp.customs.CustomButtonRounded btndelete;
    private skp.customs.CustomButtonRounded btnsaveadd;
    private skp.customs.CustomComboboxSuggest comborole;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane4;
    private skp.customs.CustomPanelRounded mainuser;
    private skp.customs.CustomTable tableuser;
    private skp.customs.CustomTextfieldRounded txtid;
    private skp.customs.CustomTextfieldRounded txtname;
    private skp.customs.CustomJpasswordRounded txtpassword;
    private skp.customs.CustomTextfieldRounded txtsearch;
    private skp.customs.CustomTextfieldRounded txtusername;
    private skp.customs.CustomPanelRounded viewuser;
    // End of variables declaration//GEN-END:variables
}