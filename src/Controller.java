import java.awt.*;

public class Controller {

    private static final Image xImage = Toolkit.getDefaultToolkit().getImage("res/x's.png");
    private static final Image oImage = Toolkit.getDefaultToolkit().getImage("res/o's.png");

    View view;
    Model model;
    public Controller(View v, Model m)
    {
        view = v;
        model = m;
    }




}
