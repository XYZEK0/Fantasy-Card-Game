package GUI;

import javax.swing.*;
import java.awt.*;

public class GUI extends JFrame
{

    public GUI()
    {
        super("FantasyCardGame");
        JPanel board = new JPanel();

        board.setPreferredSize(new Dimension(500,500));


        JButton but = new JButton(new ImageIcon("morda.jpg"));

        board.add(but);

        this.add(board);
        this.setResizable(true);
        this.pack();
        this.setVisible(true);
    }
}
