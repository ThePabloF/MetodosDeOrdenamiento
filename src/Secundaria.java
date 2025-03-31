
public class Secundaria {
    public void ordenarAscendente(int[] arreglo) {

        int n = arreglo.length; // Tamaño del arreglo
        // int[] arreglo ={10,9,21,5,15,2,-1,0}
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arreglo[i] > arreglo[j]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                }
            }
        }

    }

    public void ordenarDescendente(int[] arreglo) {
        int n = arreglo.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                if (arreglo[i] < arreglo[j]) {
                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                }
            }
        }
    }

    public int[] ordenarAscendenteExplicado(int[] arreglo, boolean condicion) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        System.out.println("Inicio del ordenamiento ascendente");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;
                if (condicion) {
                    System.out.println("Comparando: " + arreglo[i] + " y " + arreglo[j]);
                }

                if (arreglo[i] > arreglo[j]) {
                    if (condicion) {
                        System.out.println("Intercambiando " + arreglo[i] + " con " + arreglo[j]);
                    }

                    int aux = arreglo[j];
                    arreglo[j] = arreglo[i];
                    arreglo[i] = aux;
                    contCambios++;
                }
            }
        }
        int respuestas[] = { contComparaciones, contCambios };
        return respuestas;
    }

    public int[] ordenarDescendenteExplicado(int[] arreglo, boolean condicion) {
        int n = arreglo.length;
        int contComparaciones = 0;
        int contCambios = 0;
        System.out.println("Inicio del ordenamiento descendente");
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                contComparaciones++;

                if (condicion) {
                    System.out.println("Comparando: " + arreglo[i] + " y " + arreglo[j]);
                }

                if (arreglo[i] < arreglo[j]) {
                    if (condicion) {
                        System.out.println("Intercambiando " + arreglo[i] + " con " + arreglo[j]);
                    }

                    int aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;
                    contCambios++;
                }
            }
        }
        int respuestas[] = { contComparaciones, contCambios };
        return respuestas;

    }

    public int[] metodoBurbujaMejorado(int[] arreglo, boolean condicion) {
        int n = arreglo.length; // Tamaño del arreglo
        int contComparaciones = 0;
        int contCambios = 0;
        // int[] arreglo ={10,9,21,5,15,2,-1,0}
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                contComparaciones++;
                if (condicion) {
                    System.out.println(
                            "Comparaciones : " + contComparaciones + "->" + arreglo[j] + "->" + arreglo[j + 1]);
                }
                if (arreglo[j] > arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    contCambios++;
                }
            }
            if (condicion) {
                System.out.print("Estado Actual -> ");
                imprimirArreglo(arreglo);
            }

        }
        int respuestas[] = { contComparaciones, contCambios };
        return respuestas;

    }

    public int[] metodoBurbujaMejoradoDescendente(int[] arreglo, boolean condicion) {

        int n = arreglo.length; // Tamaño del arreglo
        int contComparaciones = 0;
        int contCambios = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                contComparaciones++;
                if (condicion) {
                    System.out.println(
                            "Comparaciones : " + contComparaciones + " -> " + arreglo[j] + " -> " + arreglo[j + 1]);
                }
                
                if (arreglo[j] < arreglo[j + 1]) {
                    int aux = arreglo[j];
                    arreglo[j] = arreglo[j + 1];
                    arreglo[j + 1] = aux;
                    contCambios++;
                }
            }
            if (condicion) {
                System.out.print("Estado Actual -> ");
                imprimirArreglo(arreglo);
            }
        }
        int respuestas[] = { contComparaciones, contCambios };
        return respuestas;

    }

    public void imprimirArreglo(int[] arreglo) {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i] + "-");

        }
        System.out.println();
    }

}
