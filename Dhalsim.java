public class Dhalsim extends Fighter{
	
    public void Display(){
	System.out.println("I'm Dhalism. I will meditate and then destroy you!");
    }
	
    public void Punch(){
	System.out.println("Stretching Punch!!!");
    }
	
	public void Kick(){
	System.out.println("Stretching Kick!!!");
    }

	public Dhalsim() {
        super(new superJump(), new noRoll()); 
    }

}
