package group03;



public class IS{
    public static void main(String args[]){
        /* unsorted array input */
        int[] input_array = { 5, 8, 7, 0, 3, 9, 20, 15, 1, 4, 2};
        
        InsertionSort(input_array);
        


    }
    public static void InsertionSort(int array[]) {

            // The first element in the array is assumed to be sorted. so begin with the second element.
            for(var i = 1; i < array.length; i++){
    
                // we store the current item in a variable
                var checking_value = array[i];
    
                /* if the previous sorted items are greater than the checking value,
                they should be shifted to the right */
                var hole_position = i - 1;
                while(hole_position >= 0 && array[hole_position] > checking_value){
                    array[hole_position + 1] = array[hole_position];
                    hole_position--;
                }
                // after that loop, checking value can be stored at index "hole_position +1"
                array[hole_position + 1] = checking_value;
            }
        System.out.print(array);  
    }


}
