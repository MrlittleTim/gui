package layout;

import javax.swing.*;

public class FlowLayout {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("测试布局");
        jFrame.setSize(500, 400);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 20, 20));
        JButton button1 = new JButton("按钮1");
        JButton button2 = new JButton("按钮2");
        JButton button3 = new JButton("按钮3");
        JButton button4 = new JButton("按钮4");
        JButton button5 = new JButton("按钮5");
        panel.add(button1);
        panel.add(button2);
        panel.add(button3);
        panel.add(button4);
        panel.add(button5);
        jFrame.setContentPane(panel);
        jFrame.setVisible(true);
    }
}
