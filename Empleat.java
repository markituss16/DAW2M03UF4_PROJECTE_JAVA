package portAventura_atraccions;

public class Empleat extends Persona implements IEmpleat{
	private int idEmpleat;
	private ESalariEmpleat salari;
	
	public Empleat(String nom, String cognom, String DNI, int telefon, int idEmpleat, ESalariEmpleat salari,double altura) {
		super(nom, cognom, DNI, telefon,altura);
		this.idEmpleat = idEmpleat;
		this.salari = salari;
	}

	public int getIdEmpleat() {
		return idEmpleat;
	}

	public void setIdEmpleat(int idEmpleat) {
		this.idEmpleat = idEmpleat;
	}

	public ESalariEmpleat getSalari() {
		return salari;
	}

	public void setSalari(ESalariEmpleat salari) {
		this.salari = salari;
	}

	@Override
	public String toString() {
		return "Empleat [idEmpleat=" + idEmpleat + ", salari=" + salari + ", tipusTreball=" + ", nom="
				+ nom + ", cognom=" + cognom + ", DNI=" + DNI + ", telefon=" + telefon + ", altura=" + altura + "]";
	}

	@Override
	public String comprovarSeguretat(Atraccio a){
        return a.getSeguretatAtraccio().toString();
    }

	@Override
	public String comprovarAltura(Visitant v, Atraccio a){
        if(v.getAltura()>=a.getAlturaMin()){
            return "OK";
        }
        return "OUT";
    }

	@Override
	public String comprovaEntrada(Visitant v){
        if(v.getEntrada()!=null){
            return "OK";
        }
        return "Fer fora";
    }
}
