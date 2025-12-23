/**
 * Comprehensive Java Interview Solutions
 * 
 * This file contains implementations for the top 40 Java logical coding interview questions
 * commonly asked in service-based companies in India.
 * 
 * Each solution is implemented as a separate class, and the Main class provides
 * a menu-driven interface to execute any solution.
 */

import java.util.*;

public class JavaInterviewSolutions {
    public static void main(String[] args) {
        System.out.println("Java Interview Coding Solutions");
        System.out.println("==============================\n");
        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        
        while (!exit) {
            printMenu();
            System.out.print("\nEnter your choice (1-40, 0 to exit): ");
            
            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                
                if (choice == 0) {
                    exit = true;
                    System.out.println("Exiting program. Goodbye!");
                    continue;
                }
                
                if (choice < 0 || choice > 40) {
                    System.out.println("Invalid choice. Please try again.");
                    continue;
                }
                
                executeChoice(choice, scanner);
                
                System.out.print("\nPress Enter to continue...");
                scanner.nextLine();
                System.out.println("\n");
                
            } catch (InputMismatchException e) {
                System.out.println("Please enter a valid number.");
                scanner.nextLine(); // Clear invalid input
            }
        }
        
        scanner.close();
    }
    
    private static void printMenu() {
        System.out.println("Available Solutions:");
        System.out.println("-------------------");
        System.out.println("ARRAYS:");
        System.out.println("1.  Find missing number in array");
        System.out.println("2.  Find duplicate numbers in array");
        System.out.println("3.  Find largest and smallest number in array");
        System.out.println("4.  Find pairs with given sum");
        System.out.println("5.  Remove duplicates from sorted array");
        System.out.println("6.  Sort array of 0s, 1s, and 2s");
        System.out.println("7.  Find second highest number in array");
        System.out.println("8.  Find maximum sum subarray (Kadane's Algorithm)");
        System.out.println("9.  Find subarray with given sum");
        System.out.println("10. Find majority element");
        System.out.println("11. Search in rotated sorted array");
        System.out.println("12. Find Kth smallest element");
        
        System.out.println("\nSTRINGS:");
        System.out.println("13. Reverse a string without built-in functions");
        System.out.println("14. Check if string is palindrome");
        System.out.println("15. Find duplicate characters in string");
        System.out.println("16. Check if two strings are anagrams");
        System.out.println("17. Count occurrences of each character");
        System.out.println("18. Remove all whitespaces from string");
        System.out.println("19. Reverse words in a sentence");
        System.out.println("20. Find first non-repeated character");
        System.out.println("21. Find longest substring without repeating characters");
        
        System.out.println("\nLINKED LISTS:");
        System.out.println("22. Find middle element of linked list");
        System.out.println("23. Reverse a linked list");
        System.out.println("24. Detect cycle in linked list");
        System.out.println("25. Merge two sorted linked lists");
        
        System.out.println("\nBASIC LOGIC & NUMBERS:");
        System.out.println("26. Check if number is prime");
        System.out.println("27. Generate Fibonacci series");
        System.out.println("28. Calculate factorial");
        System.out.println("29. Check if number is Armstrong number");
        System.out.println("30. Check if number is palindrome");
        System.out.println("31. Swap two numbers without temp variable");
        
        System.out.println("\nSEARCHING & SORTING:");
        System.out.println("32. Implement Binary Search");
        System.out.println("33. Implement Bubble Sort");
        
        System.out.println("\nSTACKS & QUEUES:");
        System.out.println("34. Implement Stack using array");
        System.out.println("35. Implement Queue using array");
        System.out.println("36. Check balanced parentheses");
        
        System.out.println("\nTREES:");
        System.out.println("37. Binary Tree Traversals");
        System.out.println("38. Find height of Binary Tree");
        System.out.println("39. Level Order Traversal");
        System.out.println("40. Check if Binary Tree is BST");
    }
    
    private static void executeChoice(int choice, Scanner scanner) {
        System.out.println("\n");
        
        switch (choice) {
            case 1:
                MissingNumber.execute(scanner);
                break;
            case 2:
                DuplicateNumbers.execute(scanner);
                break;
            case 3:
                LargestSmallestNumber.execute(scanner);
                break;
            case 4:
                PairsWithSum.execute(scanner);
                break;
            case 5:
                RemoveDuplicates.execute(scanner);
                break;
            case 6:
                SortZerosOnesTwos.execute(scanner);
                break;
            case 7:
                SecondHighestNumber.execute(scanner);
                break;
            case 8:
                MaximumSumSubarray.execute(scanner);
                break;
            case 9:
                SubarrayWithGivenSum.execute(scanner);
                break;
            case 10:
                MajorityElement.execute(scanner);
                break;
            case 11:
                SearchRotatedArray.execute(scanner);
                break;
            case 12:
                KthSmallestElement.execute(scanner);
                break;
            case 13:
                ReverseString.execute(scanner);
                break;
            case 14:
                PalindromeString.execute(scanner);
                break;
            case 15:
                DuplicateCharacters.execute(scanner);
                break;
            case 16:
                Anagrams.execute(scanner);
                break;
            case 17:
                CharacterCount.execute(scanner);
                break;
            case 18:
                RemoveWhitespace.execute(scanner);
                break;
            case 19:
                ReverseWords.execute(scanner);
                break;
            case 20:
                FirstNonRepeatedChar.execute(scanner);
                break;
            case 21:
                LongestSubstringWithoutRepeating.execute(scanner);
                break;
            case 22:
                MiddleOfLinkedList.execute(scanner);
                break;
            case 23:
                ReverseLinkedList.execute(scanner);
                break;
            case 24:
                DetectCycle.execute(scanner);
                break;
            case 25:
                MergeSortedLists.execute(scanner);
                break;
            case 26:
                PrimeNumber.execute(scanner);
                break;
            case 27:
                FibonacciSeries.execute(scanner);
                break;
            case 28:
                Factorial.execute(scanner);
                break;
            case 29:
                ArmstrongNumber.execute(scanner);
                break;
            case 30:
                PalindromeNumber.execute(scanner);
                break;
            case 31:
                SwapWithoutTemp.execute(scanner);
                break;
            case 32:
                BinarySearch.execute(scanner);
                break;
            case 33:
                BubbleSort.execute(scanner);
                break;
            case 34:
                StackImplementation.execute(scanner);
                break;
            case 35:
                QueueImplementation.execute(scanner);
                break;
            case 36:
                BalancedParentheses.execute(scanner);
                break;
            case 37:
                BinaryTreeTraversals.execute(scanner);
                break;
            case 38:
                BinaryTreeHeight.execute(scanner);
                break;
            case 39:
                LevelOrderTraversal.execute(scanner);
                break;
            case 40:
                ValidBST.execute(scanner);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}

// 1. Find missing number in array
class MissingNumber {
    public static void execute(Scanner scanner) {
        System.out.println("FIND MISSING NUMBER IN ARRAY");
        System.out.println("---------------------------");
        
        System.out.print("Enter array size (N-1 elements for range 1 to N): ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (numbers from 1 to " + (size+1) + " with one missing):");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = findMissingNumber(arr, size);
        System.out.println("Missing number: " + result);
    }
    
    private static int findMissingNumber(int[] arr, int n) {
        // Sum of first n+1 natural numbers
        int totalSum = ((n + 1) * (n + 2)) / 2;
        
        // Sum of array elements
        int arraySum = 0;
        for (int num : arr) {
            arraySum += num;
        }
        
        // Missing number is the difference
        return totalSum - arraySum;
    }
}

// 2. Find duplicate numbers in array
class DuplicateNumbers {
    public static void execute(Scanner scanner) {
        System.out.println("FIND DUPLICATE NUMBERS IN ARRAY");
        System.out.println("------------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        findDuplicates(arr);
    }
    
    private static void findDuplicates(int[] arr) {
        Map<Integer, Integer> countMap = new HashMap<>();
        boolean foundDuplicate = false;
        
        // Count occurrences of each element
        for (int num : arr) {
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }
        
        System.out.println("Duplicate elements:");
        
        // Print elements with count > 1
        for (Map.Entry<Integer, Integer> entry : countMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " (appears " + entry.getValue() + " times)");
                foundDuplicate = true;
            }
        }
        
        if (!foundDuplicate) {
            System.out.println("No duplicates found");
        }
    }
}

