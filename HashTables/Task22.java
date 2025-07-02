package HashTables;

public class Task22 {

    private static final int TABLE_SIZE = 309;

    /**
     * Computes the hash code for a given string using the
     * formula:
     * s[0]*31^(n-1) + s[1]*31^(n-2) + ... + s[n-1].
     *
     * Returns the index within the table.
     *
     * 
     */
    public static int hashCode(String s) {
        if (s.length() == 0) {
            return 0;
        }

        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n - 1; i++) {
            sum += s.charAt(i) * (int) Math.pow(31, n - i - 1);
        }

        // Add the final character
        sum += s.charAt(n - 1);

        // Final index, wrapped within the TABLE_SIZE
        return Math.abs(sum) % TABLE_SIZE;
    }

    public static void main(String[] args) {
        // Testing the hashCode method
        String str1 = "baab";  // Should yield index 246
        String str2 = "abba";  // Should yield index 0
        System.out.println("Index for 'baab': " + hashCode(str1));
        System.out.println("Index for 'abba': " + hashCode(str2));
    }
}

    
