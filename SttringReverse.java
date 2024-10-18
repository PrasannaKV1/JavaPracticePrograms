import java.util.Scanner;

public class SttringReverse {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String s=sc.nextLine();
        String p=stringreverse(s);
        System.out.println(p);
       boolean result= palindrome(s,p);   
       System.out.println(result);   
       sc.close(); 
    }

    private static boolean palindrome(String s, String p) {
        // TODO Auto-generated method stub
        
        //throw new UnsupportedOperationException("Unimplemented method 'palindrome'");
        if(s.equals(p))
        {
            return true;
        }
        return false;
    }

    private static String stringreverse(String s) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'stringreverse'");
        String rev="";
        for(int i=s.length()-1;i>=0;i--)
        {
            rev=rev+s.charAt(i);
        }
        return rev;
    }
    
}
