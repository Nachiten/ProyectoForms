package Form2;

import Principal.FormManager;
import sun.rmi.runtime.Log;

import javax.swing.*;
import java.awt.event.*;

public class Form2 extends JFrame {
    private JButton noMeToquesButton;
    private JPanel rootPanel;
    private JRadioButton boton5;
    private JRadioButton boton1;
    private JRadioButton boton4;
    private JRadioButton boton3;
    private JRadioButton boton6;
    private JRadioButton boton2;

    public Form2(){
        add(rootPanel);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("Este es el titulo");
                setSize(800,600);
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            }
        });

        noMeToquesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                activacionBotoens(false);
                JOptionPane.showMessageDialog(rootPane, MensajeCambiante.obtenerMensajeCambiante());
                resetearBotones();
                activacionBotoens(true);
            }
        });

        boton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton1.setText("No me toques por favor...");
                checkearGano();
            }
        });

        boton2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton2.setText("Que tocas?");
                checkearGano();
            }
        });

        boton3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton3.setText("Che que te pasa?¿");
                checkearGano();
            }
        });

        boton4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton4.setText("A mi si me pods tocar..");
                checkearGano();
            }
        });

        boton5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton5.setText("Que tocas?");
                checkearGano();
            }
        });

        boton6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boton6.setText("Que tocas?");
                checkearGano();
            }
        });


    }

    void resetearBotones(){
        boton1.setText("Presionar");
        boton2.setText("No Presionar");
        boton3.setText("Presionar");
        boton4.setText("No Presionar");
        boton5.setText("No Presionar");
        boton6.setText("Presionar");

        boton1.setSelected(false);
        boton2.setSelected(false);
        boton3.setSelected(false);
        boton4.setSelected(false);
        boton5.setSelected(false);
        boton6.setSelected(false);

    }

    void activacionBotoens(boolean valor){
        boton1.setEnabled(valor);
        boton2.setEnabled(valor);
        boton3.setEnabled(valor);
        boton4.setEnabled(valor);
        boton5.setEnabled(valor);
        boton6.setEnabled(valor);
    }

    void checkearGano(){

        if (!boton1.isSelected() && boton2.isSelected() && !boton3.isSelected() && boton4.isSelected() && boton5.isSelected() && !boton6.isSelected() ){

            FormManager.activarForm3();

            System.out.println("Ganó Form2");
        }
    }


}
