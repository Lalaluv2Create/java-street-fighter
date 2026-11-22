public class Blanka extends Fighter{
	
    public void Display(){
	System.out.println("I'm Blanka. Seeing you in action is a joke!");
    }
	
    public void Punch(){
	System.out.println("Claw Punch!!!");
    }
	
	public void Kick(){
	System.out.println("Slide Kick!!!");
    }

	public Blanka() {
        super(new basicJump(),new airRoll()); 
    }

}
