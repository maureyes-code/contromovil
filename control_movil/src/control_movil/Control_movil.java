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
        double sumaTotal = 0;
        double sumaAcademico = 0;
        double sumaRecreativo = 0;
        double metaRecreativo;
        System.out.println("Ingrese meta de uso recreativo:\n");
         metaRecreativo = entrada.nextDouble();
        while (metaRecreativo < 0 || metaRecreativo > 24) {
            System.out.print("Valor invalido (0 a 24). Ingresa nuevamente:\n");
            metaRecreativo = entrada.nextDouble();
        }
    
}
}
