public class OneAway {

    public static void main(String[] args){
        System.out.println(isOneAway("pale","ple"));
        System.out.println(isOneAway("pales", "pale"));
        System.out.println(isOneAway("pale", "bale"));
        System.out.println(isOneAway("pale", "bae"));
        System.out.println(isSecondAway("pale","ple"));
        System.out.println(isSecondAway("pales", "pale"));
        System.out.println(isSecondAway("pale", "bale"));
        System.out.println(isSecondAway("pale", "bae"));

    }
//two method approach
    private static boolean isOneAway(String first, String second) {
        boolean result = false;
        int firstlength = first.length();
        int secondlength = second.length();
        if(Math.abs(firstlength-secondlength) > 1) return result;
        if(firstlength == secondlength){
            result = checkReplace(first,second);
        }else if(firstlength < secondlength){
            result = checkedit(first,second);
        }else{
            result = checkedit(second,first);
        }
        return result;
    }


    private static boolean checkReplace(String first, String second) {
        boolean result = false;
        int index1 = 0;
        int index2 = 0;
        while(index1 < first.length() && index2 < second.length()){
            if(first.charAt(index1) != first.charAt(index2)){
                if(result) return false;
                result = true;
            }else{
                index1++;
                index2++;
            }
        }
        return true;
    }

    private static boolean checkedit(String first, String second) {
        int index1 = 0;
        int index2 = 0;
        while(index1 < first.length() && index2 < second.length()){
            if(first.charAt(index1) != second.charAt(index2)){
                if(index1 != index2){
                    return false;
                }
                index2++;
            }
            else{
                index1++;
                index2++;
            }
        }
        return true;
    }


    //onemethod approach
    private static boolean isSecondAway(String s1, String s2) {
        boolean result = false;
        int firstlength = s1.length();
        int secondlength = s2.length();
        if(Math.abs(firstlength-secondlength) > 1) return result;
        String first = firstlength < secondlength ? s1 : s2;
        String second = firstlength < secondlength ? s2 : s1;
        return checkOneEdit(first,second);
    }

    private static boolean checkOneEdit(String first, String second) {
        boolean result = false;
        int index1 = 0;
        int index2 = 0;
        while(index1 < first.length() && index2 < second.length()){
            if(first.charAt(index1) != second.charAt(index2)){
                if(result){
                    return false;
                }
                result = true;
                if(first.length() == second.length()){
                    index1++;
                }
            }else{
                index1++;
            }
            index2++;
        }
        return true;
    }

}
