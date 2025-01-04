public class EjemploStringValidar {

    public static void main(String[] args) {
        String curso = null;

        boolean esNulo = curso == null;

        System.out.println("esNulo = " + esNulo);

        boolean esVacio2 = curso.isEmpty();

        boolean isVacio3 = curso.isBlank();

        if (esNulo) {
            curso = "Java";
            System.out.println(curso.toUpperCase());
        }

        if (!esVacio2) {
            System.out.println(curso.toUpperCase());
        }

        //IsEmpty() es desde la versión JDK 1.6

        // Desde JDK 11
        //IsBlank() valida que sea distinto de null, distinto de empty y que no sea un espacio en blanco
    }
}
