//lab 12
//Step 6.)
public interface JumpBehavior{
	void jump();
}

//noJump class
class noJump implements JumpBehavior{
	public void jump(){
		System.out.println("There is no jump...");
	}
}
//basicJump class
class basicJump implements JumpBehavior{
	public void jump(){
		System.out.println("Basic jump!");
	}
}

//superJump class
class superJump implements JumpBehavior{
	public void jump(){
		System.out.println("SUPER JUMP!!!");
	}
}

//flipJump class
class flipJump implements JumpBehavior{
	public void jump(){
		System.out.println("Flips over in the air while jumping!!");
	}
}