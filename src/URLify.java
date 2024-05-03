public class URLify {

    public static void main(String[] args){
        String input = "Mr John Smith      ";
        //String output = "Mr%20John%20Smith";
        URLifyString(input.toCharArray(),13);

    }

    private static void URLifyString(char[] input, int initialength) {
         int spaces= 0 ;
         for(int i =0; i<initialength;i++){
             if(input[i] == ' ') spaces++;
         }
         System.out.println("spaces" + spaces);
        System.out.println("length" + input.length);

         int index = initialength + (spaces * 2);
        System.out.println("index" + index);
         if(index < input.length){
             input[index] = '\0';
             index--;
         }
         for(int i = initialength-1; i >=0; i--){
             if(input[i] == ' '){
                 input[index] = '0';
                 input[index -1] = '2';
                 input[index - 2] = '%';
                 index = index - 3;
                 System.out.println("index after space" + index);
             }else{
                 input[index] = input[i];
                 index--;
                 System.out.println("index after char" + index);
                 System.out.println("index after char" + input[i]);
             }

         }

         System.out.println("result : " + new String(input));

    }
}
