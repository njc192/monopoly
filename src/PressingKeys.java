import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class PressingKeys implements KeyListener {
    @Override
    public void keyTyped(KeyEvent keyEvent) {
        Util u = new Util();
        u.print(keyEvent.paramString(), "paramString");
        u.print(keyEvent.getExtendedKeyCode(),"extendedKeyCode");
        u.print(keyEvent.isActionKey(),"isActionKey");
        u.print(keyEvent.getKeyChar(),"keyEvent.getKeyChar()");


    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {
        // do nothing for now

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

    }

    public static void main(String[] args) {
        new PressingKeys();
    }
}
