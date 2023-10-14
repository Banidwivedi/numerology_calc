import javax.swing.*;

public class Output extends JFrame {
    private JLabel lbOutputText;
    private JPanel outputPanel;

    public Output() {
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        add(outputPanel);
    }
}
