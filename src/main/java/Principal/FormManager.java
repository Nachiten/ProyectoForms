package Principal;

import Form1.Form1;
import Form2.Form2;
import Form3.Form3;

public class FormManager {

    static Form1 form1 = new Form1();
    static Form2 form2 = new Form2();
    static Form3 form3 = new Form3();

    static int formActual = 1;

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

    private static void desactivarForms(){
        form1.setVisible(false);
        form2.setVisible(false);
        form3.setVisible(false);
    }


}
