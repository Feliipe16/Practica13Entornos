/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr13;
import java.util.*;
/**
 *
 * @author administrador
 */
public class Pr13 {
public static Scanner sc = new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n[] = new int [10];
        int nu = 0;
        
        for (int i = 0; i <= 10; i++){
            System.out.println("Introduce un numero");
            nu = sc.nextInt();
        }
        
        Arrays.sort(n);
        
        
    }
    
}
