public class PalindromicArray {  
    public static void main(String[] args) {  
        int[] array = {1, 2, 3, 3 ,2, 1};  
        boolean isPalindromic = checkPalindromic(array);  
        if (isPalindromic) {  
            System.out.println("The array is palindromic.");  
        } else {  
            System.out.println("The array is not palindromic.");  
        }  
    }  
    public static boolean checkPalindromic(int[] array) {  
        int start = 0;  
        int end = array.length - 1;  
        while (start < end) {  
            if (array[start] != array[end]) {  
                return false;  
            }  
            start++;  
            end--;  
        }  
        return true;  
		}
		}
