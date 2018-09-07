public class Solution {
    public boolean Find(int target, int [][] array){
       int row = array.length;
       int col = array[0].length;
       int i = 0;
       int j = 0;
       for(i = row - 1,j = 0;i >=0 && j < col;){
            if(array[i][j] == target){
                return true;
            }
            if(array[i][j] < target){
                j++;
                continue;
            }
            if(array[i][j] > target){
                i--;
                continue;
            }
       }
        return false;
    }

    public static void main(String[] args){

    }
}
