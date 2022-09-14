        /***************************************!!!Important!!!***************************************
        * Noted that if you change the name of a file, you may also need to check if the code that isn't 
        * marked as TODO may need to be modified as well.
         ********************************************************************************************/ 

class A1083331_checkpoint7_idleState extends A1083331_checkpoint7_baseState{
    /*********************************The TODO This Time (Checkpoint7) ********************************
     * 
     * TODO(3): Here you have to define the idle state based on the fsm graph.
     * Hint1: One trigger the doState method you have to print out "Now it's on idle state.". (Use println)
     * Hint2: This state won't do anything but switch to moving state.
     * 
     **********************************The End of the TODO**************************************/

    /********************************************************************************************
     START OF YOUR CODE
     ********************************************************************************************/ 

    @Override
    public A1083331_checkpoint7_baseState doState(A1083331_checkpoint7_lift mlift){
    	System.out.println("Now it's on idle state.");
    	return mlift.moving;
    }

    
    /********************************************************************************************
     END OF YOUR CODE
     ********************************************************************************************/

}
