//HW8 
//Roll
public interface Roll{
	void on_a_roll();
}

//noRoll class
class noRoll implements Roll{
	public void on_a_roll(){
		System.out.println("There is no roll...");
	}
}
//groundRoll class
class groundRoll implements Roll{
	public void on_a_roll(){
		System.out.println("Ground Roll!");
	}
}

//airRoll class
class airRoll implements Roll{
	public void on_a_roll(){
		System.out.println("Air Roll!");
	}
}
