package src;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import java.awt.Color;

public class SimpleFrame {
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

    public static void main(String[] args) {
        SimpleFrame f = new SimpleFrame();
        f.frameTest();
    }
}