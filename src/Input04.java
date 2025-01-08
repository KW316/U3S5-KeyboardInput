import java.util.Scanner;



public class Input04 {
    public static void main(String[] args){
        Scanner sc = new Scanner(Input04.class.getResourceAsStream("input04text.txt"));
        //Edit these lines to advance the scanner

        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());
        System.out.println(sc.nextLine());

        String x = sc.findInLine("BlueBumper");
        System.out.println(x);
        int a = x.length();
        System.out.println("X: "  + x.substring(0,a/2)      +", Y: "   + x.substring(a/2, a)  );
        sc.close();
    }    
}
