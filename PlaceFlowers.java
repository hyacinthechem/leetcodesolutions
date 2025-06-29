public class PlaceFlowers {
    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        //left must be zero and right must be zero if there is a 1
        if(flowerbed.length == 1 || flowerbed.length == 2 && flowerbed[0]==1 && n > 0){
            return false;
        }

        if(flowerbed.length == 1 || flowerbed.length == 2 && flowerbed[0]==1 && n == 0){
            return true;
        }

        if(flowerbed.length == 1 && flowerbed[0]==0 && n == 1){
            return true;
        }
        //for loop and check how many zeros on left and right there are. if it is less than n then it is false
        int freespots = 0;
        int last = flowerbed.length;
        for(int i = 1; i < flowerbed.length - 1; i++){
            if(i == 1 && flowerbed[0] == 0 && flowerbed[i]!=1){
                freespots++;
                flowerbed[0] = 1;
            }
            //[1,0,0,0,1,0,0]
            if(i == flowerbed.length - 2 && flowerbed[i + 1] == 0 && flowerbed[i]!=1){
                freespots++;
                flowerbed[i] = 1;
            }

            //[1,0,0,0,1,0,0]

            if(flowerbed[i-1] == 0 && flowerbed[i+1] == 0 && flowerbed[i]!=1){
                freespots++;
                flowerbed[i] = 1;
            }

        }



        return freespots>=n ? true : false;
    }

    public static void main(String[] args){
        int[] flowers = {1};
        int n = 0;
        canPlaceFlowers(flowers,n);
    }
}
