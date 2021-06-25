/*
 * MARION ELLE CHUA LI CHEN BI20110127.
 */
package main;

import java.util.Scanner;
import java.io.*;
public class Main
{
   public static void main(String[] args) throws Exception
   {
       Scanner sc = new Scanner(new File("test.txt"));
       int count=0;
       double sum=0;
       double average = 0;
       {
           int b = 0;
           int max = b;
           int a = 0;
           int min = a;
       String str="";
       try (FileWriter f1 = new FileWriter("out.txt")) {
           while(sc.hasNext())
           {
               int temp=sc.nextInt();
               count++;
               sum=sum+temp;
               average = sum / count;
               if(temp>max)
                   max=temp;
               if(temp<min)
                   min=temp;
               str=str+temp+" ";
           }
           f1.write("The value read from the file : " +str+ "\n");
           f1.write("Number of input = " +count + "\n");
           f1.write("Max = " +max + "\n");
           f1.write("Min = " +min + "\n");
           f1.write("Average = " + average + "\n");
       }
   }
}
}
