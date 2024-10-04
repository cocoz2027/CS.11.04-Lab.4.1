public class Main {

    // 1. parenthesesCheck
    public static boolean parenthesesCheck(String a) {

        int x = 0;

        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) == '(') {
                x++;
            } else {
                x--;
            }
            if (x < 0) {
                return false;
            }
        }
        return x == 0;
    }


    // 2. reverseInteger
    public static String reverseInteger(int a) {
        String b = "" + a;
        int c = b.length();
        String reverseInteger = "";

        for (int i = 0; i < c; i++) {
            int d = (a / (int) (Math.pow(10, i))) % 10;
            reverseInteger = reverseInteger + d;
        }
        return reverseInteger;
    }


    // 3. encryptThis
    public static String encryptThis(String str) {
        str = str + " ";
        String encryptThis = "";
        int n = str.length() - str.replace(" ", "").length();
        for (int i = 0; i < n; i++) {
            int spaceIndex = str.indexOf(" ");
            String Substring = str.substring(0, spaceIndex);
            if (Substring.length() > 2) {
                int firstLetter = Substring.charAt(0);
                char secondChar = Substring.charAt(1);
                char lastChar = Substring.charAt(Substring.length() - 1);
                String leftString = Substring.substring(2, spaceIndex - 1);
                encryptThis = encryptThis + firstLetter + lastChar + leftString + secondChar + " ";
                str = str.substring(spaceIndex + 1);
            } else {
                int firstLetter = Substring.charAt(0);
                char secondChar = Substring.charAt(1);
                encryptThis = encryptThis + firstLetter + secondChar + " ";
                str = str.substring(spaceIndex + 1);
            }
        }
        int lastSpace = encryptThis.length() - 1;
        encryptThis = encryptThis.substring(0, lastSpace);
        return encryptThis;
    }



    // 4. decipherThis
    public static String decipherThis(String str) {
        str = str + " ";
        String decipherThis = "";
        int n = str.length() - str.replace(" ", "").length();
        for (int i = 0; i < n; i++) {
            int spaceIndex = str.indexOf(" ");
            String Substring = str.substring(0, spaceIndex);
            String firstnumber = "";
            for (int m = 0; m < Substring.length(); m++) {
                if (Character.isDigit(Substring.charAt(m))) {
                    firstnumber = firstnumber + Substring.charAt(m);
                }
            }
            if (Substring.length() > (firstnumber.length() + 1)) {

                char firstLetter = (char) Integer.parseInt(firstnumber);
                char secondChar = Substring.charAt(firstnumber.length());
                char lastChar = Substring.charAt(Substring.length() - 1);
                String leftString = Substring.substring(firstnumber.length() + 1, Substring.length() - 1);
                decipherThis = decipherThis + firstLetter + lastChar + leftString + secondChar + " ";
            } else {
                char firstLetter = (char) Integer.parseInt(firstnumber);
                char secondChar = Substring.charAt(firstnumber.length());
                decipherThis = decipherThis + firstLetter + secondChar + " ";
            }
            if (spaceIndex + 1 < str.length()) {
                str = str.substring(spaceIndex + 1);
            }
        }
            int lastSpace = decipherThis.length() - 1;
            decipherThis = decipherThis.substring(0, lastSpace);
            return decipherThis;

    }
}



