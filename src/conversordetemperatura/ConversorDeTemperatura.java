package conversordetemperatura;

import java.util.Scanner;

public class ConversorDeTemperatura {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double c,f,ra,re,k;
        System.out.println("-----CONVERSOR DE TEMPERATURA-----");
        System.out.print("Informe uma temperatura em Celsius(C):");
        c = teclado.nextDouble();
        f = c*1.8+32;
        System.out.println("Fahrenheit:"+f+"°F");
        k = c+273.15;
        System.out.println("Kelvin:"+k+"°K");
        re = c*0.8;
        System.out.println("Réaumur:"+re+"°Re");
        ra = c*1.8+32+459.67;
        System.out.println("Rankine:"+ra+"°Ra");
        
    }
    
}
