package Model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author siqiyang
 */
public class HelloWorld {

 
    public static void main(String[] args){
        int age = 20;
        double weight = 82.5;
        char a1 = 'a';
        boolean b = true;
        String say = "Hi";

        int [] myArray = new int[3];
        myArray [0] = 0;
        myArray [1] = 1;
        myArray [2] = 2;
        
        int index=0;
        while(index<myArray.length){
          System.out.println(myArray[index]);
          index++;
      
        }
        
        System.out.println(age);
        System.out.println(weight);
        System.out.println(a1);
        System.out.println(say);
        System.out.println(b);
   


    
    }


}

