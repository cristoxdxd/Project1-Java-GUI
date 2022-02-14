package ATM_Simulator;

import java.awt.HeadlessException;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Cristopher Herrera
 */
public class GUI_Error extends javax.swing.JFrame {
    public GUI_Error(int index, HeadlessException e) {
        initComponents();
        setLocationRelativeTo(null);
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 20)); 
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Error type: ");
        jLabel5.setText(""+e);

        
        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 10;
            public void run() {
                i--;
                if (i < 0) {
                    timer.cancel();
                    GUI_Principal pPrincipal = new GUI_Principal(index);
                    pPrincipal.setVisible(true);
                }
            }
        }, 0, 1000);
        this.setVisible(false);

    }

    public GUI_Error(int index, String e) {
        initComponents();
        setLocationRelativeTo(null);
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 20)); 
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Error type: ");
        jLabel5.setText(""+e);
        
        Timer timer = new Timer();
    double RN=455;//
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 10;
            public void run() {
                i--;
                if (i < 0) {
                    timer.cancel();
                    GUI_Principal pPrincipal = new GUI_Principal(index);
                    pPrincipal.setVisible(true);
                }
            }
        }, 0, 1000);
        this.setVisible(false);
    }
    
    public GUI_Error(String e, int number) {
        initComponents();
        setLocationRelativeTo(null);
        jLabel4.setFont(new java.awt.Font("Roboto Medium", 1, 20)); 
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Error type: ");
        jLabel5.setText(""+e);
        
        Timer timer = new Timer();
    
        timer.scheduleAtFixedRate(new TimerTask() {
            int i = 10;
            public void run() {
                i--;
                if (i < 0) {
                    timer.cancel();
                    GUI_Init pInit = new GUI_Init();
                    pInit.setVisible(true);
                }
            }
        }, 0, 1000);
        this.setVisible(false);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 183, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Roboto Light", 3, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Algo salió mal...");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, -1, -1));

        jLabel3.setFont(new java.awt.Font("Roboto Thin", 2, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Esto no era lo esperado");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Roboto Medium", 0, 20)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Design_Images/2910824.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 530, 540));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 900, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUI_Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI_Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI_Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI_Error.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI_Error(0,"").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
