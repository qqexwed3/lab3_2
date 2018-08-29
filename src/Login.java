import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField textUser;
    private JPasswordField textPass;
    private JButton loginButton;
    private JButton clearButton;
    private JPanel mainPanel;

    public Login() {
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,textUser.getText()+ " " +
                        new String (textPass.getPassword()));
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textUser.setText("");
                textPass.setText("");
            }
        });
    }

    public JPanel getMainPanel() {
        return mainPanel;
    }
}
