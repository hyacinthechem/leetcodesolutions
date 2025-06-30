public class ReverseWords {
    public String reverseWords(String s) {
        int start = 0;
        String[] arr = s.split("\\s+");
        int end = arr.length - 1;
        StringBuilder sb = new StringBuilder();
        while(start < end){
            swap(arr, start, end);
            start++;
            end--;
        }
        int i = 0;
        while(i < arr.length){
            sb.append(arr[i]);
            sb.append(" ");
            i++;
        }

        return sb.toString().trim();
    }

    private void swap(String[] parts, int start, int end){
        String temp = parts[start];
        parts[start] = parts[end];
        parts[end] = temp;
    }
    public static void main(String[] args){
        ReverseWords rw = new ReverseWords();
        String word = "  hello world  ";
        rw.reverseWords(word);
    }
}