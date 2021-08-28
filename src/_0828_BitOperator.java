public class _0828_BitOperator {
    public static void main(String[] args){
        // & | ^ ~

        System.out.printf("%x\n", 0b0101 & 0b0011);     // 1
        System.out.printf("%x\n", 0b0101 | 0b0011);     // 7
        System.out.printf("%x\n", 0b0101 ^ 0b0011);     // 6
        System.out.printf("%x\n", (byte) ~0b0000000);   // fe
        System.out.printf("%x\n", 0b0110 >> 2);         // 1
        System.out.printf("%x\n", 0b0110 << 2);         // 18

        int i1 = -10;
        int i2 = i1 >> 1;
        int i3 = i1 >>> 1;
        System.out.printf("%x -> %d\n", i1, i1);    // fffffff6 -> -10
        System.out.printf("%x -> %d\n", i2, i2);    // fffffffb -> -5
        System.out.printf("%x -> %d\n", i3, i3);    // 7ffffffb -> 2147483643
    }
}
