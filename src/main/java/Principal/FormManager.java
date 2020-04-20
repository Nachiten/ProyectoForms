package Principal;

import Form1.Form1;
import Form2.Form2;
import Form3.Form3;
import Form4.Form4;
import Form5.Form5;
import Form6.Form6;

import java.util.ArrayList;
import java.util.List;

public class FormManager {

    static Form1 form1 = new Form1();
    static Form2 form2 = new Form2();
    static Form3 form3 = new Form3();
    static Form4 form4 = new Form4();
    static Form5 form5 = new Form5();
    static Form6 form6 = new Form6();

    static List<Object> forms = new ArrayList<Object>();

    static void agregarFormsALista(){
        forms.add(new Form1());
        forms.add(new Form2());
        forms.add(new Form3());
        forms.add(new Form4());
        forms.add(new Form5());
        forms.add(new Form6());
    }

    static int formActual = 1;

    public static void agregarListeners(){
        /*forms.forEach(unForm -> {
            unForm.addWindowListener(new MiWindowListener());
        });*/

        form1.addWindowListener(new MiWindowListener());
        form2.addWindowListener(new MiWindowListener());
        form3.addWindowListener(new MiWindowListener());
        form4.addWindowListener(new MiWindowListener());
        form5.addWindowListener(new MiWindowListener());
        form6.addWindowListener(new MiWindowListener());
    }


    public static void activarForm1(){
        desactivarForms();
        form1.setVisible(true);
    }

    public static void siguienteForm(){
        desactivarForms();

        switch (formActual){
            case 1:
                form2.setVisible(true);
                System.out.println("Mostrando Form2");
                break;
            case 2:
                form3.setVisible(true);
                System.out.println("Mostrando Form3");
                break;
            case 3:
                form4.setVisible(true);
                System.out.println("Mostrando Form4");
                break;
            case 4:
                form5.setVisible(true);
                System.out.println("Mostrando Form5");
                break;
            case 5:
                form6.setVisible(true);
                System.out.println("Mostrando Form6");
                break;
            default:
                System.out.println("No hay mas forms para mostrar....");
                break;
        }

        formActual++;
    }


    private static void desactivarForms(){
        form1.setVisible(false);
        form2.setVisible(false);
        form3.setVisible(false);
        form4.setVisible(false);
        form5.setVisible(false);
        form6.setVisible(false);
    }
}
