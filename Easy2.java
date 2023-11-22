public class Easy2 {
    static int findPair(int[] arr, int k){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] + arr[j] == k){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 1};
        int num = 2;
        int ans = findPair(arr, num);
        System.out.println(ans);
    }
}
