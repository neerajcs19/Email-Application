import java.awt.*;
import java.awt.event.*;
 import javax.swing.*;

public class ConnectDialog extends JDialog {
    private static final String[] TYPES = {"pop3","imap"};
    private static final String[] TYPES1 = {"gmail","yahoo","hotmail"};
    private static final String[] TYPES2 = {"smtp.gmail.com","smtp.mail.yahoo.com","smtp.live.com"};

    private JComboBox typeComboBox,serverTextField,smtpServerTextField;
    private JTextField serverTextField2, usernameTextField;
    private JTextField smtpServerTextField2;
    private JPasswordField passwordField;

    public ConnectDialog(Frame parent) {
        super(parent,true);
        setTitle("Connect");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                actionCancel();
            }
        });
    }

}