package employee.management.system;
import javax.swing.*;
import java.awt.*; //image scalling
import java.awt.event.*;//action listener

public class Home extends JFrame implements ActionListener {
    JButton view, add, update, remove;
    Home(){
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 0, 1120, 630); //the whole frame hence 0,0
        add(image);
        
        JLabel heading = new JLabel("Employee Management System");
        heading.setBounds(620, 20, 400, 40);
        heading.setBackground(new Color(70, 94, 84));
        heading.setFont(new Font("Raleway", Font.BOLD, 25));
        image.add(heading);
        
        add = new JButton ("Add Employee");
        add.setBounds(650, 80, 150, 40);
        add.setBackground(new Color(70, 94, 84));
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        image.add(add);
        
         view = new JButton ("View Employee");
        view.setBounds(820, 80, 150, 40);
        view.setBackground(new Color(70, 94, 84));
        view.setForeground(Color.WHITE);
        view.addActionListener(this);
        image.add(view);
        
         update = new JButton ("Update Employee");
        update.setBounds(650, 140, 150, 40);
        update.setBackground(new Color(70, 94, 84));
        update.setForeground(Color.WHITE);
         update.addActionListener(this);
        image.add(update);
        
         remove = new JButton ("Remove Employee");
        remove.setBounds(820, 140, 150, 40);
        remove.setBackground(new Color(70, 94, 84));
        remove.setForeground(Color.WHITE);
        remove.addActionListener(this);
        image.add(remove);
        
        
        
        setSize(1120, 630);
        setLocation(250, 100);
        setVisible(true);
    }
    
     public void actionPerformed(ActionEvent ae) {
     
         if (ae.getSource() == add)  //getSource points to the particular actionListener
         { setVisible(false);
             new AddEmployee();
         }
         else if (ae.getSource() == view) {
             setVisible(false);
             new ViewEmployee();
         }
          else if (ae.getSource() == update) {
          
          setVisible(false);
             new ViewEmployee();
          }
         else {
            setVisible(false);
          }
     
     
     }
     public static void main(String[] args) {
        new Home();
    }
}
