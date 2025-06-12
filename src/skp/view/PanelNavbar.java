package skp.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import javax.swing.Timer;
import skp.customs.CustomMessageDialog;
import skp.customs.GlassPanePopup;

/**
 *
 * @author yabsiraditya
 */

public class PanelNavbar extends javax.swing.JPanel {
    
    private Timer timer;
    private MainFrame mainFrame;

    public PanelNavbar(MainFrame mainFrame) {
        initComponents();
        
        timer = new Timer(1000, new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                ShowDateTime();
            }
        });
        timer.start();
            
        this.mainFrame = mainFrame;
    }
    
    private void ShowDateTime() {
        Calendar calender = Calendar.getInstance();
        Date DateNow = new Date();
        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE", new Locale("in", "ID"));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss", new Locale("in", "ID"));
        String day = dayFormat.format(DateNow);
        String dateTime = dateFormat.format(DateNow);
        lbldatetime.setText(day + ", " +dateTime);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelnavbar = new javax.swing.JPanel();
        btnminimize = new javax.swing.JLabel();
        btnclose = new javax.swing.JLabel();
        lbldatetime = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 106, 113));
        setLayout(new java.awt.CardLayout());

        panelnavbar.setBackground(new java.awt.Color(77, 168, 218));

        btnminimize.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/minimize.png"))); // NOI18N
        btnminimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnminimizeMouseClicked(evt);
            }
        });

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/skp/assets/closewhite.png"))); // NOI18N
        btnclose.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncloseMouseClicked(evt);
            }
        });

        lbldatetime.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        lbldatetime.setForeground(new java.awt.Color(255, 255, 255));
        lbldatetime.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbldatetime.setText("DateTime");

        javax.swing.GroupLayout panelnavbarLayout = new javax.swing.GroupLayout(panelnavbar);
        panelnavbar.setLayout(panelnavbarLayout);
        panelnavbarLayout.setHorizontalGroup(
            panelnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelnavbarLayout.createSequentialGroup()
                .addContainerGap(700, Short.MAX_VALUE)
                .addGroup(panelnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbldatetime, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelnavbarLayout.createSequentialGroup()
                        .addComponent(btnminimize)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnclose)
                        .addGap(4, 4, 4)))
                .addContainerGap())
        );
        panelnavbarLayout.setVerticalGroup(
            panelnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelnavbarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnminimize)
                    .addComponent(btnclose))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(lbldatetime)
                .addContainerGap())
        );

        add(panelnavbar, "card2");
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncloseMouseClicked
        CustomMessageDialog obj = new CustomMessageDialog();
        obj.setTitle("Keluar");
        obj.setMessage("Apakah anda yakin ingin keluar?");
        obj.eventOK(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                mainFrame.dispose();
                System.exit(0);
                GlassPanePopup.closePopupLast();
            }
        });
        GlassPanePopup.showPopup(obj);
    }//GEN-LAST:event_btncloseMouseClicked

    private void btnminimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnminimizeMouseClicked
        mainFrame.setState(MainFrame.ICONIFIED);
    }//GEN-LAST:event_btnminimizeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnclose;
    private javax.swing.JLabel btnminimize;
    private javax.swing.JLabel lbldatetime;
    private javax.swing.JPanel panelnavbar;
    // End of variables declaration//GEN-END:variables
}
