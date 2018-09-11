package HeapSort;

public class HeapSort {
    public static void heapsort(int [] arr){
        int len = arr.length - 1;
        for(int i = (arr.length-2)/2; i >= 0 ; i--){
            heapAdjust(arr,i,len);
        }
        while(len >= 0){
            swap(arr,0,len--);
            heapAdjust(arr,0,len);
        }
    }

    public static void heapAdjust(int [] arr,int i,int len){
        int left,right,j;
        while((left = 2*i+1) <= len){
            right = left + 1;
            j = left;
            if(right <= len){
                if(arr[left] < arr[right]){
                    j++;
                }
            }
            if(arr[i] < arr[j]){
                swap(arr,i,j);
            }else{
                break;
            }
             i = j;
        }
    }

    public static void swap(int [] arr,int i,int len){
        int temp = arr[i];
        arr[i] = arr[len];
        arr[len] = temp;
    }

    public static void main(String[] args){
        int [] array = {20,50,20,40,70,10,80,30,60};
        System.out.println("排序之前");
        for(int num : array){
            System.out.print(num+" ");
        }
        System.out.println("");
        heapsort(array);
        System.out.println("排序之后");
        for(int num : array){
            System.out.print(num+" ");
        }
    }

}
