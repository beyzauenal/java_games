import java.util.*;

class Player2 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);


        while (true) {
            int highestMountainHeight = -1;
            int indexOfHighest = -1;

            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt();


                if (mountainH > highestMountainHeight) {
                    highestMountainHeight = mountainH;
                    indexOfHighest = i;
                }
            }


            System.out.println(indexOfHighest);
        }
    }
}
