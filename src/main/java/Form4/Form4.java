package Form4;

import javax.swing.*;

public class Form4 extends JFrame{
    private JPanel rootPanel;
    private JTree tree1;

    public Form4(){
        add(rootPanel);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("Esto no está terminado... te recomiendo cerrarlo hasta que venga una actualizacion completa");
                setSize(800,600);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });
    }

}
