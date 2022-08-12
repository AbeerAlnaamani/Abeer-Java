import javax.swing.JOptionPane;
public class HW10 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("- What is your name?");

        System.out.print("* My name is ");
        System.out.println(name);
        System.out.println("- What would you like to do? ");
        System.out.println("* .....");
        System.out.print("- I'm sorry ");
        System.out.print(name );
        System.out.println(" .. I'm afraid I can't do that.");
    }


}
