import java.util.Scanner;

class Input03 {

    public static void main(String[] args) {
        //Create a Scanner
        Scanner keyboard = new Scanner(System.in);
        //Find and print the sum of three integers entered by the user
        System.out.println("Type a number");
        int x = keyboard.nextInt();
        System.out.println("Type another number");
        int y = keyboard.nextInt();
        System.out.println("Type one last number");
        System.out.println(keyboard.nextInt()+x+y);
        keyboard.close();
        
        //Remember to close the Scanner
        
    }
}
