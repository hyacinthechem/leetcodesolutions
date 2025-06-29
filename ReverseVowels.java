public class ReverseVowels {
    public static String reverseVowels(String s) {
        int start = 0;
        char[] array = s.toCharArray();
        int end = s.length() - 1;

        //[wIneNiGhToNut]
        //[wunoNiGhTeNIt]


        while(start < end){
            while(start < end && !isVowel(array[start])){
                start++;
            }
            while(start < end && !isVowel(array[end])){
                end--;
            }

            if(start < end){
                swap(array, start, end);
                start++;
                end--;
            }
        }
        return new String(array);
    }

    private static void swap(char[] arr, int start, int end){
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

    }

    private static boolean isVowel(char c){
        return c == 'a' || c=='A' ||c=='e'||c=='E' || c == 'i' || c=='I' || c=='e' || c=='E' || c=='o' || c == 'O' || c == 'i' || c == 'I' || c == 'u' || c == 'U';
    }

    public static void main(String[] args){
        String s = "wIneNiGhToNut";
        System.out.println(reverseVowels(s));
    }
}
