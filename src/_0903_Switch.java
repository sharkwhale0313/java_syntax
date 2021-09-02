import java.util.Scanner;

public class _0903_Switch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("등수를 입력하세요 : ");
        int rank = in.nextInt();

        switch (rank) {
            case 1:
                System.out.println("일등");
                break;
            case 2:
                System.out.println("이등");
                break;
            case 3:
                System.out.println("삼등");
                break;
            default:
                System.out.println("등외");
        }
    }
}
