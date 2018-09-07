import java.util.Scanner;

public class expression {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        System.out.print(max2(a,b,c));
    }

    public static int max1(int a,int b){
        return Math.max(a+b,a*b);
    }

    public static int max2(int a, int b,int c){
        return Math.max(max1(max1(a,b),c),max1(a,max1(b,c)));
    }
}
