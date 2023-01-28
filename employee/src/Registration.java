import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;

public class Registration extends JDialog{
    private JTextField txtname;
    private JTextField txtEmail;
    private JTextField txtphone;
    private JTextField txtAddress;
    private JTextField txtPassword;
    private JTextField txtConfirmpassword;
    private JButton txtRegister;
    private JButton txtCancel;
    private JPanel RegistrationPanel;
    public Registration(JFrame parent){
        super(parent);
        setTitle("Create a new account");
        setContentPane(RegistrationPanel);
        setMinimumSize(new Dimension(450,474));
        setModal(true);
        setLocationRelativeTo(parent);



        txtRegister.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registerUser();
            }
        });
        txtCancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
              dispose();
            }
        });
        setVisible(true);

    }
    private  void registerUser(){
        String name=txtname.getText();
        String Email=txtEmail.getText();
        String phone=txtphone.getText();
        String address=txtAddress.getText();
        String password=String.valueOf(txtPassword.getText());
        String confirmPassword=String.valueOf(txtConfirmpassword.getText());
        if(name.isEmpty() || Email.isEmpty() || phone.isEmpty() || address.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(this,
                    'Please enter all fields',
                    'try again',
                    JOptionPane.ERROR_MESSAGE);
            return;
            if (password.equals(confirmPassword)){
                JOptionPane.showMessageDialog(this,
                        'try again',
                        JOptionPane.ERROR_MESSAGE);
                return;
            }
            user= addUserToDatabase(name,Email,phone,address,password);
            if(user != null){
                dispose();
            }else {
                JOptionPane.showMessageDialog(this,
                'try again',
            JOptionPane.ERROR_MESSAGE);
            }
        }
        public user user;
        private user addUserToDatabase(String name,String Email,String phone, String password){
            user user=null;
            final  String DB_URL="jdbc:mysql://localhost/Mystore?serverTimezone=UTC";
            final String USERNAME="root";
            final  String PASSWORD ="";
            try {
                connection conn =DriverManager.getConnection(DB_URL,USERNAME,PASSWORD);
                //Connection to database

            }
            catch (Exception e){
                e.printStackTrace();
            }
            return user;
        }


 

    }

    private user addUserToDatabase(String name, String email, String phone, String address, String password) {
    }

    private  registerUser() {
    }

    public static void main(String[] args) {
        Registration myregister= new Registration( null);
    }
}
