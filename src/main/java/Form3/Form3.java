package Form3;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ContainerAdapter;
import java.awt.event.ContainerEvent;

public class Form3 extends JFrame{
    private JPanel rootPanel;
    private JPasswordField contrasenia;
    private JProgressBar progressBar1;
    private JTextField texto;
    private JLabel unLabel;

    public Form3(){
        add(rootPanel);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("Form3");
                setSize(800,600);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);


                progressBar1.setMaximum(100);
                progressBar1.setMinimum(0);
                progressBar1.setValue(75);
            }
        });


        texto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moverProgressBar();
                System.out.println(texto.getText());
            }
        });
    }

    void moverProgressBar(){

        unLabel.setText(MensajeCambiante.obtenerMensajeCambiante());

        int valorACambiar = progressBar1.getValue() + 7;

        if (valorACambiar > 100) valorACambiar = 0;

        progressBar1.setValue(valorACambiar);
    }

}
