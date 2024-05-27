
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
public class C{
    static long initialTime; // Time when timer starts
    static long lastTime; // Time when timer stops
    static double time; // Displayed time
    static int topSum = 0; // Counter for set5 sum
    static Map<String, Integer> lookup = new HashMap<>();
    public static void main(String[] args) { //5 sets or arrays
        int[] set = {2, 45, 8, 95, 54};
        int[] set2 = {3, 74, 14, 12, 367, 45,  595, 52, 91, 85};
        int[] set3 = {1, 93, 5, 10, 515, 40, 4, 50, 68, 43, 28, 356, 24, 123, 82, 456, 58, 71, 6, 311};
        int[] set4 = {111, 76, 123, 456, 76, 98, 480, 16, 34, 526, 43, 1, 10, 13, 11, 45, 23, 15, 7, 56, 734, 26, 87,
                98, 12, 237, 5, 10, 515, 640,};
        int[] set5 = new int[3000];
        for(int i=0; i<set5.length-1; i++){ //generating random ints for the 5th array
            Random rand = new Random();
            set5[i] = rand.nextInt(101);
            topSum += set5[i]; // Counting sum of all elements as they get created
        }
        int sum = 100000; // Aimed sum
        System.out.println("\nSum: " +sum + "\n");  // Display aimed sum
        System.out.println("Array size " + set.length + " : "); // Display array size

        initialTime= System.currentTimeMillis(); // Counter start
        int result = bruteForceOptimised(set, set.length, sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Optimised: \t" + "Value = " + result + "\t" + "Time = " + time );  // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = dynamic(set, set.length,sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Dynamic: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = memoized(set, set.length-1, sum , lookup); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Memorized: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        System.out.println("\n--------------------------------\n"); // Separating iterations
        System.out.println("\nSum: " +sum + "\n");  // Display aimed sum
        System.out.println("Array size " + set2.length + " : "); // Display array size

        initialTime= System.currentTimeMillis(); // Counter start
        result = bruteForceOptimised(set2, set2.length, sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Optimised: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = dynamic(set2, set2.length,sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Dynamic: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = memoized(set2, set2.length-1, sum , lookup); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Memorized: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        System.out.println("\n--------------------------------\n"); // Separating iterations
        System.out.println("\nSum: " +sum + "\n");  // Display aimed sum
        System.out.println("Array size " + set3.length + " : "); // Display array size

        initialTime= System.currentTimeMillis(); // Counter start
        result = bruteForceOptimised(set3, set3.length, sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Optimised: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = dynamic(set3, set3.length,sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Dynamic: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = memoized(set3, set3.length-1, sum , lookup); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Memorized: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        System.out.println("\n--------------------------------\n"); // Separating iterations
        System.out.println("\nSum: " +sum + "\n");  // Display aimed sum
        System.out.println("Array size " + set4.length + " : "); // Display array size

        initialTime= System.currentTimeMillis(); // Counter start
        result = bruteForceOptimised(set4, set4.length, sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Optimised: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = dynamic(set4, set4.length,sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Dynamic: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = memoized(set4, set4.length-1, sum , lookup); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Memorized: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        System.out.println("\n--------------------------------\n"); // Separating iterations
        System.out.println("\nSum: " +sum + "\n");  // Display aimed sum
        System.out.println("Array size " + set5.length + " : "); // Display array size

        initialTime= System.currentTimeMillis(); // Counter start
        result = dynamic(set5, set5.length,sum); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Dynamic: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

        initialTime= System.currentTimeMillis(); // Counter start
        result = memoized(set5, set5.length-1, sum , lookup); // Run function
        lastTime = System.currentTimeMillis(); // Counter stop
        time = (double)(lastTime - initialTime)/1000; // Convert time
        System.out.println("Memorized: \t" + "Value = " + result + "\t" + "Time = " + time ); // Display result

    }
    private static int bruteForceOptimised(int[] array , int n , int sum) {
        if (sum == 0 || n == 0) {return 0;} // Cases where sum = 0 or array has 0 elements
        else if(array[n-1] > sum)
        {return bruteForceOptimised(array, n-1, sum);} //If last elements is bigger than sum ignore
        else {return Math.max(array[n-1] + bruteForceOptimised(array , n-1 , sum - array[n-1]) ,
                bruteForceOptimised(array, n-1, sum));}
    }
    private static int dynamic(int[] array , int n , int sum) {
        if (n < 0 || sum < 0) {return 0;} // Cases where sum = 0 or array has 0 elements
        int[][] subset = new int[sum+1][n+1];
        for (int i = 1; i <= sum; i++) { // Fll the subset table in bottom up system
            for (int j = 1; j <= n; j++) {
                if (array[j-1] <= i )
                {subset[i][j] =  Math.max(array[j-1] + subset[i-array[j-1]][j-1] , subset[i][j-1] );}
                else {subset[i][j] = subset[i][j-1];}
            }
        }return subset[sum][n];
    }
    private static int memoized(int[] array , int n , int sum , Map<String, Integer> map) {
        if (n == 0 || sum == 0) {return 0;} // Cases where sum = 0 or array has 0 elements
        String key = n + "|" + sum;
        if(map.containsKey(key)) {return map.get(key);}
        if (!map.containsKey(key)){
            if(array[n] > sum) { int exclude = memoized(array, n - 1, sum, map);
                map.put(key, exclude);
                return exclude;}
            else { int include = Math.max(array[n] + memoized(array, n - 1, sum - array[n], map),
                    memoized(array, n - 1, sum - array[n], map));
                map.put(key, include);
                return include;}
        }return map.get(key);
    }
}




