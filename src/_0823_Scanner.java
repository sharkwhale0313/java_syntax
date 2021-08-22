import java.util.Scanner;

public class _0823_Scanner {
    public static void main(String[] args){
        // Scanner class가 제공하는 데이터 입력 메서드
        // next()       String
        // nextByte()   byte
        // nextShort()  short
        // nextInt()    int
        // nextLong()   long
        // nextDouble() double
        // nextLine()   String

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.printf("%d * %d은 %d 입니다. \n", x, y, x * y);

    }
}
