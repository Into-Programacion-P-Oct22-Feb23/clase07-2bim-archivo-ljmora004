/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList02 {

    public static void main(String[] args) {
        
        ArrayList<String> arreglo2 = obtenerDatos();
        String cadenaFinal = obtenerCadenaFinal(arreglo2);
        System.out.printf("\nPresentar los valores en pantalla:\n%s", 
                cadenaFinal);

    }
    
    public static ArrayList<String> obtenerDatos(){
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> arreglo = new ArrayList <>();
        boolean bandera = true;
        String pais;
        int opcion;

        while (bandera) {
            System.out.println("Ingrese el nombre de un pais:");
            pais = entrada.nextLine();
            arreglo.add(pais);
            System.out.println("Si desea agregar mas paises presione 1,"
                    + " de lo contrario 2.");
            opcion = entrada.nextInt();
            entrada.nextLine();
            if (opcion != 1) {
                bandera = false;
            }
        }
        
        return arreglo;
    }
    
    public static String obtenerCadenaFinal(ArrayList<String> arreglo){
        String mensaje = "";
        for (int i = 0; i < arreglo.size(); i++) {
            mensaje = String.format("%s%s\n", mensaje, arreglo.get(i));
        }
        return mensaje;
    }
}
