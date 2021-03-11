package artikal;

import java.util.Date;

public class KucnaHemija extends Artikal {
	
	private Date rokTrajanja;

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		if(rokTrajanja==null) {
			throw new RuntimeException("Datum nije pravilno upisan");
		}
		this.rokTrajanja = rokTrajanja;
	}

	@Override
	public String toString() {
		return "KucnaHemija [rokTrajanja=" + rokTrajanja + "]";
	}


	
	

}
