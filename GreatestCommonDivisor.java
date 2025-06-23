public class GreatestCommonDivisor {
    /** This question is all about the math with common divisors.
     * you took more of a loop and equality approach which is not how
     * the algorithm should work. but by using recursion you can make the problem more
     * manageable into smaller pieces and get the answer
     *
     * **/


    /**
     * @param str1
     * @param str2
     * @return greatest common divisor
     *
     * */

    public String gcdOfStrings(String str1, String str2) {
        if(!(str1+str2).equals(str2+str1)){
            return "";
        }

        int gcd = gcd(str1.length(), str2.length());
        return str2.substring(0,gcd);
    }

    public int gcd(int a, int b){
        return (b==0) ? a : gcd(b, a%b);
    }
}
