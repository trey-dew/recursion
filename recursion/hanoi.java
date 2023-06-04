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
public class hanoi 
{
    public static int hanoi(int n)
    {       
        if(n <=0)
        {
            return -1;
        }
        if(n==1)
            return 1;
        else
           return 2*hanoi(n-1)+1;
        
    }
   public static int find(String filename, String startPath)
    {
        int count = 0;
        File currentFile = new File(startPath);
        File[] fileList = currentFile.listFiles();
        for(File files : fileList)
        {
            if(files.isFile())
            {
                if(filename.equals(files.getName()))
                {
                    count++;
                     System.out.println("The Path is "+files.getAbsolutePath());
                }              
            }
            else
            {
                
                count+=find(filename,files.getAbsolutePath());
            }
            
        }
        return count;
    }
    public static int gcd(int x,int y)
    {
            if(y==0)
            {
                System.out.println("The greatest common denomenator is "+x);
                return x;
            }
            else if(y>0)
            {
                return gcd(y,x%y);
            }
        return -1;
    }
}
