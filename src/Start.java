import javax.swing.*;
import java.awt.*;

public class Start {
    public static void main(String[] args) {
        opdracht1();
        opdracht2();
        opdracht3();
    }
    public static void opdracht1(){
        JOptionPane.showMessageDialog(null, "Hello world");
    }
    public static void opdracht2(){
        String name = JOptionPane.showInputDialog(null, "Voer een naam in");
        JOptionPane.showMessageDialog(null, "Hello " + name);
    }

    public static void opdracht3() {
        JFrame frame = new JFrame("Mooie GUI");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("Vul hier onder wat in:", SwingConstants.CENTER);
        label.setBounds(50,100,200,30);
        JTextField textfield = new JTextField(SwingConstants.CENTER);
        textfield.setBounds(50,150,200,30);
        textfield.setSize(200, 30);
        panel.add(label);
        frame.add(panel);
        frame.add(textfield);
        frame.add(label);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
