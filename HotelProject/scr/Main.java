import javax.swing.SwingUtilities;

import UI.LoginUI.LoginUI;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new LoginUI().setVisible(true);
        });
    }
}
