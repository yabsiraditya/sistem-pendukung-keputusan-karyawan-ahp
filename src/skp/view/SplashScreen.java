package skp.view;

import javax.swing.Timer;
import java.awt.event.ActionEvent;

/**
 *
 * @author yabsiraditya
 */

public class SplashScreen extends javax.swing.JFrame {
    
    public SplashScreen() {
        initComponents();
        setLocationRelativeTo(null);
        startSplash();
    }
    
    private void startSplash() {
        Timer timer = new Timer(3000, (ActionEvent e) -> {
            dispose(); // tutup splash
            new LoginForm().setVisible(true);
        });
        timer.setRepeats(false);
        timer.start();
    }    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        loading = new javax.swing.JLabel();
        logo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 106, 113));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(77, 168, 218));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        loading.setFont(new java.awt.Font("Montserrat Medium", 0, 16)); // NOI18N
        loading.setForeground(new java.awt.Color(255, 255, 255));
        loading.setText("Loading...");
        jPanel1.add(loading, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 320, -1, -1));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setText("LOGO");
        jPanel1.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 70, 310, 180));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 350));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel loading;
    private javax.swing.JLabel logo;
    // End of variables declaration//GEN-END:variables
}
