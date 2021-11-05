// Name: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* Give an array named n with values 32, 2, 70, 4, 52,
    42, 8, 35, 9, 211,
    Write a program that will Display the highest
    number (without sorting) */

public class array_b {
    
    public static void main(String[] args) {
        
        // array that is named n; the array has 10 values.
        int[] n = new int[] {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};

        // Displaying the original values of an array n.
        System.out.print("Original Array: ");
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }   
        
        System.out.println("\n");

        // Solution on how to get the highest number in an Array (without sorting)
       int high = n[0];

       for(int i = 0; i < n.length; i++){
           if (n[i] > high){
               high = n[i];
           }
       }

       // Displaying the Highest Number in an Array n.
       System.out.println("The Highest Number in Array n is: " + high);

    }
}
