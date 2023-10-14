import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    MainFrame mainFrame = new MainFrame();
    public MainFrame() {
        setSize(1280, 720);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
        setBackground(new Color(0x333333));
    }

    public static void main(String[] args) {
            Input inputFrame = new Input();
        }
    }
