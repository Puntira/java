import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class Example08_11 {

    public static void main(String[] args) {
        new Example08_11().new Mycal();
    }
    class Mycal implements ActionListener {
        JFrame window;
        JLabel numberLabel;
        JTextField numberField;
        JButton[] btn;
        JPanel panel1, panel2;
        Font myFont = new Font("Tahoma", Font.BOLD, 18);
    

        public Mycal() {
            window = new JFrame("My Calculator");
            Container c = window.getContentPane();
            c.setLayout(new FlowLayout());

            panel1 = new JPanel();
            panel1.setPreferredSize(new Dimension(270, 40));
            panel1.setLayout(new FlowLayout());
            panel1.setBorder(new LineBorder(Color.DARK_GRAY, 1));
            numberField = new JTextField(15);
            numberField.setEditable(false);
            numberField.setFont(myFont);
            numberField.setHorizontalAlignment(JTextField.RIGHT);
            panel1.add(numberField);
            panel2 = new JPanel();
            panel2.setPreferredSize(new Dimension(250, 200));
            panel2.setLayout(new GridLayout(4, 3));
            panel2.setBorder(new LineBorder(Color.LIGHT_GRAY, 1));
            String[] textBtn = { " 1 ", " 2 ", " 3 ", " 4 ", " 5 ", " 6 ", " 7 ", " 8 ", " 9 ", " 0 ", " . ", " C " };
            btn = new JButton[textBtn.length];
            for (int n = 0; n < btn.length; n++) {
                btn[n] = new JButton(textBtn[n]);
                btn[n].setFont(myFont);
                btn[n].addActionListener(this);
                panel2.add(btn[n]);
            }
            c.add(panel1);
            c.add(panel2);
            window.setSize(300, 300);
            window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            window.setVisible(true);
        }

        public void actionPerformed(ActionEvent event) {

            String str = numberField.getText();
            if (event.getSource() == btn[0]) {
                str += "1";
                numberField.setText(str);
            } else if (event.getSource() == btn[1]) {
                str += "2";
                numberField.setText(str);
            } else if (event.getSource() == btn[2]) {
                str += "3";
                numberField.setText(str);
            } else if (event.getSource() == btn[3]) {
                str += "4";
                numberField.setText(str);
            } else if (event.getSource() == btn[4]) {
                str += "5";
                numberField.setText(str);
            } else if (event.getSource() == btn[5]) {
                str += "6";
                numberField.setText(str);
            } else if (event.getSource() == btn[6]) {
                str += "7";
                numberField.setText(str);
            } else if (event.getSource() == btn[7]) {
                str += "8";
                numberField.setText(str);
            } else if (event.getSource() == btn[8]) {
                str += "9";
                numberField.setText(str);
            } else if (event.getSource() == btn[9]) {
                str += "0";
                numberField.setText(str);
            } else if (event.getSource() == btn[10]) {
                str += ".";
                numberField.setText(str);
            } else if (event.getSource() == btn[11]) {
                numberField.setText("");
            }
        }
    }
}

