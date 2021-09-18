class Circle2 {
    double radius;
    // static 키워드를 사용하면 모든 객체가 값을 공유
    static int numOfCircles = 0;
    int numCircles = 0;

    public Circle2(double radius) {
        this.radius = radius;
        numOfCircles++;
        numCircles++;
    }
}
public class _0919_Static {
    public static void main(String[] args){
        Circle2 myCircle = new Circle2(10.0);
        Circle2 yourCircle = new Circle2(5.0);

        //print();
        System.out.println("원의 갯수 : " + Circle2.numOfCircles);
        System.out.println("원의 갯수 : " + yourCircle.numOfCircles);
    }

}
