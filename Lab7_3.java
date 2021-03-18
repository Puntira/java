// File Name : Lab7_3.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextArea numberField;
    JButton btn1, btn2, btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn0,btnc,btndel,btnce,btnb,btnp,btnl,btnx,btns,btnq,btng;
    Float num1,num2;
    String op = "";
    JFrame window;
    public Lab7_3() {
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout( new FlowLayout() );
        
        /*numberLabel = new JLabel( "Show Number : " );
        container.add( numberLabel );*/
        numberField = new JTextArea(10,20);
        numberField.setEditable(false);
        container.add(numberField);
        container.add( numberField );
        //numberField.setHorizontalAlignment ( SwingConstants.RIGHT );

        
        btnp = new JButton(" % "); 
        btnp.addActionListener( this);
        container.add( btnp );
        btnce = new JButton(" CE"); 
        btnce.addActionListener( this);
        container.add( btnce );
        btnc = new JButton(" c "); 
        btnc.addActionListener( this);
        container.add( btnc );
        btndel = new JButton("<"+""); 
        btndel.addActionListener( this);
        container.add( btndel );
        btnl = new JButton(" - "); 
        btnl.addActionListener( this);
        container.add( btnl );
        btnx = new JButton(" * "); 
        btnx.addActionListener( this);
        container.add( btnx );
        btns = new JButton(" / "); 
        btns.addActionListener( this);
        container.add( btns );
        btnq = new JButton(" . "); 
        btnq.addActionListener( this);
        container.add( btnq );
        btn1 = new JButton(" 1 ");
        btn1.addActionListener( this);
        container.add( btn1 );
        btn2 = new JButton(" 2 ");
        btn2.addActionListener( this);
        container.add( btn2 );
        btn3 = new JButton(" 3 ");
        btn3.addActionListener( this);
        container.add( btn3 );
        btn4 = new JButton(" 4 ");
        btn4.addActionListener( this);
        container.add( btn4 );
        btn5 = new JButton(" 5 ");
        btn5.addActionListener( this);
        container.add( btn5 );
        btn6 = new JButton(" 6 ");
        btn6.addActionListener( this);
        container.add( btn6 );
        btn7 = new JButton(" 7 ");
        btn7.addActionListener( this);
        container.add( btn7 );
        btn8 = new JButton(" 8 ");
        btn8.addActionListener( this);
        container.add( btn8 );
        btn9 = new JButton(" 9 ");
        btn9.addActionListener( this);
        container.add( btn9 );
        btn0 = new JButton(" 0 "); 
        btn0.addActionListener( this);
        container.add( btn0 );
        
        btng = new JButton(" = "); 
        btng.addActionListener( this);
        container.add( btng );
        btnb = new JButton(" + "); 
        btnb.addActionListener( this);
        container.add( btnb );

        window.setSize( 240,400);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
    }
    public void actionPerformed( ActionEvent event ){
        String str = numberField.getText();
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText( str );
        }
        else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText( str );
        }
        else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText( str );
        }
        else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText( str );
        }
        else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText( str );
        }
        else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText( str );
        }
        else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText( str );
        }
        else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText( str );
        }
        else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText( str );
        }
        else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText( str );
        }
        else if (event.getSource() == btnc) {
            str = "";
            numberField.setText( str );
        }
        else if (event.getSource() == btnb) {
            num1 = num2;
            num2 = Float.parseFloat(str);
            str = "";
            op = "+";
            numberField.setText( str );
        }
        else if (event.getSource() == btnl) {
            num1 = num2;
            num2 = Float.parseFloat(str);
            str = "";
            op = "-";
            numberField.setText( str );
        }
        else if (event.getSource() == btnx) {
            num1 = num2;
            num2 = Float.parseFloat(str);
            str = "";
            op = "*";
            numberField.setText( str );
        }
        else if (event.getSource() == btns) {
            num1 = num2;
            num2 = Float.parseFloat(str);
            str = "";
            op = "/";
            numberField.setText( str );
        }
        else if (event.getSource() == btnq) {
            str += ".";
            numberField.setText( str );
        }
        else if (event.getSource() == btng) {
            num1 = num2;
            num2 = Float.parseFloat(str);
            if(op=="+"){
                num2 = num1+num2;
                str=Float.toString(num2);
            }
            if(op=="-"){
                num2 = num1-num2;
                str=Float.toString(num2);
            }
            if(op=="*"){
                num2 = num1*num2;
                str=Float.toString(num2);
            }
            if(op=="/"){
                num2 = num1/num2;
                str=Float.toString(num2);
            }
            op = "";
            numberField.setText( str );
        }
        
    }
    public static void main(String[] args) {
        Lab7_3 gui = new Lab7_3();
    }
}
