package skp.main;

import javax.swing.SwingUtilities;
import javax.swing.UIDefaults;
import javax.swing.UIManager;
import skp.customs.ScrollBarWin11UI;
import skp.view.SplashScreen;

/**
 *
 * @author yabsiraditya
 */


public class MainApp {
    public static void main(String[] args) {
        
        //Customs Scroll Pane
        UIDefaults ui = UIManager.getDefaults();
        
        ui.put("ScrollBarUI", ScrollBarWin11UI.class.getCanonicalName());
        
        
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }
}