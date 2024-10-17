import java.util.Scanner;

/**
 * ReplacedCharcter
 */
public class ReplacedCharcter {

    public static void main(String[] args) {
        

        Scanner ref=new Scanner(System.in);
        System.out.println("enter the string based on your wish");
        String s=ref.nextLine();
        char ch[] =s.toCharArray();
        for(int g=0;g<ch.length;g++)
        {
            if(ch[g]=='a'||ch[g]=='s')
            {
                 ch[g]='@';
            }
        }
        System.out.println(ch);
    ref.close();
    
    }

    
}