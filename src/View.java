import javax.swing.*;

public class View
{
    public static final int BASELEN = 50;

    private static JButton r1c1 = new JButton();
    private static JButton r1c2 = new JButton();
    private static JButton r1c3 = new JButton();

    private static JButton r2c1 = new JButton();
    private static JButton r2c2 = new JButton();
    private static JButton r2c3 = new JButton();

    private static JButton r3c1 = new JButton();
    private static JButton r3c2 = new JButton();
    private static JButton r3c3 = new JButton();

    private static JButton [] row1 = {r1c1,r1c2,r1c3};
    private static JButton [] row2 = {r2c1,r2c2,r2c3};
    private static JButton [] row3 = {r3c1,r3c2,r3c3};

    private static JButton [][] arr = {row1,row2,row3};

    public View()
    {


        JButton reset = new JButton("Reset");
        reset.setBounds(200,0,150,BASELEN);

        JButton [][] arr = {row1,row2,row3};

        JLabel label = new JLabel();
        label.setBounds(225,400,100,40);
    }
}
