class Box {
    int length;
    int width;
    int height;

    public Box(int length, int width, int height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public int calculateArea() {
        return length*width;
    }
    public int calculateVolume() {
        return length*width*height;
    }
}

public class AK_06_Task {
    public static void main(String[] args) {
        Box b1 = new Box(5, 5, 5);
        Box b2 = new Box(4, 8, 3);

        System.out.println("Box 1 Area: " + b1.calculateArea());
        System.out.println("Box 1 Volume: " + b1.calculateVolume());

        System.out.println("Box 2 Area: " + b2.calculateArea());
        System.out.println("Box 2 Volume: " + b2.calculateVolume());
    }
}
