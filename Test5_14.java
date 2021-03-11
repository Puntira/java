import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Test5_14 extends JFrame {
    JLabel numberLabel, resultLabel;
    JTextField numberField, resultField;
    /** Creates a new instance of Test5_14 */
    public Test5_14() {
        super("Summation number Swing Application");
        // obtain content pane and set its layout to FlowLayout
        Container container = getContentPane();
        container.setLayout( new FlowLayout() );
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel( "Enter an integer and press Enter" );
        container.add( numberLabel );
        // create numberField and attach it to content pane
        numberField = new JTextField( 10 );
        container.add( numberField );
        // register this applet as numberField’s ActionListener
        numberField.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent event )
            {
                long number, sumValue;
                // obtain user’s input and convert to long
                number = Long.parseLong( numberField.getText() );
                // calculate fibonacci value for number user input
                sumValue = summation( number );
                // indicate processing complete and display result
                //showStatus( "Done." );
                resultField.setText( Long.toString( sumValue ) );
            } // end method actionPerformed
        } );
            // create resultLabel and attach it to content pane
            resultLabel = new JLabel( "Summation value is" );
            container.add( resultLabel );
            // create numberField, make it uneditable
            // and attach it to content pane
            resultField = new JTextField( 15 );
            resultField.setEditable( false );
            container.add( resultField );
            }
            public static void main(String[] args) {
                Test5_14 window = new Test5_14();
                window.setSize( 350,150);
                window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                window.setVisible(true);
            }
    public long summation( long n )
    {
        long total = 0;
        for(long x = 0 ; x <= n ; x++)
        total += x;
        return(total);
    } // end method summation
}