package ntzoe.j.app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Swing extends JFrame {

    public Swing() {
        this.setSize(new Dimension(500, 500));

        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        JButton button = new JButton("click to show popup");
        button.setSize(100, 100);


        JTable label = new JTable();
        label.setBackground(Color.BLUE);
        label.setSize(200, 200);

        Popup popup = PopupFactory.getSharedInstance()
                .getPopup(button, label, 0, 0);

        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("show popup");
                popup.show();
            }
        });
        this.add(button);
        this.add(new JLabel());
    }

}
