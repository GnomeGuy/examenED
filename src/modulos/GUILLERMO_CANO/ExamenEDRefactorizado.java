package modulos.GUILLERMO_CANO;

import java.util.Random;
import java.util.Scanner;

public class ExamenEDRefactorizado {

    static int topeDeGeneracion = 30;

    public static void main(String args[]){

        System.out.println("Introduce la cantidad de numeros que tendra el array: ");
        Scanner input = new Scanner(System.in);
        int tamañoArray = input.nextInt();
        Random random = new Random();
        int []numerosAleatorios = new int[tamañoArray];
        for(int vueltas=0; vueltas<tamañoArray; vueltas++)
        {
            numerosAleatorios[vueltas] = random.nextInt(ExamenEDRefactorizado.topeDeGeneracion);
        }

        ExamenEDRefactorizado.ejecutarAlgoritmo(numerosAleatorios);
        input.close();
    }


    public static void ejecutarAlgoritmo(int[] numerosAleatorios){

        int mayorNumero = 0;
        int menorNumero = ExamenEDRefactorizado.topeDeGeneracion;

        for(int vueltas=0; vueltas<numerosAleatorios.length; vueltas++)
        {
             System.out.println(numerosAleatorios[vueltas]);
            if(numerosAleatorios[vueltas] > mayorNumero ){
                mayorNumero = numerosAleatorios[vueltas];
            }

            if(numerosAleatorios[vueltas] < menorNumero){
                menorNumero = numerosAleatorios[vueltas];
            }
        }

        int multiplicacionMenorYMayor = menorNumero *mayorNumero;
        if (multiplicacionMenorYMayor == 0 || (multiplicacionMenorYMayor % 2 != 0)  ){
            System.out.println("El mayor y el menor numero generado no dan resto 0 al dividirlos entre 2.");
        }else{
            System.out.println("El mayor y el menor número generado son divisibles entre 2, dando de resto 0.");
        }
    }
}