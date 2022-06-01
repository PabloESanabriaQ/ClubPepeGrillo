import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        String opcion = "";
        TablaDispersaEnlazada tabla = new TablaDispersaEnlazada();
        TipoSocio socio;
        String nombreSocio;
        int codigoSocio, edadSocio, dia, mes, anio;

        do {
            System.out.println("-----------------");
            System.out.println("Bienvenido al club de bochas Pepe Grillo");
            System.out.println("-----------------");
            System.out.println("Seleccione una opción:");
            System.out.println("-----------------");
            System.out.println("1 - INSERTAR SOCIO");
            System.out.println("2 - BUSCAR SOCIO");
            System.out.println("3 - ELIMINAR SOCIO");
            System.out.println("-----------------");
            System.out.println("0 - SALIR");
            System.out.println("-----------------");
            System.out.println("");
            try {
                opcion = entrada.readLine();
            } catch (IOException e) {
                System.out.println("Elija una opción de la lista.");
            }
            switch (opcion) {
                case "1":
                    System.out.println("Ingrese el nombre del socio");
                    nombreSocio = entrada.readLine();
                    System.out.println("Ingrese el número de socio");
                    codigoSocio = Integer.parseInt(entrada.readLine());
                    System.out.println("Ingrese la edad del socio");
                    edadSocio = Integer.parseInt(entrada.readLine());
                    System.out.println("Ingrese el día de inscripción");
                    dia = Integer.parseInt(entrada.readLine());
                    System.out.println("Ingrese el mes de inscripción");
                    mes = Integer.parseInt(entrada.readLine());
                    System.out.println("Ingrese el año de inscripción");
                    anio = Integer.parseInt(entrada.readLine());
                    socio = new TipoSocio(nombreSocio, codigoSocio, edadSocio, dia, mes, anio);
                    tabla.insertar(socio);
                    System.out.println("");
                    break;
                case "2":
                    System.out.print("Ingrese el número de socio que desea buscar: ");
                    try {
                        Elemento buscado = tabla.buscar(Integer.parseInt(entrada.readLine()));
                        System.out.println(buscado.getSocio().toString());                       
                        
                    } catch (Exception e) {
                        System.out.println("Socio no encontrado");
                    }
                    break;
                case "3":
                    System.out.print("Ingrese el código del socio que desea eliminar: ");
                    try {
                        tabla.eliminar(Integer.parseInt(entrada.readLine()));
                        System.out.println("Socio eliminado correctamente");
                    } catch (IOException e) {
                        System.out.println("Socio no encontrado");
                    }
                    break;
                case "0":
                    break;
            }
        } while (!opcion.equals("0"));
    }
}
