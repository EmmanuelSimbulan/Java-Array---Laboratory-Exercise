// Name: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* Give an array named n with values 32, 2, 70, 4, 52,
    42, 8, 35, 9, 211,
    Write a program that will Display the lowest
    number (without sorting) */

    public class array_c {
    
        public static void main(String[] args) {
            
            // array that is named n; the array has 10 values.
            int[] n = new int[] {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};
    
            // Displaying the original values of an array n.
            System.out.print("Original Array: ");
            for(int i = 0; i < n.length; i++){
                System.out.print(n[i] + " ");
            }   
            
            System.out.println("\n");
    
            // Solution on how to get the lowest number in an Array (without sorting)
           int low = n[0];
    
           for(int i = 0; i < n.length; i++){
               if (n[i] < low){
                   low = n[i];
               }
           }
           
           // Displaying the Lowest Number in an Array n.
           System.out.println("The Lowest Number in Array n is: " + low);
    
        }
    }
    
