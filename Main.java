    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int k = input.nextInt();
            int a = input.nextInt();
            int a_length = input.nextInt();
            int b = input.nextInt();
            int b_length = input.nextInt();
            System.out.println(a_length * b_length % 1000000007);
        }
    }
