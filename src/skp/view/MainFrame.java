package skp.view;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import skp.customs.CustomMessageDialog;
import skp.customs.GlassPanePopup;
import skp.customs.ScrollBarWin11UI;
import skp.model.UserModel;
import skp.view.*;


/**
 *
 * @author yabsiraditya
 */

public class MainFrame extends javax.swing.JFrame {
    
    int xx, xy;
    private UserModel user;

    public MainFrame(UserModel user) {
        this.user = user;
        initComponents();
        
        GlassPanePopup.install(this);
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        leftpanel = new javax.swing.JPanel();
        menupanel = new javax.swing.JPanel();
        rightpanel = new javax.swing.JPanel();
        toppanel = new javax.swing.JPanel();
        panelnavbar = new javax.swing.JPanel();
        containerpanel = new javax.swing.JPanel();
        panelmain = new skp.customs.CustomPanelRounded();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        leftpanel.setBackground(new java.awt.Color(255, 255, 255));
        leftpanel.setMaximumSize(new java.awt.Dimension(300, 768));
        leftpanel.setMinimumSize(new java.awt.Dimension(300, 768));
        leftpanel.setLayout(new java.awt.BorderLayout());

        menupanel.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menupanelLayout = new javax.swing.GroupLayout(menupanel);
        menupanel.setLayout(menupanelLayout);
        menupanelLayout.setHorizontalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
        menupanelLayout.setVerticalGroup(
            menupanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 768, Short.MAX_VALUE)
        );

        leftpanel.add(menupanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(leftpanel, java.awt.BorderLayout.LINE_START);

        rightpanel.setLayout(new java.awt.BorderLayout());

        toppanel.setBackground(new java.awt.Color(0, 106, 113));
        toppanel.setLayout(new java.awt.BorderLayout());

        panelnavbar.setBackground(new java.awt.Color(77, 168, 218));

        javax.swing.GroupLayout panelnavbarLayout = new javax.swing.GroupLayout(panelnavbar);
        panelnavbar.setLayout(panelnavbarLayout);
        panelnavbarLayout.setHorizontalGroup(
            panelnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1066, Short.MAX_VALUE)
        );
        panelnavbarLayout.setVerticalGroup(
            panelnavbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );

        toppanel.add(panelnavbar, java.awt.BorderLayout.PAGE_START);

        rightpanel.add(toppanel, java.awt.BorderLayout.PAGE_START);

        containerpanel.setBackground(new java.awt.Color(245, 245, 245));

        panelmain.setBackground(new java.awt.Color(255, 255, 255));
        panelmain.setRoundBottomLeft(30);
        panelmain.setRoundBottomRight(30);
        panelmain.setRoundTopLeft(30);
        panelmain.setRoundTopRight(30);
        panelmain.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout containerpanelLayout = new javax.swing.GroupLayout(containerpanel);
        containerpanel.setLayout(containerpanelLayout);
        containerpanelLayout.setHorizontalGroup(
            containerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        containerpanelLayout.setVerticalGroup(
            containerpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(containerpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        rightpanel.add(containerpanel, java.awt.BorderLayout.CENTER);

        getContentPane().add(rightpanel, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        PanelMenu panelMenu = new PanelMenu(panelmain, user);
        leftpanel.removeAll();
        leftpanel.add(panelMenu);
        leftpanel.repaint();
        leftpanel.revalidate();
        
        toppanel.removeAll();
        toppanel.add(new PanelNavbar(this));
        toppanel.repaint();
        toppanel.revalidate();
        
        panelmain.removeAll();
        panelmain.add(new PanelDashboard());
        panelmain.repaint();
        panelmain.revalidate();
    }//GEN-LAST:event_formWindowOpened

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xx, y - xy);
    }//GEN-LAST:event_formMouseDragged
    
    public static void main(String args[]) {
        //Custom Scroll Pane
        UIDefaults ui = UIManager.getDefaults();
        
        ui.put("ScrollBarUI", ScrollBarWin11UI.class.getCanonicalName());
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel containerpanel;
    private javax.swing.JPanel leftpanel;
    private javax.swing.JPanel menupanel;
    private skp.customs.CustomPanelRounded panelmain;
    private javax.swing.JPanel panelnavbar;
    private javax.swing.JPanel rightpanel;
    private javax.swing.JPanel toppanel;
    // End of variables declaration//GEN-END:variables
}
