package newTest;


import java.util.Scanner;


public class Main3 {
    static int target=0;
    static double sum=0;
    static double P=0;
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int p=scanner.nextInt();
        int q=scanner.nextInt();
        int n=scanner.nextInt();
        target=n;
        P=p;
        System.out.println(dfs(p,q,0,0));
    }

    public static double dfs(int p,int q,int n,int depth){
        if(n==target) return depth;
        if(p>=100) return dfs((int)(P/Math.pow(2,n+1)),q,n+1,depth+1);
        double left=0;
        double right=0;
        left=p/100.0*dfs((int)(P/Math.pow(2,n+1)),q,n+1,depth+1);
        right=(100-p)/100.0*dfs(p+q,q,n,depth+1);
//        if(p+q>=1) right=(1-p)*dfs(Math.floor(p/2),q,n+1,depth+1);
//        else right=(1-p)*dfs(Math.floor(p+q),q,n,depth+1);

        return left+right;
    }
}