        /***************************************!!!Important!!!***************************************
        * Noted that if you change the name of a file, you may also need to check if the code that isn't 
        * marked as TODO may need to be modified as well.
         ********************************************************************************************/ 

class A1083331_checkpoint7_loadingState extends A1083331_checkpoint7_baseState{
    /*********************************The TODO This Time (Checkpoint7) ********************************
     * 
     * TODO(4): Here you have to define the loading state based on the fsm graph.
     * Hint1: One trigger the doState method you have to print out "Now it's on loading/unloading state.". (Use println)
     * Hint2: Noted that if the current floor equals to target floor that means it will first get a new 
     * destination floor then switch to idle state, otherwise it'll swtich to moving state.
     * 
     **********************************The End of the TODO**************************************/

    /********************************************************************************************
     START OF YOUR CODE
     ********************************************************************************************/ 
    @Override
    public A1083331_checkpoint7_baseState doState(A1083331_checkpoint7_lift mlift){
    	System.out.println("Now it's on loading/unloading state.");
    	if(mlift.currentFloor==mlift.targetFloor){
    		mlift.targetFloor=mlift.next();
    		return mlift.idle;
    	}
    	else{
    		return mlift.moving;
    	}
    }
    /********************************************************************************************
     END OF YOUR CODE
     ********************************************************************************************/

}
