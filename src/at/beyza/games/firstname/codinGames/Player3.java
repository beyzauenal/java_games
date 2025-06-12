import java.util.*;

class Player3 {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt();
        int lightY = in.nextInt();
        int thorX = in.nextInt();
        int thorY = in.nextInt();


        while (true) {
            int remainingTurns = in.nextInt();

            String direction = "";


            if (thorY > lightY) {
                direction += "N";
                thorY--;
            } else if (thorY < lightY) {
                direction += "S";
                thorY++;
            }


            if (thorX > lightX) {
                direction += "W";
                thorX--;
            } else if (thorX < lightX) {
                direction += "E";
                thorX++;
            }


            System.out.println(direction);
        }
    }
}
