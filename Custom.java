import java.lang.NumberFormatException;
import java.util.Scanner;

abstract class Character
{
  public String classType = "";
  private String name = "";
  private int age = 0;
  private String gender = "";
  private String race = "";
  private String faceShape = "";
  private String hairStyle = "";
  private String hairColor = "";
  private String eyeShape = "";
  private String eyeBrow = "";
  private String eyeColor = "";
  private String noseModification = "";
  private String skinType = "";
  private String clothes = "";
  private String bodyBuild = "";
  private String facialFeatures = "";
  private String emote = "";
  private String headWear = "";
  private String accessories = "";
  private String familiar = "";
  private String quirks = "";

  public void setClasstype (String classType)
  {
    this.classType = classType;
  }

  public Character (Scanner scanner)
  {
    System.out.println ("Enter your character's name:");
    name = scanner.nextLine ();
    System.out.println ("Enter your character's age:");
    age = scanner.nextInt ();
	while(true){
		if(age < 1){
			System.out.println("Invalid age input");
			age = scanner.nextInt();
		} else {
			break;
		}
	}
    

    boolean menu = false;
    while (!menu)
      {
	System.out.println ("------MENU------");
	System.out.println
	  ("1.Gender\n2.Race\n3.Face Shape\n4.Hair Style\n5.Hair Color\n6.Eye shape\n7.Eye brow\n8.Eye color\n9.Nose Modifiction\n10.Skin type\n11.Clothes\n12.Body build\n13.Facial Feature\n14.Emote\n15.Head wear\n16.Accessories\n17.Familiar\n18.quirks\n19.Exit\nEnter your choice: ");
	String choice = scanner.nextLine ();
	//scanner.nextLine ();

	if (choice.matches("1"))
	  {
	    while(true){
	    String cgender;
		System.out.println("Enter your character's gender (1.Male/2.female/3.Other): ");
		cgender = scanner.nextLine();

		if (cgender.matches("1"))
		  {
		    gender = "Male";
			break;
		  }
		else if (cgender.matches("2"))
		  {
		    gender = "Female";
			break;
		  }
		else if (cgender.matches("3"))
		  {
		    gender = "Other";
			break;
		  }
		else
		  {
		    System.out.println ("Invalid Input");
		  }
	    }

	  }
	else if (choice.matches("2"))
	  {
	    while(true){
	        String crace;
		System.out.println
		  ("Enter your character's race (1.human/2.demon/3.giant/4.elve/5.Angel): ");
		crace = scanner.nextLine();

		if (crace.matches("1"))
		  {
		    race = "Human";
			break;
		  }
		else if (crace.matches("2"))
		  {
		    race = "Demon";
			break;
		  }
		else if (crace.matches("3"))
		  {
		    race = "Giant";
			break;
		  }
		else if (crace.matches("4"))
		  {
		    race = "Elve";
			break;
		  }
		else if (crace.matches("5"))
		  {
		    race = "Angel";
			break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }
	    }
	    

	  }
	else if (choice.matches("3"))
	  {
		while(true){
	    String cFaceshape;
		System.out.println("Enter your character's face shape (1.oval/2.diamond/3.round/4.square/5.oblong): ");
		cFaceshape = scanner.nextLine();

		if (cFaceshape.matches("1"))
		  {
		    faceShape = "Oval";
			break;
		  }
		else if (cFaceshape.matches("2"))
		  {
		    faceShape = "Diamon";
			break;
		  }
		else if (cFaceshape.matches("3"))
		  {
		    faceShape = "Round";
			break;
		  }
		else if (cFaceshape.matches("4"))
		  {
		    faceShape = "Square";
			break;
		  }
		else if (cFaceshape.matches("5"))
		  {
		    faceShape = "Oblong";
			break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }
	      }
	    

	  }
	else if (choice.matches("4"))
	  {
	      while(true){
	    String cHairStyle;
		System.out.println("your character's hair style (1.mohawk/2.fade/3.ponytail/4.pixie/5.clean head): ");
		cHairStyle = scanner.nextLine ();

		if (cHairStyle.matches("1"))
		  {
		    hairStyle = "Mohawk";
			break;
		  }
		else if (cHairStyle.matches("2"))
		  {
		    hairStyle = "Fade";
			break;
		  }
		else if (cHairStyle.matches("3"))
		  {
		    hairStyle = "Ponytail";
			break;
		  }
		else if (cHairStyle.matches("4"))
		  {
		    hairStyle = "Pixie";
			break;
		  }
		else if (cHairStyle.matches("5"))
		  {
		    hairStyle = "Clean head";
			break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }
	     }

	  }
	else if (choice.matches("5"))
	  {
                while(true){
	    String cHairCol;
		System.out.println("Enter your character's hair color (1.black/2.brown/3.blonde/4.grey/5.pink): ");
		cHairCol = scanner.nextLine ();

		if (cHairCol.matches("1"))
		  {
		    hairColor = "Black";
			break;
		  }
		else if (cHairCol.matches("2"))
		  {
		    hairColor = "Brown";
			break;
		  }
		else if (cHairCol.matches("3"))
		  {
		    hairColor = "Blode";
			break;
		  }
		else if (cHairCol.matches("4"))
		  {
		    hairColor = "Grey";
			break;
		  }
		else if (cHairCol.matches("5"))
		  {
		    hairColor = "Pink";
			break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

                }

	  }
	else if (choice.matches("6"))
	  {
                while(true){
	        String cEyeShape;
		System.out.println
		  ("Enter your character's eye shape (1.round/2.droopy/3.almond/4.hooded/5.wide set): ");
		cEyeShape =scanner.nextLine ();

		if (cEyeShape.matches("1"))
		  {
		    eyeShape = "Round";
			break;
		  }
		else if (cEyeShape.matches("2"))
		  {
		    eyeShape = "Droopy";
			break;
		  }
		else if (cEyeShape.matches("3"))
		  {
		    eyeShape = "Almond";
			break;
		  }
		else if (cEyeShape.matches("4"))
		  {
		    eyeShape = "Hooded";
			break;
		  }
		else if (cEyeShape.matches("5"))
		  {
		    eyeShape = "Wide set";
			break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("7"))
	  {
	    String cEyeBrow;
	    while(true)
	      {
		System.out.println
		  ("Enter your character's eye brow (1.thin/2.flat/3.short/4.straight/5.rounded): ");
		cEyeBrow = scanner.nextLine ();

		if (cEyeBrow.matches("1"))
		  {
		    eyeBrow = "Thin";
			break;
		  }
		else if (cEyeBrow.matches("2"))
		  {
		    eyeBrow = "Flat";
			break;
		  }
		else if (cEyeBrow.matches("3"))
		  {
		    eyeBrow = "Short";
			break;
		  }
		else if (cEyeBrow.matches("4"))
		  {
		    eyeBrow = "Straight";
			break;
		  }
		else if (cEyeBrow.matches("5"))
		  {
		    eyeBrow = "Rounded";
			break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("8"))
	  {
	    String cEyeCol;
	    while(true)
	      {
		System.out.println("Enter your character's eye color (1.black/2.brown/3.blonde/4.grey/5.blue): ");
		cEyeCol = scanner.nextLine ();

		if (cEyeCol.matches("1"))
		  {
		    eyeColor = "Black";
			break;
		  }
		else if (cEyeCol.matches("2"))
		  {
		    eyeColor = "Brown";
			break;
		  }
		else if (cEyeCol.matches("3"))
		  {
		    eyeColor = "Blonde";
			break;
		  }
		else if (cEyeCol.matches("4"))
		  {
		    eyeColor = "Grey"; break;
		  }
		else if (cEyeCol.matches("5"))
		  {
		    eyeColor = "Blue"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("9"))
	  {
	    String cNoseModi;
	    while(true)
	      {
		System.out.println("Enter your character's nose modification (1.straight/2.curve/3.raised/4.convex/5.lowered):");
		cNoseModi = scanner.nextLine ();

		if (cNoseModi.matches("1"))
		  {
		    noseModification = "Straight"; break;
		  }
		else if (cNoseModi.matches("2"))
		  {
		    noseModification = "Curve"; break;
		  }
		else if (cNoseModi.matches("3"))
		  {
		    noseModification = "Raised"; break;
		  }
		else if (cNoseModi.matches("4"))
		  {
		    noseModification = "Convex"; break;
		  }
		else if (cNoseModi.matches("5"))
		  {
		    noseModification = "Lowered"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("10"))
	  {
	    String cSkinT;
	    while(true)
	      {
		System.out.println("Enter your character's skin type (1.black/2.white/3.brown): ");
		cSkinT = scanner.nextLine ();

		if (cSkinT.matches("1"))
		  {
		    skinType = "Black"; break;
		  }
		else if (cSkinT.matches("2"))
		  {
		    skinType = "White"; break;
		  }
		else if (cSkinT.matches("3"))
		  {
		    skinType = "Brown"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	

	  }
	else if (choice.matches("11"))
	  {
	    String cClothes;
	    while(true)
	      {
		System.out.println("Enter your character's clothes (1.Robe/2.Armor/3.Leather/4.Cloth/5.Fur): ");
		cClothes = scanner.nextLine ();

		if (cClothes.matches("1"))
		  {
		    clothes = "Robe"; break;
		  }
		else if (cClothes.matches("2"))
		  {
		    clothes = "Armor"; break;
		  }
		else if (cClothes.matches("3"))
		  {
		    clothes = "Leather"; break;
		  }
		else if (cClothes.matches("4"))
		  {
		    clothes = "Cloth"; break;
		  }
		else if (cClothes.matches("5"))
		  {
		    clothes = "Fur"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	       

	  }
	else if (choice.matches("12"))
	  {
	    String cBodyBuild;
	    while(true)
	      {
		System.out.println("Enter your character's body build (1.slim/2.skinny/3.muscular): ");
		cBodyBuild = scanner.nextLine ();

		if (cBodyBuild.matches("1"))
		  {
		    bodyBuild = "Slim"; break;
		  }
		else if (cBodyBuild.matches("2"))
		  {
		    bodyBuild = "Skinny"; break;
		  }
		else if (cBodyBuild.matches("3"))
		  {
		    bodyBuild = "Muscular"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("13"))
	  {
	    String cFF;
	    while(true)
	      {
		System.out.println("Enter your character's facial features (1.scars/2.moles): ");
		cFF = scanner.nextLine ();

		if (cFF.matches("1"))
		  {
		    facialFeatures = "Scars"; break;
		  }
		else if (cFF.matches("2"))
		  {
		    facialFeatures = "Moles"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("14"))
	  {
	    String cEmote;
	    while(true)
	      {
		System.out.println("Enter your character's emote (1.sad/2.happy/3.confused/4.angry/5.bored): ");
		cEmote = scanner.nextLine ();

		if (cEmote.matches("1"))
		  {
		    emote = "Sad"; break;
		  }
		else if (cEmote.matches("2"))
		  {
		    emote = "Happy"; break;
		  }
		else if (cEmote.matches("3"))
		  {
		    emote = "Confused"; break;
		  }
		else if (cEmote.matches("4"))
		  {
		    emote = "Angry"; break;
		  }
		else if (cEmote.matches("5"))
		  {
		    emote = "Bored"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("15"))
	  {
	    String cHeadwear;
	    while(true)
	      {
		System.out.println("Enter your character's head wear (1.straw hat/2.helmet/3.mask/4.hood): ");
		cHeadwear = scanner.nextLine ();

		if (cHeadwear.matches("1"))
		  {
		    headWear = "Straw hat"; break;
		  }
		else if (cHeadwear.matches("2"))
		  {
		    headWear = "Helmet"; break;
		  }
		else if (cHeadwear.matches("3"))
		  {
		    headWear = "Mask"; break;
		  }
		else if (cHeadwear.matches("4"))
		  {
		    headWear = "Hood"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("16"))
	  {
	    String cAccesso;
	    while(true)
	      {
		System.out.println("Enter your character's accessories (1.rings/2.pendant/3.bracelet): ");
		cAccesso = scanner.nextLine ();

		if (cAccesso.matches("1"))
		  {
		    accessories = "Rings"; break;
		  }
		else if (cAccesso.matches("2"))
		  {
		    accessories = "Pendant"; break;
		  }
		else if (cAccesso.matches("3"))
		  {
		    accessories = "Bracelet"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("17"))
	  {
	    String cFam;
	    while(true)
	      {
		System.out.println("Enter your character's familiar/pet (1.pegasus/2.phoenix/3.dragon/4.tiger/5.griffith): ");
		cFam = scanner.nextLine ();

		if (cFam.matches("1"))
		  {
		    familiar = "Pegasus"; break;
		  }
		else if (cFam.matches("2"))
		  {
		    familiar = "Phoenix"; break;
		  }
		else if (cFam.matches("3"))
		  {
		    familiar = "Dragon"; break;
		  }
		else if (cFam.matches("4"))
		  {
		    familiar = "Tiger"; break;
		  }
		else if (cFam.matches("5"))
		  {
		    familiar = "Griffith"; break;
		  }
		else
		  {
		    System.out.println ("Invalid input");
		  }

	      }
	    

	  }
	else if (choice.matches("18"))
	  {
	    String cQuirks;
	    while(true)
	      {
		System.out.println("Enter your character's quirks (1.freckles/2.tattoos/3.different eye colors): ");
		cQuirks = scanner.nextLine ();

		if (cQuirks.matches("1"))
		  {
		    quirks = "freckles"; break;
		  }
		else if (cQuirks.matches("2"))
		  {
		    quirks = "Tattoos"; break;
		  }
		else if (cQuirks.matches("3"))
		  {
			boolean eye = false;
		    while(!eye){
				System.out.println("Please make sure you have input for the eye color before you pick another color press 6 to exit if you have not pick yet" + "Enter a number for the other eye color (1.black/2.brown/3.blonde/4.grey/5.blue): ");
				String input = scanner.nextLine();

				String otherEye = "";

				if(input.matches("1")){
					otherEye = "Black";
				}else if(input.matches("2")){
					otherEye = "Brown";
				}else if(input.matches("3")){
					otherEye = "Blonde";
				}else if(input.matches("4")){
					otherEye = "Grey";
				}else if(input.matches("5")){
					otherEye = "Blue";
				}else if(input.matches("6")){
					System.out.println("Exit");
					break;
				} else {
					System.out.println("Invalid input! Please enter a number between 1 and 5.");
					continue;
				}

				if(eyeColor.equals(otherEye)){
					System.out.println("Invalid input! Please pick another color.");
				} else {
					eyeColor = eyeColor + " and " + otherEye;
					quirks = "Two different eye colors";
					break;
				}
				eye = true;
			
			}
			break;
		  }
		else
		  {
		    System.out.println ("Invalid Input");
		  }

	      }
	    

	  } else if (choice.matches("19")){
	      menu = true;
	  } else {
	      System.out.println("Invalid input");
	  }

      }
  }


  public String getName ()
  {
    return name;
  }

  public int getAge ()
  {
    return age;
  }

  public String getGender ()
  {
    return gender;
  }

  public String getFaceShape ()
  {
    return faceShape;
  }

  public String getHairStyle ()
  {
    return hairStyle;
  }

  public String getHairColor ()
  {
    return hairColor;
  }

  public String getEyeColor ()
  {
    return eyeColor;
  }

  public String getSkinType ()
  {
    return skinType;
  }

  public String getClothes ()
  {
    return clothes;
  }

  public String getClassType ()
  {
    return classType;
  }

  public String getBodyBuild ()
  {
    return bodyBuild;
  }

  public String getRace ()
  {
    return race;
  }

  public String getEyeBrow ()
  {
    return eyeBrow;
  }

  public String getEyeShape ()
  {
    return eyeShape;
  }

  public String getFacialFeatures ()
  {
    return facialFeatures;
  }

  public String getNoseModification ()
  {
    return noseModification;
  }

  public String getFamiliar ()
  {
    return familiar;
  }

  public String getEmote ()
  {
    return emote;
  }

  public String getHeadWear ()
  {
    return headWear;
  }

  public String getAccessories ()
  {
    return accessories;
  }

  public String getQuirks ()
  {
    return quirks;
  }

  public abstract void display ();

  public abstract void specialAbility ();


}


class Mage extends Character
{
  private int magicPower;

  public Mage (Scanner scanner)
  {
    super (scanner);
    setClasstype ("Mage");
    int skill = 0;
    while(skill < 1 || skill > 100){
        System.out.println ("Enter your mage's magic power (1-100):"); 
        while(true){
			try{
				skill = Integer.parseInt(scanner.nextLine());
				boolean check = false;
				while(!check){
					if (skill >= 1 || skill <= 100){
					magicPower = skill;
					check = true;
				} else {
					System.out.println("Invalid input");
				}
				}
				
				break;
			} catch (NumberFormatException e){
				System.out.println("error invalid");
				System.out.println("Please enter number from 1 to 100");
			}
		}
    }
  }

   @Override public void display ()
  {
    System.out.println
      ("You have created a mage character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("Magic power: " + magicPower);

  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your Mage can cast powerful spells using their magic power.");
  }
}

class Assassin extends Character
{
  private int stealthSkill;
  private String weapon;
  private String enchantment;

  void setWeapon(String enchant){
	enchant = "No enchantment";
	enchantment = enchant;
  }

  void setWeapon(String enchant, Scanner scanner){
	while (true){
				System.out.println("Choose an enchantment for your weapon \n1.Flame \n2.Frostbite \n3.Stun \nEnter a number of your choice: ");
				String eBow = scanner.nextLine();
				

				if(eBow.matches("1")){
					enchant = " Flame enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;
					break;
				}else if(eBow.matches("2")){
					enchant = "Frostbite enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;
					break;
				}else if(eBow.matches("3")){
					enchant = "Stun enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;			
					break;
				}else {
					System.out.println("Invalid input");
				}
			}
  }

  public Assassin (Scanner scanner)
  {
    super (scanner);
    setClasstype ("Assassin");
    int skill = 0;
    while(skill < 1 || skill > 100){
        System.out.println ("Enter your assassin's stealth skill (1-100):"); 
        while(true){
			try{
				skill = Integer.parseInt(scanner.nextLine());
				boolean check = false;
				while(!check){
					if (skill >= 1 || skill <= 100){
					stealthSkill = skill;
					check = true;
				} else {
					System.out.println("Invalid input");
				}
				}
				
				break;
			} catch (NumberFormatException e){
				System.out.println("error invalid");
				System.out.println("Please input a number from 1 to 100");
			}
		}
    }

	boolean e = false;
	while(!e){
		System.out.println("Enter your weapon \n1.Dagger \n2.Short Sword \nEnter: ");
		String choice = scanner.nextLine();
		if(choice.matches("1")){
			weapon = "Dagger";
			boolean dag = true;
			while(dag){
				
				System.out.println("Do you want a enchantment for your weapon?(Y/N): ");
				char input = scanner.next().charAt(0);

				if(input == 'Y' || input == 'y'){
					setWeapon(enchantment, scanner);
					dag = false;
				}else if(input == 'N' || input == 'n'){
					setWeapon("plain");
					dag = false;
				}else {
					System.out.println("Invalid input. Please enter Y for yes or N for no.");
				}
			}
			e = true;
		}else if(choice.matches("2")){
			weapon = "Short Sword";
			boolean ss = true;
			while(ss){
				
				System.out.println("Do you want a enchantment for your weapon?(Y/N): ");
				char input = scanner.next().charAt(0);

				if(input == 'Y' || input == 'y'){
					setWeapon(enchantment, scanner);
					ss = false;
				}else if(input == 'N' || input == 'n'){
					setWeapon(enchantment);
					ss = false;
				}else {
					System.out.println("Invalid input. Please enter Y for yes or N for no.");
				}
			}
			e = true;
		}else{
			System.out.println("Invalid input");
		}
		
	}

  }

   @Override public void display ()
  {
    System.out.println
      ("You have created an assassin character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("stealthSkill: " + stealthSkill);
	System.out.println ("Weapon: " + weapon + "with a " + enchantment);
  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your Asssassin can cast heavy damage with stealth skill.");
  }
}

class Tank extends Character
{
  private int defensePower;

  public Tank (Scanner scanner)
  {
    super (scanner);
    setClasstype ("Tank");
    int skill = 0;
    while(skill < 1 || skill > 100){
        System.out.println ("Enter your tank's defense power (1-100):"); 
        while(true){
			try{
				skill = Integer.parseInt(scanner.nextLine());
				boolean check = false;
				while(!check){
					if (skill >= 1 || skill <= 100){
					defensePower = skill;
					check = true;
				} else {
					System.out.println("Invalid input");
				}
				}
				
				break;
			} catch (NumberFormatException e){
				System.out.println("error invalid");
				System.out.println("Please input a number from 1 to 100");
			}
		}
    }
  }

   @Override public void display ()
  {
    System.out.println
      ("You have created a tank character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("Defense power: " + defensePower);
  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your tank can withstand heavy damage and protect your allies with their defense power.");
  }
}

class Fighter extends Character
{
  private int attackPower;
  private String weapon;
  private String enchantment;

  void setWeapon(String enchant){
	enchant = " No enchantment ";
	enchantment = enchant;
  }

  void setWeapon(String enchant, Scanner scanner){
	while (true){
				System.out.println("Choose an enchantment for your weapon \n1.Flame \n2.Frostbite \n3.Stun \nEnter a number of your choice: ");
				String eBow = scanner.nextLine();
				

				if(eBow.matches("1")){
					enchant = " Flame enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;
					break;
				}else if(eBow.matches("2")){
					enchant = "Frostbite enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;
					break;
				}else if(eBow.matches("3")){
					enchant = "Stun enchantment";
					System.out.println("You have chosen " + enchant);
					enchantment = enchant;			
					break;
				}else {
					System.out.println("Invalid input");
				}
			}
  }


  public Fighter (Scanner scanner)
  {
    super (scanner);
    setClasstype ("Fighter");

    int skill = 0;
    while(skill < 1 || skill > 100){
        System.out.println ("Enter your fighter's attack power (1-100):"); 
		while(true){
			try{
				skill = Integer.parseInt(scanner.nextLine());
				boolean check = false;
				while(!check){
					if (skill >= 1 || skill <= 100){
					attackPower = skill;
					check = true;
				} else {
					System.out.println("Invalid input");
				}
				}
				
				break;
			} catch (NumberFormatException e){
				System.out.println("error invalid");
				System.out.println("Please input a number from 1 to 100");
			}
		}

    }

	boolean e = false;
	while(!e){
		System.out.println("Enter your weapon \n1.Greatsword \n2.Battle Axe \nEnter: ");
		String choice = scanner.nextLine();
		if(choice.matches("1")){
			weapon = "Greatsword";
			boolean eGS = true;
			while(eGS){
				
				System.out.println("Do you want a enchantment for your weapon?(Y/N): ");
				char input = scanner.next().charAt(0);

				if(input == 'Y' || input == 'y'){
					setWeapon(enchantment, scanner);
					eGS = false;
				}else if(input == 'N' || input == 'n'){
					setWeapon("plain");
					eGS = false;
				}else {
					System.out.println("Invalid input. Please enter Y for yes or N for no.");
				}
			}
			e = true;
		}else if(choice.matches("2")){
			weapon = "Battle Axe";
			boolean eBA = true;
			while(eBA){
				
				System.out.println("Do you want a enchantment for your weapon?(Y/N): ");
				String input = scanner.nextLine();

			if(input.equalsIgnoreCase("y")){ 
					setWeapon(enchantment, scanner);
					eBA = false;
				}else if(input.equalsIgnoreCase("n")){
					setWeapon(enchantment);
					eBA = false;
				}else {
					System.out.println("Invalid input. Please enter Y for yes or N for no.");
				}
			}
			e = true;
		}else{
			System.out.println("Invalid input");
		}
		
	}
	
  }

   @Override public void display ()
  {
    System.out.println
      ("You have created a fighter character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("Attack power: " + attackPower);
	System.out.println ("Weapon: " + weapon + " with a " + enchantment);
  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your fighter can unleash powerful combos and deal massive damage with their attack power.");
  }
}

class Archer extends Character
{
  private int accuracySkill;
  private String bow;

  void setWeapon(String enchanted){
	enchanted = "Plain bow";
	bow = enchanted;
  }

    void setWeapon(String enchanted, Scanner scanner){
      while (true){
				System.out.println("Choose an enchantment for your bow \n1.Flaming Arrow \n2.Frostbite \n3.Seeker \nEnter: ");
				int eBow = scanner.nextInt();
				

				if(eBow == 1){
					enchanted = "Flaming Arrow bow";
					System.out.println("You have chosen " + enchanted);
					bow = enchanted;
					break;
				}else if(eBow == 2){
					enchanted = "Frostbite bow";
					System.out.println("You have chosen " + enchanted);
					bow = enchanted;
					break;
				}else if(eBow == 3){
					enchanted = "Seeker bow";
					System.out.println("You have chosen " + enchanted);
					bow = enchanted;
					break;
				}else {
					System.out.println("Invalid input");
				}
			}
	
  }

  
  public Archer (Scanner scanner) { 
    super (scanner); 
    setClasstype ("Archer"); 

    int skill = 0;
    while(skill < 1 || skill > 100){
        System.out.println ("Enter your archer's accuracy skill (1-100):"); 
        while(true){
			try{
				skill = Integer.parseInt(scanner.nextLine());
				boolean check = false;
				while(!check){
					if (skill >= 1 || skill <= 100){
					accuracySkill = skill;
					check = true;
				} else {
					System.out.println("Invalid input");
				}
				}
				
				break;
			} catch (NumberFormatException e){
				System.out.println("error invalid");
				System.out.println("please enter 1 to 100");
			}
		}
    }

    boolean e = false; 
    while (!e) { 
        System.out.println("Do want to add an enchantment to the bow? (Y/N)"); 
        String choice = scanner.nextLine();
        scanner.nextLine();   

        if(choice.equalsIgnoreCase("y")){ 
            setWeapon("enchanted", scanner); 
            e = true; 
        } else if(choice.equalsIgnoreCase("n")){ 
            setWeapon("Plain"); 
            e = true; 
        } else { 
            System.out.println("Invalid input. Please enter Y for yes or N for no."); 
        } 
    } 
}




   @Override public void display ()
  {
    System.out.println
      ("You have created an archer character with the following attributes:");
    System.out.println ("Class type: " + getClassType ());
    System.out.println ("Name: " + getName ());
    System.out.println ("Age: " + getAge ());
    System.out.println ("Gender: " + getGender ());
    System.out.println ("Race: " + getRace ());
    System.out.println ("Face shape: " + getFaceShape ());
    System.out.println ("Hair style: " + getHairStyle ());
    System.out.println ("Hair color: " + getHairColor ());
    System.out.println ("Eye shape: " + getEyeShape ());
    System.out.println ("Eye brow: " + getEyeBrow ());
    System.out.println ("Eye color: " + getEyeColor ());
    System.out.println ("Nose modification: " + getNoseModification ());
    System.out.println ("Skin type: " + getSkinType ());
    System.out.println ("Clothes: " + getClothes ());
    System.out.println ("Body build: " + getBodyBuild ());
    System.out.println ("Facial features: " + getFacialFeatures ());
    System.out.println ("Emote: " + getEmote ());
    System.out.println ("Head wear: " + getHeadWear ());
    System.out.println ("Accessories: " + getAccessories ());
    System.out.println ("Familiar: " + getFamiliar ());
    System.out.println ("Quirks: " + getQuirks ());
    System.out.println ("Accuracy skill: " + accuracySkill);
	System.out.println("Bow: " + bow);
  }

  @Override public void specialAbility ()
  {
    System.out.println
      ("Your archer can shoot arrows with pinpoint accuracy and hit enemies from a long distance with their accuracy skill.");
  }
}

interface CharacterCreationSystem
{
  public Character chooseClass (Scanner scanner);
  public void displayCharacter (Character character);
  public void showSpecialAbility (Character character);
}

class Game implements CharacterCreationSystem
{
  @Override 
  public Character chooseClass (Scanner scanner) {
    Character character = null;
    String choice;
    while (true) {
        System.out.println ("Choose your class:");
        System.out.println ("1. Mage");
        System.out.println ("2. Assassin");
        System.out.println ("3. Tank");
        System.out.println ("4. Fighter");
        System.out.println ("5. Archer");
		System.out.println ("6. Exit");

        choice = scanner.nextLine();
        

        if (choice.matches("1")) {
            character = new Mage(scanner);
        } else if (choice.matches("2")) {
            character = new Assassin(scanner);
        } else if (choice.matches("3")) {
            character = new Tank(scanner);
        } else if (choice.matches("4")) {
            character = new Fighter(scanner);
        } else if (choice.matches("5")) {
            character = new Archer(scanner);
        } else if(choice.matches("6")) {
            System.out.println("Exiting...");
			return null;
        } else {
			System.out.println("Invalid choice. Please try again. ");
		}

		if (character != null) {
			break;
		}
    }
    return character;
}


  @Override 
  public void displayCharacter (Character character)
  {
    if (character != null)
      {
	character.display ();
      }
    else
      {
	System.out.println ("No character created.");
      }
  }

  @Override public void showSpecialAbility (Character character)
  {
    if (character != null)
      {
	character.specialAbility ();
      }
    else
      {
	System.out.println ("No character created. therefore no special ability");
      }
  }
}

public class Custom {
	
	static void askmode() {
		Scanner input = new Scanner(System.in);
		
		boolean valid = false;
		
		while(!valid){
			System.out.println("Do you want to play in hard mode?(Y/N)");
		String ans = input.nextLine();
		
			if(ans.matches("y") || ans.matches("Y")){
				System.out.println("-----Hard Mode-----");
				valid = true;
			}else if (ans.matches("n") || ans.matches("N")){
				System.out.println("-----Normal Mode-----");
				valid = true;
			} else { System.out.println("Invalid output");
			continue;
	     }
		}
	}
	
    public static void main(String[] args) {
        try {
            String[] messages = {"In the realm of Eldoria", "\nwhere magic intertwines with reality, and mythical creatures roam the lands, a prophecy was foretold", "\nThe ancient scrolls spoke of a time when the world would be shrouded in darkness", "\nbrought upon by the malevolent sorcerer", "\nMorgath", "\nThe kingdom's only hope lies within you", "\nGoodluck Adventurer may the goddess guide you"};

            for (String message : messages) {
                printWithTypewriterEffect(message);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        Scanner scanner = new Scanner(System.in);
        boolean start = false;
        
        while (!start){
            System.out.println("\nPress 1 to Start or 2 to Exit: ");
            String intro = scanner.nextLine();

            if (intro.matches("1")){
                boolean custom = false;
                while(!custom){
                    Game game = new Game ();
                    Character character = game.chooseClass (scanner);
                    if (character == null) {
                        System.out.println("Press 1 to restart or 2 to quit the game");
                        int choice = scanner.nextInt();
                        if (choice == 1) {
                            continue;
                        } else if (choice == 2) {
							character = null;
                            System.out.println("Quitting game");
							scanner.close();
                            System.exit(0);
                        }
                    }
                    game.displayCharacter (character);
                    game.showSpecialAbility (character);
                    boolean con = false;
                    while (!con){
                        System.out.println("Do you confirm these attributes? (1.YES/2.NO): ");
                        String conf = scanner.nextLine();
                        if(conf.matches("1")){
							askmode();
                            System.out.println("------Entering the world------");
                            custom = true;
                            con = true;
                        } else if (conf.matches("2")){
                            custom = false;
                            con = true;
                        } else {
                            System.out.println("Invalid output");
                        }
						
                    }
                }
                start = true;
                
            } else if(intro.matches("2")) {
                System.out.println("Quitting game");
                start = true;
            } else {
                System.out.println("Invalid input");
            }
        }
    }

    public static void printWithTypewriterEffect(String message) throws InterruptedException {
        for (char c : message.toCharArray()) {
            System.out.print(c);
            Thread.sleep(20); 
        }
        System.out.println();
    }
}
