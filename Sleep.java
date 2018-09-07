import java.util.Scanner;

public class Sleep {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int k = input.nextInt();
        int [] interest = new int[n];
        int [] awake = new int[n];
        for(int i = 0; i < n; i++){
            interest[i] = input.nextInt();
        }
        for(int i = 0; i < n; i++){
            awake[i] = input.nextInt();
        }
        int count = 0;
        int sum = 0;
        int sum2 = 0;
        for(int i = 0; i  < n; i++){
            if(awake[i] == 1){
                sum += interest[i];
            }
        }
        if(k != 0){
            for(int i = 0; i  < n - k + 1; i++){
                count = 0;
                if(awake[i] == 0){
                    for(int j = i; j <= i + k-1; j++) {
                        if (awake[j] == 0) {
                            count += interest[j];
                        }
                    }
                    //System.out.println("count: " + count);
                    count = sum + count;
                }
                if(sum2 <= count){
                    sum2 = count;
                }
            }
            count = 0;
            for(int j = n - k + 1; j < n; j++){
                if(awake[j] == 0){
                    count += interest[j];
                }
            }
            count += sum;
            if(count >= sum2){
                sum2 = count;
            }
        }
        if(k == 0){
            sum2 = sum;
        }
        System.out.println(sum2);
    }
}