// 3. Find largest and smallest number in array
class LargestSmallestNumber {
    public static void execute(Scanner scanner) {
        System.out.println("FIND LARGEST AND SMALLEST NUMBER IN ARRAY");
        System.out.println("---------------------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        findLargestAndSmallest(arr);
    }
    
    private static void findLargestAndSmallest(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        
        int largest = arr[0];
        int smallest = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }
        
        System.out.println("Largest number: " + largest);
        System.out.println("Smallest number: " + smallest);
    }
}

// 4. Find pairs with given sum
class PairsWithSum {
    public static void execute(Scanner scanner) {
        System.out.println("FIND PAIRS WITH GIVEN SUM");
        System.out.println("------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int targetSum = scanner.nextInt();
        
        findPairsWithSum(arr, targetSum);
    }
    
    private static void findPairsWithSum(int[] arr, int targetSum) {
        Map<Integer, Integer> numMap = new HashMap<>();
        boolean foundPair = false;
        
        System.out.println("Pairs with sum " + targetSum + ":");
        
        for (int i = 0; i < arr.length; i++) {
            int complement = targetSum - arr[i];
            
            if (numMap.containsKey(complement)) {
                System.out.println("(" + complement + ", " + arr[i] + ")");
                foundPair = true;
            }
            
            numMap.put(arr[i], i);
        }
        
        if (!foundPair) {
            System.out.println("No pairs found with sum " + targetSum);
        }
    }
}

// 5. Remove duplicates from sorted array
class RemoveDuplicates {
    public static void execute(Scanner scanner) {
        System.out.println("REMOVE DUPLICATES FROM SORTED ARRAY");
        System.out.println("---------------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in sorted order:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int newLength = removeDuplicates(arr);
        
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);
    }
    
