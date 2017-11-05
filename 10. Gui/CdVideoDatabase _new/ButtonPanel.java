class ButtonPanel extends JPanel implemnts ActionListener{  
  public ButtonPanel() {  
  yellowButton = new JButton("Yellow");
         blueButton = new JButton("Blue");
         redButton = new JButton("Red");  
           add(yellowButton);
         add(blueButton);
         add(redButton);  
           yellowButton.addActionListener(this); 
         blueButton.addActionListener(this); 
         redButton.addActionListener(this); 
     }  
       private JButton yellowButton, blueButton, redButton;
  public void actionPerformed(ActionEvent evt){  
    Object source = evt.getSource();
        Color color = getBackground();
        if (source == yellowButton) color = Color.yellow;
        else if (source == blueButton) color = Color.blue;
        else if (source == redButton) color = Color.red;
        setBackground(color);
        repaint();
     }
}  
