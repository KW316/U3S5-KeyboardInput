import javax.swing.JOptionPane;
public class Input01 {
    public static void main(String[] args) {
        //Create a JOptionPanne
        JOptionPane keyboard = new JOptionPane();
        String question = JOptionPane.showInputDialog("What is your name");
        //Store the input as a String and print it.
        String answer = question;
        System.out.println(answer);
        question = JOptionPane.showInputDialog("What is your age");
        int age = Integer.parseInt(question);
        //Parse the input as an int.
        System.out.println(age + 1);
        //Print its value +1
        
        //Try creating a dialog, parsing it, and initializing an int in a single line.
        int a = Integer.parseInt(JOptionPane.showInputDialog("What is your favorite number"));
        System.out.println(a);
        //You should have only one semicolon (;) in this line.

        
    }
}
