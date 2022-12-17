import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI {
    public void frameTest() {
        //JFrame = A new GUI Window
        JFrame frame = new JFrame();
        frame.setVisible(true); //make frame visible
        frame.setSize(500, 500); //size of frame 500x500
        frame.setTitle("GUI Test"); //set title of frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exit out of application
        //frame.setResizable(false); to make the window non-resizable

        ImageIcon logo = new ImageIcon("images/Icon.png"); //ImageIcon object
        frame.setIconImage(logo.getImage()); //change icon of frame
        frame.getContentPane().setBackground(new Color(40, 40, 40)); //set background of the frame
    }

    public void labelTest() {
        //JFrame = A new GUI Window
        JFrame frame = new JFrame();
        frame.setSize(500, 500);
        //frame.setResizable(false);
        frame.setTitle("You caught a Pikachu!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Border border = BorderFactory.createLineBorder(Color.WHITE, 2);

        ImageIcon logo = new ImageIcon("images/pokeball.png");
        frame.setIconImage(logo.getImage());
        //frame.getContentPane().setBackground(new Color(20, 20, 20)); 
        
        //JLabel = a GUI display area for a string, image or both
        JLabel label = new JLabel(); //create a new label
        frame.add(label);
        ImageIcon p = new ImageIcon(new ImageIcon("images/pikachu.png").getImage().getScaledInstance(350, 360, Image.SCALE_DEFAULT));
        label.setIcon(p); //set image for the label
        label.setText("Pikachu"); //set text of the label
        label.setFont(new Font("Bahnschrift", Font.PLAIN, 25)); //set font of the text
        label.setIconTextGap(15); //set gap of icon to the text
        label.setBackground(new Color(20, 20, 20)); //set background of the label
        label.setOpaque(true); //to display background color
        label.setHorizontalTextPosition(JLabel.CENTER); //set horizontal text position wrt icon (LEFT, CENTER, RIGHT)
        label.setVerticalTextPosition(JLabel.BOTTOM); //set vertical text position wet icon (TOP, CENTER, BOTTOM)
        label.setForeground(Color.WHITE); //set text color
        label.setBorder(border); //set border
        label.setVerticalAlignment(JLabel.CENTER); //set vertical position of icon+text within label
        label.setHorizontalAlignment(JLabel.CENTER); //set horizontal position of icon+text within label
        
        frame.setVisible(true);
        //frame.pack(); auto resize according to components
    }

    public static void main(String[] args) {
        GUI Test = new GUI();
        // Test.frameTest();
        Test.labelTest();
    }
}