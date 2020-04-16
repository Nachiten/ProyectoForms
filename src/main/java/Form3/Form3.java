package Form3;

import Principal.FormManager;

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

    int intentos = 0;

    public Form3(){
        add(rootPanel);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("No tengo ni idea que es esto, espero que vos si");
                setSize(800,600);
                //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

                progressBar1.setMaximum(100);
                progressBar1.setMinimum(0);
                progressBar1.setValue(10);
            }
        });



        texto.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moverProgressBar();

                if (contrasenia.isEnabled())
                contrasenia.setText(texto.getText());

                if (texto.getText().equals("zxcpkazxm")) {
                    contrasenia.setEnabled(false);
                    unLabel.setText("Pasó algo ahi che.... no se bien que pero creo que ese campo de abajo no servia para nada... ok?¿");
                } else if (texto.getText().equals("HSanOQCBrtn")){

                    switch(intentos){
                        case 0:
                            unLabel.setText("Solo confirmame la contraseña una vez mas.. para asegurarme que esté bien");
                            break;

                        case 1:
                            unLabel.setText("una vez mas a ver. Pará que la anoto");
                            break;

                        case 2:
                            unLabel.setText("no me leas, ah no para.. ya lo hiciste :)");
                            JOptionPane.showMessageDialog(rootPane, "Contraseña Aceptada :(:):");
                            System.out.println("Ganó Form 3");
                            FormManager.activarForm4();
                            break;
                    }

                    intentos++;

                }
            }
        });
    }

    void moverProgressBar(){

        unLabel.setText(MensajeCambiante.obtenerMensajeCambiante());

        int valorACambiar = progressBar1.getValue() + 9;

        if (valorACambiar > 100) valorACambiar = 0;

        progressBar1.setValue(valorACambiar);
    }

}
