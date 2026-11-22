# java-street-fighter
A Street Fighter character simulator I made for a Java programming class
I built it using Java and object-oriented programming
The project uses different Street Fighter characters to demonstrate inheritance, polymorphism, and reusable behaviors

## How It Works
1. The program creates an ArrayList to store the fighters
2. Different Street Fighter characters are created, including Ryu, Ken, Chun-Li, Dhalsim, Zangief, Guile, Vega, and Blanka
3. Each character has their own display message, punch, and kick
4. Characters also have different jumping and rolling behaviors
5. The program loops through the fighters and displays each character's moves and behaviors

## Characters Included
- **Ryu:** Hadouken punch, no jumping, and no rolling
- **Ken:** Shoryuken punch, basic jump, and no rolling
- **Chun-Li:** Hyakuretsukyaku kick, super jump, and no rolling
- **Dhalsim:** Stretching punch and kick, super jump, and no rolling
- **Zangief:** Power punch and kick, no jumping, and no rolling
- **Guile:** Sonic punch, spin kick, flip jump, and air roll
- **Vega:** Claw punch, slide kick, super jump, and ground roll
- **Blanka:** Claw punch, slide kick, basic jump, and air roll

## Java Concepts Used
- Inheritance using the Fighter parent class
- Polymorphism using an ArrayList of Fighter objects
- Abstract classes and methods
- Interfaces for jumping and rolling behaviors
- Reusable behaviors using separate JumpBehavior and Roll interfaces
- Constructors to assign different behaviors to each character

## Files
- `Fighter.java` - Abstract parent class for all fighters
- `Ryu.java` - Ryu character
- `Ken.java` - Ken character
- `ChunLi.java` - Chun-Li character
- `Dhalsim.java` - Dhalsim character
- `Zangief.java` - Zangief character
- `Guile.java` - Guile character
- `Vega.java` - Vega character
- `Blanka.java` - Blanka character
- `JumpBehavior.java` - Jumping interface and jumping behaviors
- `Roll.java` - Rolling interface and rolling behaviors
- `StreetFighterTest.java` - Main program that creates and displays all fighters

## What I Learned
- How to use inheritance to create different character classes
- How to use polymorphism with an ArrayList of parent class objects
- How to create abstract classes and interfaces
- How to give different objects their own behaviors
- How to reuse code by separating behaviors into their own classes
- How to use constructors to assign behaviors to objects

## How to Run
1. Download or clone the repository
2. Open the project in an IDE such as Eclipse or IntelliJ IDEA
3. Make sure all Java files are in the same project
4. Run `StreetFighterTest.java`
5. View the characters, moves, jumping behaviors, and rolling behaviors in the console
