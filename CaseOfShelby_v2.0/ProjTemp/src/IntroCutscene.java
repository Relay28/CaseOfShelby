
import java.awt.*;
import java.util.Objects;

public class IntroCutscene extends javax.swing.JFrame implements Scene {


    public IntroCutscene() {

        initComponents();
        setLocationRelativeTo(null);
        storybox.setEditable(false);
        JsonParser s = new JsonParser();
        String[] dialogues = s.arrayLineReader("openingLines");
        lineReader.dialouge(dialogues, storybox);
        storybox.setBounds(0, 0, 950, 580);

       //// storybox.setDoubleBuffered(true);
        playScene();


    }
    @Override
    public void playScene(){
        lineReader.loading(lblbg,"image/2.gif",5000);
        lineReader.loading(lblbg,"image/3.gif",12000);
        lineReader.loading(lblbg,"image/4.gif",16000);
        //storybox.setDoubleBuffered(true);
        LivingRoom obj = new LivingRoom();
        lineReader.loading(IntroCutscene.this, obj, 25000);



    }

    private void initComponents() {
        jScrollPane1 = new javax.swing.JScrollPane();
        storybox = new javax.swing.JTextArea();
        lblbg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("IntroCutscene");
        setBackground(new java.awt.Color(112, 102, 102));
        setPreferredSize(new java.awt.Dimension(950, 580));
        setResizable(false);
        getContentPane().setLayout(null);


        storybox.setBackground(new java.awt.Color(0, 0, 0));
        // storybox.setColumns(20);
        storybox.setBorder(null);

        storybox.setColumns(20);
        Font font = new Font("SimSun", Font.BOLD, 20); // Change the font name and size as needed
        storybox.setFont(font);
        storybox.setLineWrap(true);
        storybox.setWrapStyleWord(true);
        //  storybox.setBorder(new RoundBorder(30));
        storybox.setForeground(new java.awt.Color(255, 255, 255));
        storybox.setRows(5);
        jScrollPane1.setViewportView(storybox);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(60, 390, 816, 128);

        lblbg.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/image/1.gif")))); // NOI18N
        lblbg.setText("");
        getContentPane().add(lblbg);
        lblbg.setBounds(0, -220, 950, 980);

        pack();
    }


    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IntroCutscene.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(() -> {
            new IntroCutscene().setVisible(true);
        });
    }

    // Variables declaration - do not modify
    private javax.swing.JLabel lblbg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea storybox;
    // End of variables declaration
}
