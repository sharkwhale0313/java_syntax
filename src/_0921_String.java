// == 와 != 는 문자열 내용물을 비교하는 것이 아니라
// "동일한 객체" 인지를 비교
public class _0921_String {
    public static void main(String[] args){
        String s1 = "Hi, Java!";
        String s2 = "Hi, Java!";
        String s3 = new String("Hi, Java!");
        String s4 = new String("Hi, Java!");

        System.out.println("s1 == s2 -> " + (s1 == s2));
        System.out.println("s1 == s3 -> " + (s1 == s3));
        System.out.println("s3 == s4 -> " + (s3 == s4));

        s1 = s3;
        System.out.println("s1 == s3 -> " + (s1 == s3));

    }
}
