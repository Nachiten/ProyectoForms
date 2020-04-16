package Form3;

public class MensajeCambiante {
    static int numeroMensaje = -1;

    static String[] losMensajes = {"Hay algo cargando...", "Sabes que es?", "ah mira, yo tampoco", "no será algo importante no?", "O algo malo", "Quien sabe?", "Che vos queres saber como seguir no?", "Bueno mira, veni que te cuento algo", "resulta que si escribis 'zxcpkazxm' y tocas enter algo raro pasa","te digo otra cosa?","naa.. mejor no","bueno está bien.. lo que tenes que escribir es la primera letra de cada mensaje desde el primero sin contar este (ni el siguiente) ;)", "[Mensaje final]"};

    public static String obtenerMensajeCambiante(){

        numeroMensaje++;

        if (numeroMensaje >= losMensajes.length){
            numeroMensaje = 0;
        }

        return losMensajes[numeroMensaje];
    }
}

