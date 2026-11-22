public abstract class Fighter{
	
    public abstract void Display(); // everyone writes their own display
	
    public void Kick(){
	System.out.println("Basic boring kick");
    }
	
    public void Punch(){
	System.out.println("Basic boring punch");
	}
		
	public void Jump() {
		myJump.jump();
	}

	public void Roll() {
		myRoll.on_a_roll();
	}

	private JumpBehavior myJump;
    private Roll myRoll;
	
	
	 public Fighter(JumpBehavior jumpType, Roll rollType) {
        myJump = jumpType;  // Set the jump behavior
        myRoll = rollType;  // Set the roll behavior
    }
}

