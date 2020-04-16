package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;


public class MiGUIForm extends JFrame{
    private JPanel rootPanel;
    private JLabel texto;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;

    private boolean ganoJuego;

    public MiGUIForm()
    {
        add(rootPanel);

        // JRootPane rootPane = SwingUtilities.getRootPane(boton1);
        // rootPane.setDefaultButton(null);

        boton1.setEnabled(true);
        boton2.setEnabled(true);
        boton3.setEnabled(true);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("Este es el titulo");
                setSize(800,600);
            }
        });


        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarBoton(boton2);
                cambiarBoton(boton3);
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarBoton(boton1);
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                cambiarBoton(boton1);
                cambiarBoton(boton3);
            }
        });

        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (!ganoJuego){
                    JOptionPane.showMessageDialog(rootPane, MensajeRandom.devolverMensajeRandom());
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ahora si hizo algo, ganaste");

                    FormManager.activarForm2();
                }


            }
        });

    }

    void cambiarBoton(JButton unBoton){
        if (unBoton.isEnabled()) unBoton.setEnabled(false);
        else unBoton.setEnabled(true);

        if(!boton1.isEnabled() && !boton2.isEnabled() && !boton3.isEnabled()){
            ganoJuego = true;
        }
    }

}

class MensajeRandom{

    static int numeroMensaje = -1;

    static String[] losMensajes = {"Este boton no hace nada, no se para que lo tocas", "No pienses que por seguir tocando este boton va a pasar algo distinto", "Estos textos son solo relleno, ni te gastes", "Podes parar de tocar este boton? Yo que vos pruebo otra cosa", "Basta pa (o ma)", "No se que mas decirte la verdad mierda que sos terco/a", "010101000111001001100001011011010111000001100001001000000110011001100001011011000111001101100001001000000011101001000100", "Pone el mensaje anterior en un conversor y otenene una pista ''importante'' para mas adelante", "Que estas pensando? Que vas a obtener algo de este boton? (quiza si)", "En algun momento yo consideraria la posibilidad de ... tomarme un cafe. O DE HACER OTRA COSA NO?"};

    public static String devolverMensajeRandom(){

        numeroMensaje++;

        if (numeroMensaje >= losMensajes.length){
            numeroMensaje = 0;
        }

        return losMensajes[numeroMensaje];
    }
}


