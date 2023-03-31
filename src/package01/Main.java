package package01;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog("Enter your name", args);
        System.out.println(name);
    }
}
