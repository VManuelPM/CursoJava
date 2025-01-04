public class EjemploMatricesBuscar {
    public static void main(String[] args) {
        int[][] matrizDeEnteros = {
                {35,90,3,1997},
                {15,2020, 10,5},
                {666, 121, 32767, 2000}
        };

        int elementoBuscar = 15;
        boolean encontrado = false;
        int i;
        int j = 0;
        buscar: for (i=0; i < matrizDeEnteros.length; i++) {
            for (j = 0; j < matrizDeEnteros[i].length; j++) {
                if(matrizDeEnteros[i][j] == elementoBuscar){
                    encontrado = true;
                    break buscar;
                }
            }
        }

        if(encontrado){
            System.out.println("Encontrado elemento a buscar: "
                    + elementoBuscar + " en las coordenadas " + i + "," + j);
        }else{
            System.out.println(elementoBuscar + " No se ha encontrado");
        }
    }
}
