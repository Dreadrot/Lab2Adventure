import java.util.Scanner;
public class DemiGorgonFullVersion {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int state = 0;
		
		boolean continueGame = true;
		System.out.println("Oh. Hello. You've found an unfortunate fate, haven't you?");
		System.out.println("What is your name?");
		String name = scan.nextLine();
		
		System.out.println("Well then, " + name + ", are you ready to proceed?");
		String playChoice = scan.nextLine();
		
		if(playChoice.equalsIgnoreCase("no")) {
			System.out.println("Come back when you've grown a spine. I'll wait.");
		}else {while (continueGame){
		
		
			
			
		
		
		
		
		switch (state){
		
			case 0:
				System.out.println("Excellent. Let's begin.");
				System.out.println("You awake in what appears to be an alternate reality.");
				System.out.println("The air smells of ash and sulfur. everything is a shade of black or grey.");
				System.out.println("Everything looks eroded, and covered in black vines.");
				System.out.println("The room you're in vaguely resembles the Grand Circus space.");
				
				System.out.println("Do you: look outside, call for help, sneak downstairs?");
				String firstAction = scan.nextLine();
				if(firstAction.equalsIgnoreCase("look outside")){
					//change state one
					state = 1;
				}else if(firstAction.equalsIgnoreCase("call for help")){
					state = 3;
				}else if(firstAction.equalsIgnoreCase("sneak downstairs")){
					state = 5;
				}
				break;
		
			case 1:
				System.out.println("The streets of this Detroit are empty and motionless,");
				System.out.println("save for a quick shadow that darts from window to window in the "
						+ "building across from you.");
				
				System.out.println("Do you: hide, shout hello");
				String windowAction = scan.nextLine();
				if(windowAction.equalsIgnoreCase("hide")){
				state = 2;
				}else if(windowAction.equalsIgnoreCase("shout hello")){
					state = 13;
				}
				break;
			
			case 2:
				System.out.println("You quickly duck behind a pillar, out of view from the window.");
				System.out.println("The figure does not see you. You live a moment more.");

				state = 4;
				break;
		
			case 3:
				System.out.println("You shout for someone, anyone, but there is no one who hears you.");
				System.out.println("Except one.");
				System.out.println("The DemiGorgon has found you.");
				System.out.println("You are unarmed, reckless, and cornered in the GC space. Bummer.");
				//Easter Egg Ending!
				windowAction = scan.nextLine();
				if(windowAction.equalsIgnoreCase("el!")){
					System.out.println("Just then, as you're sure the DemiGorgon will eat you...");
					System.out.println(" . \n . \n . \n El: " + name + "! Friends don't leave friends behind.");
					System.out.println("You see El standing behind the DemiGorgon.");
					System.out.println("She begins to transform. She turns into a bigger DemiGorgon!");
					System.out.println("She eats the DemiGorgon and leads you back to the overworld!");
					System.out.println("You win! Thanks for playing!");
				}
				state = 4;
				break;
			case 4:
				//GAME over
				continueGame = false;
				break;
				
			case 5:
				System.out.println("You creep out from what you assume is the Snug.");
				
				System.out.println("You find a bag of chips in the verri machine. Do you: eat it, save it");
				String chipsAction = scan.nextLine();
				
				if(chipsAction.equalsIgnoreCase("eat it")){
					state = 6;
				}else if(chipsAction.equalsIgnoreCase("save it")){
					state = 8;
				}
				break;
			case 6:
				System.out.println("You eat the chips.");
				System.out.println("you see a shadow dash from the elevator hallway.");
				System.out.println("The DemiGorgon draws near. He must have smelled your delicious food.");
				System.out.println("Do you: run, hide, fight");
				chipsAction = scan.nextLine();
				state = 7;
				break;
			case 7:
				System.out.println("Trick question. The DemiGorgon wins. He wanted those. I guess he loses too.");
				System.out.println("You were stealing anyway.");
				System.out.println("Nice job, theif. Nobody wins.");
				state = 4;
				break;
			case 8:
				System.out.println("You decide to hold on to the chips.");
				System.out.println("Maybe you're not hungry.");
				System.out.println("Maybe you're gluten free.");
				System.out.println("Maybe you're on a diet.");
				System.out.println("That's not really my concern.");
				System.out.println("You become aware of a presence in one of the former class rooms.");
				System.out.println("You become distressed as it is far too big to be human.");
				
				System.out.println("Do you: use decoy chips, calmly leave");
				chipsAction = scan.nextLine();
				if(chipsAction.equalsIgnoreCase("use decoy chips")){
					System.out.println("You open the bag of chips and throw them across the room before making a run for the exit.");
					System.out.println("The DemiGorgon devours them, but savors them, but definitely devours them.");
					System.out.println("I'm sorry. I know you wanted those chips.");
					state = 9;
				}else if(chipsAction.equalsIgnoreCase("calmly leave")){
					state = 12;
				}
				break;
			case 9:
				System.out.println("You make it to the first floor. There's a man in a hazmat suit facing away from you at the exit.");
				System.out.println("Do you: tackle and run, talk");
				String hazmatAction = scan.nextLine();
				if(hazmatAction.equalsIgnoreCase("tackle and run")){
					state = 10;
				} else if(hazmatAction.equalsIgnoreCase("talk")){
					state = 11;
				}
				break;
			case 10:
				System.out.println("You tackle the man in the hazmat suit and run away.");
				System.out.println("You wander the wastelands until you die from the black lung.");
				state = 4;
				break;
			case 11:
				System.out.println("You approach the man in the hazmat suit and explain your predicament.");
				System.out.println("He takes you back to the overworld where the government convinces everyone you were under the influence.");
				System.out.println("Still, they leave you alone, and you're not dead.");
				System.out.println("And you can just buy chips again. Isn't that great? Anyways, you win!");
				state = 4;
				break;
			case 12:
				System.out.println("You calmly walk to the nearest exit and take the stairs");
				System.out.println("Curse you and your level-headed demeanor!");
				state = 9;
				break;
			case 13:
				System.out.println("You call out into the urban abyss, hoping for some response");
				System.out.println("The wraith-like body stops and suddenly disappears");
				System.out.println("The DemiGorgon has found you.");
				System.out.println("You are unarmed, curious, and overly friendly. There was never hope for you.");
				state = 4;
				break;
			default:
				System.out.println("Wat. How'd you...? Eh. You died, I guess.");
				state = 4;
				break;
				
		}
		}
		scan.close();
		return;
		}

	}
}
	


