import javax.swing.*;

public class MainFrame extends JFrame {
    public MainFrame() {
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
            MainFrame mainFrame = new MainFrame();
            Input inputFrame = new Input(mainFrame);
        }
    }
