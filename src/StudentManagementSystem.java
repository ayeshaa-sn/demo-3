import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentManagementSystem extends JFrame {
    public StudentManagementSystem(){
        super("Student Management System");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,200);

        JPanel panel=new JPanel(new FlowLayout());

        JButton button1=new JButton("Add New Student");

        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               JPanel panel1=new JPanel(new GridLayout(5,2));
               JLabel label1=new JLabel("ID:");
               JTextField feild1=new JTextField("");

                JLabel label2=new JLabel("Name:");
                JTextField feild2=new JTextField("");

                JLabel label3=new JLabel("Address:");
                JTextField feild3=new JTextField("");

                JLabel label4=new JLabel("Mobile:");
                JTextField feild4=new JTextField("");

                JTextField feild5=new JTextField("");
                JButton submit=new JButton("Submit:");


                panel1.add(label1);
                panel1.add(feild1);
                panel1.add(label2);
                panel1.add(feild2);
                panel1.add(label3);
                panel1.add(feild3);
                panel1.add(label4);
                panel1.add(feild4);
                panel1.add(feild5);

                panel1.add(submit);
                add(panel1);
                setVisible(true);

            }
        });

        panel.add(button1);




        JButton button2=new JButton("View All Students");
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel.add(button2);

        add(panel);
        setVisible(true);
    }

}
