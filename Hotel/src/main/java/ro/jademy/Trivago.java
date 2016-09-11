/**
 * 
 */
package ro.jademy;

/**
 * @author Andrei
 *
 */
public class Trivago {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Agentie booking = new Agentie("Calipso") ;
		Sejur mySejur = new Sejur();
		Hotel myHotel = new Hotel();
		
		myHotel.numeHotel = "Perla" ;
		myHotel.setPretNoapte(50);
		
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(1);
		booking.addSejur(1,mySejur);
		
		myHotel = new Hotel();
		myHotel.numeHotel = "Aeolis" ;
		myHotel.setPretNoapte(40);
		mySejur = new Sejur();
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(2);
		booking.addSejur(1,mySejur);
		
		myHotel = new Hotel();
		myHotel.numeHotel = "Acrotiris" ;
		myHotel.setPretNoapte(60);
		mySejur = new Sejur();
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(1);
		booking.addSejur(1,mySejur);
		
		myHotel = new Hotel();
		myHotel.numeHotel = "Aeolis" ;
		myHotel.setPretNoapte(40);
		mySejur = new Sejur();
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(7);
		booking.addSejur(2,mySejur);
		
		myHotel = new Hotel();
		myHotel.numeHotel = "Acrotiris" ;
		myHotel.setPretNoapte(60);
		mySejur = new Sejur();
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(7);
		booking.addSejur(3,mySejur);
		
		
		
		System.out.println("Pentru agentia " + booking.numeAgentie + " avem urmatoarele oferte:\n" + booking.pretSejur());
		
		Agentie floo = new Agentie("Negru") ;
		
		myHotel = new Hotel();
		
		myHotel.numeHotel = "Perla" ;
		myHotel.setPretNoapte(50);
		
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(1);
		floo.addSejur(4,mySejur);
		
		myHotel = new Hotel();
		myHotel.numeHotel = "Aeolis" ;
		myHotel.setPretNoapte(40);
		mySejur = new Sejur();
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(2);
		floo.addSejur(4,mySejur);
		
		myHotel = new Hotel();
		myHotel.numeHotel = "Acrotiris" ;
		myHotel.setPretNoapte(60);
		mySejur = new Sejur();
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(1);
		floo.addSejur(4,mySejur);
	/*	
		myHotel = new Hotel();
		
		myHotel.numeHotel = "Perla" ;
		myHotel.setPretNoapte(50);
		
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(7);
		floo.addSejur(5,mySejur);
	*/	
		creeazaSejur("Perla",50,7,5,floo);
		
		System.out.println("Pentru agentia " + floo.numeAgentie + " avem urmatoarele oferte:\n" + floo.pretSejur());
	}
/**
 * 
 * @param numeHotel aici scriem numele hotelului
 * @param pretNoapte
 * @param numarNopti
 * @param nrSejur
 * @param agentie
 */
	private static void creeazaSejur(String numeHotel, int pretNoapte , int numarNopti ,int nrSejur , Agentie agentie ){
		
		Hotel myHotel = new Hotel();
		
		myHotel.numeHotel = "Perla" ;
		myHotel.setPretNoapte(50);
		
		Sejur mySejur = new Sejur();
		mySejur.setCazare(myHotel);
		mySejur.setNumarNopti(7);
		agentie.addSejur(5,mySejur);
	}
		
}
