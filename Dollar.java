import java.util.Scanner;

public class Dollar {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a = input.nextInt();
        double[][] f = new double[102][2];
        f[1][0] = 100.0;
        f[1][1] = a;
        for(int i = 2; i <= n; i++){
            a = input.nextInt();
            f[i][0] = Math.max(f[i-1][0],f[i-1][1]/(double)a*100);
            f[i][1] = Math.max(f[i-1][1],f[i-1][0]*(double)a/100);
        }
        System.out.print(f[n][0]);
    }

}
