public class _0822_CharBoolDemo {
    public static void main(String[] args){
        // char
        char ga1 = '가';
        char ga2 = '\uac00'; // 유니코드 가

        // bool
        boolean cham = true;
        boolean geojit = false;

        System.out.println(ga1);
        System.out.println(ga2);
        System.out.println(cham + "는 참이고 " + geojit + "는 거짓입니다. ");
    }
}
