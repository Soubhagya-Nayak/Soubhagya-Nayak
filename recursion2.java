import java.util.HashSet;

public class recursion2 {
    // Question 1
    /* public static void towerOfHanoi(int n, String src, String help, String dest) {
        if (n == 1) {
            System.out.println("The block "+n+" was transfered from "+src+" to "+dest);
            return;
        }
        towerOfHanoi(n-1, src, dest, help);
        System.out.println("The block "+n+" was transfered from "+src+" to "+dest);
        towerOfHanoi(n-1, help, src, dest);
    }
    public static void main(String[] args) {
        int n = 4;
        towerOfHanoi(n, "S", "H", "D");
    }
    */

    // Question 2
    /*public static void printReverse(String str, int idx) {
        if (idx == 0) {
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.println(str.charAt(idx));
        printReverse(str, idx-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        printReverse(str, str.length()-1);
    }
    */

    // Question 3
    /*public static int first = -1;
    public static int last = -1;
    public static void findOcuurance(String str, int idx, char element) {
        if (idx == str.length()) {
            System.out.println(first);
            System.out.println(last);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == element) {
            if (first == -1) {
                first = idx;
            } else {
                last = idx;
            }
        }
        findOcuurance(str, idx+1, element);
    }
    public static void main(String[] args) {
        String str = "abaacdaefaah";
        findOcuurance(str, 0, 'a');
    }
    */

    // Question 4
    /*public static boolean isSorted(int arr[], int idx) {
        if (idx == arr.length-1) {
            return true;
        }
        if (arr[idx] >= arr[idx+1]) {
            return false;
        }
        return isSorted(arr, idx+1);
    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2};
        System.out.println(isSorted(arr, 0));
    }
    */

    // Question 5
    /*public static void moveAllX(String str, int idx, int count, String newString) {
        if (idx == str.length()) {
            for (int i=0; i<count; i++) {
                newString += 'x';
            }
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (currChar == 'x') {
            count++;
            moveAllX(str, idx+1, count, newString);
        } else {
            newString += currChar;
            moveAllX(str, idx+1, count, newString);
        }
    }
    public static void main(String[] args) {
        String str = "axbcxxd";
        moveAllX(str, 0, 0, "");
    }
    */

    // Question 6
    /*public static boolean []map = new boolean [26];
    public static void removeDuplicates(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        if (map[currChar - 'a']) {
            removeDuplicates(str, idx+1, newString);
        } else {
            newString += currChar;
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString);
        }
    }
    public static void main(String[] args) {
        String str = "aabbccdd";
        removeDuplicates(str, 0, "");
    }
    */

    // Question 7
    /*public static void subSequences(String str, int idx, String newString) {
        if (idx == str.length()) {
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        subSequences(str, idx+1, newString+currChar);
        subSequences(str, idx+1, newString);
    }
    public static void main(String[] args) {
        String str = "abc";
        subSequences(str, 0, "");
    }
    */

    // Question 8
    /*public static void subSequences(String str, int idx, String newString, HashSet<String>set) {
        if (idx == str.length()) {
            if (set.contains(newString)) {
                return;
            } else {
                System.out.println(newString);
                set.add(newString);
                return;
            }
        }
        char currChar = str.charAt(idx);
        subSequences(str, idx+1, newString+currChar, set);
        subSequences(str, idx+1, newString, set);
    }
    public static void main(String[] args) {
        String str = "aaa";
        HashSet<String> set = new HashSet<>();
        subSequences(str, 0, "", set);
    }
    */

    // Question 9
    public static String []keypad = {".", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void printComb(String str, int idx, String combination) {
        if (idx == str.length()) {
            System.out.println(combination);
            return;
        }

        char currChar = str.charAt(idx);
        String mapping = keypad[currChar - '0'];

        for(int i=0; i<mapping.length(); i++) {
            printComb(str, idx+1, combination+mapping.charAt(i));
        }
    }
    public static void main(String[] args) {
        String str = "23";
        printComb(str, 0, "");
    }
}
