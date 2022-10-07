package layout;

import javax.swing.*;
import java.awt.*;

public class GridLayout {
    public static void main(String[] args) {
        JFrame frame = new JFrame("网格布局");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);



        //行数和总数优先
        JPanel panel = new JPanel(new java.awt.GridLayout(3, 3, 20, 20));
        for (int i = 1; i <= 9; i++) {
            JButton button = new JButton("按钮" + i);
            panel.add(button);
        }
        frame.setContentPane(panel);
    }
}
