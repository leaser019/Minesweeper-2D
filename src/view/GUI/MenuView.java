package view.GUI;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.awt.Font;
import java.awt.Graphics;

public class MenuView extends JFrame {

    private JPanel content;
    static BufferedImage img;

    public MenuView() {
        setResizable(false);
        setFont(new Font("Times New Roman", Font.PLAIN, 14));
        setIconImage(Toolkit.getDefaultToolkit().getImage(
                "img\\icon.png"));
        setTitle("Minesweeper");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600, 620);
        setLocationRelativeTo(null);
        try {
            img = ImageIO.read(new File("img\\Menu.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        content = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                g.drawImage(img, 0, 0, null);
            }
        };
        content.setSize(getPreferredSize());
        this.add(content);

        this.setVisible(true);
    }

    public static void main(String[] args) {
        MenuView menuView = new MenuView();
    }
}
