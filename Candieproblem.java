import java.util.ArrayList;
import java.util.List;

/**
 * Leetcode:1431. Kids With the Greatest Number of Candies
 * */

public class Candieproblem {


    /***
     * relatively simple question, practice using while loops and understanding logic. also had stream operation
     * for finding max.
     *
     * **/
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> res = new ArrayList<>();

        int i = 0;
        int max = 0;
        while(i < candies.length){
            if(max<candies[i]){
                max = candies[i];
            }
            i++;
        }

        i = 0;
        while(i < candies.length){
            if(candies[i] + extraCandies >= max){
                res.add(true);
            }else{
                res.add(false);
            }
            i++;
        }
        return res;
    }
}
