import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoadingScr extends javax.swing.JFrame {
    private ImageIcon loadingIcon;
    private Timer timer;
    public static GameTm tm=null;
    private float alpha = 1.0f; // Initial alpha value for full opacity


    public LoadingScr() {

        initComponents();
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Loading");
        setSize(950, 580);

        MusicPlayer.playLoad();
        loadingIcon = new ImageIcon(getClass().getResource("/image/jabistud.png"));

        lineReader.loading(loadingIcon,"/image/loadingg.gif",2500);


        timer = new Timer(50, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                alpha -= 0.01f; // Decrease alpha value gradually
                if (alpha < 0) {
                    alpha = 0;

                    IntroCutscene obj = new IntroCutscene();
                    tm=new GameTm();
                    lineReader.loading(LoadingScr.this,obj,1000);
                    timer.stop();

                }
                repaint();
            }
        });
        timer.start();
    }

    @Override
    public void paint(Graphics g) {
        Graphics2D g2d = (Graphics2D) g.create();


        g2d.setColor(Color.BLACK);
        g2d.fillRect(0, 0, getWidth(), getHeight());
        int fadeWidth = (int) (getWidth() * alpha);
        int fadeHeight = (int) (getHeight() * alpha);
        g2d.setComposite(AlphaComposite.SrcOver.derive(1.0f));
        g2d.fillRect(0, 0, fadeWidth, getHeight());
        g2d.fillRect(getWidth() - fadeWidth, 0, fadeWidth, getHeight());
        g2d.fillRect(0, 0, getWidth(), fadeHeight);
        g2d.fillRect(0, getHeight() - fadeHeight, getWidth(), fadeHeight);

        g2d.setComposite(AlphaComposite.SrcOver.derive(alpha));
        g2d.drawImage(loadingIcon.getImage(), 0, 0, getWidth(), getHeight(), this);

        g2d.dispose();
    }




    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Loading");
        setBackground(new java.awt.Color(112, 102, 102));
        setPreferredSize(new java.awt.Dimension(950, 580));
        setResizable(false);
        getContentPane().setLayout(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 950, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 580, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

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
            java.util.logging.Logger.getLogger(LoadingScr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoadingScr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoadingScr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoadingScr.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoadingScr().setVisible(true);
            }
        });
    }

}
