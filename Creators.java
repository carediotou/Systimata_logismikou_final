
public class Creators {
	static Creators creators[]= new Creators[10];
	private String name;
	private int birthdate;
	private int died;
	private Heroes heroname;
	static int counterCreators=0;

	public Creators(String name ,int birthdate , int died, Heroes heroname) {
			this.name=name;
			this.birthdate=birthdate;
			this.died=died;
			this.heroname=heroname;
			creators[counterCreators]=this;
			++counterCreators;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	public int getBirthdate() {
		return birthdate;
	}
	public void setBirthdate(int birthdate) {
		this.birthdate=birthdate;
	}
	public int getDied() {
		return died;
	}
	public void setDied(int died) {
		this.died=died;
	}
	public Heroes getHeroName() {
		return heroname;
	}
	public void setHeroName(Heroes heroname) {
		this.heroname=heroname;
	}
	public String toString() {
		return "Creators [name=" +name + ",Birth Date=" +birthdate+ ",Died=" +died+ ",Notablework="+ heroname.getHeroName()+ "]";
	}

}
