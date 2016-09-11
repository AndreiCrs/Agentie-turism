/**
 * 
 */
package ro.jademy;

import java.util.ArrayList;

/**
 * @author Andrei
 *
 */
public class PachetSejur {

	private ArrayList<Sejur> pachet = new ArrayList<Sejur>();
	private int index ;
	public void addSejur(Sejur sejur){
		pachet.add(sejur);
	};
	
	public int pretPachet(){
		int pretTotal = 0 ;
		for (Sejur sejur : pachet) {
			pretTotal += sejur.pretSejur() ;
		}
		return pretTotal ;
		
		
	}

	/**
	 * @return the index
	 */
	public int getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(int index) {
		this.index = index;
	}
}
