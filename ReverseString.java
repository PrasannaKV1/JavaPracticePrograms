import java.util.Scanner;
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the string based on your wish");
        String sone=sc.nextLine();
        char ch[]=sone.toCharArray();
        var f=reverseString(ch);
        System.out.println("The reversed value  is"+f);
        sc.close();



    }

    private static char[]  reverseString(char[] ch) {
        // TODO Auto-generated method stub
       //  throw new UnsupportedOperationException("Unimplemented method 'reverseString'");
       for(int i=0;i<ch.length/2;i++)
       {

        char temp =ch[i];
        ch[i]=ch[ch.length-1-i];
        ch[ch.length-1-i]=temp;

       }
       return ch;
    }
    
}