    private static int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int i = 0;
        for (int j = 1; j < nums.length; j++) {
            if (nums[j] != nums[i]) {
                i++;
                nums[i] = nums[j];
            }
        }
        
        return i + 1;
    }
}

// 6. Sort array of 0s, 1s, and 2s
class SortZerosOnesTwos {
    public static void execute(Scanner scanner) {
        System.out.println("SORT ARRAY OF 0s, 1s, AND 2s");
        System.out.println("---------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (only 0s, 1s, and 2s):");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        sortArray(arr);
        
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    
    private static void sortArray(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        // Dutch National Flag algorithm
        while (mid <= high) {
            switch (arr[mid]) {
                case 0:
                    // Swap arr[low] and arr[mid]
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    low++;
                    mid++;
                    break;
                case 1:
                    mid++;
                    break;
                case 2:
                    // Swap arr[mid] and arr[high]
                    temp = arr[mid];
                    arr[mid] = arr[high];
                    arr[high] = temp;
                    high--;
                    break;
            }
        }
    }
}

// 7. Find second highest number in array
class SecondHighestNumber {
    public static void execute(Scanner scanner) {
        System.out.println("FIND SECOND HIGHEST NUMBER IN ARRAY");
        System.out.println("---------------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = findSecondHighest(arr);
        
        if (result != Integer.MIN_VALUE) {
            System.out.println("Second highest number: " + result);
        } else {
            System.out.println("No second highest element found");
        }
    }
    
    private static int findSecondHighest(int[] arr) {
        if (arr.length < 2) {
            return Integer.MIN_VALUE;
        }
        
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;
        
        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }
        
        return secondHighest;
    }
}

// 8. Find maximum sum subarray (Kadane's Algorithm)
class MaximumSumSubarray {
    public static void execute(Scanner scanner) {
        System.out.println("FIND MAXIMUM SUM SUBARRAY (KADANE'S ALGORITHM)");
        System.out.println("-------------------------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = maxSubArraySum(arr);
        System.out.println("Maximum subarray sum: " + result);
    }
    
    private static int maxSubArraySum(int[] arr) {
        int maxSoFar = arr[0];
        int maxEndingHere = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }
        
        return maxSoFar;
    }
}

// 9. Find subarray with given sum
class SubarrayWithGivenSum {
    public static void execute(Scanner scanner) {
        System.out.println("FIND SUBARRAY WITH GIVEN SUM");
        System.out.println("---------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (positive numbers):");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter target sum: ");
        int targetSum = scanner.nextInt();
        
        findSubarrayWithSum(arr, targetSum);
    }
    
    private static void findSubarrayWithSum(int[] arr, int targetSum) {
        int currentSum = arr[0];
        int start = 0;
        
        for (int i = 1; i <= arr.length; i++) {
            // If current sum exceeds target, remove elements from start
            while (currentSum > targetSum && start < i - 1) {
                currentSum -= arr[start];
                start++;
            }
            
            // If current sum equals target, print the subarray
            if (currentSum == targetSum) {
                System.out.println("Subarray found from index " + start + " to " + (i - 1));
                System.out.print("Elements: ");
                for (int j = start; j < i; j++) {
                    System.out.print(arr[j] + " ");
                }
                return;
            }
            
            // Add next element to current sum if i is within array bounds
            if (i < arr.length) {
                currentSum += arr[i];
            }
        }
        
        System.out.println("No subarray found with sum " + targetSum);
    }
}

// 10. Find majority element
class MajorityElement {
    public static void execute(Scanner scanner) {
        System.out.println("FIND MAJORITY ELEMENT");
        System.out.println("--------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        int result = findMajorityElement(arr);
        
        if (result != -1) {
            System.out.println("Majority element: " + result);
        } else {
            System.out.println("No majority element found");
        }
    }
    
    // Using Boyer-Moore Voting Algorithm
    private static int findMajorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        
        // Find candidate
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            count += (num == candidate) ? 1 : -1;
        }
        
        // Verify candidate
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }
        
        return count > nums.length / 2 ? candidate : -1;
    }
}

