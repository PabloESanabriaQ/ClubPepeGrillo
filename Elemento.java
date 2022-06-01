public class Elemento {
    TipoSocio socio;
    Elemento siguiente;

    public Elemento(TipoSocio tipoSocio){
        this.socio = tipoSocio;
    }

    public TipoSocio getSocio(){
        return socio;
    }
}
