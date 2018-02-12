import java.util.Scanner;

public class DcUniverseTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);

		Heroes batman =new Heroes ("Batman","Bruce Wane","No Super Powers",1939,"https://www.google.gr/search?q=batman&rlz=1C1CHMO_elGR576GR576&source=lnms&tbm=isch&sa=X&ved=0ahUKEwiyjtfl2pnZAhXIZ1AKHQzMB8IQ_AUICigB&biw=1366&bih=637#imgrc=Nku2xOU5H9p7bM");
		new Creators ("Robert Kahn",1915,1998,batman);

		Heroes ww=new Heroes ("WonderWoman","Diana of Themyscira","Super Strength",1941,"https://www.google.gr/search?q=wonder+woman&rlz=1C1CHMO_elGR576GR576&source=lnms&tbm=isch&sa=X&ved=0ahUKEwi314m83ZnZAhUQL1AKHYm6B6AQ_AUICigB&biw=1366&bih=637#imgrc=njHyjfulqJM-iM");
		new Creators ("William Moulton Marston",1893,1947,ww);

		Heroes flash=new Heroes ("Flash","Barry Allen","Super Fast",1940,"https://www.google.gr/search?q=flash&rlz=1C1CHMO_elGR576GR576&source=lnms&tbm=isch&sa=X&ved=0ahUKEwjG-JCU5JnZAhVIiaYKHeeEDd8Q_AUICigB&biw=1366&bih=637#imgrc=j4-WYtjQRyWHGM");
		new Creators ("Harry Lampert",1916,2004,flash);

		while (true){
			System.out.println("**************** DC Universe****************");
			System.out.println("------------------ Menu --------------------");
			System.out.println("Type 1 to display Super Heroes List");
			System.out.println("Type 2 to search Creators information according to Notable Work");
			System.out.println("Type 3 to add a new Super Hero");
			System.out.println("Type 4 to find the newest Super Hero");
			System.out.println("Type 5 to find a Super Hero and change the year of creation");
			System.out.println("Type here:");

			int choice = scanner.nextInt();

			if (choice == 1){
				System.out.println("List of DC Universe Super Heroes : ");
				/*for (Heroes heroes: Heroes.heroes){
					if (heroes!= null)
						//System.out.println(Heroes.heroes[counterHeroes]);
					    System.out.println(heroes.toString());
				}*/
				for(int y=0; y<Heroes.heroes.length; y++) {
					if(Heroes.heroes[y] != null) {
						System.out.println("---- Hero "+(y+1)+" ----");
						System.out.println(Heroes.heroes[y].toString());
						System.out.println("");
					}
				}
			}

			else if (choice == 2){
				System.out.println("");
				System.out.println("Give the name of a Super Hero to see from whom he is created by.");
				System.out.print("Type here: ");
				String name = scanner.next();
				int counter=0;
				for(int y=0; y<Heroes.heroes.length; y++){
					if(Heroes.heroes[y] != null){
						if (Heroes.heroes[y].getHeroName().equals(name)) {
							System.out.println(Creators.creators[y].toString());
							System.out.println("");
							counter++;
						}
					}
				}
				if (counter==0)
					System.out.println("No results found");
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
				System.out.println("");
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
				System.out.println("The newest Super Hero is " +Heroes.heroes[row].getHeroName()+" and his creation Year is " +max);
				System.out.println("");
			}
			else if(choice==5){
				int count = 0;
				for(int y=0; y<Heroes.heroes.length; y++){
					if(Heroes.heroes[y] != null){
						++count;
					}
				}
				System.out.println("Insert a number between 1 and "+count+" to to see the details of a SuperHero in this index.");
				int index=scanner.nextInt() - 1;

				if(Heroes.heroes[index]!= null){
						System.out.println("The Hero was found in index is " +Heroes.heroes[index].getHeroName());
						System.out.println("The creation date is:" +Heroes.heroes[index].getCreationyear());
						System.out.print("If you want to change the Creation Year press 0. If you want to continue press 1.");
						System.out.println("");
						int type = scanner.nextInt();
						if(type == 0) {
							System.out.println("Enter the year of your choice :");
							int NewCyear=scanner.nextInt();
							Heroes.heroes[index].setCreationyear(NewCyear);
							System.out.println(Heroes.heroes[index].toString());
							System.out.println("");
							System.out.println("");
						}
						else continue;

				}
				else
					System.out.println("There are no Infos about this Index.");

			}
			else {
				System.out.println("Wrong Input, please try again.");
				System.out.println("");
			}

	}
  }
}


