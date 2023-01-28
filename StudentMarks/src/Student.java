import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Student {
    private JTextField txtname;
    private JTextField txtmarks1;
    private JTextField txtmarks2;
    private JTextField txtmarks3;
    private JTextField txttotal;
    private JTextField txtAvg;
    private JTextField txtgrade;
    private JButton calButton;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Student");
        frame.setContentPane(new Student().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public Student() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int m1,m2,m3,tot;
                double Avg;
                m1=Integer.parseInt(txtmarks1.getText());
                m2=Integer.parseInt(txtmarks2.getText());
                m3=Integer.parseInt(txtmarks3.getText());

                tot=m1 +m2 +m3;
                txttotal.setText(String.valueOf(tot));
                Avg=tot/3;
                txtAvg.setText(String.valueOf(Avg));
                if(Avg>60)
                {
                    txtgrade.setText("pass");
                }
                else
                {
                    txtgrade.setText("fail");
                }





            }
        });
    }
}
