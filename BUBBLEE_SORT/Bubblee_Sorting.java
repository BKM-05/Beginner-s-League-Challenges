import java.util.*;
public class Bubblee_Sorting
{public static void main(String args[])
 {Scanner sc=new Scanner(System.in);
  System.out.println("Input the number of inputs you want to enter:");
  int n=sc.nextInt(); //no of inputs
  sc.nextLine();
  String a[]=new String[n]; // stores the inputs
  System.out.println("Input the Foods you want to add in the array");
  for (int i=0;i<n;i++) 
  {a[i]=sc.nextLine();
  }
  // Bubble sorting in alphabetical order
  for(int i=0;i<n-1;i++)
  {for(int j=0;j<n-1-i;j++)
   {if(a[j].compareToIgnoreCase(a[j+1])>0)
    {//Swap
     String temp=a[j];
     a[j]=a[j+1];
     a[j+1]=temp;
    }
   }
  }
  // Printing the Sorted Food list
  for(int i=0;i<n;i++)
   System.out.println(a[i]);
  sc.close();
 }
}
