
public class MetodoSeleccion {

    public void ordenarSeleccion(int[] arreglo){
        int n= arreglo.length;
        for(int i=0; i<n-1;i++){
            int maxIdx = i;
            for(int j=i+1; j<n;j++){
                if (arreglo[maxIdx]<arreglo[j]) {
                    maxIdx=j;   
                }

            }
            if (maxIdx!= i) {

                int aux= arreglo[maxIdx];
                arreglo[maxIdx]=arreglo[i];
                arreglo[i]=aux;
                
            }

        }

    }
    public void ordenarSeleccionA(int[] arreglo){
        int n= arreglo.length;
        for(int i=0; i<n-1;i++){
            int maxIdx = i;
            for(int j=i+1; j<n;j++){
                if (arreglo[maxIdx]>arreglo[j]) {
                    maxIdx=j;   
                }

            }
            if (maxIdx!= i) {

                int aux= arreglo[maxIdx];
                arreglo[maxIdx]=arreglo[i];
                arreglo[i]=aux;
                
            }

        }

    }



    public int[] ordenarSeleccionAscendenteExplicado(int[] arreglo, boolean condicion) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        System.out.println("Inicio del ordenamiento por selección ascendente");
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if (condicion) {
                    System.out.println("Comparando " + arreglo[minIdx] + " y " + arreglo[j]);
                }
                
                if (arreglo[minIdx] > arreglo[j]) {
                    minIdx = j;
                }
            }
            if (minIdx != i) {
                if (condicion) {
                    System.out.println("Intercambiando " + arreglo[i] + " con " + arreglo[minIdx]);
                }
                
                int aux = arreglo[minIdx];
                arreglo[minIdx] = arreglo[i];
                arreglo[i] = aux;
                contCambios++;
            }
        }
        int respuestas[] = {contComparaciones,contCambios};
        return respuestas;
    }
    public int[] ordenarSeleccionDescendenteExplicado(int[] arreglo, boolean condicion) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        System.out.println("Inicio del ordenamiento por selección descendente");
        for (int i = 0; i < n - 1; i++) {
            int maxIdx = i;
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if (condicion) {
                    System.out.println("Comparando " + arreglo[maxIdx] + " y " + arreglo[j]);
                }
                
                if (arreglo[maxIdx] < arreglo[j]) {
                    maxIdx = j;
                }
            }
            if (maxIdx != i) {
                if (condicion) {
                    System.out.println("Intercambiando " + arreglo[i] + " con " + arreglo[maxIdx]);
                }
                
                int aux = arreglo[maxIdx];
                arreglo[maxIdx] = arreglo[i];
                arreglo[i] = aux;
                contCambios++;
            }
        }
        int respuestas[] = {contComparaciones,contCambios};
        return respuestas;
    }


    public void imprimirArreglo(int[] arreglo){
        for(int i=0;i<arreglo.length;i++){
            System.out.print(arreglo[i]+"-");
            
        }
        System.out.println();
    }
    public void mt(int[] arreglo, boolean op){
        if (op) {
            ordenarSeleccion(arreglo);
        }else{
            ordenarSeleccionA(arreglo);
        }
    }
    
}
