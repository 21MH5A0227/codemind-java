import java.util.Scanner;
class L{
    public static int pal(int n){
        int t,d,r=0;
        t=n;
        while(n!=0){
            d=n%10;
            n=n/10;
            r=(r*10)+d;
    }
    if(t==r)
    return 1;
    else
    return 0;
}
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int c=0;
    int[] l=new int[n];
    for(int i=0;i<n;i++){
        l[i]=s.nextInt();
    }
    for(int i=0;i<n;i++){
        if(pal(l[i])==1)
        c+=1;
    }
    System.out.println(c);
}
}