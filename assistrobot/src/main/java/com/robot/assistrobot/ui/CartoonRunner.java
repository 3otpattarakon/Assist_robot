package com.robot.assistrobot.ui;

import javax.swing.*;
import java.awt.*;

public class CartoonRunner extends JFrame {

    private int x = 0;
    private final int y = 300; // ตำแหน่งแนวตั้ง
    private final int speed = 5;

    public CartoonRunner() {
        setSize(100, 100);
        setUndecorated(true);
        setAlwaysOnTop(true);
        setBackground(new Color(0, 0, 0, 0)); // โปร่งใส
        setLayout(null);

        ImageIcon icon = new ImageIcon(
            getClass().getResource("/images/CatSlimeIdle.png")
        );

        JLabel label = new JLabel(icon);
        label.setBounds(0, 0, 100, 100);
        add(label);

        setLocation(x, y);
        setVisible(true);

        startAnimation();
    }

    private void startAnimation() {
        Timer timer = new Timer(50, e -> {
            x += speed;

            int screenWidth = Toolkit.getDefaultToolkit()
                    .getScreenSize().width;

            if (x > screenWidth) {
                x = -100; // วิ่งกลับจากซ้าย
            }

            setLocation(x, y);
        });
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(CartoonRunner::new);
    }
}