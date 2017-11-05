import javax.swing.*;
import java.awt.*;
class MyJFrame extends JFrame {

    public MyJFrame() {
        Container c = getContentPane();
        c.setLayout( new FlowLayout() );
        c.add( new PanelJ2());
        c.add( new PanelJ2());
        c.add( new PanelJ2());
        setTitle( "ExampleJ3 - Hi there");
        setBounds( 100, 150, 300, 300);
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}
