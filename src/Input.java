/**
 * lb -> label
 * tf -> text field
 * btn -> button
 * rb -> radio button */

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Input extends JFrame {
    private JPanel inputPanel;

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
    private JTextField tfDateOfBirth;
    private JButton btnSubmit;
    private JButton btnClear;

    private final String emptyString = "";


    public Input() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        add(inputPanel);

        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String firstName = tfFirstName.getText();
                String lastName = tfLastName.getText();
                Birthday birthday = new Birthday(tfDateOfBirth.getText());
                String placeOfBirth = tfPlaceOfBirth.getText();
                Numerology numerology = new Numerology(firstName, lastName, birthday, placeOfBirth);
                inputPanel.setVisible(false);
                Output outputFrame = new Output();
            }
        });
        btnClear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tfFirstName.setText(emptyString);
                tfLastName.setText(emptyString);
                tfDateOfBirth.setText(emptyString);
                tfPlaceOfBirth.setText(emptyString);
                rbMale.setSelected(false);
                rbFemale.setSelected(false);
                rbOther.setSelected(false);
            }
        });
        rbMale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rbFemale.setSelected(false);
                rbOther.setSelected(false);
            }
        });
        rbFemale.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rbMale.setSelected(false);
                rbOther.setSelected(false);
            }
        });
        rbOther.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rbMale.setSelected(false);
                rbFemale.setSelected(false);
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
