/**Leetcode 1768:  Merge Strings
 * You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
 *
 * Return the merged string.
 *
 *
 * */


/**
 * Improvements:
 *
 * Automatically started thinking in terms of "for loop"
 *
 * for(int i = 0; i < word1.length() && word2.length(); i++){}
 * and couldnt handle the control between appending items of longest word when short word length would break for loop
 *
 * had to use || operator for lengths BUT THIS IS NOT POSSIBLE WITH FOR LOOP
 *
 * */



public class MergeStrings {

    /**
     * Main Method
     * @param word1 word one as a string
     * @param word2 second word as string
     * @return the concatenated strings in alternating order
     *
     * */
    public String mergeAlternately( String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while(i < word1.length() || i < word2.length()){
            if(i < word1.length()){
                sb.append(word1.charAt(i));
            }

            if(i < word2.length()){
                sb.append(word2.charAt(i));
            }
            i++;
        }
        return sb.toString();
    }
}
