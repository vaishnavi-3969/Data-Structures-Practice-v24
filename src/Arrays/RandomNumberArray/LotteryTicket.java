package Arrays.RandomNumberArray;
/*
Create a lottery quick pick
application that'll generate
a lottery ticket with 6 random
nos. b/w  1-69
* */

import java.util.Arrays;
import java.util.Random;

public class LotteryTicket {
    public static void main(String[] args) {
        Random random = new Random();
        int[] lotteryTicket = new int[6];
        for(int i=0; i<6; i++){
            lotteryTicket[i] = random.nextInt(1,69);
        }
        Arrays.sort(lotteryTicket);
        System.out.println(Arrays.toString(lotteryTicket));
    }
}
