import java.util.Arrays;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Calculadora  calculadora = new Calculadora();
        List<Integer> ListaNumerosUno = Arrays.asList(1000,50,40,70,90);
        List<Integer> ListaNumerosDos = Arrays.asList(200,12,11,30,40);



        System.out.println("La suma de los arreglos es : "+ calculadora.sumarListas(ListaNumerosUno,ListaNumerosDos));
        System.out.println("La resta de los arreglos es: "+ calculadora.restarListas(ListaNumerosUno,ListaNumerosDos));
        System.out.println("La multiplicacion del arreglo 1 es: "+ calculadora.multiplicarListas(ListaNumerosUno,ListaNumerosDos));
        calculadora.dividirListas(ListaNumerosUno,ListaNumerosDos);

    }
}
