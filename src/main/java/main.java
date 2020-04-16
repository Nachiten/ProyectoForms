import Principal.FormManager;

import javax.swing.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class main {
    public static void main(String[] args) throws ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException
    {
        FormManager.agregarListeners();

        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());

        FormManager.activarForm1();
    }

}

