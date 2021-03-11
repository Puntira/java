import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test5_15 implements ActionListener {
    JLabel number1Label, number2Label, resultLabel,number3Label;
    JTextField number1Field, number2Field,resultField,number3Field;
    JButton btn1;
    JFrame window;
    /** Creates a new instance of Test5_15 */
    public Test5_15() {
        window = new JFrame("Summation number Swing Application");
        // obtain content pane and set its layout to FlowLayout
        Container container = window.getContentPane();
        container.setLayout( new FlowLayout() );
        // create numberLabel and attach it to content pane
        number1Label = new JLabel( "Enter number 1 " );
        container.add( number1Label );
        number1Field = new JTextField( 10 );
        container.add( number1Field );

        number2Label = new JLabel( "Enter number 2 " );
        container.add( number2Label );
        number2Field = new JTextField( 10 );
        container.add( number2Field );

        number3Label = new JLabel( "Enter   +  -  *  / " );
        container.add( number3Label );
        number3Field = new JTextField( 10 );
        container.add( number3Field );

        resultLabel = new JLabel( "Result value is" );
        container.add( resultLabel );
        resultField = new JTextField( 15 );
        resultField.setEditable( false );
        container.add( resultField );
        btn1 = new JButton(" carculam ");
        btn1.addActionListener( this);
        container.add( btn1 );
        window.setSize( 300,200);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
        public void actionPerformed( ActionEvent event )
        {
            int num1 = Integer.parseInt(number1Field.getText()) ;
            int num2 = Integer.parseInt(number2Field.getText()) ;
            String op =  number3Field.getText();
            if (event.getSource() == btn1)
            {
                if (op.equals("+"))
            }  
                resultField.setText(Integer.toString(num1+num2) ) ;
            else if (event.getSource() == "-")
                resultField.setText(Integer.toString(num1-num2) ) ;
            else if (event.getSource() == "*")
                resultField.setText(Integer.toString(num1*num2) ) ;
            else if (event.getSource() == "/")
                resultField.setText(Float.toString((float)num1/num2) ) ;
            
        } // end method actionPerformed
        public static void main(String[] args) {
            Test5_15 gui = new Test5_15();
        }
}


                


