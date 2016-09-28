/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package guvi7;

import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Guvi7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i,sum=0;
        float avg;
        int[]a=new int[10];
        Scanner obj=new Scanner(System.in);
        for(i=0;i<10;i++)
            a[i]=obj.nextInt();
        for(i=0;i<10;i++)
            sum=sum+a[i];
        avg=(float)sum/10;
System.out.println("average is:"+avg);
    }
}
