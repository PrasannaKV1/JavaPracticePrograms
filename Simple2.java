import java.util.Scanner;

public class Simple2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String sone =sc.nextLine();
        int CapCount=0;
        int smallcount=0;
        for(int i=0;i<sone.length();i++)
        {
            if(sone.charAt(i)>='A'&& sone.charAt(i)<='Z')
            {
                CapCount++;
            }
            else if(sone.charAt(i)>='a'&&sone.charAt(i)<='z')
            {
                smallcount++;
            }
        }

        System.out.println("Number of capital letters are"+CapCount);
        System.out.println("Number of small letter are"+smallcount);


     sc.close();

    }
    
}
