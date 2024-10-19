import java.util.Scanner;
public class Arraysum {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the size of the array ");
        int N=sc.nextInt();
        int array[]=new int[N];
        for(int n=0;n<array.length;n++)
        {
            array[n]=sc.nextInt();
        }
        System.out.println(sumofarrayelements(array));
        sc.close();

    }

    private static int sumofarrayelements(int[] array) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'sumofarrayelements'");
         int sum=0;
         for(int w=0;w<array.length;w++)
         {
            sum=sum+array[w];
         }
         return sum;
        }
    
}
