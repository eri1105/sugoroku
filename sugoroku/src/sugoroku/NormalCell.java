package sugoroku;
/**
 * ふつうなます
 * @author 3d167
 *
 */
public class NormalCell extends Cell {

	/**
	 * コンストラクタ
	 */
	public NormalCell() {
	}

	@Override
	public boolean doEvent(Coma coma) {
		coma.addPoint(100);
		return true;
	}

	@Override
	public String getCaption() {
		return "風が吹いている.....";
	}

}
