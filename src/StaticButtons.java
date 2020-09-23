import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class StaticButtons implements MouseListener {
    private static int turn = 0;
    private JButton button;
    private Image image;
    private JLabel label;

    private static final Image xImage = Toolkit.getDefaultToolkit().getImage("res/x's.png");
    private static final Image oImage = Toolkit.getDefaultToolkit().getImage("res/o's.png");

    public static int getTurn() {
        int val = turn % 2;
        if (val  == 0)
            return 1;
        return 2;
    }

    public StaticButtons(JButton b, JLabel l)
    {
        this(b,null,l);
    }

    public StaticButtons(JButton b, Image i, JLabel l)
    {
        button = b;
        image = i;
        label = l;
        label.setText("turn : Player" + StaticButtons.getTurn());


    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        turn++;
        image = turn % 2 == 0 ? xImage: oImage;
        button.setIcon(new ImageIcon(image.getScaledInstance(button.getWidth(),button.getHeight(),Image.SCALE_DEFAULT)));
        label.setText("turn : Player" + StaticButtons.getTurn());

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
