package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class MiGUIForm2 extends JFrame{
    private JPanel rootPanel;
    private JLabel texto;
    private JButton boton1;
    private JButton boton2;

    private boolean ganoJuego;

    public MiGUIForm2()
    {
        //add(rootPanel);

        boton1.setEnabled(true);
        boton2.setEnabled(true);

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
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cambiarBoton(boton1);
            }
        });
    }

    void cambiarBoton(JButton unBoton){
        if (unBoton.isEnabled()) unBoton.setEnabled(false);
        else unBoton.setEnabled(true);

        if(!boton1.isEnabled() && !boton2.isEnabled()){
            ganoJuego = true;
        }
    }

}


