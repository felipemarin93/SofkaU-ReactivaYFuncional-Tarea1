import java.util.List;

public class Calculadora {

    public Integer sumarListas (List<Integer> listaNumerosUno,List<Integer> listaNumerosDos){
        Integer resultadoSumaUno = listaNumerosUno.stream().reduce((acumulador,numero)->{
            return acumulador+numero;}).get();

        Integer resultadoSumaDos = listaNumerosDos.stream().reduce((acumulador,numero)->{
            return acumulador+numero;}).get();

        Integer resultadoSumaTotal = resultadoSumaUno+resultadoSumaDos;

        return resultadoSumaTotal;

    }

    public Integer restarListas (List<Integer> listaNumerosUno,List<Integer> listaNumerosDos){
        Integer resultadoRestaUno = listaNumerosUno.stream()
                .reduce((acumulador, numero) -> acumulador - numero).get();

        Integer resultadoRestaDos = listaNumerosDos.stream()
                .reduce((acumulador, numero) -> acumulador - numero).get();

        Integer resultadoRestaTotal = resultadoRestaUno-resultadoRestaDos;

        return resultadoRestaTotal;

    }

    public Integer multiplicarListas (List<Integer> listaNumerosUno,List<Integer> listaNumerosDos){
        Integer resultadoMultiplicacionUno = listaNumerosUno.stream()
                .reduce((acumulador, numero) -> acumulador * numero).get();
        Integer resultadoMultiplicacionDos = listaNumerosDos.stream()
                .reduce((acumulador, numero) -> acumulador * numero).get();
        Integer resultadoMultiplicacionTotal = resultadoMultiplicacionUno*resultadoMultiplicacionDos;
        return resultadoMultiplicacionTotal;

    }

    public void dividirListas (List<Integer> listaNumerosUno,List<Integer> listaNumerosDos){
        Integer resultadoDivisionUno = listaNumerosUno.stream()
                .reduce((acumulador, numero) -> acumulador + numero).get();
        Integer resultadoDivisionDos = listaNumerosDos.stream()
                .reduce((acumulador, numero) -> acumulador + numero).get();

        if (resultadoDivisionDos==0){
            System.out.println("No puedes dividir por cero");
        } else{
            double resultadoDivisionTotal = resultadoDivisionUno/resultadoDivisionDos;
            System.out.println("El resultado de la división es: "+resultadoDivisionTotal);
        }
    }
}
