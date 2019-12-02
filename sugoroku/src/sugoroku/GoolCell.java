package sugoroku;

public class GoolCell extends Cell {

	public GoolCell() {
	}

	@Override
	public boolean doEvent(Coma coma) {
		return false;
	}

	@Override
	public String getCaption() {
		return "アマゾン";
	}

}
