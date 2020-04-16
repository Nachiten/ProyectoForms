package Principal;

import Form1.Form1;
import Form2.Form2;

public class FormManager {

    static Form1 form1 = new Form1();
    static Form2 form2 = new Form2();

    static int formActual = 1;

    public static void activarForm1(){
        form1.setVisible(true);
        form2.setVisible(false);
    }


    public static void activarForm2(){
        form2.setVisible(true);
        form1.setVisible(false);
    }

}
