package Form6;

import javax.swing.*;

public class Form6 extends JFrame{

    private JPanel rootPanel;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JButton button4;
    private JButton button5;
    private JButton button6;

    public Form6(){

        add(rootPanel);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("Este programa fue hecho casi al 100% en un solo dia y con mucho café de por medio");
                setSize(800,600);
            }
        });

    }

}
