import java.awt.*;
import javax.swing.*;
public class LineRectOval extends JFrame {
public LineRectOval(){
super("Draw String Line Rect Oval");
}
// display various lines, rectangles and ovals
public void paint( Graphics g )
{
super.paint( g ); // call superclass's paint method
g.setColor( Color.RED );
g.drawLine( 25, 50, 400, 50 );
g.drawString("drawString", 25, 45);
g.setColor( Color.BLUE );
g.drawRect( 25, 60, 90, 55 );
g.drawString("drawRect", 35, 75);
g.fillRect( 120, 60, 90, 55 );
g.setColor( Color.WHITE );
g.drawString("fillRect", 135, 75);
super.setBackground(Color.GREEN);
g.clearRect( 215, 60, 90, 55 );
g.drawString("clearRect", 235, 75);
g.setColor( Color.CYAN );
g.fillRoundRect( 315, 60, 90, 55, 50, 50 );
g.setColor( Color.BLACK );
g.drawString("fillRoundRect", 325, 75);
g.setColor( Color.CYAN );
g.drawRoundRect( 410, 60, 90, 55, 20, 20 );
g.setColor( Color.BLACK );
g.drawString("drawRoundRect", 420, 75);
g.setColor( Color.YELLOW );
g.draw3DRect( 25, 120, 90, 55, true );
g.setColor( Color.BLACK );
g.drawString("draw3DRect", 35, 135);
g.setColor( Color.YELLOW );
g.fill3DRect( 120, 120, 90, 55, false );
g.drawString("fill3DRect", 135, 135);
g.setColor( Color.MAGENTA );
g.drawOval( 315, 120, 90, 55 );
g.setColor( Color.BLACK );
g.drawString("drawOval", 325, 140);
g.setColor( Color.MAGENTA );
g.fillOval( 410, 120, 90, 55 );
g.setColor( Color.WHITE );
g.drawString("fillOval", 425, 140);
g.setColor( Color.MAGENTA );
g.drawOval( 515, 120, 55, 55 );
g.setColor( Color.BLACK );
g.drawString("drawOval", 525, 140);
} // end method paint
public static void main(String[] args) {
LineRectOval test = new LineRectOval();
test.setSize(600, 200);
test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
test.setVisible(true);
}
} // end class LineRectOval