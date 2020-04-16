package GUI;

import javax.swing.*;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException
    {
        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        MiGUIForm GUIform1 = new MiGUIForm();
        GUIform1.setVisible(true);
    }

}
