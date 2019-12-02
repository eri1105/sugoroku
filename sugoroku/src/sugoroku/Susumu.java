package sugoroku;

public class Susumu extends Cell {

	public Susumu() {
	}

	@Override
	public boolean doEvent(Coma coma) {
		coma.proceed(+1);
		return false;
	}

	@Override
	public String getCaption() {
		return "筋斗雲";
	}

}
