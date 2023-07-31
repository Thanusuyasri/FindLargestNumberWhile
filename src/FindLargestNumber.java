import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();
        int num = scanner.nextInt();
        int length = str.length();
        int i=0,n=0;
        while(i<length-1)
        {
            char ch = str.charAt(i);
            char sch = str.charAt(i+1);
            if(ch<sch)
            {
                str = str.substring(0,i)+str.substring(i+1,length);
                n++;
            }
            else
            {
                i++;
            }
            if(n==num){
                break;
            }
            length = str.length();
            if(i==length-1 && n!=num)
            {
                i=0;
            }
        }
        System.out.println(str);
    }
}
