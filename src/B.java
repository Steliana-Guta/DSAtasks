
class B { // Subset Sum problem - Task A point b)
    static long initialTime;
    static long lastTime;
    static double time;
    private static int isSubsetSum(int[] array , int n , int sum) {
        if (sum == 0 || n == 0) {return 0;} // Cases where sum = 0 or array has 0 elements
        else if(array[n-1] > sum)
        {return isSubsetSum(array, n-1, sum);} //If last elements is bigger than sum ignore
        else {return Math.max(array[n-1] + isSubsetSum(array , n-1 , sum - array[n-1]) , isSubsetSum(array, n-1, sum));}}
    public static void main(String[] args) {
        int[] subset = { 2, 5, 8, 12, 16,45,78,98,52 };
        int sum = 21;
        System.out.println("\nSum: " + sum ); // Display sum
        System.out.println("Array size: " + subset.length ); // Display array length
        initialTime = System.currentTimeMillis(); //Start timer
        int result = isSubsetSum(subset, subset.length, sum); // Start function, iterate through all possibilities
        lastTime = System.currentTimeMillis(); // Stop timer once function is run
        time = (double) (lastTime - initialTime) / 1000; // Convert time
        System.out.println("\n\nResults \t" + "\nValue OR Smallest available difference = " + result + "\t\t\t" + "Time = " + time);
        // Print results of either value or smallest available difference plus time recorded
    }
}