

public class MetodoInsercion {
    public int insercionAsd(int[] arreglo){
        int size = arreglo.length;
        int contComparaciones = 0;
        
        for(int i = 1;i<size ;i++){ 
          int aux = arreglo[i];
          int j = i-1;
          contComparaciones++;
          while(j>=0 && aux<arreglo[j]){

            arreglo[i] = arreglo[j];
            j= j-1;
          }
          arreglo[i] = aux;

        }
        return contComparaciones;
         
    }

    public void insercionDes(int[] arreglo){
        int size = arreglo.length;
        
        for(int i = 0;i<size ;i++){
          int pos=i;
          int aux = arreglo[i];

          while ((pos>0) && (arreglo[pos-1]>aux)) {
            arreglo[pos] = arreglo[pos-1];
            pos--;
            
          }
          arreglo[pos] = aux;


        }
         
    }

    public int[] insercionAscendenteExplicado(int[] arreglo, boolean condicion) {
      int size = arreglo.length;
      int contComparaciones = 0;
      int contCambios = 0;
      System.out.println("Inicio del ordenamiento por inserción ascendente");
      for (int i = 1; i < size; i++) {
          int aux = arreglo[i];
          int j = i - 1;
          contComparaciones++;
          if (condicion) {
            System.out.println("Insertando " + aux);
          }
          

          
          while (j >= 0 && aux < arreglo[j]) {
              if (condicion) {
                System.out.println("Moviendo " + arreglo[j] + " a la posición " + (j + 1));
              }
              
              arreglo[j + 1] = arreglo[j];
              j--;
              contCambios++;
          }
          arreglo[j + 1] = aux;
      }
      int respuestas[] = {contComparaciones,contCambios};
        return respuestas;
  }
    public int[] insercionDescendenteExplicado(int[] arreglo, boolean condicion) {
      int size = arreglo.length;
      int contComparaciones = 0;
      int contCambios = 0;
      System.out.println("Inicio del ordenamiento por inserción descendente");
      for (int i = 1; i < size; i++) {
          int aux = arreglo[i];
          int j = i - 1;
          contComparaciones++;
          if (condicion) {
            System.out.println("Insertando " + aux);
          }
          
          while (j >= 0 && arreglo[j] < aux) {
            if (condicion) {
              System.out.println("Moviendo " + arreglo[j] + " a la posición " + (j + 1));
            }
              
              arreglo[j + 1] = arreglo[j];
              j--;
              contCambios++;
          }
          arreglo[j + 1] = aux;
      }
      int respuestas[] = {contComparaciones,contCambios};
        return respuestas;
  }

    
}
