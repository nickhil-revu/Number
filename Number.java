/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
//package number;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Nickhil
 */
public class Number 
{
    public static void main(String[] args) throws IOException 
    {
      int n=1, j,m=2,k,a=0,result=0;
      int i, p;
      String ch;
      InputStreamReader isr = new InputStreamReader(System.in);
      BufferedReader br =new BufferedReader(isr);
      System.out.println("Choose a Number of your Choice between 1 to 63");
      for(i=0;i<6;i++)
      {
          k=0;a=0;
          p=(int)Math.pow(2, i);
          //System.out.println(p);
          
          for (j=p;j<63;j++)
          {
              if(k<p&&a==0)
              {
              System.out.print(j);
              System.out.print(" ");
              k++;
             
              }
              else
              {
                  k--;
                  a=1;
                  if(k==0)
  		     a=0;
  
              }
              }
          System.out.println("\nMy Number is in the list (y/n)");
          if("y".equals(br.readLine()))
          result+=p;
          n++;
          System.out.println();
      }
      
      System.out.println(result);
      
      
    }
}
