import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalcButton extends JButton  {

    private int value;
    Tablo tablo;

    CalcButton(int value, Tablo tablo) {
        super(String.format("%d",value));
        this.value = value;
        this.tablo = tablo;
        addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tablo.setValue(value);
            }
        });

    }
}
