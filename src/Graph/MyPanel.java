package Graph;

import Board.ArrayOfPlaces;
import Board.BoardContent;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class MyPanel extends JPanel {
    private BufferedImage image;
    private BufferedImage image2;
    private BufferedImage image3;
    private BufferedImage image4;
    private BufferedImage image5;
    private BufferedImage image6;

    BoardContent[][] boardContent;

    public MyPanel(BoardContent[][] boardContent) {
        this.boardContent = boardContent;
        setPreferredSize(new Dimension(1200, 1000));
        try {
            image = ImageIO.read(new File("src/Images/PLKO.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            image2 = ImageIO.read(new File("src/Images/sword.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            image3 = ImageIO.read(new File("src/Images/allay.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            image4 = ImageIO.read(new File("src/Images/hearth.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            image5 = ImageIO.read(new File("src/Images/death.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            image6 = ImageIO.read(new File("src/Images/time.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }


    }


    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(image, 0, 0, this);
        g.setFont(new Font("TimesRoman", Font.PLAIN, 25));
        g2d.drawString("Statystyki:", 1047, 220);
        g2d.drawString(String.valueOf(Stats.alive), 1100, 283);

        for (int i = 0; i < 1000; i++) {
            for (int k = 0; k < 1000; k++) {
                g2d.setColor(new Color(0, 128, 0));
                g2d.drawRect(i, k, 1, 1);

            }
        }
        for (int u = 0; u < ArrayOfPlaces.xFood.size(); u++) {
            g2d.setColor(new Color(128, 0, 0));
            g2d.drawRect(ArrayOfPlaces.xFood.get(u), ArrayOfPlaces.yFood.get(u), 1, 1);
        }
        for (int u = 0; u < ArrayOfPlaces.xIron.size(); u++) {
            g2d.setColor(new Color(161, 157, 148));
            g2d.drawRect(ArrayOfPlaces.xIron.get(u), ArrayOfPlaces.yIron.get(u), 1, 1);
        }
        for (int u = 0; u < ArrayOfPlaces.xStone.size(); u++) {
            g2d.setColor(new Color(136, 140, 141));
            g2d.drawRect(ArrayOfPlaces.xStone.get(u), ArrayOfPlaces.yStone.get(u), 1, 1);
        }
        for (int u = 0; u < ArrayOfPlaces.xWood.size(); u++) {
            g2d.setColor(new Color(133, 94, 55));
            g2d.drawRect(ArrayOfPlaces.xWood.get(u), ArrayOfPlaces.yWood.get(u), 1, 1);
        }


        for (int i = 0; i < 1000; i++) {
            for (int k = 0; k < 1000; k++) {
                if (boardContent[i][k].occupied) {
                    for (int l = 0; l < 2; l++) {
                        for (int m = 0; m < 2; m++) {
                            g2d.setColor(new Color(0, 0, 0));
                            g2d.drawRect(i + l, k + m, 1, 1);
                        }

                    }
                }

            }
        }
        for (int d = 0; d < 1001; d++) {
            g2d.setColor(new Color(255, 255, 255));
            g2d.drawRect(1001, d, 1, 1);
        }

        g2d.drawImage(image, 1000, 0, this);
        g2d.drawImage(image2, 1020, 258, this);
        g2d.drawImage(image3, 1008, 310, this);
        g2d.drawImage(image4, 1016, 362, this);
        g2d.drawImage(image5, 1016, 414, this);
        g2d.drawImage(image6, 1016, 466, this);

    }
}