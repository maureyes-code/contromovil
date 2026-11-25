/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package control_movil;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author LEGION
 */
public class Control_movil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        // 1. Variables de entrada
        int dia = 1;
        int diasSuperados = 0;

        double tiempoTotal;
        double sumaTotal = 0;

        double tiempoAcademico;
        double sumaAcademico = 0;

        double tiempoRecreativo;
        double sumaRecreativo = 0;
        double metaRecreativo;
        String cadenaFinal = "Regulación del uso del celular";

        System.out.println("Ingrese meta de uso recreativo:");
        metaRecreativo = entrada.nextDouble();

        //Comprobar que el valor sea válido
        while (metaRecreativo < 0 || metaRecreativo > 24) {
            System.out.print("Valor invalido (0 a 24). Ingresa nuevamente:\n");
            metaRecreativo = entrada.nextDouble();

            
        }
        
        //Ciclo de los 7 dias para el proceso
        while (dia <= 7) {
            /*Aqui se pide las horas destinadas a cada actividad, se usan los
            acumuladores y se arma la cadena final
            */
            
            
            
            
            
            dia = dia+1;
        }
        
        //Imprimir una sola cadena que vamos a ir concatenando con format
        System.out.println(cadenaFinal);
    }
}
