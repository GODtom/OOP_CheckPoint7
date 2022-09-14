        /***************************************!!!Important!!!***************************************
        * Noted that if you change the name of a file, you may also need to check if the code that isn't 
        * marked as TODO may need to be modified as well.
         ********************************************************************************************/ 
import java.util.ArrayList;
import java.lang.Thread;

public class A1083331_checkpoint7{
       public static void main(String[] args) {
        //Description : Define a queue to store the data.
        ArrayList<Integer> destination=new ArrayList<>();
        /*********************************The TODO This Time (Checkpoint7) ********************************
         * 
         * TODO(6): Here you read in the data from command line storing them into a arraylist.
         * Hint1: You'll execute this program by "java checkpoint7 1 5 3 6 8", that is to say the data
         * will be 1,5,3,6, and 8.
         * Hint2: The lift will goes to floors in the destination list one by one. 
         **********************************The End of the TODO**************************************/

        /********************************************************************************************
         START OF YOUR CODE
         ********************************************************************************************/ 
         int[] temp=new int[args.length];
         for(int i=0;i<args.length;i++){
            temp[i]=Integer.valueOf(args[i]);
         }         
         for(int i=0;i<temp.length;i++){
            destination.add(temp[i]);
         }
        /********************************************************************************************
         END OF YOUR CODE
         ********************************************************************************************/
        Thread fsm=new Thread(new A1083331_checkpoint7_lift(destination));
        fsm.start();
       }
}