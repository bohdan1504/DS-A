import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("Doom");
        stack.push("Borderlands");
        stack.push("FFVII");

//        String myFavGame = stack.pop();
//        System.out.println(stack.peek());

//        System.out.println(stack.search("Borderlands"));

        // Stack will run out of memory if we add too much
//        for (int i =0; i < 1000000000; i++){
//            stack.push("Fallout76");
//        }
        System.out.println(stack);

    }
}