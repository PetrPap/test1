/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author Petros
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arrayOfInt = new int[4];
        int sum;
        float average;
        Random random = new Random();
        arrayOfInt[0] = random.nextInt(101);
        arrayOfInt[1] = random.nextInt(101);
        arrayOfInt[2] = random.nextInt(101);
        arrayOfInt[3] = random.nextInt(101);
        
        
        sum = arrayOfInt[0] + arrayOfInt[1] + arrayOfInt[2] + arrayOfInt[3];
        average = sum/4f;
        
        System.out.println(Arrays.toString(arrayOfInt));
        System.out.println(sum);
        System.out.println(average);
        
        
    }
    
}
