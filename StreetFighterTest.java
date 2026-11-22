import java.util.*;

public class StreetFighterTest{
    public static void main(String[] args){
	ArrayList<Fighter> AllFighters = new ArrayList<Fighter>();
	
	Fighter f1 = new Ryu();
	AllFighters.add(f1);
	Fighter f2 = new Ken();
	AllFighters.add(f2);
	Fighter f3 = new ChunLi();
	AllFighters.add(f3);
	Fighter f4 = new Dhalsim(); //Step 7
	AllFighters.add(f4);
	Fighter f5 = new Zangief(); //Step 12
	AllFighters.add(f5);
	Fighter f6 = new Guile();//Step 13
	AllFighters.add(f6);
	Fighter f7 = new Vega();//Step 4 a.
	AllFighters.add(f7);
	Fighter f8 = new Blanka();//Step 4 b.
	AllFighters.add(f8);
	
	for(Fighter f: AllFighters){
	    f.Display();
	    f.Punch();
	    f.Kick();
		f.Jump();
		f.Roll();
	    System.out.println();
	}
    }
}

	
	
