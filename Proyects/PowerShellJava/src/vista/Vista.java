package vista;

public class Vista {
    public static void mostrarMenuPrincipal(){
        System.out.println(  "1. Ver usuarios locales\n" +
                             "2. Ver usuarios AD\n" +
                             "3. Ver fecha\n" +
                             "0. Sortir\n");
    }

    public static void mostraComanda(String m){
        int sepQT = 45;
        String separador = "\n" + "-".repeat(sepQT) + "\n";

        String missatge = separador;
                missatge += m;
                missatge += separador;


        System.out.printf(missatge);
    }
}