// 11. Search in rotated sorted array
class SearchRotatedArray {
    public static void execute(Scanner scanner) {
        System.out.println("SEARCH IN ROTATED SORTED ARRAY");
        System.out.println("-----------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements (rotated sorted array):");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter target element to search: ");
        int target = scanner.nextInt();
        
        int result = search(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
    
    private static int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (nums[mid] == target) {
                return mid;
            }
            
            // Check if left half is sorted
            if (nums[left] <= nums[mid]) {
                // Check if target is in left half
                if (nums[left] <= target && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            } 
            // Right half is sorted
            else {
                // Check if target is in right half
                if (nums[mid] < target && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        
        return -1;
    }
}

// 12. Find Kth smallest element
class KthSmallestElement {
    public static void execute(Scanner scanner) {
        System.out.println("FIND KTH SMALLEST ELEMENT");
        System.out.println("------------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter K (to find Kth smallest element): ");
        int k = scanner.nextInt();
        
        if (k <= 0 || k > arr.length) {
            System.out.println("Invalid value of K");
            return;
        }
        
        int result = findKthSmallest(arr, k);
        System.out.println("The " + k + "th smallest element is: " + result);
    }
    
    private static int findKthSmallest(int[] arr, int k) {
        // Using priority queue (max heap)
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        for (int num : arr) {
            maxHeap.add(num);
            
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }
        
        return maxHeap.peek();
    }
}

// 13. Reverse a string without built-in functions
class ReverseString {
    public static void execute(Scanner scanner) {
        System.out.println("REVERSE A STRING WITHOUT BUILT-IN FUNCTIONS");
        System.out.println("----------------------------------------");
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String reversed = reverseString(input);
        System.out.println("Reversed string: " + reversed);
    }
    
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int left = 0;
        int right = charArray.length - 1;
        
        while (left < right) {
            // Swap characters
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;
            
            // Move towards the middle
            left++;
            right--;
        }
        
        return new String(charArray);
    }
}

// 14. Check if string is palindrome
class PalindromeString {
    public static void execute(Scanner scanner) {
        System.out.println("CHECK IF STRING IS PALINDROME");
        System.out.println("--------------------------");
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        boolean isPalindrome = checkPalindrome(input);
        
        if (isPalindrome) {
            System.out.println("\"" + input + "\" is a palindrome");
        } else {
            System.out.println("\"" + input + "\" is not a palindrome");
        }
    }
    
    private static boolean checkPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        
        return true;
    }
}

// 15. Find duplicate characters in string
class DuplicateCharacters {
    public static void execute(Scanner scanner) {
        System.out.println("FIND DUPLICATE CHARACTERS IN STRING");
        System.out.println("---------------------------------");
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        findDuplicateCharacters(input);
    }
    
    private static void findDuplicateCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        boolean foundDuplicate = false;
        
        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("Duplicate characters:");
        
        // Print characters with count > 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("'" + entry.getKey() + "' appears " + entry.getValue() + " times");
                foundDuplicate = true;
            }
        }
        
        if (!foundDuplicate) {
            System.out.println("No duplicate characters found");
        }
    }
}

// 16. Check if two strings are anagrams
class Anagrams {
    public static void execute(Scanner scanner) {
        System.out.println("CHECK IF TWO STRINGS ARE ANAGRAMS");
        System.out.println("-------------------------------");
        
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();
        
        boolean areAnagrams = checkAnagrams(str1, str2);
        
        if (areAnagrams) {
            System.out.println("The strings are anagrams");
        } else {
            System.out.println("The strings are not anagrams");
        }
    }
    
    private static boolean checkAnagrams(String str1, String str2) {
        // Remove spaces and convert to lowercase
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        
        // If lengths are different, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Convert strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);
        
        // Compare sorted arrays
        return Arrays.equals(charArray1, charArray2);
    }
}

// 17. Count occurrences of each character
class CharacterCount {
    public static void execute(Scanner scanner) {
        System.out.println("COUNT OCCURRENCES OF EACH CHARACTER");
        System.out.println("--------------------------------");
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        countCharacters(input);
    }
    
    private static void countCharacters(String str) {
        Map<Character, Integer> charCount = new HashMap<>();
        
        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        System.out.println("Character counts:");
        
        // Print character counts
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}

// 18. Remove all whitespaces from string
class RemoveWhitespace {
    public static void execute(Scanner scanner) {
        System.out.println("REMOVE ALL WHITESPACES FROM STRING");
        System.out.println("--------------------------------");
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        String result = removeWhitespace(input);
        System.out.println("String after removing whitespaces: \"" + result + "\"");
    }
    
    private static String removeWhitespace(String str) {
        // Method 1: Using built-in replaceAll
        // return str.replaceAll("\\s", "");
        
        // Method 2: Manual approach without using replaceAll
        StringBuilder sb = new StringBuilder();
        
        for (char c : str.toCharArray()) {
            if (!Character.isWhitespace(c)) {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}

// 19. Reverse words in a sentence
class ReverseWords {
    public static void execute(Scanner scanner) {
        System.out.println("REVERSE WORDS IN A SENTENCE");
        System.out.println("-------------------------");
        
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
        String result = reverseWords(input);
        System.out.println("Reversed sentence: \"" + result + "\"");
    }
    
    private static String reverseWords(String str) {
        // Split the string by spaces
        String[] words = str.split("\\s+");
        StringBuilder reversed = new StringBuilder();
        
        // Append words in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" ");
            }
        }
        
        return reversed.toString();
    }
}

// 20. Find first non-repeated character
class FirstNonRepeatedChar {
    public static void execute(Scanner scanner) {
        System.out.println("FIND FIRST NON-REPEATED CHARACTER");
        System.out.println("--------------------------------");
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        char result = findFirstNonRepeatedChar(input);
        
        if (result != 0) {
            System.out.println("First non-repeated character: '" + result + "'");
        } else {
            System.out.println("No non-repeated character found");
        }
    }
    
