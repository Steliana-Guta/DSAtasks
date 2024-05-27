
public class A { // Subset Sum problem - Task A point a)
    private static boolean isSubsetSum(int[] array , int n , int sum) {
        if (sum == 0) {return true;} // If sum = 0 return true
        if (n == 0) {return false;} // If number of array elements = 0 return false
        else if(array[n-1] > sum) {return isSubsetSum(array, n-1, sum);} //If last elements is bigger than sum ignore
        else {return isSubsetSum(array, n - 1, sum) || isSubsetSum(array, n - 1, sum - array[n - 1]);}
    }
    public static void main(String[] args) // Main function
    {   int[] subset = { 2, 5, 8, 12, 16,45,78,98,52 };
        int sum = 10;
        if (isSubsetSum(subset, subset.length, sum))
        {System.out.println("TRUE");}
        else {System.out.println("FALSE");}
    }
}