import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class RandomButtons implements MouseListener {


    JButton button;
    Image image;
    public RandomButtons(JButton c)
    {
        button = c;
        image = null;

    }



    public RandomButtons(JButton c, Image i)
    {
        image = i;
        button = c;
    }
    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        RandomNumbers r = new RandomNumbers();
        RandomNumbers d = new RandomNumbers();
        r.setMaxValue(499);
        d.setMaxValue(100);
        d.setMin(50);
        int width = d.roll();
        int height = d.roll();
        button.setBounds(r.roll(),r.roll(),width,height);
        button.setIcon(new ImageIcon(image.getScaledInstance(width,height,Image.SCALE_DEFAULT)));
        button.setText("" + (char)width +  " " + (char)height);
        System.out.println(width + " " + height);

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
