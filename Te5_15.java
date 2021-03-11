import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Te5_15 implements ActionListener {
JLabel number1Label, number2Label, resultLabel;
JTextField number1Field, number2Field,resultField;
JButton btn1, btn2, btn3, btn4;
JFrame window;

/** Creates a new instance of Test5_15 */
public Te5_15() {
window = new JFrame("Summation number SwingApplication");
// obtain content pane and set its layout to FlowLayout
Container container = window.getContentPane();
container.setLayout( new FlowLayout() );
// create numberLabel and attach it to content pane
number1Label = new JLabel( "Enter number 1 " );

container.add( number1Label );
number1Field = new JTextField( 10 );
//number1Field.setEditable(false);
//number1Field.setText("10");
container.add( number1Field );
number2Label = new JLabel( "Enter number 2 " );
container.add( number2Label );
number2Field = new JTextField( 10 );
//number2Field.addActionListener(this); //เเปะเซนเซอร์
container.add( number2Field );
resultLabel = new JLabel( "Result value is" );
container.add( resultLabel );
resultField = new JTextField( 15 );
resultField.setEditable( false );
container.add( resultField );
btn1 = new JButton(" + ");
btn1.addActionListener( this);
container.add( btn1 );
btn2 = new JButton(" - ");
btn2.addActionListener( this);
container.add( btn2 );
btn3 = new JButton(" * ");
btn3.addActionListener( this);
container.add( btn3 );
btn4 = new JButton(" / ");
btn4.addActionListener( this);
container.add( btn4 );
window.setSize( 300,150);
window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
;
window.setVisible(true);
}
public void actionPerformed( ActionEvent event )
{
int num1 = Integer.parseInt(number1Field.getText()) ;
int num2 = Integer.parseInt(number2Field.getText()) ;

if (event.getSource() == btn1)
resultField.setText(Integer.toString(num1+num2) ) ;
else if (event.getSource() == btn2)
resultField.setText(Integer.toString(num1-num2) ) ;
else if (event.getSource() == btn3)
resultField.setText(Integer.toString(num1*num2) ) ;
else if (event.getSource() == btn4)
resultField.setText(Float.toString((float)num1/num2) ) ;
} 
public static void main(String[] args) {
    Te5_15 gui = new Te5_15();
    }
     }
