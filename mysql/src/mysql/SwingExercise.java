package mysql;

import javax.swing.JOptionPane;

public class SwingExercise {

public static void main(String[] args) {


    String name = null;
    boolean input = true;

    try {
     while (input) {
      while (name == null) {
       name = JOptionPane.showInputDialog(null, "Enter username:");
       if (name == null) {
        JOptionPane.showMessageDialog(null, "No input.", "Error", JOptionPane.ERROR_MESSAGE);
       }
      }
      String pw = JOptionPane.showInputDialog(null, "Enter password:");
      input = false;
     }
    } catch (Exception e) {
     JOptionPane.showMessageDialog(null, "Invalid input.", "Error", JOptionPane.ERROR_MESSAGE);

    }
}
}