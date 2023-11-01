import java.util.*;

class StarPatternDimand
{
public static void main(String arg[])
 {
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the number");
  int num=sc.nextInt();
  
  for(int i=1;i<=num;i++)
  {
   for(int j=num-1;j>=i;j--)
    {
     System.out.print(" ");
    }
   for(int k=1;k<=i;k++)
    {
     System.out.print(" *");
    }
  System.out.println();
  }
   
  for(int i=1;i<=num-1;i++)
   {
   for(int j=1;j<=i;j++)
    {
     System.out.print(" ");
    }
   for(int k=num-1;k>=i;k--)
    {
     System.out.print(" *");
    }
  System.out.println();
  } 
 }
}

/*
-------------------Output----------------------------------------------------------------------------

 C:\Users\Shree\Desktop\csj 35\logic Programming\StarPattern>javac StarPatternDimand.java

 C:\Users\Shree\Desktop\csj 35\logic Programming\StarPattern>java StarPatternDimand
 Enter the number
 4
     *
    * *
   * * *
  * * * *
   * * *
    * *
     *
-------------------------------------------------------------------------------------------------------
*/