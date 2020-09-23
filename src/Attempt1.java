
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.*;
import java.io.File;

public class Attempt1 extends JFrame {

    private static final int BASELEN = 50;

    public Attempt1()
    {
        JButton r1c1 = new JButton();
        JButton r1c2 = new JButton();
        JButton r1c3 = new JButton();

        JButton r2c1 = new JButton();
        JButton r2c2 = new JButton();
        JButton r2c3 = new JButton();

        JButton r3c1 = new JButton();
        JButton r3c2 = new JButton();
        JButton r3c3 = new JButton();

        JButton reset = new JButton("Reset");
        reset.setBounds(200,0,150,BASELEN);

        JButton [] row1 = {r1c1,r1c2,r1c3};
        JButton [] row2 = {r2c1,r2c2,r2c3};
        JButton [] row3 = {r3c1,r3c2,r3c3};

        JButton [][] arr = {row1,row2,row3};

        JLabel label = new JLabel();
        label.setBounds(225,400,100,40);


        int vOffset =200;
        int hOffset = 200;
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                JButton b = arr[i][j];
                b.setBounds(j*BASELEN + hOffset,i*BASELEN+vOffset,BASELEN,BASELEN);
                StaticButtons staticButtons = new StaticButtons(b,label);



                b.addMouseListener(staticButtons);


                add(b);
                add(label);

            }

        }
        reset.addActionListener(e  ->
        {
            try
            {
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("res/tada.wav").getAbsoluteFile());
                Clip clip = AudioSystem.getClip();
                clip.open(audioInputStream);
                clip.start();
            }
            catch (Exception v)
            {
                v.printStackTrace();
            }
        });


        add(reset);
        setLayout(null);
        setSize(500,500);
        setVisible(true);


    }

    public static void main(String[] args) {
        new Attempt1();
    }
}
