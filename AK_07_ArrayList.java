import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AK_07_ArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of ArrayList: ");
        int n = sc.nextInt();

        ArrayList<Integer> arrayList = new ArrayList<>();
        for(int i=0; i<n; i++) {
            System.out.print("Enter the "+ (i+1) +"th element: ");
            int a = sc.nextInt();
            arrayList.add(a);
        }

        for(int i=arrayList.size()-1; i>=0; i--) {
            System.out.print(arrayList.get(i) + " ");
        }

        HashMap<Integer, String> map = new HashMap<>();

        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");

        System.out.println("size of map: " + map.size());
        System.out.println(map.get(3));
        for (Integer key : map.keySet()) {
            System.out.println("Key: " + key + ", Value: " + map.get(key));
        }
    }
}
