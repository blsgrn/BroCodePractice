package package01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name", args);
        JOptionPane.showMessageDialog(null, "Hello " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age: "));
        JOptionPane.showMessageDialog(null, "Your age is " + age);

        Double height = Double.parseDouble(JOptionPane.showInputDialog("Enter your height: "));
        JOptionPane.showMessageDialog(null, "Your age is " + height);

    }
}
