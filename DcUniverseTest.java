import java.util.Scanner;

public class DcUniverseTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		Heroes batman =new Heroes ("Batman","Bruce Wane","No Super Powers",1939,"https://www.google.gr/search?q=batman&rlz=1C1CHMO_elGR576GR576&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiyjtfl2pnZAhXIZ1AKHQzMB8IQ_AUICigB&biw=1366&bih=637#imgrc=Nku2xOU5H9p7bM");
		new Creators ("Robert Kahn",1915,1998,batman);

		Heroes ww=new Heroes ("Wonder Woman","Diana of Themyscira","Super Strength",1941,"https://www.google.gr/search?q=wonder+woman&rlz=1C1CHMO_elGR576GR576&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi314m83ZnZAhUQL1AKHYm6B6AQ_AUICigB&biw=1366&bih=637#imgrc=njHyjfulqJM-iM");
		new Creators ("William Moulton Marston",1893,1947,ww);

		Heroes flash=new Heroes ("Flash","Barry Allen","Super Fast",1940,"https://www.google.gr/search?q=flash&rlz=1C1CHMO_elGR576GR576&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjG-JCU5JnZAhVIiaYKHeeEDd8Q_AUICigB&biw=1366&bih=637#imgrc=j4-WYtjQRyWHGM");
		new Creators ("Harry Lampert",1916,2004,flash);

		while (true){
			System.out.println("**************** DC Universe****************");
			System.out.println("------------------ Menu --------------------");
			System.out.println("Type 1 to display Super Heroes List");
			System.out.println("Type 2 to search Creators information according to Notable Work");
			System.out.println("Type 3 to add a new Super Hero");
			System.out.println("Type 4 to find the oldest Super Hero");
			System.out.println("Type 5 to find a Super Heroand and change the year of creation");
			System.out.println("Type here:");

			int choice = scanner.nextInt();

			if (choice == 1){
				System.out.println("List of DC Universe Super Heroes : ");
				for (Heroes heroes: Heroes.heroes){
					if (heroes!= null)
						System.out.println(heroes.toString());
				}
			}

			else if (choice == 2){
				System.out.println("");
				System.out.println("Give the name of s Super Hero to see from who created by ");
				System.out.print(" Type here: ");
				String name=scanner.next();
						int counter=0;
						for(int y=0; y<Creators.creators.length; y++){

							if(Creators.creators[y] != null){
								if (Creators.creators[y].getHeroName().equals(name))
									System.out.println(Creators.creators[y].toString());
									counter++;
							}
						}
						if (counter==0) {
							System.out.println("No results found");
						}
			}

			else if (choice==3) {
				System.out.print("Insert Super Hero name: ");
				String name=scanner.next();
				System.out.print("Insert the true Identity: ");
				String identity=scanner.next();
				System.out.print("Insert the Super Power: ");
				String power=scanner.next();
				System.out.print("Insert the Creation Year :");
				int creationyear=scanner.nextInt();
				System.out.print("Insert Google Image Url: ");
				String url=scanner.next();
				Heroes NewHeroes = new Heroes(name,identity,power,creationyear,url);
				System.out.println(name +" has been stored");
			}

			else if(choice==4){
				int max=0;
				int row=0;
				int y;
				for(y=0; y<Heroes.heroes.length; y++){
					if(Heroes.heroes[y]!= null){
						if(max<Heroes.heroes[y].getCreationyear()){
							max=Heroes.heroes[y].getCreationyear();
							row=y;
						}
					}
				}
				System.out.println("the oldest Super Hero is " +Heroes.heroes[row].getHeroName()+" and his creation Year is " +max);
			}
			else if(choice==5){
				System.out.println("Insert a number between 0 and 9 to to see the details of a SuperHero in this index");
				int index=scanner.nextInt();

				if(Heroes.heroes[index]!= null){
						System.out.println("The Hero was found in index is " +Heroes.heroes[index].getHeroName());
						System.out.println("The creation date was:" +Heroes.heroes[index].getCreationyear());
						System.out.print("To change the Creation Year Type here a New year: ");
						int NewCyear=scanner.nextInt();
						Heroes.heroes[index].setCreationyear(NewCyear);
						System.out.println("The infomation have been changed: "+Heroes.heroes[index].toString());
				}
				else{
					System.out.println("There is no Infos about this Index");
				}


			}
			else{
				System.out.println("Wrong Input");
				System.out.println("Try again");

			}
		}
	}
}
