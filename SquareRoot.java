import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class SquareRoot implements ActionListener,KeyListener
{
    Frame f;
    Label one,two;
    TextField three,four;
    Button five;
    Double i,t;
    String s1="";
    public SquareRoot()
    {
        f=new Frame("square root");
        one=new Label("Enter the number");
        two=new Label("square root is ");
        three=new TextField(5);
        four=new TextField(5);
        five=new Button("Ckick here for result");
        f.setSize(400,400);
        f.setVisible(true);
        f.add(one);
        f.add(two);
        f.add(three);
        f.add(four);
        f.add(five);
        f.setLayout(null);
        one.setBounds(20,20,140,40);
        two.setBounds(20,250,140,40);
        three.setBounds(180,30,140,40);
        four.setBounds(180,250,140,40);
        five.setBounds(100,150,240,40);
        three.addKeyListener(this);
        five.addActionListener(this);
    }
    public void keyPressed(KeyEvent k)
    {
        System.out.print("");
    }
    public void keyTyped(KeyEvent k)
    {
        s1+= k.getKeyChar();
    }
    public void keyReleased(KeyEvent k)
    {
        System.out.print("");
    }
    public void actionPerformed(ActionEvent ae)
    {
        
        try
        {
            t=Double.parseDouble(s1); // this is another method to convert string into double
            
            // Float f=Float.valueOf(s1);  //Returns the Float object that contains the value specified by the string in str.
            // Float f1=f.floatValue();    //Returns the value of the invoking object as a float.
            // System.out.print(f1);
            
        }
        catch(NumberFormatException e)
        {
            System.out.print("please type  the correct number");
        }
        
        
        for(i=0.01;i<=t;)
        {
            System.out.println((double)(i*i));
            
            if(((float)(i*i)/t==.99)||(float)(i*i)/t==1.0)
            {
                four.setText(i+"");
                System.out.print("                  "+"subham"+i);
                break;
            }
            
            i=i+.01;
            
            
        }
    }
    public static void main(String s[])
    {
        new SquareRoot();
    }
}