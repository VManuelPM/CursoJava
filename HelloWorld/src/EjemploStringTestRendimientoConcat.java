public class EjemploStringTestRendimientoConcat {

    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        //String builder es mutable
        StringBuilder sb = new StringBuilder(a);

        long inicio = System.currentTimeMillis();

        for(int i=0; i < 500; i++){
            //c = c.concat(a).concat(b).concat("\n"); // 2ms
            //  c += a + b + "\n"; // 11ms
            sb.append(a).append(b).append("\n"); //0ms
        }

        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb = " + sb.toString());
    }
}
