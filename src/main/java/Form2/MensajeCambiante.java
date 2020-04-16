package Form2;

public class MensajeCambiante {

    static int numeroMensaje = -1;

    static String[] losMensajes = {"Como te cuesta respetar las regas...", "Ya me harte de vos", "Si tocas este boton una vez mas cierro el programa", "O te formateo el disco", "Na mentira", "Puto el que lee", "Vos queres pelear?", "Vengan de a uno, pero con la cara destapada"};

    public static String obtenerMensajeCambiante(){

        numeroMensaje++;

        if (numeroMensaje >= losMensajes.length){
            numeroMensaje = 0;
        }

        return losMensajes[numeroMensaje];
    }
}
