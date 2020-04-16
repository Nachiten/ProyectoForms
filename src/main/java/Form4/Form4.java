package Form4;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form4 extends JFrame{
    private JPanel rootPanel;
    private JButton boton2;
    private JButton boton5;
    private JButton boton1;
    private JButton boton6;
    private JButton boton3;
    private JButton boton7;
    private JButton boton4;
    private JButton boton8;

    boolean gano = false;

    public Form4(){
        add(rootPanel);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("Esto se llama hacer sufrir a una persona de manera gratuita :)");
                setSize(800,600);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });


        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gano){
                    boton1.setText("");
                    checkearGano();
                    return;
                }

                if(boton5.getText().equals("Este tampoco.. me confundi. El que esta arriba mio")) {
                    boton1.setText("Ahora si tocas todos los botones algo raro deberia pasar...");
                    gano = true;
                    return;
                }

                if (boton1.getText().equals("Boton 1"))
                boton6.setText("Ahora tocas el boton dos lugares a mi derecha");
                else{
                    reiniciar();
                    return;
                }

                boton1.setText("Boton 12");
            }
        });
        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gano){
                    boton2.setText("");
                    checkearGano();
                    return;
                }
                else reiniciar();
            }
        });
        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gano){
                    boton3.setText("");
                    checkearGano();
                    return;
                }

                if (boton3.getText().equals("Ahora me tocas a mi"))
                boton4.setText("Ahora tocas el boton abajo del Boton1");
                else reiniciar();
            }
        });
        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gano) {
                    boton4.setText("");
                    checkearGano();
                    return;
                }

                reiniciar();
            }
        });
        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gano){
                    boton5.setText("");
                    checkearGano();
                    return;
                }

                if (boton4.getText().equals("Ahora tocas el boton abajo del Boton1"))
                boton5.setText("No pará, era el que está a mi derecha...");
                else reiniciar();
            }
        });
        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gano){
                    boton6.setText("");
                    checkearGano();
                    return;
                }

                if (boton5.getText().equals("No pará, era el que está a mi derecha..."))
                boton5.setText("Este tampoco.. me confundi. El que esta arriba mio");
                else reiniciar();
            }
        });
        boton7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gano){
                    boton7.setText("");
                    checkearGano();
                    return;
                }

                //boton4.setText("Ahora tocas el boton arriba mio");
                reiniciar();
            }
        });


        boton8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if (gano){
                    boton8.setText("");
                    checkearGano();
                    return;
                }

                if (boton6.getText().equals("Ahora tocas el boton dos lugares a mi derecha"))
                    boton3.setText("Ahora me tocas a mi");
                else reiniciar();
            }
        });
    }

    void resetearBotones(){
        boton1.setText("Boton 1");
        boton2.setText("No");
        boton3.setText("Quiza");
        boton4.setText("A veces");
        boton5.setText("Chau");
        boton6.setText("Hola");
        boton7.setText("No me toques");
        boton8.setText("Empeza por aca");
    }

    void reiniciar(){
        JOptionPane.showMessageDialog(rootPane, "NO");
        resetearBotones();
    }

    void checkearGano(){
        if (boton1.getText().equals("") &&
            boton2.getText().equals("") &&
            boton3.getText().equals("") &&
            boton4.getText().equals("") &&
            boton5.getText().equals("") &&
            boton6.getText().equals("") &&
            boton7.getText().equals("") &&
            boton8.getText().equals(""))
        {
            JOptionPane.showMessageDialog(rootPane, "Rompiste todo....");
            JOptionPane.showMessageDialog(rootPane, "Y ganaste este juego... por ahora (hasta que se agreguen mas niveles)");
            System.out.println("Ganó Form 4");
        }
    }



}
