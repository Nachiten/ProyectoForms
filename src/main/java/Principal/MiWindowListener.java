package Principal;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MiWindowListener implements WindowListener {

    public void windowClosing(WindowEvent arg0) {
        System.out.println("CERRANDO PROGRAMA [Usuario cerro la ventana]...");
        System.exit(1); // Cerrado por el usuario
    }

    public void windowOpened(WindowEvent arg0) {
        //System.out.println("Window Opened");
    }
    public void windowClosed(WindowEvent arg0) {
        //System.out.println("Window Closed");
    }
    public void windowIconified(WindowEvent arg0) {
        //System.out.println("Window Iconified");
    }
    public void windowDeiconified(WindowEvent arg0) {
        //System.out.println("Window Deiconified");
    }
    public void windowActivated(WindowEvent arg0) {
        //System.out.println( "Ventana " + arg0.getWindow().getClass() + " Activada");
    }
    public void windowDeactivated(WindowEvent arg0) {
        //System.out.println( "Ventana " + arg0.getWindow().getClass() + " Desactivada");

    }

}