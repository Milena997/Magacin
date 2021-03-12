package artikal;

import java.util.LinkedList;

import interfaceMagacin.InterfaceMagacin;

public class Magacin implements InterfaceMagacin {

	public LinkedList<Artikal> artikli= new LinkedList<>();
	@Override
	public void dodajArtikal(Artikal artikal) {
		if(artikal!=null) {
		artikli.add(artikal);
		}
		
	}

	@Override
	public void izbaciArtikal(Artikal artikal) {
		if(artikal!=null) {
		artikli.remove(artikal);
		}
		
	}

	@Override
	public Artikal nadjiArtikal(int sifra) {
		if(sifra>0) {
		
		for(Artikal artikal: artikli) {
			
			if(artikal.getSifra()==sifra) {
				return artikal;
			}
			
		}
		}
		return null;
	}


}
