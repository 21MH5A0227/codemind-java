import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int d = 0;
        if(a == 1)
            a = 2;
        for(int i=a; i<=b; i++)
        {
            int c = 0;
            for(int j=2; j<=(int)Math.sqrt(i); j++)
            {
                if(i % j == 0)
                    c = 1;
            }
            if(c == 0)
                d++;
        }
        System.out.println(d);
        sc.close();
    }
}