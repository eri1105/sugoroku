/**
 * 
 */
package sugoroku;

/**
 * すごろくの位置を表すコマクラス
 * @author 3d167 まつもとえり
 */
public class Coma {
	/**
	 * プレイヤーの名前
	 */
	private String name;
	/**
	 * 現在位置
	 */
	private int position;
	private int Point;


	/**
	 * コンストラクタ
	 * @param name プレイヤー名
	 */
	public Coma( String name) {
		this.name = name;
		this.position = 0;
	}
	/**
	 * このこまの現在位置を返します
	 * @return
	 */
	public int getPosition() {
		return this.position;
	}
	/**
	 * このこまが指定された分量進みます
	 * @param amount すすむ量
	 */
	public void proceed(int amount) {
		this.position += amount;
	}
	public void addPoint( int amount ) {
		System.out.println( name + "は" + amount + "ポイントをゲットした" );
		this.Point += amount;
	}
	public void showProfile() {
		System.out.println( name + "現在のポイントは" + Point + " " + position + "コマ目にいます" );
	}

}
