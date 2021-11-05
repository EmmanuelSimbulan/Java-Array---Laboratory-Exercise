// Name: Simbulan, Emmanuel R.
// Section: BSCS 2-4

/* Give an array named n with values 32, 2, 70, 4, 52,
    42, 8, 35, 9, 211,
    Write a program that will Separate all odd from
    even numbers */

public class array_a {
    public static void main(String[] args) {
        
        // array that is named n; the array has 10 values.
        int[] n = new int[] {33, 2, 70, 4, 52, 42, 8, 35, 9, 211};

        // Displaying the original values of an array n.
        System.out.print("Original Array: ");
        for(int i = 0; i < n.length; i++){
            System.out.print(n[i] + " ");
        }   
        
        System.out.println("\n");

        // Displaying the Odd Numbers/Values in n Array
        System.out.print("The Odd Numbers are: ");
        for (int i = 0; i < 9; i++){
            if (n[i] % 2 == 1){
               System.out.print(n[i] + " ");
            }
        }  
        
        System.out.println("\n");

        // Displaying the Even Numbers/Values in n Array
        System.out.print("The Even Numbers are: ");
        for (int i = 0; i < 9; i++){
            if (n[i] % 2 == 0){
               System.out.print(n[i] + " ");
            }
        }



    }
}
