import java.util.Arrays;
import java.util.List;


/**
 * Author Daniel Felipe Marin Giraldo
 * v 1.0
 * Clase principal que llama los métodos de la calculadora, se definen dos arreglos de números los cuales serán recorridos
 * usando stream y algunos de sus métodos para poder operar la calculadoras
 */
public class Principal {

    public static void main(String[] args) {

        Calculadora  calculadora = new Calculadora();
        List<Integer> listaNumerosUno = Arrays.asList(150,50,40,70,90);
        List<Integer> listaNumerosDos = Arrays.asList(120,9,11,15,16);

        System.out.println("Bienvenido a la calculadora realizada con Stream");

        System.out.println("\nEsta es la Lista 1: "+ listaNumerosUno);
        System.out.println("Esta es la Lista 2: "+ listaNumerosDos);


        boolean validarCeros = false;


        if (listaNumerosDos.size()!=listaNumerosUno.size()){
            System.out.println("Los arreglos son diferentes, por favor ingrese la misma cantidad de números");

        }else{
            calculadora.sumar(listaNumerosUno,listaNumerosDos);
            calculadora.restar(listaNumerosUno,listaNumerosDos);
            calculadora.multiplicar(listaNumerosUno,listaNumerosDos);

            if (listaNumerosDos.contains(0)){
                System.out.println("El arreglo tiene un cero, no puedes dividir ni generar módulo");
            } else{
                calculadora.dividir(listaNumerosUno,listaNumerosDos);
                calculadora.modulo(listaNumerosUno,listaNumerosDos);
            }
            System.out.println("\nEl número mayor de la Lista 1 es : "+ calculadora.calcularMaximo(listaNumerosUno).get());
            System.out.println("El número menor de la Lista 2 es : "+ calculadora.calcularMinimo(listaNumerosDos).get());

        }

    }
}
