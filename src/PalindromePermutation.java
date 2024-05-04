public class PalindromePermutation {

    public static void main(String[] args){
        String input = "tactcoapapa";
        String output = "abcbca";
        System.out.println(isPermutationOfPalindrome(input));
        System.out.println(isPermutationOfPalindrome(output));
        System.out.println(isPermutationOfPalindrome("abc"));

    }

    private static boolean isPermutationOfPalindrome(String input) {
        boolean result = false;
        int[] countarray = new int[26];
        for(char c: input.toCharArray() ){
            countarray[c - 'a']++;
        }
        for(int a : countarray){
            if(a % 2 == 1){
                if(result) return false;
                result = true;
            }
        }

        return true;

    }
}
