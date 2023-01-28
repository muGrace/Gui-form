import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class personnal {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JPanel Units;
    private JButton saveButton;
    private JButton cancelButton;
    private JComboBox comboBox1;

    public static void main(String[] args) {
        JFrame frame = new JFrame("personnal");
        frame.setContentPane(new personnal().Units);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public personnal() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        cancelButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
