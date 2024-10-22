import java.util.HashSet;
import java.util.Scanner;

public class Array68 {
    public static void main(String[] args) {
        Scanner si=new Scanner(System.in);
        System.out.println("enter the string based on your wish");
        String s=si.nextLine();
        boolean result =uniqueCharcters(s);
        System.out.println(result);
        si.close();
    }

    private static boolean uniqueCharcters(String s) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'uniqueCharcters'");
        HashSet<Character> char_set=new HashSet<>();
        for(int c=0;c<s.length();c++)
        {
            char_set .add(s.charAt(c));
        }
        return char_set.size()==s.length();

    }
    
}
