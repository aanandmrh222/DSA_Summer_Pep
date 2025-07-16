public class AK_07_Oops {
    static class Rectangle {
        private int length;
        private int breadth;

        public Rectangle(int length, int breadth) {
            this.length = length;
            this.breadth = breadth;
        }

        public int getLength() {
            return length;
        }
        public int getBreadth() {
            return breadth;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public void setBreadth(int breadth) {
            this.breadth = breadth;
        }

        public int area() {
            return length * breadth;
        }
    }
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5, 10);
        System.out.println("Length: " + rect.getLength());
        System.out.println("Breadth: " + rect.getBreadth());
        System.out.println("Area: " + rect.area());
        rect.setLength(7);
        rect.setBreadth(12);    
        System.out.println("Updated Length: " + rect.getLength());
        System.out.println("Updated Breadth: " + rect.getBreadth());    
        System.out.println("Updated Area: " + rect.area());
    }
}


/*
----------------------- Encapsulation -----------------------
1. It is a process of wrapping similar code in one place.
2. We cannot access any function from the class directly.
3. Increase in security of the data.
4. It helps control the modification of our data members.

----------------------- Abstraction -----------------------

*/