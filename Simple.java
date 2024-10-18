import java.util.Scanner;

public class Simple {
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the string based on your wish");
    String s=sc.nextLine();
    for(int i=0;i<s.length();i++)
    {
        System.out.println((int)s.charAt(i) );
    }
    
    sc.close();
    }
    
}
