package ntzoe.j.app;

import org.ntzoe.j.implement.ui.swing.NotifyLabel;

import javax.swing.*;
import java.awt.*;
import java.util.jar.Manifest;

public class Main extends JFrame {

    private NotifyLabel nlabel;

    public Main() {

        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(500, 500);

        JLabel label = new JLabel("i'm popup");
        label.setBackground(Color.PINK);
        label.setSize(250, 100);

        JButton button =  new JButton("click me");

        JPanel panel = new JPanel();
        panel.add(button);

        this.nlabel = new NotifyLabel(button, label);

        this.add(panel);

        this.setVisible(true);

    }

    public static void main(String[] args) {
        new Main();
    }
}