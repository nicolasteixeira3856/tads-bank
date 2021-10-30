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
        TelaDeleteCliente frame1 = new TelaDeleteCliente();
        TelaManejarContas frame2 = new TelaManejarContas();
        TelaVincularContaCliente frame3 = new TelaVincularContaCliente();
        frame2.setVisible(true);
        frame3.setVisible(true);
        frame1.setVisible(true);
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
