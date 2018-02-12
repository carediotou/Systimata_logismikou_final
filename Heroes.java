public class Heroes {
	static Heroes heroes[]=new Heroes [10];
	private String heroname;
	private String identity;
	private String power;
	private int creationyear;
	private String url;
	static int counterHeroes=0;

	public Heroes(String heroname, String identity, String power, int creationyear, String url) {
		this.heroname=heroname;
		this.identity=identity;
		this.power=power;
		this.creationyear=creationyear;
		this.url=url;
		heroes[counterHeroes]=this;
		++counterHeroes;
	}

	public String getHeroName() {
		return heroname;
	}
	public void setHeroName(String heroname) {
		this.heroname=heroname;
	}
	public String getIdentity() {
		return identity;
	}
	public void setIdentity(String Identity) {
		this.identity=identity;
	}
	public String getPower() {
		return power;
	}
	public void setPower(String power) {
		this.power=power;
	}
	public int getCreationyear() {
		return creationyear;
	}
	public void setCreationyear(int creationyear) {
		if(creationyear>0){
			this.creationyear=creationyear;
		}
		else{
			System.out.println("Creation year hasn't changed because the number was worng");
		}
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url=url;
	}


	public String toString() {
		return "- Super Heroe: "+ heroname + "\n  ~ Real Identity: " + identity +"\n  ~ Power: " + power+ "\n  ~ Creation Year: "+creationyear+ "\n  ~ Google Image Url: " + url;
	}
}
