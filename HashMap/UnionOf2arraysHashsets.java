//Union of 2 arrays
//putting all the elements in hashsets(contains unique values only)and printing them.
class Test {
    // Prints union of arr1 and arr2
    static void printUnion(int arr1[], int arr2[])
    {
        HashSet<Integer> hs = new HashSet<>();
 
        for (int i = 0; i < arr1.length; i++)
            hs.add(arr1[i]);
        for (int i = 0; i < arr2.length; i++)
            hs.add(arr2[i]);
        System.out.println(hs);
    }