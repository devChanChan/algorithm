import java.util.Scanner;

public class Main {
    public static int result = 0;
    public static StringBuilder msg = new StringBuilder();
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        moveRing(num, 1, 2, 3);
        msg.insert(0, result + "\n");
        System.out.println(msg);
    }
    
    public static void moveRing(int num, int from, int by, int to) {
        result++;
        if(num == 1) {
            msg.append(from);
            msg.append(" ");
            msg.append(to);
            msg.append("\n");
        } else {
            moveRing(num-1, from, to, by);
            msg.append(from);
            msg.append(" ");
            msg.append(to);
            msg.append("\n");
            moveRing(num-1, by, from, to);
        }
    }
}