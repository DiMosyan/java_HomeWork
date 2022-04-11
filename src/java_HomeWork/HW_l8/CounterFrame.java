package java_HomeWork.HW_l8;

import com.sun.deploy.ui.FancyButton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterFrame extends JFrame {
    private int value = 0;
    JPanel mainPanel = new JPanel();
    JPanel bottomPanel = new JPanel();

    public CounterFrame() {
        setTitle("Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(300, 300, 250, 220);
        Font font = new Font("Arial", Font.BOLD, 32);
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setPreferredSize(new Dimension(200, 120));
        add(mainPanel, BorderLayout.CENTER);
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.setPreferredSize(new Dimension(200, 60));
        add(bottomPanel, BorderLayout.SOUTH);

        JLabel label = new JLabel(String.valueOf(value));
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setFont(font);
        label.setPreferredSize(new Dimension(100, 50));
        mainPanel.add(label, BorderLayout.CENTER);

        JButton decrementButton = new JButton("<");
        decrementButton.setFont(font);
        mainPanel.add(decrementButton, BorderLayout.LINE_START);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelUpdate(label, -1);
            }
        });

        JButton incrementButton = new JButton(">");
        incrementButton.setFont(font);
        mainPanel.add(incrementButton, BorderLayout.LINE_END);
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelUpdate(label, 1);
            }
        });

        JButton zeroButton = new JButton("Reset");
        zeroButton.setFont(font);
        mainPanel.add(zeroButton, BorderLayout.NORTH);
        zeroButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelUpdate(label, -value);
            }
        });

        JButton decrementTenButton = new JButton("10 <<");
        decrementTenButton.setFont(font);
        bottomPanel.add(decrementTenButton, BorderLayout.LINE_START);
        decrementTenButton.addActionListener((new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelUpdate(label, -10);
            }
        }));

        JButton incrementTenButton = new JButton(">> 10");
        incrementTenButton.setFont(font);
        bottomPanel.add(incrementTenButton, BorderLayout.LINE_END);
        incrementTenButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labelUpdate(label, 10);
            }
        });

        setVisible(true);
    }

    private void labelUpdate(JLabel label, int count) {
        this.value += count;
        label.setText(String.valueOf(this.value));
    }
}