    private static char findFirstNonRepeatedChar(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        
        // Count occurrences of each character
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        // Find first character with count 1
        for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        
        return 0; // No non-repeated character found
    }
}

// 21. Find longest substring without repeating characters
class LongestSubstringWithoutRepeating {
    public static void execute(Scanner scanner) {
        System.out.println("FIND LONGEST SUBSTRING WITHOUT REPEATING CHARACTERS");
        System.out.println("-----------------------------------------------");
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        int result = lengthOfLongestSubstring(input);
        System.out.println("Length of longest substring without repeating characters: " + result);
    }
    
    private static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int maxLength = 0;
        Map<Character, Integer> charMap = new HashMap<>();
        
        // Sliding window approach
        for (int i = 0, j = 0; j < n; j++) {
            char currentChar = s.charAt(j);
            
            // If character is already in current window, move window start
            if (charMap.containsKey(currentChar)) {
                i = Math.max(charMap.get(currentChar) + 1, i);
            }
            
            // Update max length
            maxLength = Math.max(maxLength, j - i + 1);
            
            // Store character position
            charMap.put(currentChar, j);
        }
        
        return maxLength;
    }
}

// 22. Find middle element of linked list
class MiddleOfLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("FIND MIDDLE ELEMENT OF LINKED LIST");
        System.out.println("--------------------------------");
        
        System.out.print("Enter number of elements in linked list: ");
        int n = scanner.nextInt();
        
        ListNode head = null;
        ListNode tail = null;
        
        System.out.println("Enter " + n + " elements:");
        
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);
            
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        ListNode middle = findMiddle(head);
        
        if (middle != null) {
            System.out.println("Middle element: " + middle.val);
        } else {
            System.out.println("Linked list is empty");
        }
    }
    
    private static ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        // Fast pointer moves twice as fast as slow pointer
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        
        return slow;
    }
}

// 23. Reverse a linked list
class ReverseLinkedList {
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("REVERSE A LINKED LIST");
        System.out.println("-------------------");
        
        System.out.print("Enter number of elements in linked list: ");
        int n = scanner.nextInt();
        
        ListNode head = null;
        ListNode tail = null;
        
        System.out.println("Enter " + n + " elements:");
        
        for (int i = 0; i < n; i++) {
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);
            
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
        }
        
        System.out.println("Original linked list:");
        printList(head);
        
        ListNode reversed = reverseList(head);
        
        System.out.println("Reversed linked list:");
        printList(reversed);
    }
    
    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        
        while (current != null) {
            ListNode nextTemp = current.next;
            current.next = prev;
            prev = current;
            current = nextTemp;
        }
        
        return prev;
    }
    
    private static void printList(ListNode head) {
        ListNode current = head;
        
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        
        System.out.println();
    }
}

// 24. Detect cycle in linked list
class DetectCycle {
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("DETECT CYCLE IN LINKED LIST");
        System.out.println("-------------------------");
        
        System.out.println("Creating a linked list with 5 nodes (1->2->3->4->5)");
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        
        System.out.print("Do you want to create a cycle? (y/n): ");
        String choice = scanner.next();
        
        if (choice.equalsIgnoreCase("y")) {
            // Create a cycle: 5 points back to 3
            head.next.next.next.next.next = head.next.next;
            System.out.println("Created a cycle: 5 points back to 3");
        }
        
        boolean hasCycle = detectCycle(head);
        
        if (hasCycle) {
            System.out.println("The linked list contains a cycle");
        } else {
            System.out.println("The linked list does not contain a cycle");
        }
    }
    
    private static boolean detectCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            
            if (slow == fast) {
                return true;
            }
        }
        
        return false;
    }
}

// 25. Merge two sorted linked lists
class MergeSortedLists {
    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("MERGE TWO SORTED LINKED LISTS");
        System.out.println("---------------------------");
        
        System.out.print("Enter number of elements in first linked list: ");
        int n1 = scanner.nextInt();
        
        ListNode head1 = null;
        ListNode tail1 = null;
        
        System.out.println("Enter " + n1 + " elements in sorted order:");
        
        for (int i = 0; i < n1; i++) {
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);
            
            if (head1 == null) {
                head1 = newNode;
                tail1 = newNode;
            } else {
                tail1.next = newNode;
                tail1 = newNode;
            }
        }
        
        System.out.print("Enter number of elements in second linked list: ");
        int n2 = scanner.nextInt();
        
        ListNode head2 = null;
        ListNode tail2 = null;
        
        System.out.println("Enter " + n2 + " elements in sorted order:");
        
        for (int i = 0; i < n2; i++) {
            int val = scanner.nextInt();
            ListNode newNode = new ListNode(val);
            
            if (head2 == null) {
                head2 = newNode;
                tail2 = newNode;
            } else {
                tail2.next = newNode;
                tail2 = newNode;
            }
        }
        
        System.out.println("First linked list:");
        printList(head1);
        
        System.out.println("Second linked list:");
        printList(head2);
        
        ListNode merged = mergeTwoLists(head1, head2);
        
        System.out.println("Merged linked list:");
        printList(merged);
    }
    
    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        // Create a dummy head
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }
        
        // Attach remaining nodes
        if (l1 != null) {
            tail.next = l1;
        } else {
            tail.next = l2;
        }
        
        return dummy.next;
    }
    
    private static void printList(ListNode head) {
        ListNode current = head;
        
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        
        System.out.println();
    }
}

