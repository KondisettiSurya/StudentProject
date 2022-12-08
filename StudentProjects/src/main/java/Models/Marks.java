package Models;

public class Marks {

	
	private int Rollnumber;
	
	private int English;
	
	private int Hindi;
	
	private int Telugu;
	
	private int Maths;
	
	private int Science;
	
	private int Social;
	
	

	public Marks(int rollnumber, int english, int hindi, int telugu, int maths, int science, int social) {
		super();
		Rollnumber = rollnumber;
		English = english;
		Hindi = hindi;
		Telugu = telugu;
		Maths = maths;
		Science = science;
		Social = social;
	}

	public Marks() {
		// TODO Auto-generated constructor stub
	}

	public int getRollnumber() {
		return Rollnumber;
	}

	public void setRollnumber(int rollnumber) {
		Rollnumber = rollnumber;
	}

	public int getEnglish() {
		return English;
	}

	public void setEnglish(int english) {
		English = english;
	}

	public int getHindi() {
		return Hindi;
	}

	public void setHindi(int hindi) {
		Hindi = hindi;
	}

	public int getTelugu() {
		return Telugu;
	}

	public void setTelugu(int telugu) {
		Telugu = telugu;
	}

	public int getMaths() {
		return Maths;
	}

	public void setMaths(int maths) {
		Maths = maths;
	}

	public int getScience() {
		return Science;
	}

	public void setScience(int science) {
		Science = science;
	}

	public int getSocial() {
		return Social;
	}

	public void setSocial(int social) {
		Social = social;
	}
	
	
}
