package Form1;

public class MensajeCambiante{

    static int numeroMensaje = -1;

    static String[] losMensajes = {"Este boton no hace nada, no se para que lo tocas", "No pienses que por seguir tocando este boton va a pasar algo distinto", "Estos textos son solo relleno, ni te gastes", "Podes parar de tocar este boton? Yo que vos pruebo otra cosa", "Basta pa (o ma)", "No se que mas decirte la verdad mierda que sos terco/a", "010101000111001001100001011011010111000001100001001000000110011001100001011011000111001101100001001000000011101001000100", "Pone el mensaje anterior en un conversor y otenene una pista ''importante'' para mas adelante", "Que estas pensando? Que vas a obtener algo de este boton? (quiza si)", "En algun momento yo consideraria la posibilidad de ... tomarme un cafe. O DE HACER OTRA COSA NO?"};

    public static String obtenerMensajeCambiante(){

        numeroMensaje++;

        if (numeroMensaje >= losMensajes.length){
            numeroMensaje = 0;
        }

        return losMensajes[numeroMensaje];
    }
}
