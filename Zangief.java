public class Zangief extends Fighter{
	
    public void Display(){
	System.out.println("I'm Zangief. My strength is much greater than yours!");
    }
	
    public void Punch(){
	System.out.println("Power Punch!!!");
    }
	
	public void Kick(){
	System.out.println("Power KICK!!!");
    }

	public Zangief() {
        super(new noJump(), new noRoll()); 
    }

}
