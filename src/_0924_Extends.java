class Circle3{
    private void secret(){
        System.out.println("비밀이다.");
    }
    protected void findRadius() {
        System.out.println("반지름 10.0cm");
    }
    public void findArea() {
        System.out.println("면적은 (r*r*3.14)이다.");
    }
}
class Ball extends Circle3 {
    private String color;

    public Ball(String color) {
        this.color = color;
    }
    public void findColor() {
        System.out.println(color + " 공이다.");
    }
    public void findArea() {
        System.out.println("넓이는 4*(3.14*r*r)이다.");
    }
    public void findVolume() {
        System.out.println("부피는 4/3*(3.14*r*r*r)이다.");
    }
}

public class _0924_Extends {
    public static void main(String[] args){
        Circle3 c1 = new Circle3();
        Ball c2 = new Ball("빨간색");

        System.out.println("원 : ");
        c1.findRadius();
        c1.findArea();

        System.out.println("\n공 : ");
        c2.findRadius();
        c2.findColor();
        c2.findArea();
        c2.findVolume();
    }
}
