public class Guile extends Fighter{
	
    public void Display(){
	System.out.println("I'm Guile. Are you man enough to fight with me?!");
    }
	
    public void Punch(){
	System.out.println("Sonic Punch!");
    }
	
	public void Kick(){
	System.out.println("Spin Kick!");
    }

	public Guile() {
        super(new flipJump(), new airRoll()); 
    }

}
