import java.util.*;

public class checkRepeat {

    // public static boolean checkRepeat(int arr[]){
    // for(int i=0;i<arr.length;i++){
    // for(int j=0;j<arr.length;j++){
    // if(arr[i] == arr[j] && i!=j) return true;
    // }
    // }
    // return false;
    // }

    public static boolean checkRepeat(int arr[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            if (map.containsKey(ele)) {
                int initialValue = map.get(ele);
                map.put(ele, initialValue + 1);
            } else {
                map.put(ele, 1);
            }
        }
        for (Map.Entry<Integer, Integer> ele : map.entrySet()) {
            if (ele.getValue() > 1)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 4, 2 };
        if (checkRepeat(nums))
            System.out.print("Yes");
        else
            System.out.print("No");
    }
}