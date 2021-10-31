/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalholpoo;
import views.*;

/**
 *
 * @author Vitor
 */
public class TrabalhoLpoo {
    private static void createAndShowGUI() {
        JFrameTelaInicial frame = new JFrameTelaInicial();
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
    
}
