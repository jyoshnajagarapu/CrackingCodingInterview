

import java.util.Arrays;

public class Permutation {
    public static void main(String args[] ){
        String one = "random";
        String two = "modnar";
        boolean result = findPermutation( one ,  two);
        System.out.println(result);
        System.out.println(findPermutation( "random" ,  "aaaaaa"));


        System.out.println(findPermutation1( "random" ,  "aaaaaa"));
        System.out.println(findPermutation1( "random" ,  "modnar"));
    }
    //sort the strings
    public static boolean findPermutation(String one , String two){
        if(one.length() != two.length()) return false;
        char[] temp = one.toCharArray();
        char[] temp1 = two.toCharArray();
        Arrays.sort(temp);
        Arrays.sort(temp1);
        if(Arrays.equals(temp,temp1)) return true;
        return false;
    }

    //count the occurences
    public static boolean findPermutation1(String one , String two){
        if(one.length() != two.length()) return false;
        int[] temp = new int[128];
        for(char a: one.toCharArray()){
            temp[a]++ ;
        }
        for(char b : two.toCharArray()){
            temp[b]--;
            if(temp[b] < 0) return false;
        }
        return true;
    }

}


