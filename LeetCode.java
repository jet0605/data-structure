import java.util.HashMap;
import java.util.*;

public class LeetCode {
    /**
     * 题目描述：
     * 给定两个整数n和k，从1中返回k个数字的所有可能组合。n。
     *
     * 例如,
     *
     * 如果n = 4 k = 2，解为:
     *
     * (
     *
     * (2、4),
     *
     * (3、4),
     *
     * (2、3),
     *
     * (1、2),
     *
     * (1、3)
     *
     * (1、4)
     *
     * ]
     * 方法：回朔法
     */
    static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
    public static ArrayList<ArrayList<Integer>> combine(int n, int k) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        backtracking(n,k,1,list);
        return result;
    }
    public static void backtracking(int n,int k ,int start, ArrayList<Integer> list){
        if(k < 0)
            return;
        else if(k == 0){
            result.add(new ArrayList(list));
        }else{
            for(int i = start; i <= n; i++){
                list.add(i);
                backtracking(n,k-1,i+1,list);
                list.remove(list.size() - 1);
            }
        }
    }
    public static void main(String[] args){
        ArrayList<ArrayList<Integer>> demo = combine(2,1);
        for(int i = 0;i < demo.size(); i++){
            System.out.println(demo.get(i).toString());
        }
    }


}