// 26. Check if number is prime
class PrimeNumber {
    public static void execute(Scanner scanner) {
        System.out.println("CHECK IF NUMBER IS PRIME");
        System.out.println("---------------------");
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        boolean isPrime = isPrime(num);
        
        if (isPrime) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " is not a prime number");
        }
    }
    
    private static boolean isPrime(int n) {
        // Handle special cases
        if (n <= 1) {
            return false;
        }
        if (n <= 3) {
            return true;
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false;
        }
        
        // Check for divisibility by numbers of form 6k ± 1
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
}

// 27. Generate Fibonacci series
class FibonacciSeries {
    public static void execute(Scanner scanner) {
        System.out.println("GENERATE FIBONACCI SERIES");
        System.out.println("-----------------------");
        
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        
        System.out.println("Fibonacci series up to " + n + " terms:");
        generateFibonacci(n);
    }
    
    private static void generateFibonacci(int n) {
        int first = 0, second = 1;
        
        if (n <= 0) {
            System.out.println("Invalid input");
            return;
        }
        
        if (n >= 1) {
            System.out.print(first + " ");
        }
        
        if (n >= 2) {
            System.out.print(second + " ");
        }
        
        for (int i = 3; i <= n; i++) {
            int next = first + second;
            System.out.print(next + " ");
            first = second;
            second = next;
        }
        
        System.out.println();
    }
}

// 28. Calculate factorial
class Factorial {
    public static void execute(Scanner scanner) {
        System.out.println("CALCULATE FACTORIAL");
        System.out.println("------------------");
        
        System.out.print("Enter a non-negative integer: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers");
            return;
        }
        
        long result = factorial(n);
        System.out.println(n + "! = " + result);
    }
    
    private static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        
        return fact;
    }
}

// 29. Check if number is Armstrong number
class ArmstrongNumber {
    public static void execute(Scanner scanner) {
        System.out.println("CHECK IF NUMBER IS ARMSTRONG NUMBER");
        System.out.println("--------------------------------");
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        boolean isArmstrong = isArmstrong(num);
        
        if (isArmstrong) {
            System.out.println(num + " is an Armstrong number");
        } else {
            System.out.println(num + " is not an Armstrong number");
        }
    }
    
    private static boolean isArmstrong(int num) {
        int originalNum = num;
        int sum = 0;
        int digits = countDigits(num);
        
        while (num > 0) {
            int digit = num % 10;
            sum += Math.pow(digit, digits);
            num /= 10;
        }
        
        return sum == originalNum;
    }
    
    private static int countDigits(int num) {
        int count = 0;
        while (num > 0) {
            count++;
            num /= 10;
        }
        return count;
    }
}

// 30. Check if number is palindrome
class PalindromeNumber {
    public static void execute(Scanner scanner) {
        System.out.println("CHECK IF NUMBER IS PALINDROME");
        System.out.println("---------------------------");
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        
        boolean isPalindrome = isPalindrome(num);
        
        if (isPalindrome) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
    }
    
    private static boolean isPalindrome(int num) {
        // Handle negative numbers
        if (num < 0) {
            return false;
        }
        
        int originalNum = num;
        int reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        
        return originalNum == reversed;
    }
}

// 31. Swap two numbers without temp variable
class SwapWithoutTemp {
    public static void execute(Scanner scanner) {
        System.out.println("SWAP TWO NUMBERS WITHOUT TEMP VARIABLE");
        System.out.println("-----------------------------------");
        
        System.out.print("Enter first number: ");
        int a = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();
        
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        
        // Swap using arithmetic operations
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

// 32. Implement Binary Search
class BinarySearch {
    public static void execute(Scanner scanner) {
        System.out.println("IMPLEMENT BINARY SEARCH");
        System.out.println("---------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements in sorted order:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.print("Enter target element to search: ");
        int target = scanner.nextInt();
        
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array");
        }
    }
    
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            // Check if target is present at mid
            if (arr[mid] == target) {
                return mid;
            }
            
            // If target is greater, ignore left half
            if (arr[mid] < target) {
                left = mid + 1;
            }
            // If target is smaller, ignore right half
            else {
                right = mid - 1;
            }
        }
        
        // Element not found
        return -1;
    }
}

// 33. Implement Bubble Sort
class BubbleSort {
    public static void execute(Scanner scanner) {
        System.out.println("IMPLEMENT BUBBLE SORT");
        System.out.println("-------------------");
        
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println("Original array:");
        printArray(arr);
        
        bubbleSort(arr);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
    
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        
        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            
            // If no swapping occurred in this pass, array is sorted
            if (!swapped) {
                break;
            }
        }
    }
    
    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

