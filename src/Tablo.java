import javax.swing.*;
import java.awt.*;

public class Tablo extends JLabel {
    final static int NOACTION = 0;
    final static int PLUS = 1;
    final static int MINUS = 2;
    final static int EQUAL = 3;
    final static int CLEAR = 4;
    private int value = 0;
    private int memvalue = 0;
    private int action = NOACTION;
    private boolean isClear = true;
    private boolean isClearTablo = false;

    Tablo () {
        Font font = new Font("Verdana", Font.PLAIN, 20);
        setBackground(Color.RED);
        setPreferredSize(new Dimension(400,40));
        setVerticalAlignment(TOP);
        setHorizontalAlignment(CENTER);
        setForeground(Color.BLUE);
        setFont(font);
        setBorder(BorderFactory.createLineBorder(Color.RED, 5));
    }

    public void setValue(int value) {
        if (isClearTablo) {
            this.value = value;
            isClearTablo = false;
        }
        else {
            this.value = this.value*10 + value;

        }
        setText(String.format("%d",this.value));
    }

    public void setAction (int action) {
        if (action == CLEAR) { clearTablo(); return; }
        switch (this.action) {
            case PLUS:
                plusValue();
                break;
            case MINUS:
                minusValue();
                break;
        }
        memvalue = value;
        this.action = action;
        isClear = true;
        isClearTablo = true;
    }

    private void clearTablo () {
        memvalue = 0;
        value = 0;
        this.action = NOACTION;
        setText(String.format("%d", memvalue));
        isClear = true;
    }

    private void plusValue() {
        memvalue += value;
        value = memvalue;
        setText(String.format("%d", memvalue));
    }

    private void minusValue() {
        memvalue -= value;
        value = memvalue;
        setText(String.format("%d", memvalue));
    }
}
