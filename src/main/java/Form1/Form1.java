package Form1;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Principal.FormManager;

public class Form1 extends JFrame{
    private JPanel rootPanel;
    private JLabel texto;
    private JButton boton1;
    private JButton boton2;
    private JButton boton3;
    private JButton boton4;
    private JButton boton5;

    private boolean ganoJuego;

    public Form1()
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
                setTitle("Tocame");
                setSize(800,600);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
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
                    JOptionPane.showMessageDialog(rootPane, MensajeCambiante.obtenerMensajeCambiante());
                }else{
                    JOptionPane.showMessageDialog(rootPane, "Ahora si hizo algo, pero no se bien que...");

                    System.out.println("Ganó Form1");

                    FormManager.activarForm2();
                }


            }
        });

        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                FormManager.activarForm2();
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