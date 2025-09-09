public class StringMethods {
    public static void main(String[] args) {
        
        String str="Velayutham.G";

        //  LENGTH AND CHARACTER ACCESSS

        // Length of the String
        System.out.println(str.length());

        // Returns Character at Specified Index
        System.out.println(str.charAt(9));

        // Unicode of Character at index
        System.out.println(str.codePointAt(11));

        // Unicode of Character before Index
        System.out.println(str.codePointBefore(11));

        // Counts Unicode code points
        System.out.println(str.codePointCount(5, 10));



        String str1="Vignesh";
        String str2="Rashmi";
        String str3="rashmi";
        StringBuffer sb=new StringBuffer("Vignesh");
        String email="vels@gmail.com";

        // Compares Two Strings (Case Sensitive)
        System.out.println(str1.equals(str2));

        // Compares Ignoring case
        System.out.println(str2.equalsIgnoreCase(str3));

        // Lexicographic Comparison
        System.out.println(str2.compareTo(str3));

        // Lexicographic Comparison ignoring case
        System.out.println(str2.compareToIgnoreCase(str3));

        // Compares Sequence with String
        System.out.println(str1.contentEquals(sb));

        // Checks Regex Match
        System.out.println(email.matches("^[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z]+$"));

    }
}
