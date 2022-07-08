import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;



/**
 * Author Daniel Felipe Marin Giraldo
 * v 1.0
 * Clase calculadora que implementa los métodos sumar, restar, multiplicar,dividir y módulo, recibe 2 objetos tipo List
 * para poder operar según el índice de cada arreglo
 */
public class Calculadora {


    public void sumar(List<Integer> listaNumerosUno, List<Integer> listaNumerosDos){
        AtomicInteger indice = new AtomicInteger();
        List<Integer> resultadoSuma = listaNumerosUno.stream().map((listaUno)->{
                    Integer listaDos = listaNumerosDos.get(indice.get());
                    indice.getAndIncrement();
                    Integer operacionSuma = listaUno+listaDos;
                    return operacionSuma;
                }).collect(Collectors.toList());
        System.out.println("\nEl vector resultado de la suma es: " + resultadoSuma.toString());
    }


    public void restar (List<Integer> listaNumerosUno,List<Integer> listaNumerosDos){
        AtomicInteger indice = new AtomicInteger();
        List<Integer> resultadoResta = listaNumerosUno.stream().map((listaUno)->{
            Integer listaDos = listaNumerosDos.get(indice.get());
            indice.getAndIncrement();
            Integer operacionResta = listaUno-listaDos;
                    return operacionResta;
        }).collect(Collectors.toList());
        System.out.println("El vector resultado de la resta es: " + resultadoResta.toString());
    }

    public void multiplicar(List<Integer> listaNumerosUno, List<Integer> listaNumerosDos){
        AtomicInteger indice = new AtomicInteger();
        List<Integer> resultadoMultiplicacion = listaNumerosUno.stream().map((listaUno)->{
                    Integer listaDos = listaNumerosDos.get(indice.get());
                    indice.getAndIncrement();
                    Integer operacionMultiplicacion = listaUno*listaDos;
                    return operacionMultiplicacion;
                }).collect(Collectors.toList());
        System.out.println("El vector resultado de la multiplicación es: " + resultadoMultiplicacion.toString());

    }

    public void dividir (List<Integer> listaNumerosUno,List<Integer> listaNumerosDos){
        AtomicInteger indice = new AtomicInteger();
        List<Integer> resultadoDivision = listaNumerosUno.stream()
                .map((listaUno)->{
                    Integer listaDos = listaNumerosDos.get(indice.get());
                    indice.getAndIncrement();
                    Integer operacionDivision = listaUno/listaDos;
                        return operacionDivision ;
                }).collect(Collectors.toList());
        System.out.println("El vector resultado de la división es: " + resultadoDivision.toString());
    }

    public void modulo(List<Integer> listaNumerosUno, List<Integer> listaNumerosDos){
        AtomicInteger indice = new AtomicInteger();
        List<Integer> resultadoModulo = listaNumerosUno.stream().map((listaUno)->{
            Integer listaDos = listaNumerosDos.get(indice.get());
            indice.getAndIncrement();
            Integer operacionModulo = listaUno%listaDos;
            return operacionModulo;
        }).collect(Collectors.toList());
        System.out.println("El vector resultado del módulo es: " + resultadoModulo.toString());

    }

    public Optional<Integer> calcularMaximo(List<Integer>listaNumerosUno) {
        Optional<Integer> numeroMayor = listaNumerosUno.stream().max((x, y) -> x.compareTo(y));

        return numeroMayor;

    }

    public Optional<Integer> calcularMinimo(List<Integer>listaNumerosDos) {
        Optional<Integer> numeroMenor = listaNumerosDos.stream().min((x, y) -> x.compareTo(y));

        return numeroMenor;

    }





}
