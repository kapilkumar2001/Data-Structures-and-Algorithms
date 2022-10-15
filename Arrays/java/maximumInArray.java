public class    maximumInArray {
    public static void main(String[] args) {
        int[] arr={4, 9584,43,56,87,876,767,5544,232};
        System.out.println(search(arr));
    }

    private static int search(int[] arr) {
        int element =arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(element<arr[i])
                element=arr[i];
        }
   return element; 
   }
}
