public class AK_04_PassByValues {
    public static void main(String[] args) {
        // Demonstrating pass by value with a primitive type means pass by value
        int x = 5;
        myFunc(x);
        System.out.println("Value of x in main: " + x);

        // Demonstrating pass by reference with an array
        int[] arr = {10};
        myFunc(arr);
        System.out.println("Value of arr[0] in main: " + arr[0]);

        int[] arr1 = {2};
        int[] arr2 = {8};
        System.out.println(mulFumc(arr1, arr2));
    }
    
    // pass by value -- a copy of the value is passed
    // to the function, so changes made inside the function do not affect the original variable
    public static void myFunc(int x) {
        x++;
        System.out.println("Value of x inside myFunc: " + x);
    }

    // pass by reference -- a reference to the original variable is passed
    // to the function, so changes made inside the function affect the original variable
    public static void myFunc(int[] arr) {
        arr[0]++;
        System.out.println("Value of arr[0] inside myFunc: " + arr[0]);
    }

    public static int mulFumc(int[] arr1, int[] arr2) {
        return arr1[0]*arr2[0];
    }

} 
