public class ChunLi extends Fighter{
	
    public void Display(){
	System.out.println("I'm Chun Li.  I'm the strongest woman in the world!");
    }
	
    public void Kick(){
	System.out.println("Hyakuretsukyaku kick!");
    }
	
	public ChunLi() {
        super(new superJump(), new noRoll()); 
	}
}
