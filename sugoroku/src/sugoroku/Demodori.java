package sugoroku;

public class Demodori extends Cell {

	public Demodori() {
	}

	@Override
	public boolean doEvent(Coma coma) {
		coma.proceed(-2);
		return false;
	}

	@Override
	public String getCaption() {
		return "ピラニアの河";
	}

}
