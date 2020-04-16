package GUI;

public class FormManager {

    static int formActual = 1;

    static void activarForm2(){
        MiGUIForm GUIform1 = new MiGUIForm();
        GUIform1.setVisible(false);

        MiGUIForm2 GUIform2 = new MiGUIForm2();
        GUIform2.setVisible(true);

    }

}
