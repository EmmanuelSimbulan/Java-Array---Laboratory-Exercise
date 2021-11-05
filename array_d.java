// Name: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* Give an array named n with values 32, 2, 70, 4, 52,
    42, 8, 35, 9, 211,
    Write a program that will Sort the numbers in 
    ascending order */

    import java.util.Arrays; // package that will use to sort an array

    public class array_d {
    
        public static void main(String[] args) {
            
            // array that is named n; the array has 10 values.
            int[] n = new int[] {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};
    
            // Displaying the original values of an array n.
            System.out.println("Original Array: ");
            for(int i = 0; i < n.length; i++){
                System.out.print(n[i] + " ");
            }   
            
            System.out.println("\n");

            // Commands to sort the Array n
            Arrays.sort(n);
            System.out.println("Elements of Array n, sorted in Ascending Order: ");

            // Displaying the sorted Array n in Ascending Order
            for(int i = 0; i < n.length; i++){
                System.out.print(n[i] + " ");
            }   



        }
    }