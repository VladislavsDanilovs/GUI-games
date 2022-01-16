package GUI.Lesson10;
//JOptionPane

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Test1 {

    public static void main(String[] args) {

        // JOptionPane.showMessageDialog(null, "This is khjau", "Mr.Khaju",
        // JOptionPane.INFORMATION_MESSAGE);

        // JOptionPane.showConfirmDialog(null, "Khaau", "title",
        // JOptionPane.OK_CANCEL_OPTION);
        // String name1 = JOptionPane.showInputDialog("wait What?");

        // System.out.println("Hello "+name1);

        String[] responses = { "No ", "tings", "blush" };

        ImageIcon img1 = new ImageIcon("shaq1.png");

        JOptionPane.showOptionDialog(null, "Oke", "Skra", JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE, img1, responses, 0);

    }

}
