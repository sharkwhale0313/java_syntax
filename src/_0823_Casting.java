public class _0823_Casting {
    public static void main(String[] args){
        // 연산 중 필요하다면 타입 범위가 넓은 방향으로 자동 타입 변환
        // double > float > long > int > short, char > byte
        int i;
        double d;
        byte b;

        i = 7 / 4;
        System.out.println(i);

        d = 7 / 4;
        System.out.println(d);

        d = 7 / (double)4;
        System.out.println(d);

        // i = 7 / (double)4; // int type인 i 에 double을 대입할 수 없음

        i = 300;
        if (i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
            System.out.println("byte 타입으로 변환할 수 없습니다.");
        else
            b = (byte) i;
    }
}