// 34. Implement Stack using array
class StackImplementation {
    static class Stack {
        private int maxSize;
        private int[] stackArray;
        private int top;
        
        public Stack(int size) {
            maxSize = size;
            stackArray = new int[maxSize];
            top = -1;
        }
        
        public void push(int value) {
            if (isFull()) {
                System.out.println("Stack is full. Cannot push " + value);
                return;
            }
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " to stack");
        }
        
        public int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot pop.");
                return -1;
            }
            int value = stackArray[top--];
            System.out.println("Popped " + value + " from stack");
            return value;
        }
        
        public int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty. Cannot peek.");
                return -1;
            }
            return stackArray[top];
        }
        
        public boolean isEmpty() {
            return (top == -1);
        }
        
        public boolean isFull() {
            return (top == maxSize - 1);
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("IMPLEMENT STACK USING ARRAY");
        System.out.println("-------------------------");
        
        System.out.print("Enter stack size: ");
        int size = scanner.nextInt();
        
        Stack stack = new Stack(size);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nStack Operations:");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Check if full");
            System.out.println("6. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int value = scanner.nextInt();
                    stack.push(value);
                    break;
                case 2:
                    stack.pop();
                    break;
                case 3:
                    int top = stack.peek();
                    if (top != -1) {
                        System.out.println("Top element: " + top);
                    }
                    break;
                case 4:
                    System.out.println("Stack is " + (stack.isEmpty() ? "empty" : "not empty"));
                    break;
                case 5:
                    System.out.println("Stack is " + (stack.isFull() ? "full" : "not full"));
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

// 35. Implement Queue using array
class QueueImplementation {
    static class Queue {
        private int maxSize;
        private int[] queueArray;
        private int front;
        private int rear;
        private int currentSize;
        
        public Queue(int size) {
            maxSize = size;
            queueArray = new int[maxSize];
            front = 0;
            rear = -1;
            currentSize = 0;
        }
        
        public void enqueue(int value) {
            if (isFull()) {
                System.out.println("Queue is full. Cannot enqueue " + value);
                return;
            }
            
            // Circular queue implementation
            rear = (rear + 1) % maxSize;
            queueArray[rear] = value;
            currentSize++;
            System.out.println("Enqueued " + value + " to queue");
        }
        
        public int dequeue() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot dequeue.");
                return -1;
            }
            
            int value = queueArray[front];
            front = (front + 1) % maxSize;
            currentSize--;
            System.out.println("Dequeued " + value + " from queue");
            return value;
        }
        
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty. Cannot peek.");
                return -1;
            }
            return queueArray[front];
        }
        
        public boolean isEmpty() {
            return (currentSize == 0);
        }
        
        public boolean isFull() {
            return (currentSize == maxSize);
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("IMPLEMENT QUEUE USING ARRAY");
        System.out.println("-------------------------");
        
        System.out.print("Enter queue size: ");
        int size = scanner.nextInt();
        
        Queue queue = new Queue(size);
        boolean exit = false;
        
        while (!exit) {
            System.out.println("\nQueue Operations:");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. Check if empty");
            System.out.println("5. Check if full");
            System.out.println("6. Exit");
            
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter value to enqueue: ");
                    int value = scanner.nextInt();
                    queue.enqueue(value);
                    break;
                case 2:
                    queue.dequeue();
                    break;
                case 3:
                    int front = queue.peek();
                    if (front != -1) {
                        System.out.println("Front element: " + front);
                    }
                    break;
                case 4:
                    System.out.println("Queue is " + (queue.isEmpty() ? "empty" : "not empty"));
                    break;
                case 5:
                    System.out.println("Queue is " + (queue.isFull() ? "full" : "not full"));
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}

// 36. Check balanced parentheses
class BalancedParentheses {
    public static void execute(Scanner scanner) {
        System.out.println("CHECK BALANCED PARENTHESES");
        System.out.println("-------------------------");
        
        System.out.print("Enter an expression with parentheses: ");
        String expression = scanner.nextLine();
        
        boolean isBalanced = checkBalancedParentheses(expression);
        
        if (isBalanced) {
            System.out.println("The expression has balanced parentheses");
        } else {
            System.out.println("The expression does not have balanced parentheses");
        }
    }
    
    private static boolean checkBalancedParentheses(String expr) {
        Stack<Character> stack = new Stack<>();
        
        for (char c : expr.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                
                char top = stack.pop();
                
                if ((c == ')' && top != '(') || 
                    (c == ']' && top != '[') || 
                    (c == '}' && top != '{')) {
                    return false;
                }
            }
        }
        
        return stack.isEmpty();
    }
}

// 37. Binary Tree Traversals
class BinaryTreeTraversals {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("BINARY TREE TRAVERSALS");
        System.out.println("---------------------");
        
        // Create a sample binary tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Sample Binary Tree:");
        System.out.println("       1");
        System.out.println("      / \\");
        System.out.println("     2   3");
        System.out.println("    / \\");
        System.out.println("   4   5");
        
