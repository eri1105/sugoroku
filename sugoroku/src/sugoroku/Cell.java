/**
 * 
 */
package sugoroku;

/**
 * すごろくに使用されるマス目を表現する 抽象基底クラス
 * @author 3d167
 *
 */
public abstract class Cell {
	/**
	 * コンストラクタ (new できないので protectedにしておく）
	 */
	protected Cell() {
	}
	/**
	 * なにかしらのイベントを実行できる予定
	 * TODO まだどうするかは決まっていない
	 */
	public abstract boolean doEvent( Coma coma );
	/**
	 * マス目の表示名
	 * @return 表示文字列
	 */
	public abstract String getCaption();

}


