/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Arrays;

/**
 *
 * @author siqiyang
 */
public class array {
    public static void main(String args[]){
        int arr[] = { 1, 2, 3, 4, 5, 6 };
        int doub = 0, triple = 0;
    
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0)
                doub = arr[i]*2;
            else
                triple = arr[i]*3;
        }
           System.out.println("Double index positions sum: " + doub);
           System.out.println("triple index positions sum: " + triple);
       // System.out.println(Arrays.toString(arr));

    }
    
}
