import java.util.Scanner;

public class Array43 {
    public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the size of the array");
    int N=sc.nextInt();
    int array[]=new int[N];
    for(int s=0;s<array.length;s++)
    {
        array[s]=sc.nextInt();
    }
        
      boolean result=isSortedornoted(array);
      System.out.println(result
      );
    
    }

    private static boolean isSortedornoted(int[] array) {
        // TODO Auto-generated method stub
       // throw new UnsupportedOperationException("Unimplemented method 'isSortedornoted'");
       boolean issortedtrue=true;
       for(int i=1;i<array.length;i++)
       {
           if(array[i]<array[i-1])
           {
            issortedtrue=false;
            break;
           }
       }
       return issortedtrue;

    }
    
}
