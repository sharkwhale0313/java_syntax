public class _0822_Constant {
    public static void main(String[] args){
        // 상수 : 프로그램 실행 중 변경할 수 없는 데이터
        // EX] pi = 3.141592 or mach = 3*10^8 m/s 등
        // 상수 이름은 일반 변수와 구분하기 위해 모두 '대문자'로 표기
        // 키워드는 'final'
        final double PI = 3.14159;

        // 자동 타입 변환
        double d1 = 5 * 3.14; // 정수 5를 5.0으로 자동 타입변환
        double d2 = 1;        // 정수 1을 1.0으로 자동 타입변환

        // 강제 타입 변환

        // double인 3.14를 float으로 형변환 하여 f 에 3.14F 저장
        float f = (float)3.14;

        // int인 300을 byte로 형변환하면 -> '데이터 손실 발생'
        // byte = 8 bit = 2^8 = -128 ~ 127
        byte b = (byte)300;

        // double인 3.14를 byte로 형변환하면 데이터가 손실되고 3만 저장
        byte x = (byte)3.14;

        // float인 3.14를 double로 형변환하면 데이터 손실 없이 저장
        double d = (double)3.14f;
    }
}
