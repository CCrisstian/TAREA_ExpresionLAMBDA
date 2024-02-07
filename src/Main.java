import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\tTarea: Expresión Lambda que elimine espacios\n");

        Function<String, String> Eliminar_Espacios_Comas_Puntos = entrada ->
                entrada.replaceAll(" ", "").   /*Elimina espacios en blanco*/
                        replaceAll(",", "").   /*Elimina comas*/
                        replaceAll("\\.","").    /*Elimina puntos*/
                        toUpperCase();                      /*Convierte las letras en mayúsculas*/


        String palabra = "Hola, mundo. ¿Como Estas?";
        System.out.println("Entrada: " + palabra);
        System.out.println("Salida: " + Eliminar_Espacios_Comas_Puntos.apply(palabra));
    }
}