public class driver{
    public static void main(String [] args){
        solution sol = new solution();
        int [] arr1 = {3};
        int [] arr2 = {1,9};
        int [] arr3 = {8,1};
        int [] arr4 = {7,1,5,3,6,4};
        int [] arr5 = {6,1,1,23,4,54,33,4,1,9,2,3,4,5,9,6,4,5,3,100};

        Test("Max profit for arr1 is " + sol.maxProfit(arr1), sol.maxProfit(arr1) == 0);
        Test("Max profit for arr2 is " + sol.maxProfit(arr2), sol.maxProfit(arr2) == 8);
        Test("Max profit for arr3 is " + sol.maxProfit(arr3), sol.maxProfit(arr3) == 0);
        Test("Max profit for arr4 is " + sol.maxProfit(arr4), sol.maxProfit(arr4) == 5);
        Test("Max profit for arr5 is " + sol.maxProfit(arr5), sol.maxProfit(arr5) == 99);

    }

    //For testing
    public static void Test(String testDescription, boolean testPasses) {
		if (testPasses)
			System.out.println("Test PASSED: " + testDescription);
		else
			System.out.println("Test FAILED: " + testDescription);
	}
}
