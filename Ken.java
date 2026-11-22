public class Ken extends Fighter{
	
    public void Display(){
	System.out.println("I'm Ken.  Attack me if you dare, I will crush you!");
    }
	
    public void Kick(){
	System.out.println("Shoryuken punch!");
    }
	
	public Ken(){
		super(new basicJump(), new noRoll()); 
}
}
