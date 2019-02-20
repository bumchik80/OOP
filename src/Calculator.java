import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    final static String WINDOW_TITLE = "Калькулятор";
    Calculator() {
        drawWindow();
    }

    private void drawWindow() {
        JFrame window = new JFrame(WINDOW_TITLE);
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setBounds(300, 300, 400, 400);

        addComponent(window.getContentPane());

        window.pack();
        window.setVisible(true);

    }

    private void addComponent(Container pane) {

        JPanel panelTablo = new JPanel();

        Tablo tablo = new Tablo();
        panelTablo.add(tablo);

        JPanel panelNumber = new JPanel();
        for (int i = 0; i < 10; i++) {
            panelNumber.add(new CalcButton(i, tablo));
        }

        JPanel panelControl = new JPanel();
        JButton plusButton = new JButton("+");
        plusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablo.getText().length() > 0) {
                    tablo.setAction(Tablo.PLUS);
                }
            }
        });
        panelControl.add(plusButton);

        JButton minusButton = new JButton("-");
        minusButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablo.getText().length() > 0) {
                    tablo.setAction(Tablo.MINUS);
                }
            }
        });
        panelControl.add(minusButton);

        JButton equalButton = new JButton("=");
        equalButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablo.getText().length() > 0) {
                    tablo.setAction(Tablo.EQUAL);
                }
            }
        });
        panelControl.add(equalButton);

        JButton clearButton = new JButton("C");
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tablo.getText().length() > 0) {
                    tablo.setAction(Tablo.CLEAR);
                }
            }
        });
        panelControl.add(clearButton);



        pane.add(panelTablo, BorderLayout.PAGE_START);
        pane.add(panelNumber, BorderLayout.CENTER);
        pane.add(panelControl, BorderLayout.PAGE_END);
    }
}
