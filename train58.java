import java.util.*;

class train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int Y = sc.nextInt();

            if (X < Y)
                System.out.println("BIKE");
            else if (Y < X)
                System.out.println("CAR");
            else
                System.out.println("SAME");
        }
    }
}
