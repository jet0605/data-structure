import java.util.Scanner;

public class Fruit {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int []fruit = new int[n];
        for(int i = 0; i < n; i++){
            fruit[i] = input.nextInt();
        }
        int m = input.nextInt();
        int [] questions = new int[m];
        for(int i = 0; i < m; i++){
            questions[i] = input.nextInt();
        }
        int []sum = new int[n];
        int count = 0;
        for(int i = 0; i < n ; i++){
            count += fruit[i];
            sum[i] = count;
        }
        for(int j = 0; j < m; j++){
            System.out.println(find(sum,questions[j])+1);
        }
    }

    public static int find(int[] sum,int k){
        int mid = sum.length / 2;
        if(sum[mid] == k)
            return mid;
        int start = 0;
        int end = sum.length -1;
        while(start <= end){
            mid = (end - start) / 2 + start;
            if(sum[mid] == k){
                return mid;
            }else if(sum[mid] > k){
                end = mid - 1;
            }else if(sum[mid] < k){
                start = mid + 1;
            }
        }
        return start;
    }
}
