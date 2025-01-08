import javax.swing.JOptionPane;

public class Input02 {
    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null,
                "This is an error message.",
                "Error",
                JOptionPane.ERROR_MESSAGE);

        
        String input1 = (String)JOptionPane.showInputDialog(null,
                "Type your name?",
                "Dialog Title",
                2,
                null,
                null,
                "Type something here.");

        
        String[] acceptableValues = {"Dog", "Cat", "Giraffe"};
        String input2 = (String)JOptionPane.showInputDialog(null,
                "What is the best animal?",
                "Dialog Title",
                2,
                null,
                acceptableValues,
                acceptableValues[1]);
        System.out.println(input1);
        System.out.println(input2);
                
    }
}
