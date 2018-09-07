import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Block {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        int [] blocks = new int[m];
        for(int i = 0; i < m; i++){
            blocks[i] = input.nextInt();
        }
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i = 1; i <= n; i++){
            map.put(i,0);
        }
        for(int i = 0; i < m; i++){
            if(map.containsKey(blocks[i])){
                int num = map.get(blocks[i]);
                map.put(blocks[i],num+1);
            }
        }
        int count = 0;
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
            if(entry.getKey() == 1){
                count = entry.getValue();
            }
            if(entry.getValue() <= count){
                count = entry.getValue();
            }
            if(entry.getValue() == 0){
                count = 0;
                break;
            }
        }
        System.out.println(count);
    }
}
