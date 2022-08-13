import java.util.Stack;

public class Stacks {
    public static void main(String[] args) {

        // *****************************************************

        // stack = LIFO data structure. Last-In First-Out
        //               stores objects into a sort of "vertical tower"
        //		  push() to add objects to the top
        //		  pop() to remove objects from the top

        // uses of stacks?
        // 1. undo/redo features in text editors
        // 2. moving back/forward through browser history
        // 3. backtracking algorithms (maze, file directories)
        // 4. calling functions (call stack)

        // *****************************************************


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