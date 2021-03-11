import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test5_9 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Selection Sorteiei");
        JTextArea textArea = new JTextArea();
        Font newfont = new Font("Tamaho",Font.BOLD,16);
        int array[] = {2, 6, 4, 8, 10, 12, 89, 68, 45, 37};
        String output;

        output = "Data items in original order\n";
        for(int n = 1 ; n < array.length; n++)
            output += " " + array[n];

        selectionSort(array);
        output += "\n\nData items in ascending order\n";
        for(int n = 1 ; n < array.length; n++)
            output += " " + array[n];
        textArea.setForeground(Color.blue);
        textArea.setFont(newfont);
        textArea.setText(output);
        // add component
        window.add(textArea);
        window.setSize( 320,240);
        window.setVisible(true);
        window.setDefaultCloseOperation(
        JFrame.EXIT_ON_CLOSE);
        }
        public static void selectionSort(int a[])
        {
        for(int pass = a.length - 1 ; pass > 0 ; pass--) {
            int max = pass;
            for (int n = pass ; n >= 0 ; n--)
                if (a[n] > a[max]) max = n;
            if (pass != max) {
                int temp = a[pass];
                a[pass] = a[max];
                a[max] = temp;
            }
        }
    }
}
