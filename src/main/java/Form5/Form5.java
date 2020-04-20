package Form5;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Form5 extends JFrame{
    private JPanel rootPanel;
    private JSlider slider1;
    private JSlider slider2;
    private JSlider slider3;

    private int valorSlider1 = 50;
    private int valorSlider3 = 50;

    public Form5(){

        add(rootPanel);

        SwingUtilities.invokeLater(new Runnable() {

            @Override
            public void run()
            {
                setTitle("Este programa fue hecho casi al 100% en un solo dia y con mucho café de por medio");
                setSize(800,600);
            }
        });

        slider1.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent ce) {

                int valorNuevo = slider1.getValue();

                if (valorSlider1 < valorNuevo)
                {
                    slider2.setValue(slider2.getValue() - 1);
                } else if (valorSlider1 > valorNuevo)
                {
                    slider2.setValue(slider2.getValue() + 1);
                }

                valorSlider1 = valorNuevo;

                checkearComplecion();
            }
        });

        slider3.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent ce) {

                int valorNuevo = slider3.getValue();

                if (valorSlider3 < valorNuevo)
                {
                    slider2.setValue(slider2.getValue() + 1);
                } else if (valorSlider3 > valorNuevo)
                {
                    slider2.setValue(slider2.getValue() - 1);
                }

                valorSlider3 = valorNuevo;

                checkearComplecion();
            }
        });
    }

    void checkearComplecion(){
        if (slider1.getValue() == 100 && slider2.getValue() == 100 && slider3.getValue() == 100){
            System.out.println("Ganó Form 5");


            while (true){
                JOptionPane.showMessageDialog(rootPane, "Muy bien, te felicito");
            }

        }

    }

}
