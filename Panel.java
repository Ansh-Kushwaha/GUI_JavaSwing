import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {
    public void panelTest() {
        // JPanel = a GUI component that functions as a container to hold other components

        JPanel orangePanel = new JPanel(); // create a new JPanel object
        orangePanel.setBackground(new Color(255, 196, 156)); // set background color of the panel
        orangePanel.setBounds(25, 25, 250, 250);
        JPanel sBluePanel = new JPanel();
        sBluePanel.setBackground(new Color(194, 232, 255));
        sBluePanel.setBounds(300, 25, 250, 250);
        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(new Color(139, 183, 240));
        bluePanel.setBounds(25, 300, 250, 250);
        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(new Color(186, 224, 189));
        greenPanel.setBounds(300, 300, 250, 250);

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(588, 612);
        frame.setTitle("Colouorange Tiles!");
        ImageIcon icon = new ImageIcon("images/tiles.png");
        frame.setIconImage(icon.getImage());
        frame.setVisible(true);
        frame.setResizable(false);
        frame.add(orangePanel);
        frame.add(sBluePanel);
        frame.add(bluePanel);
        frame.add(greenPanel);
    }

    public static void main(String[] agrs) {
        Panel obj = new Panel();
        obj.panelTest();
    }
}