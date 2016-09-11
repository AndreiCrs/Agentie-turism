/**
 * 
 */
package ro.jademy;

/**
 * @author Andrei
 *
 */
public class Sejur {

	private int numarNopti ;
	private Hotel cazare ;
	
	public Sejur (){
		
	}

	/**
	 * @return the numarNopti
	 */
	public int getNumarNopti() {
		return numarNopti;
	}

	/**
	 * @param numarNopti the numarNopti to set
	 */
	public void setNumarNopti(int numarNopti) {
		this.numarNopti = numarNopti;
	}

	/**
	 * @return the cazare
	 */
	public Hotel getCazare() {
		return cazare;
	}

	/**
	 * @param cazare the cazare to set
	 */
	public void setCazare(Hotel cazare) {
		this.cazare = cazare;
	}

	
	public int pretSejur(){
		return this.numarNopti * this.cazare.getPretNoapte() ;
		
	}
}
