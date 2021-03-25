import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class StringJFrame extends JFrame implements
ActionListener
{
private Button okBtn;
private JLabel strLabel, xLabel, yLabel;
private JTextField strField, xField, yField;
String mesg;
int x, y;
public StringJFrame() {
super("Gui with Draw Image in JFrame");
Container c = getContentPane();
c.setLayout( new FlowLayout());
strLabel = new JLabel("Enter String : ");
c.add(strLabel);
strField = new JTextField(20);
c.add(strField);
xLabel = new JLabel("Coordinate X : ");
c.add(xLabel);
xField = new JTextField(5);
c.add(xField);
yLabel = new JLabel("Coordinate Y : ");
c.add(yLabel);
yField = new JTextField(5);
c.add(yField);
okBtn = new Button(" OK ");
okBtn.addActionListener(this);
c.add(okBtn);
setSize(340,300);
setForeground(Color.BLUE);
}
public void actionPerformed(ActionEvent event) {
mesg = strField.getText();
x = Integer.parseInt(xField.getText() );
y = Integer.parseInt(yField.getText() );
repaint();}
public void paint(Graphics g) {
    super.paint(g);
    g.drawRect(10,32, 330,80);
    g.setColor(Color.BLACK);
    g.drawString(mesg, x, y+90);
    }
    public static void main(String[] args) {
    StringJFrame info = new StringJFrame();
    info.setSize(350, 400);
    info.setDefaultCloseOperation
    (JFrame.EXIT_ON_CLOSE);
    info.setVisible(true);
    }
    }