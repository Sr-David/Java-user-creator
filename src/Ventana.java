import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Ventana extends JFrame{

    ArrayList<user> users = new ArrayList<user>();

    public Ventana(){
        setTitle("User Creator");
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);


        JPanel panel = new JPanel();
        panel.setLayout(null);
        
        JLabel label = new JLabel("User name: ");
        label.setBounds(10, 20, 100, 30);
        panel.add(label);
        JTextField textField = new JTextField();
        textField.setBounds(120, 20, 150, 30);
        panel.add(textField);

        JLabel label2 = new JLabel("Password: ");
        label2.setBounds(10, 60, 100, 30);
        panel.add(label2);
        JPasswordField passwordField = new JPasswordField();
        passwordField.setBounds(120, 60, 150, 30);
        panel.add(passwordField);

        JLabel label3 = new JLabel("Email: ");
        label3.setBounds(10, 100, 100, 30);
        panel.add(label3);

        JTextField textField2 = new JTextField();
        textField2.setBounds(120, 100, 150, 30);
        panel.add(textField2);

        ButtonGroup group = new ButtonGroup();
        JRadioButton hombre = new JRadioButton("Man");
        hombre.setBounds(10, 140, 100, 30);
        JRadioButton mujer = new JRadioButton("Woman");
        mujer.setBounds(120, 140, 100, 30);
        group.add(hombre);
        group.add(mujer);
        panel.add(hombre);
        panel.add(mujer);



        JButton button = new JButton("Create user");
        button.setBounds(10, 180, 150, 30);
        panel.add(button);

        button.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String user = textField.getText();
                String password = new String(passwordField.getPassword());
                if (user.equals("") || password.equals("") || textField2.getText().equals("") || (!hombre.isSelected() && !mujer.isSelected())){
                    JOptionPane optionPane = new JOptionPane();
                    optionPane.showMessageDialog(null, "One or more fields are not completed", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                    
                }else{
 
                    JOptionPane optionPane = new JOptionPane();
                    optionPane.showMessageDialog(null, "A new user have been created", "User created", JOptionPane.INFORMATION_MESSAGE);
                    boolean sexo;
                    if (hombre.isSelected()){
                        sexo = true;
                    }else{
                        sexo = false;
                    }
                    user newUser = new user(user, password, textField2.getText(), sexo);

                }
              
            }
        });


        add(panel);

        setVisible(true);
                

    }
    

}
