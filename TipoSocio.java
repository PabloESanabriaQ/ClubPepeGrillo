public class TipoSocio {
    class Fecha
    {
        int dia;
        int mes;
        int anio;
        Fecha(int dia, int mes, int anio){
            this.dia = dia;
            this.mes = mes;
            this.anio = anio;
        }

        public String toString(){
            return " " + dia + "-" + mes + "-" + anio;
        }
    }

    private String nombre;
    private int edad;
    int codigo;
    Fecha f;
    
    public TipoSocio(String nombre, int codigo, int edad, int dia, int mes, int anio){
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        f = new Fecha(dia, mes, anio);
    }

    public int getCodigo(){
        return codigo;
    }

    public String toString(){
        return "Código: " + codigo + ". Nombre: " + nombre + ". Edad: " + edad + ". Fecha: " + f.toString();
    }

    
}
