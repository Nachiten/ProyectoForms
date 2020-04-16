package Principal;

import Form1.Form1;
import Form2.Form2;
import Form3.Form3;
import Form4.Form4;
import Form5.Form5;

public class FormManager {

    static Form1 form1 = new Form1();
    static Form2 form2 = new Form2();
    static Form3 form3 = new Form3();
    static Form4 form4 = new Form4();
    static Form5 form5 = new Form5();

    static int formActual = 1;

    public static void agregarListeners(){
        form1.addWindowListener(new MiWindowListener());
        form2.addWindowListener(new MiWindowListener());
        form3.addWindowListener(new MiWindowListener());
        form4.addWindowListener(new MiWindowListener());
    }

    public static void activarForm1(){
        desactivarForms();
        form1.setVisible(true);
    }

    public static void activarForm2(){
        desactivarForms();
        form2.setVisible(true);
    }

    public static void activarForm3(){
        desactivarForms();
        form3.setVisible(true);
    }

    public static void activarForm4(){
        desactivarForms();
        form4.setVisible(true);
    }

    public static void activarForm5(){
        desactivarForms();
        form5.setVisible(true);
    }

    private static void desactivarForms(){
        form1.setVisible(false);
        form2.setVisible(false);
        form3.setVisible(false);
        form4.setVisible(false);
        form5.setVisible(false);
    }

    public static int terminarPrograma(){
        System.exit(1);
        return 1;
    }


}
