public class Ryu extends Fighter{
	
    public void Display(){
	System.out.println("I'm Ryu.  You must defeat Sheng Long to stand a chance!");
    }
	
    public void Punch(){
	System.out.println("Hadouken punch!");
    }
	
	public Ryu() {
        super(new noJump(), new noRoll()); 
    }

}

