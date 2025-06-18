public class AK_02_Loops {
    public static void main(String[] args) {
        // for(int i=0; i<5; i++) {
        //     for(int j=i; j<5; j++) {
        //         if(i+j==5) break;
        //         System.out.println(i + " -> " + j);
        //     }
        // }

        int n = 4; // Number of lines in the pattern

        // for (int i = 1; i <= n; i++) {
        //     for (int j = i; j >= 1; j--) {
        //         System.out.print(j + " ");
        //     }
        //     System.out.println();
        // }

        for(int i=1; i<=n; i++) {
            for(int j=1; j<=n; j++) {
                if(i==1 || i==n || j==1 || j==n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}


