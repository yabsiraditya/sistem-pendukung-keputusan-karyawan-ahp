package skp.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import skp.util.*;
import skp.controller.*;
import skp.customs.GlassPanePopup;
import skp.customs.CustomMessageDialog;
import skp.model.UserModel;
        
/**
 *
 * @author yabsiraditya
 */

public class LoginForm extends javax.swing.JFrame {
    private static Connection conn = new DBConnection().getConnection();

    public LoginForm() {
        initComponents();
        getRootPane().setDefaultButton(btnlogin);
        setLocationRelativeTo(null);
        
        txtpassword.setText("Masukan Password");
        txtpassword.setEchoChar((char) 0);
        txtpassword.setForeground(Color.GRAY);
        
        btnhidepass.setVisible(false);
        
        GlassPanePopup.install(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgloginpanel = new javax.swing.JPanel();
        btnclose = new javax.swing.JLabel();
        loginpanel = new skp.customs.CustomPanelRounded();
        btnlogin = new skp.customs.CustomButtonRounded();
        txtusername = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        btnshowpass = new javax.swing.JLabel();
        btnhidepass = new javax.swing.JLabel();
        textlogin = new javax.swing.JLabel();
        loginicon = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 106, 113));
        setMaximumSize(new java.awt.Dimension(1280, 720));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        bgloginpanel.setBackground(new java.awt.Color(77, 168, 218));
        bgloginpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclose.setBackground(new java.awt.Color(255, 0, 0));
        btnclose.setFont(new java.awt.Font("Montserrat ExtraBold", 1, 18)); // NOI18N
        btnclose.setForeground(new java.awt.Color(255, 0, 0));
        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/closeboldred.png"))); // NOI18N
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });
        bgloginpanel.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1240, 10, -1, -1));

        loginpanel.setBackground(new java.awt.Color(255, 255, 255));
        loginpanel.setRoundBottomLeft(50);
        loginpanel.setRoundBottomRight(50);
        loginpanel.setRoundTopLeft(50);
        loginpanel.setRoundTopRight(50);
        loginpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnlogin.setBackground(new java.awt.Color(77, 168, 218));
        btnlogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/login.png"))); // NOI18N
        btnlogin.setText("Login");
        btnlogin.setFillClick(new java.awt.Color(62, 134, 173));
        btnlogin.setFillOriginal(new java.awt.Color(77, 168, 218));
        btnlogin.setFillOver(new java.awt.Color(82, 191, 251));
        btnlogin.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        btnlogin.setRoundCorner(30);
        btnlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnloginActionPerformed(evt);
            }
        });
        loginpanel.add(btnlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 470, 50));

        txtusername.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtusername.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), "Username", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat SemiBold", 0, 14))); // NOI18N
        txtusername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtusernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtusernameFocusLost(evt);
            }
        });
        loginpanel.add(txtusername, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, 470, 70));

        txtpassword.setFont(new java.awt.Font("Montserrat", 0, 16)); // NOI18N
        txtpassword.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)), "Password", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Montserrat SemiBold", 0, 14))); // NOI18N
        txtpassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtpasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtpasswordFocusLost(evt);
            }
        });
        loginpanel.add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, 470, 70));

        btnshowpass.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnshowpass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/show.png"))); // NOI18N
        btnshowpass.setText("Show Password");
        btnshowpass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnshowpassMouseClicked(evt);
            }
        });
        loginpanel.add(btnshowpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        btnhidepass.setFont(new java.awt.Font("Montserrat", 0, 14)); // NOI18N
        btnhidepass.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/hide.png"))); // NOI18N
        btnhidepass.setText("Hide Password");
        btnhidepass.setToolTipText("");
        btnhidepass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnhidepassMouseClicked(evt);
            }
        });
        loginpanel.add(btnhidepass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, -1, -1));

        textlogin.setFont(new java.awt.Font("Montserrat", 1, 48)); // NOI18N
        textlogin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textlogin.setText("Login");
        textlogin.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(78, 51, 34)));
        loginpanel.add(textlogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 470, 70));

        bgloginpanel.add(loginpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 540, 600));

        loginicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/loginicon.png"))); // NOI18N
        bgloginpanel.add(loginicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 180, -1, -1));

        jLabel1.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Copyright @2025");
        bgloginpanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 680, -1, 30));

        getContentPane().add(bgloginpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtpasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusLost
        String password = String.valueOf(txtpassword.getPassword());
        if (password.isEmpty()) {
            txtpassword.setText("Masukan Password");
            txtpassword.setEchoChar((char)0);
            txtpassword.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtpasswordFocusLost

    private void txtpasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtpasswordFocusGained
        String password = String.valueOf(txtpassword.getPassword());
        if (password.equals("Masukan Password")) {
            txtpassword.setText("");
            txtpassword.setEchoChar('•');
            txtpassword.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtpasswordFocusGained

    private void txtusernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusLost
        if (txtusername.getText().isEmpty()) {
            txtusername.setText("Masukan Username");
            txtusername.setForeground(Color.GRAY);
        }
    }//GEN-LAST:event_txtusernameFocusLost

    private void txtusernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtusernameFocusGained
        if (txtusername.getText().equals("Masukan Username")) {
            txtusername.setText("");
            txtusername.setForeground(Color.BLACK);
        }
    }//GEN-LAST:event_txtusernameFocusGained

    private void btnhidepassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnhidepassMouseClicked
        btnshowpass.setVisible(true);
        btnhidepass.setVisible(false);
        txtpassword.setEchoChar('*');
    }//GEN-LAST:event_btnhidepassMouseClicked

    private void btnshowpassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnshowpassMouseClicked
        btnshowpass.setVisible(false);
        btnhidepass.setVisible(true);
        txtpassword.setEchoChar((char)0);
    }//GEN-LAST:event_btnshowpassMouseClicked

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        CustomMessageDialog obj = new CustomMessageDialog();
        obj.setTitle("Keluar");
        obj.setMessage("Apakah anda yakin ingin keluar?");
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                dispose();
                System.exit(0);
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
    }//GEN-LAST:event_btncloseMouseClicked

    private void btnloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnloginActionPerformed
        AuthController auth = new AuthController(this);
        UserModel user = auth.loginUser(txtusername.getText(), txtpassword.getText());
        if (user != null) {
            new MainFrame(user).setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnloginActionPerformed
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bgloginpanel;
    private javax.swing.JLabel btnclose;
    private javax.swing.JLabel btnhidepass;
    private skp.customs.CustomButtonRounded btnlogin;
    private javax.swing.JLabel btnshowpass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel loginicon;
    private skp.customs.CustomPanelRounded loginpanel;
    private javax.swing.JLabel textlogin;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtusername;
    // End of variables declaration//GEN-END:variables
}
