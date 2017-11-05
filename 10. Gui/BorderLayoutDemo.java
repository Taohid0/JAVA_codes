import javax.swing.*;
import java.awt.*;
class BorderLayoutDemo extends JFrame { 
    public BorderLayoutDemo() { 
      setTitle("Borer Layout Demo");
      setSize(300, 200);
      Container contentPane = getContentPane();
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      //Use the content pane's default BorderLayout.
      //contentPane.setLayout(new BorderLayout());
      contentPane.setLayout(new BorderLayout(5,2));
      contentPane.add(new JButton("Button 1 (NORTH)"), BorderLayout.NORTH); 
      contentPane.add(new JButton("2 (CENTER)"), BorderLayout.CENTER); 
      contentPane.add(new JButton("Button 3 (WEST)"), BorderLayout.WEST); 
      contentPane.add(new JButton("Long-Named Button 4 (SOUTH)"), BorderLayout.SOUTH);
      contentPane.add(new JButton("Button 5 (EAST)"), BorderLayout.EAST);
    }
}