        System.out.println("\nInorder Traversal (Left-Root-Right):");
        inorderTraversal(root);
        System.out.println();
        
        System.out.println("\nPreorder Traversal (Root-Left-Right):");
        preorderTraversal(root);
        System.out.println();
        
        System.out.println("\nPostorder Traversal (Left-Right-Root):");
        postorderTraversal(root);
        System.out.println();
    }
    
    private static void inorderTraversal(TreeNode root) {
        if (root != null) {
            inorderTraversal(root.left);
            System.out.print(root.val + " ");
            inorderTraversal(root.right);
        }
    }
    
    private static void preorderTraversal(TreeNode root) {
        if (root != null) {
            System.out.print(root.val + " ");
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }
    
    private static void postorderTraversal(TreeNode root) {
        if (root != null) {
            postorderTraversal(root.left);
            postorderTraversal(root.right);
            System.out.print(root.val + " ");
        }
    }
}

// 38. Find height of Binary Tree
class BinaryTreeHeight {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("FIND HEIGHT OF BINARY TREE");
        System.out.println("-------------------------");
        
        // Create a sample binary tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Sample Binary Tree:");
        System.out.println("       1");
        System.out.println("      / \\");
        System.out.println("     2   3");
        System.out.println("    / \\");
        System.out.println("   4   5");
        
        int height = findHeight(root);
        System.out.println("\nHeight of the binary tree: " + height);
    }
    
    private static int findHeight(TreeNode root) {
        if (root == null) {
            return 0;
        }
        
        int leftHeight = findHeight(root.left);
        int rightHeight = findHeight(root.right);
        
        return Math.max(leftHeight, rightHeight) + 1;
    }
}

// 39. Level Order Traversal
class LevelOrderTraversal {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("LEVEL ORDER TRAVERSAL");
        System.out.println("--------------------");
        
        // Create a sample binary tree
        //       1
        //      / \
        //     2   3
        //    / \
        //   4   5
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        
        System.out.println("Sample Binary Tree:");
        System.out.println("       1");
        System.out.println("      / \\");
        System.out.println("     2   3");
        System.out.println("    / \\");
        System.out.println("   4   5");
        
        System.out.println("\nLevel Order Traversal:");
        levelOrderTraversal(root);
    }
    
    private static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            System.out.print(current.val + " ");
            
            if (current.left != null) {
                queue.add(current.left);
            }
            
            if (current.right != null) {
                queue.add(current.right);
            }
        }
        
        System.out.println();
    }
}

// 40. Check if Binary Tree is BST
class ValidBST {
    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        
        TreeNode(int val) {
            this.val = val;
        }
    }
    
    public static void execute(Scanner scanner) {
        System.out.println("CHECK IF BINARY TREE IS BST");
        System.out.println("-------------------------");
        
        System.out.println("Example 1: Valid BST");
        //       4
        //      / \
        //     2   6
        //    / \ / \
        //   1  3 5  7
        TreeNode validRoot = new TreeNode(4);
        validRoot.left = new TreeNode(2);
        validRoot.right = new TreeNode(6);
        validRoot.left.left = new TreeNode(1);
        validRoot.left.right = new TreeNode(3);
        validRoot.right.left = new TreeNode(5);
        validRoot.right.right = new TreeNode(7);
        
        System.out.println("       4");
        System.out.println("      / \\");
        System.out.println("     2   6");
        System.out.println("    / \\ / \\");
        System.out.println("   1  3 5  7");
        
        boolean isValidBST1 = isValidBST(validRoot);
        System.out.println("Is valid BST? " + isValidBST1);
        
        System.out.println("\nExample 2: Invalid BST");
        //       4
        //      / \
        //     2   6
        //    / \ / \
        //   1  3 3  7
        TreeNode invalidRoot = new TreeNode(4);
        invalidRoot.left = new TreeNode(2);
        invalidRoot.right = new TreeNode(6);
        invalidRoot.left.left = new TreeNode(1);
        invalidRoot.left.right = new TreeNode(3);
        invalidRoot.right.left = new TreeNode(3); // This makes it invalid (3 < 4)
        invalidRoot.right.right = new TreeNode(7);
        
        System.out.println("       4");
        System.out.println("      / \\");
        System.out.println("     2   6");
        System.out.println("    / \\ / \\");
        System.out.println("   1  3 3  7");
        
        boolean isValidBST2 = isValidBST(invalidRoot);
        System.out.println("Is valid BST? " + isValidBST2);
    }
    
    private static boolean isValidBST(TreeNode root) {
        return isValidBST(root, Long.MIN_VALUE, Long.MAX_VALUE);
    }
    
    private static boolean isValidBST(TreeNode root, long minVal, long maxVal) {
        if (root == null) {
            return true;
        }
        
        if (root.val <= minVal || root.val >= maxVal) {
            return false;
        }
        
        return isValidBST(root.left, minVal, root.val) && 
               isValidBST(root.right, root.val, maxVal);
    }
}
