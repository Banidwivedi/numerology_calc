import javax.swing.*;

public class Output extends JFrame {
    private JLabel lbOutputText;
    private JPanel outputPanel;

    public Output(MainFrame mainFrame) {
        mainFrame.setSize(640, 480);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mainFrame.setResizable(false);
        mainFrame.setVisible(true);
        mainFrame.add(outputPanel);
    }
}
