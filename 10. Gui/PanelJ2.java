import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class PanelJ2 extends JPanel {

public PanelJ2() {
        JButton b = new JButton( "OK");
        setLayout( new BorderLayout() );
        setBackground( Color.red);
        add( b, BorderLayout.SOUTH);
}
        //b.addActionListener( new ExampleActionListener());      


    // restores screen after window has been covered, minimized, public void paintComponent( Graphics g) {
//        super.paintComponent( g);
//        g.drawRect( 50, 50, 200, 100);
//        g.drawString( "Hello", 125, 100 );
    }


