package employee.management.system;

import javax.swing.*;
import java.awt.*; //background frame
import java.awt.event.*;

public class Splash extends JFrame implements ActionListener {
    
    Splash() //constructor called
    {
      getContentPane().setBackground(Color.WHITE);
      setLayout(null);
      
      //employee display
      JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
      heading.setBounds(80,30,1200,60);  //frame heading
      heading.setFont(new Font("serif", Font.PLAIN, 60));
      heading.setForeground(Color.RED);
      add(heading);
      
      //front image
      ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/front.jpg"));
      Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
      ImageIcon i3 = new ImageIcon(i2); //can not pass image 12 directly so we copy to i3
      JLabel image = new JLabel(i3); //object i3 passed in JLabel
      image.setBounds(50, 100, 1050, 500); //size of the image
      add(image);
      
      //for putting up a button
      JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
      clickhere.setBounds(400, 400, 300, 70);
      clickhere.setBackground(Color.ORANGE);
      clickhere.setForeground(Color.BLACK);
      clickhere.addActionListener(this);
      image.add(clickhere);
      
      setSize(1170,650);
      setLocation(200,50);
      setVisible(true);
      
       while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
            
            heading.setVisible(true);
            try {
                Thread.sleep(500);
            } catch (Exception e){
                
            }
        }
        
    
    
    }
    
    public void actionPerformed(ActionEvent ae){
    
        setVisible(false);
        new Login();
    }
    
    public static void main(String args[]){
        new Splash(); //object created
    }
}
