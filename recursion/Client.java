/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursion;
import java.util.Scanner;
import java.io.File;
/**
 *
 * @author treyd
 */
public class Client 
{
    
    public static void main(String[] args)
    {        
        Scanner scans = new Scanner(System.in);
        System.out.println("Give me a A: for hanoi. B: for find C: for GCD. D: to exist");
        String option = scans.nextLine();
        while(!(option.equals("A:")||option.equals("B:")||option.equals("C:")||option.equals("D:")))
        {
            System.out.println("Try again. Give me a A: for hanoi. B: for find C: for GCD. D: to exist");   
            option = scans.nextLine();
        }            
        code(option);
        
    }
    private static void code(String option){
        Scanner scans = new Scanner(System.in);
        
        if(option.equals("A:"))
            {
                 System.out.println("Give me a number for hanoi");
                 int han = Integer.parseInt(scans.nextLine());
                 int jacob = hanoi.hanoi(han);
                 if(jacob ==-1)
                 {
                     System.out.println("Enter a postive number");
                 }
                 else
                 {
                 System.out.println("It would take this many moves "+jacob);
                 }
            }
            if(option.equals("B:"))
            {
                 System.out.println("Give me a filename");
                 String filename = scans.nextLine();
                 System.out.println("Give me path");
                String paths = scans.nextLine();
                if(hanoi.find(filename, paths)<1)
                    System.out.println("No results found");
            }
        if(option.equals("C:"))
        {
            System.out.println("Give me a number for GCD");
            int x = Integer.parseInt(scans.nextLine());
            System.out.println("Give me another number for GCD");
            int y = Integer.parseInt(scans.nextLine());
            if( x<1||y<1)
            {
                System.out.println("Give me a valid input");
            }
            else
            {
                hanoi.gcd(x, y);
            }
            
        }
        if(option.equals("D:"))
        {
            return;
        }
        main(null);
    }
    
}
