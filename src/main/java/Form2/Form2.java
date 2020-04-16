package Form2;

import javax.swing.*;

public class Form2 extends JFrame {
    private JButton HOLASOYFORM2Button;

    public Form2(){
        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("Este es el titulo");
                setSize(800,600);
            }
        });
    }
}
