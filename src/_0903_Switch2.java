import java.util.Scanner;

public class _0903_Switch2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String english = in.nextLine();

        switch (english){
            case "odd":
                System.out.println("홀수");
                break;
            case "even":
                System.out.println("짝수");
                break;
            default:
                System.out.println("짝수도 홀수도 아닙니다.");

        }
    }
}
