/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes_matriz;

import java.util.Random;
/**
 *
 * @author rebec
 */
public class Testes_matriz {    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int matriz[][] = new int[10000][10000];
        
        Random random = new Random();
        int x;
        
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                matriz[i][j] =  random.nextInt(51);
                
                matriz[j][i] = matriz[i][j] * 2;
                
                //System.out.print(matriz[i][j] + " ");
            }
            //System.out.println(" ");
        }
        
    }
    
}
