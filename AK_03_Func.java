public class AK_03_Func {
    public static void main(String[] args) {
        greet();
        System.out.println(num(4));
        System.out.println(getName("Aanand"));
        System.out.println(coffee("Coff", 6));
    }
    public static void greet() {
        System.out.println("Hello, welcome to the function!");
    } 

    public static int num(int a) {
        return a+4;
    }


    public static String getName(String name) {
        return "Your name is: "+name;
    }



    public static String coffee(String name, int sugar) {
        int size = coffee(coffee(sugar));
        if(size>5) {
            return "large";
        } 
        else {
            return "small"; 
        }
    }
    public static int coffee(int sugarQunt) {
        return sugarQunt;
    }
}
