public class Vega extends Fighter{
	
    public void Display(){
	System.out.println("I'm Vega. Handsome fighters never lose battles! ");
    }
	
    public void Punch(){
	System.out.println("Claw Punch!");
    }
	
	public void Kick(){
	System.out.println("Slide Kick!");
    }

	public Vega() {
        super(new superJump(), new groundRoll()); 
    }

}
