public class Easy1{
    static void Reverse(int[] arr){
        for(int i = arr.length - 1; i >= 0; i--){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        Reverse(arr);
    }
}