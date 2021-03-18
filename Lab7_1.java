
// File Name : Lab7_1.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.JScrollPane;

public class Lab7_1 extends JFrame { // ต้อง extendsมี s เป็นการบอกว่าสืบทอดมาจาก jframe
    JLabel numberLabel, resultLabel,blanklabel;
    JTextField numberField,blankfield;
    JTextArea resultArea;
    String blank5 = " ";
    public Lab7_1() {
        super("Program display value n");
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        numberLabel = new JLabel("Enter integer and press Enter");//comprenant
        container.add(numberLabel);
        numberField = new JTextField(10);
        container.add(numberField);

        blanklabel = new JLabel("Enter integer umber of blank:");//comprenant
        container.add(blanklabel);
        blankfield = new JTextField(10);
        container.add(blankfield);


        blankfield.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        int number,line;
                        String sr = "";
                        line = Integer.parseInt(blankfield.getText());
                        number = Integer.parseInt(numberField.getText());
                        resultArea.setText("");
                        for (int n = 1; n <= line; n++) {   
                            sr += " ";   
                        }   
                        for (int n = 1; n <= number; n++) {
                            resultArea.append(blank5 + Integer.toString(n)+sr);
                            if (n % 10 == 0)
                                resultArea.append("\n");
                        }
                        numberField.setText("");
                    } 
                });
        resultArea = new JTextArea(10, 20);
     
        resultArea.setEditable(false);
        container.add(resultArea);
        
    }
    public static void main(String[] args) {
        Lab7_1 window = new Lab7_1();
        window.setSize(360, 290);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        
        JScrollPane scrollableTextArea = new JScrollPane(window.resultArea);
        scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        window.add(scrollableTextArea);
    }
}
