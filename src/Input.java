import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Input extends JFrame {
    private JPanel mainPanel;

    private JLabel lbFirstName;
    private JTextField tfFirstName;
    private JLabel lbLastName;
    private JTextField tfLastName;
    private JLabel lbDateOfBirth;
    private JLabel lbPlaceOfBirth;
    private JTextField tfPlaceOfBirth;

    private JLabel lbGender;
    private JRadioButton rbMale;
    private JRadioButton rbFemale;
    private JRadioButton rbOther;
    private JTextField textField1;
    private JButton btnSubmit;
    private JButton btnClear;


    public Input(MainFrame mainFrame) {
        mainFrame.setSize(640, 480);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.add(mainPanel);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mainPanel.setVisible(false);
                Output outputFrame = new Output(mainFrame);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
