
import java.util.Arrays;
import java.util.HashMap;

class ArraySort{
    public static void main(String[] args) {
        Integer[] arr = {5,2,4,4,9,2,2};
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        System.out.println();
        arraySort(arr);
        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }

    }
    public static void arraySort(Integer[] nums){
        HashMap<Integer,Integer> frequencyMap = new HashMap<>();
        for (Integer integer : nums) {
            frequencyMap.put(integer, frequencyMap.getOrDefault(integer, 0)+1);
        }
        Arrays.sort(nums, (a,b) -> {
            if(frequencyMap.get(a)<frequencyMap.get(b)) return -1;
            else if(frequencyMap.get(a)==frequencyMap.get(b)) return  a<b?1:-1;
            return 0;
        });
    }
}