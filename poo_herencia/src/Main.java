import com.amoelcodigo.Alumno;
import com.amoelcodigo.AlumnoInternacional;
import com.amoelcodigo.Profesor;

public class Main {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();
        alumno.setNombre("Manuel");
        alumno.setApellido("More");

        Profesor profesor = new Profesor();
        profesor.setNombre("Paco");
        profesor.setApellido("Perez");
        profesor.setAsignatura("Matemáticas");


        AlumnoInternacional alumnoInternacional = new AlumnoInternacional();
        alumnoInternacional.setNombre("Jhon");
        alumnoInternacional.setApellido("Wayne");
        alumnoInternacional.setNotaCastellano(4);

        System.out.println("Alumno: " + alumno.getNombre() + " " + alumno.getApellido());
        System.out.println("Profesor " + profesor.getNombre() + " " + profesor.getApellido());
        System.out.println("Alumno Internacional " + alumnoInternacional.getNombre() + " "
                + alumnoInternacional.getApellido() + " ,Nota: " + alumnoInternacional.getNotaCastellano());

        Class clase = alumnoInternacional.getClass();
        while(clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}