```java
import java.util.*;

class train71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();

            if (A + 2 * B >= X)
                System.out.println("Qualify");
            else
                System.out.println("NotQualify");
        }
    }
}
```