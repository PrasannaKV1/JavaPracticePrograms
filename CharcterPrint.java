import java.util.Scanner;

public class CharcterPrint {

    public static void main(String[] args) {
        

        Scanner sc =new Scanner(System.in);
        System.out.println("enter charcter based on your wish ");
        char c=sc.next().charAt(0);
        int AssValue=(int)c;
        System.out.println("The Ascii  value is"+AssValue);
        sc.close();


    }
    
}
