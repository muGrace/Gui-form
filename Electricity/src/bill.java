import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class bill {
    private JTextField txtID;
    private JButton calButton;
    private JTextArea txtprint;
    private JButton printButton;
    private JTextField txtUnit;
    private JTextField txtName;
    private JPanel Main;

    public static void main(String[] args) {
        JFrame frame = new JFrame("bill");
        frame.setContentPane(new bill().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public bill() {
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cid;
                double charge;
                 int count;

            }
        });
        calButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


            }
        });
        printButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Cid=txtcid.getText();
                count=Integer.parseInt()
            }
        });
    }
}
