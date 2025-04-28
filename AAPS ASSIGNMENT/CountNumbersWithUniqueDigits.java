/*
20. Count all numbers with unique digits for a given number of digits.
    Write its algorithm, program. Find its time and space complexities. Explain with suitable example.
*/

public class CountNumbersWithUniqueDigits {
    public static int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;
        int res = 10, uniqueDigits = 9, availableNumber = 9;
        
        while (n-- > 1 && availableNumber > 0) {
            uniqueDigits = uniqueDigits * availableNumber;
            res += uniqueDigits;
            availableNumber--;
        }
        
        return res;
    }

    public static void main(String[] args) {
        int n = 2;
        System.out.println("Count of numbers with unique digits: " + countNumbersWithUniqueDigits(n));
    }
}

/*
Time Complexity: O(n)
Space Complexity: O(1)

Example:
Input: 2
Output: 91
(10 for 1-digit, 81 for 2-digit unique numbers)
*/
