import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        
        boolean conPasos = false;
        String entradaBoolean;
        String orden = "";
        boolean op = false;
        boolean continuar = true;
        Scanner sc = new Scanner(System.in);
        Secundaria secundaria = new Secundaria();
        MetodoInsercion insert = new MetodoInsercion();
        MetodoSeleccion metodoSeleccion = new MetodoSeleccion();

        while (continuar) {
            int[] arreglo = { 10, 9, 21, 5, 15, 2, -1, 0 };
            System.out.println("Seleccione un metodo de ordenamiento: ");
            System.out.println("1. Burbuja");
            System.out.println("2. Seleccion");
            System.out.println("3. Inserción");
            System.out.println("4. Burbuja Mejorado");
            System.out.println("5. Salir");
            int metodo = sc.nextInt();

            if (metodo == 5) {
                continuar = false;
                break;
            }

            metodoSeleccion.imprimirArreglo(arreglo);
            boolean entradaValida = false;

            while (!entradaValida) {
                System.out.println("¿Desea ver los pasos? (True/False): ");
                entradaBoolean = sc.next().toLowerCase(); // Leer como cadena y convertir a minúsculas
                sc.nextLine(); // Limpiar el buffer
            
                if (entradaBoolean.equals("true") || entradaBoolean.equals("false")) {
                    conPasos = Boolean.parseBoolean(entradaBoolean);
                    entradaValida = true;
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese 'true' o 'false'.");
                }
            }

            entradaValida = false;
            while (!entradaValida) {
                System.out.println("¿Desea ordenar ascendentemente (A) o descendentemente (D)?: ");
                orden = sc.next().toLowerCase();
                if (orden.equals("a") || orden.equals("d")) {
                    entradaValida = true;
                } else {
                    System.out.println("Entrada inválida. Por favor, ingrese 'A' o 'D'.");
                }
            }
            
            boolean ascendente = orden.equals("a");
            
            

            int resultados[] = {};
            switch (metodo) {
                case 1:
                    System.out.println("Metodo Burbuja");
                    if (orden.equalsIgnoreCase("A")) {
                        System.out.print("Arreglo Original->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                        resultados = secundaria.ordenarAscendenteExplicado(arreglo, conPasos);
                        System.out.println("Resultado de Comparaciones: " + resultados[0]);
                        System.out.println("Resultado de Cambios: " + resultados[1]);
                        System.out.println("Arreglo Ordenado ->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                    } else {
                        System.out.print("Arreglo Original->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                        resultados = secundaria.ordenarDescendenteExplicado(arreglo, conPasos);
                        System.out.println("Resultado de Comparaciones: " + resultados[0]);
                        System.out.println("Resultado de Cambios: " + resultados[1]);
                        System.out.println("Arreglo Ordenado ->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                    }

                    break;
                case 2:

                    System.out.println("Metodo Seleccion");
                    if (orden.equalsIgnoreCase("A")) {
                        System.out.print("Arreglo Original->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                        resultados = metodoSeleccion.ordenarSeleccionAscendenteExplicado(arreglo, ascendente);
                        System.out.println("Resultado de Comparaciones: " + resultados[0]);
                        System.out.println("Resultado de Cambios: " + resultados[1]);
                        System.out.println("Arreglo Ordenado ->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                    } else {
                        System.out.print("Arreglo Original->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                        resultados = metodoSeleccion.ordenarSeleccionDescendenteExplicado(arreglo, ascendente);
                        System.out.println("Resultado de Comparaciones: " + resultados[0]);
                        System.out.println("Resultado de Cambios: " + resultados[1]);
                        System.out.println("Arreglo Ordenado ->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                    }

                    break;

                case 3:
                    System.out.println("Metodo Insercion");
                    if (orden.equalsIgnoreCase("A")) {
                        System.out.print("Arreglo Original->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                        resultados = insert.insercionAscendenteExplicado(arreglo, ascendente);
                        System.out.println("Resultado de Comparaciones: " + resultados[0]);
                        System.out.println("Resultado de Cambios: " + resultados[1]);
                        System.out.println("Arreglo Ordenado ->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                    } else {
                        System.out.print("Arreglo Original->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                        resultados = insert.insercionDescendenteExplicado(arreglo, ascendente);
                        System.out.println("Resultado de Comparaciones: " + resultados[0]);
                        System.out.println("Resultado de Cambios: " + resultados[1]);
                        System.out.println("Arreglo Ordenado ->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                    }

                    break;
                case 4:
                
                    if(orden.equalsIgnoreCase("A")){
                        System.out.println("Burbuja Mejorado");
                        System.out.print("Arreglo Original->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                        resultados = secundaria.metodoBurbujaMejorado(arreglo, conPasos);
                        System.out.println("Resultado de Comparaciones: " + resultados[0]);
                        System.out.println("Resultado de Cambios: " + resultados[1]);
                        System.out.println("Arreglo Ordenado ->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                    }else{
                        System.out.println("Burbuja Mejorado");
                        System.out.print("Arreglo Original->");
                        metodoSeleccion.imprimirArreglo(arreglo);
                        resultados = secundaria.metodoBurbujaMejoradoDescendente(arreglo, conPasos);
                        System.out.println("Resultado de Comparaciones: " + resultados[0]);
                        System.out.println("Resultado de Cambios: " + resultados[1]);
                        System.out.println("Arreglo Ordenado ->");
                        metodoSeleccion.imprimirArreglo(arreglo);

                    }
                    

                default:
                    System.out.println("Opción no valida");
                    break;
            }
        }


    }
}
