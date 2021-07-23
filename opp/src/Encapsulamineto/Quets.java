package Encapsulamineto;

public class Quets {
	private static final int NOT_PICKED = 0 ; 
	private static final int PICKED = 1; 
	private static final int COMPLETD = 2 ;
	
	private String title ;
	private int reward ; 
	private int  status ; 
	
	public Quets(String title , int reward , int status ) {
		
		this.title= title ;
		this.reward = reward ; 
		this.status = status ; 
		
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReward() {
		return reward;
	}

	public void setReward(int reward) {
		this.reward = reward;
	}
	
	public void changeToPICKED() {
		this.status = PICKED ;
	}
	public void changeToNOT_PICKED() {
		this.status = NOT_PICKED ;
	}
    public void changeToCOMPLETD() {
	    this.status = COMPLETD ;
}
}