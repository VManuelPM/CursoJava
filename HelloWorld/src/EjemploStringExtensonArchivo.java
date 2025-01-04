public class EjemploStringExtensonArchivo {

    public static void main(String[] args) {
        String archivo = "alguna.imagen.json";
        int i = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring(i) = " + archivo.substring(i+1));

    }
}
