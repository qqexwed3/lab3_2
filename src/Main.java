import javax.swing.*;

public class Main {
    public static void main(String[] args){
        JFrame JF = new JFrame();
        Login loginPanel = new Login();
        JF.setContentPane(loginPanel.getMainPanel());
        JF.pack();
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.setVisible(true);
    }
}
