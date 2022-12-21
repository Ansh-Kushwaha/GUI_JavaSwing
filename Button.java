import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Button extends JFrame implements ActionListener{

    JButton button;
    JLabel label;

    Button(){
        button = new JButton("Click Here!");
        label = new JLabel();
        this.setSize(500, 500);
        this.setResizable(false);
        this.getContentPane().setBackground(new Color(45, 45, 45));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setVisible(true);
        
        button.setBounds(200, 200, 100, 40);
        button.addActionListener(this);
        button.setFocusable(false);
        button.setForeground(Color.GRAY);
        button.setBackground(new Color(65, 65, 65));
        button.setBorder(BorderFactory.createBevelBorder(2));

        label.setBounds(150, 150, 200, 40);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.BOTTOM);
        label.setHorizontalAlignment(JLabel.CENTER);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setBackground(Color.GRAY);
        label.setOpaque(true);
        // label.setText("This is a label!");
        label.setFont(new Font("Bahnschrift", Font.PLAIN, 25));
        
        this.add(label);
        this.add(button);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == button) {
            this.getContentPane().setBackground(new Color(85, 85, 85));
            this.setTitle("You successfully clicked the button!");
            label.setText("Task Completed.");
            System.out.println("Task completed.");
        }
    }

    public static void main(String[] args) {
        new Button();
    }
}