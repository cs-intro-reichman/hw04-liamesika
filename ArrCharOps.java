/** A library of operations on arrays of characters (char values) 
 *  The library also features a string comparison method. */
public class ArrCharOps {
    public static void main(String[] args) {
      /*  String str = "clearly";
        char[] arr1 = {'c','l','e','a','r','l','y'};
        char[] arr2 = {'U','n','d','e','r','s','t', 'o', 'o', 'd'};
        System.out.println(str);  // Prints the string
        println(arr1);            // Prints an array of characters
        System.out.println(charAt(arr1,2));      
        System.out.println(indexOf(arr1,'l'));  
        System.out.println(indexOf(arr1,'l',3)); 
        System.out.println(lastIndexOf(arr1, 'l'));
        System.out.println(concat(arr1, arr2));
        System.out.println(subArray(arr2, 2, 9));
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
        // System.out.println(hashCode(arr1));
        // System.out.println(hashCode(arr2));*/
        System.out.println(compareTo("abcd", "abcd"));
        System.out.println(compareTo("abc", "abcd"));
        System.out.println(compareTo("abw", "abcd"));
        System.out.println(compareTo("Abcd", "a"));
        System.out.println(compareTo("apple", "banana"));
        System.out.println(compareTo("apple", "applepie"));
        System.out.println(compareTo("Zoo", "zoo"));
    }

    /** Prints the given array of characters, and moves the cursor to the next line.
     */
    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    /** Returns the char value at the specified index. Assume that the array is non-empty.
     */
    public static char charAt(char[] arr, int index) {
        if (index < 0 || index >= arr.length) {
            return ' ';
        }
        return arr[index];
    }

    /** If the two arrays have the same value in every index, 
     *  returns true; Otherwise returns false.
     */
     public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    /** Returns the index within the given array of the first occurrence of the given character.
     *  If no such character is found, returns -1.
     */
    public static int indexOf(char[] arr, char ch) {
        int range_arr;
        range_arr = arr.length;
        for (int i=0; i<range_arr; i++){
            if (arr[i] == ch){
                return i;
            }
        }
        return -1;
    }

    /** Same as indexOf(char[], char), but starts the search in the given index.
     */
    public static int indexOf(char[] arr, char ch, int fromIndex) {
        int range_arr;
        range_arr = arr.length;
        for (int i=fromIndex; i<range_arr; i++){
            if (arr[i] == ch){
                return i;
            }
        }
        return -1;
    }

    /** Returns the index within the given arr of the last occurrence of the given character.
     *  If no such character is found, returns -1.
     */
    public static int lastIndexOf(char[] arr, char ch) {
        int range_arr;
        int last_index = 0;
        range_arr = arr.length;
        for (int i=0; i<range_arr; i++){
            if (arr[i] == ch){
                last_index = i;
            }
        }
        if (last_index == 0){
            return -1;
        }
        else{
            return last_index;
        }
    }

    /* Returns an array which is the concatanation of the two given arrays.
    "מחזירה מערך שהוא השרשור (החיבור) של שני המערכים הנתונים."
    */
    public static char[] concat(char[] arr1, char[] arr2) {
        int range_arr2, range_arr1, lengt ;
        
        range_arr1 = arr1.length;
        range_arr2 = arr2.length;
        lengt = (range_arr1+range_arr2);

        char[] arr_return = new char[lengt];

        for (int i=0; i<range_arr1; i++){
            arr_return[i] = arr1[i];
        }

        for (int j=0; j<range_arr2; j++){
            arr_return[j + range_arr1] = arr2[j];
        }
        
        return arr_return;
    }

    /** Returns a new array that can be described as a sub-array of this array.
     *  The sub-array begins at the specified beginIndex and extends to the character at index endIndex - 1.
     *  For example, if arr contains the characters "hamburger", then subArray(4, 8) returns an array of
     *  characters containing the characters "urge".
     */  

    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        int length_arr = arr.length;
        int new_arr_lengt = endIndex - beginIndex;
        char [] new_array = new char [new_arr_lengt];
        for (int i=0; i < new_arr_lengt; i++){
            new_array[i] = arr[beginIndex];
            beginIndex ++;
        }
 
        return new_array;
    }

     /** Returns a single integer that represents the given array. This integer is sometimes 
     *  referred to as the array's "hash code". Later in the course we'll explain what these 
     *  hash codes are used for. For now, simply implement the specification given below.
     *  The hash code is computed as: arr[0]*7^(n-1) + arr[1]*7^(n-2) + ... + arr[n-2]*7 + arr[n-1]
     *  where arr[i] is the i'th character of the array, and n is the array's length.
     *  The hash value of an empty array is zero.

     */
    public static long hashCode(char[] arr) {
        int res =0;
        int arr_lengt ;
        int less = 1, hezka_val;
        double hezka;

        arr_lengt = arr.length;
        for(int i=0; i< arr_lengt; i++){
            hezka_val = (arr_lengt-less);
            hezka = Math.pow(7, hezka_val);
            res += arr[i]* hezka;
            less ++;
        }
        return res;
    }

    
    public static int compareTo(String str1, String str2) {
            int length1 = str1.length();
            int length2 = str2.length();
            int minLength = Math.min(length1, length2);

            for (int i = 0; i < minLength; i++) {
                char c1 = str1.charAt(i);
                char c2 = str2.charAt(i);
                if (c1 != c2) {
                    return c1 - c2;
                }
            }

            return length1 - length2;
    }
}


