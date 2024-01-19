/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arraydemo;

import java.io.InputStream;
import java.util.Scanner;

/**
 *
 * @author knigh
 */
public class ArrayDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Enter a string");
        Scanner input = new Scanner(System.in);
        String myWord = input.nextLine();
        
        char[] myLetters = new char[myWord.length()];
        
        for(int i = 0 ;i<myLetters.length;i++) {
            myLetters[i]=myWord.charAt(i);
        }
        System.out.println("Print in Reverse");
        
        for(int i = myLetters.length-1;i>=0 ;i--) {
            System.out.println(myLetters[i]);
        }
    }

    private static Scanner newScanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}//End of the class
