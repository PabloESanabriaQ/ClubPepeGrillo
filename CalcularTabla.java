public class CalcularTabla {
    //n es el tamaño de la cantidad de claves a dispersar
    //m es el tamaño de la tabla de dispersión
    //El factor de carga es de 0.8
    //El tamaño de mis datos es de 1000, entonces si m/n = 0.8 => m = n / 0.8 

    static boolean esPrimo(int m){
        //Vamos a comprobar si un número m es primo.
        //Utilizamos la raíz de M (descartando el decimal)
        //Si es divisible por los números primos anteriores a su raíz NO será primo
        //de lo contrario, es primo.
        int raizDeM = (int) Math.sqrt(m);
        for(int i = 2; i < raizDeM; i++){
            if(m % i == 0){
                return false;
            }
        }
        return true;
    }

    public static int calcularTamanioTabla(long n){
        Double factorDeCarga = 0.8;
        Double m = n / factorDeCarga;
        int mEntero = (int) Math.round(m);
        while (!esPrimo(mEntero)){
            mEntero++;
        }
        return mEntero;
    }
}
