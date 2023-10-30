import java.util.*;

class Data
{
void display(int arr3[][],int row,int col)
{
 System.out.println("Aaddition of two matrix"); 
 for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
   {
    System.out.print(arr3[i][j] + " ");
   }
   System.out.println();
  }
}

}

public class AddOfTwoMatrix
{
public static void main(String arg[])
{
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the Size of row");
 int row=sc.nextInt();
 System.out.println("Enter the Size of Coloumn");
 int col=sc.nextInt();

 int arr1[][]=new int[row][col];
 
 for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
    {
    System.out.println("Enter the element of first array");
    arr1[i][j]=sc.nextInt();
    }
  }

 int arr2[][]=new int[row][col]; 
 for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
    {
    System.out.println("Enter the element of second array");
    arr2[i][j]=sc.nextInt();
    }
  } 

 int arr3[][]=new int[row][col]; 
 for(int i=0;i<row;i++)
  {
   for(int j=0;j<col;j++)
    {
    arr3[i][j]=arr1[i][j] + arr2[i][j];
    }
  }  
 
Data d1=new Data();
d1.display(arr3,row,col); 
sc.close();
}
}