// Name: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* Give an array named n with values 33, 2, 70, 4, 52,
    42, 8, 35, 9, 211,
    Write a program that will Sort the numbers in 
    ascending order */

    public class array_d2 {
    
        public static void main(String[] args) {
            
            // array that is named n; the array has 10 values.
            int[] n = new int[] {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};
    
            // Displaying the original values of an array n.
            System.out.println("Original Array: ");
            for(int i = 0; i < n.length; i++){
                System.out.print(n[i] + " ");
            }   
            
            System.out.println("\n");

            int temp = 0; // temporary variable

            // solution on how to sort the array n in ascending order,
            // without the use of array.sort(n);
            for (int i = 0; i < n.length; i++){
                for (int j = i + 1; j < n.length; j++){
                    if (n[i] > n[j]){
                        temp = n[i];
                        n[i] = n[j];
                        n[j] = temp;
                    }
                }
            }

            // Displaying the sorted Array n in Ascending Order
            System.out.println("Elements of Array n, sorted in Ascending Order: ");
            for (int i = 0; i < n.length; i++){
                System.out.print(n[i] + " ");
            }

        }
    }