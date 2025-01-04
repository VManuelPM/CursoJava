public class EjemploStringInmutable {

    public static void main(String[] args) {
        String curso  = "curso";
        String profesor = "Manu";

        String resultado = curso.concat(profesor);
        System.out.println("curso = " + resultado);

        String resultado2 = curso.transform(c -> {
            return c + " con " + profesor;
        });

        System.out.println("curso after transform: " + resultado2);
    }
}
