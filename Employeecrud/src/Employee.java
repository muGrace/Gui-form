import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;
public class Employee {
    private JPanel Main;
    private JTextField txtname;
    private JTextField txtsalary;
    private JTextField txtmobile;
    private JButton saveButton;
    private JTable table1;
    private JButton deleteButton;
    private JButton updateButton;
    private JButton searchButton;
    private JTextField txtid;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Employee");
        frame.setContentPane(new Employee().Main);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
    Connection con;

    public void connect(){
        try {
            Class.forName("con.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql://localhost/bookshop","root");
        }
        catch (ClassNotFoundException ex){

        }catch(SQLException ex){
    }

    public Employee() {
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
