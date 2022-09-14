        /*********************************Some texts you may use (Checkpoint7) ********************************
         * Typos isn't to blame for the zero, here are the text you'll need.
         * "Now it's on idle state."
         * "Moving,lift is on floor==>"
         * "Now it's on loading/unloading state."
         * Noted that if you change the name of a file, you may also need to check if the code that isn't 
         * marked as TODO may need to be modified as well.
         *****************************************************************************************************/
import java.util.*;    

public class A1083331_checkpoint7_lift implements Runnable{
    //Description : Define all states of the lift.
    A1083331_checkpoint7_baseState loading,idle,moving,current;
    //Description : Define the destination list.
    ArrayList<Integer> dList=new ArrayList<>();
    //Description : Define the current destination floor.
    protected Integer targetFloor;
    //Description : Define the current floor at which the lift is.
    protected Integer currentFloor;

    //Description : Set the idel state to current state and the lift is on first floor.
    public A1083331_checkpoint7_lift(ArrayList<Integer> destination){
    /*********************************The TODO This Time (Checkpoint7) ********************************
     * 
     * TODO(1): Here you have to set up the constructor.
     * Hint1: First you need to create objects of three states, and set the current state to idle state.
     * Hint2: Set up the dList bases on destination be passed in.
     * Hint3: Set the current floor to 1, and set the target floor by method next().
     * 
     **********************************The End of the TODO**************************************/

    /********************************************************************************************
     START OF YOUR CODE
     ********************************************************************************************/ 

    idle =new A1083331_checkpoint7_idleState();
   	moving=new A1083331_checkpoint7_movingState();
    loading=new A1083331_checkpoint7_loadingState();
    current=idle;
    dList=destination;
    currentFloor=1;
    targetFloor=next();    
    /********************************************************************************************
     END OF YOUR CODE
     ********************************************************************************************/

    }
    //Description : Define the run method for this thread.
    public void run(){
        while(targetFloor!=null){
            current=current.doState(this);
            doNothing();
        }
        System.out.println("Now it's on idle state.");  //After the lift stop, it will print out this line.
    }
    //Description : Offer a new destination from the list.
    protected Integer next(){
    /*********************************The TODO This Time (Checkpoint7) ********************************
     * 
     * TODO(2): Here you have to offer a new destination from the list once this method is called.
     * Hint1: You have to alway return the first element from the destination list, also remove the first
     * element upon returning.
     * Hint2: Return null if the dList has nothing left.
     * 
     **********************************The End of the TODO**************************************/

    /********************************************************************************************
     START OF YOUR CODE
     ********************************************************************************************/ 
     if(dList.size()!=0){
    	 int ne=0;
    	 ne=dList.get(0);
    	 dList.remove(0);
    	 return ne;   
 	 }
 	 else{
 	 	return null;
 	}
    /********************************************************************************************
     END OF YOUR CODE
     ********************************************************************************************/

    }
    //Description : Make the thread pause for seconds.
    public void doNothing(){
        try{Thread.sleep(500);}
        catch(InterruptedException err){}
    }
    

}
