/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fri;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author Student
 */
public class Fri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Enter the words:");
        Scanner s1 = new Scanner(System.in);
        String b = s1.nextLine(); //ma
        
        char[] s = new char[b.length()] ;
                Set<String> t1 = new HashSet<>();
        int n = b.length();
        for (int i = 0, j = 1; i < n; j++, i++) {


            s[i]=b.charAt(i);

         
t1.add(Character.toString(s[i]));
        }
       
       

        
        System.out.println("the value of identical is"+t1);
      
        }
    }

