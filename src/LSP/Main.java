package LSP;

class Shape {
    public void draw() {
        System.out.println("도형을 그립니다.");
    }
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("사각형을 그립니다.");
    }
}

class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        Shape shape2 = new Circle();

        shape1.draw();
        shape2.draw();
    }
}
