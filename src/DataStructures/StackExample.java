package DataStructures;
import java.util.*;
/*
    This is a program example of how Stack works
    @author Anette Larios
    @since 13.06.2023
    @version 1.8.0
 */
public class StackExample {
    /*
    showpush fuuction shows how a push works for a stack and then prints the value that was inserted
    @param Stack stack is a stack object called 'stack'
    @param int 'a' is a random integer
    @author Anette Larios
    @since 13.06.2023
     */
    static void showpush (Stack stack, int a){
        stack.push(new Integer(a));
        System.out.println("push(" + a + ")");
        System.out.println("stack: " + stack);
    }

    /*
    showpop is a function that shows how pop works on a stack deleting the last elements.
    @param receives an object type Stack called 'Stack'
    @author Anette Larios
    @since 13.06.2023
     */
    static void showpop(Stack stack){
        //prints message
        System.out.println("pop -> ");
        //deletes element in top of the stack
        Integer a = (Integer) stack.pop();
        //prints the element that was deleted
        System.out.println(a);
        //prints the stack after the deletion
        System.out.println("stack: " + stack);
    }
    /*
    main function calls the functions that makes the principal functionalities of a stack.
    author Anette Larios
    since 13.06.2023
    */

    public static void main(String args[]) {
        //Declares a new object called 'stack' type Stack.
        Stack stack = new Stack();
        //Prints how is the stack before making operations init.
        System.out.println("stack: " + stack);
        //Calls showpush fuction to insert elements in the stack
        showpush(stack, 42);
        showpush(stack, 66);
        showpush(stack, 99);
        //calls showpop function to delete elements in the stack
        showpop(stack);
        showpop(stack);
        showpop(stack);
        /*
        Try catch, the programs calls showpop function and shows a message if the stack is empty, in consequence
        no elements can be deleted.
         */
        try {
            showpop(stack);
        } catch (EmptyStackException e) {
            System.out.println("empty stack");
        }
    }
}