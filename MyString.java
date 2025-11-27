public class MyString {
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    /** Returns the lowercase version of the given string. */
    
    public static String lowerCase(String str) {
        int length = str.length();

        char[] lower = new char[length];

        for (int i = 0; i < length; i++) {
            char current = str.charAt(i);

            if (current >= 'A' && current <= 'Z') {
                lower[i] = (char) (current - 'A' + 'a');
            } else {
                lower[i] = current;
            }
        }

        return new String(lower);
    }

     /** If str1 contains str2, returns true; otherwise returns false. */
     public static boolean contains(String str1, String str2) {
        boolean match = true;

        int length1 = str1.length();
        int lenght2 = str2.length();

        if (lenght2 > length1){
            return false;
        }
        // לולאה חיצונית: עוברת על כל מיקום אפשרי ב-str1
        // שממנו יכולה להתחיל str2
        // (עד length1 - lenght2 כי אחרי זה אין מספיק תווים)
        for (int i = 0; i <= length1 - lenght2; i++) {
            match = true; 
            for (int j = 0; j < lenght2; j++) {

                // משווים את התו במיקום i+j ב-str1 לתו במיקום j ב-str2
                if (str1.charAt(i + j) != str2.charAt(j)) {
                    
                    // אם התווים לא שווים אין התאמה במיקום
                    match = false;
                    break; 
                }
            }

            // אם סיימנו את הלולאה הפנימית ו-match עדיין true -
            if (match) {
                return true;
            }
        }

        // עברנו על כל המיקומים ולא מצאנו התאמה
        return false;
    }


}
