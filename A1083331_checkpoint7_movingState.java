        /***************************************!!!Important!!!***************************************
        * Noted that if you change the name of a file, you may also need to check if the code that isn't 
        * marked as TODO may need to be modified as well.
         ********************************************************************************************/ 


class A1083331_checkpoint7_movingState extends A1083331_checkpoint7_baseState{
    /*********************************The TODO This Time (Checkpoint7) ********************************
     * 
     * TODO(5): Here you have to define the moving state based on the fsm graph.
     * Hint1: One trigger the doState method you have to print out "Moving,lift is on floor==>currentFloor". (Use println)
     * Hint2: Noted that if the current floor equals to target floor that means it will switch to loading state,
     * otherwise it'll go up/down one floor each time and swtich to moving state.
     * 
     **********************************The End of the TODO**************************************/

    /********************************************************************************************
     START OF YOUR CODE
     ********************************************************************************************/ 
    @Override
    public A1083331_checkpoint7_baseState doState(A1083331_checkpoint7_lift mlift){
    	System.out.println("Moving,lift is on floor==>"+mlift.currentFloor);
    	if(mlift.targetFloor==mlift.currentFloor){	
    		return mlift.loading;
    	}
    	else{
    		if(mlift.currentFloor<mlift.targetFloor){
    			mlift.currentFloor++;
    			return mlift.moving;
    		}
    		else{
    			mlift.currentFloor--;
    			return mlift.moving;
    		}
    	}
    }
   
    /********************************************************************************************
     END OF YOUR CODE
     ********************************************************************************************/



}
