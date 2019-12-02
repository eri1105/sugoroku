package sugoroku;

import java.util.Random;
import java.util.Scanner;

/**
 * すごろくチャレンジ
 * @author 3d167
 *
 */
public class Main {

	/**
	 * すごろくインスタンスで使用する乱数発生装置
	 */
	private Random rand = new Random();
	/**
	 * すごろくインスタンスで使用する入力装置
	 */
	private Scanner input = new Scanner(System.in);
	/**
	 * すごろくのマス目配列
	 */
	private Cell[] path;
	/**
	 * プレイヤーのこま
	 */
	private Coma player;



	/**
	 * すごろくのメインプログラム
	 * @param args 起動時引数
	 */
	public static void main(String[] args) {

		// ダイスがあるはず
		// 升目があるはず
		//      ふりだし あがり その他 いろいろなマスがあるはず
		// プレイヤー
		//      どの位置にいるかを記録しておく必要があるはず
		//      お金の概念はいれるのか？

		// どんなマス目が存在しているのか 画面に出たほうがいいよね
		//尚早するならそれぞれんｐプレイヤーの位置がどこかわからないとね

		//	Main m = new Main();
		//	m.run();
		new Main().run();

	}
	/**
	 * すごろくのプログラムの動作
	 */
	private void run() {
		// ゲームを始めるための処理
		initGame();
		// ターンを繰り返し
		do {
			showPath();

			//プレイヤーがダイスを振る
			System.out.println("ダイスを振ってね◆（エンターキー入力(*^-^*)）");
			input.nextLine(); // 入力まち（データは読み取らない）
			int proceed = rand.nextInt(4) + 1;//1~4 のどれか適当に
			System.out.println( proceed + "がでたよ");

			//こまを出目分進める
			player.proceed(proceed);

			int pos = player.getPosition();

			if( pos < path.length ) {
				Cell now = path[pos];
				//どんなマスに来たのか情報を出す
				System.out.println( now.getCaption() );
				//マスに割り振られたおベントが発生する
				now.doEvent(player);
				player.showProfile();
			}

			// もしゴールだったら ゲーム終了
			boolean goal = path.length - 1 <= player.getPosition();
			if( goal ) {
				System.out.println("ゴールだよん！");
				break;
			}

		} while(true);
		//ゲームが終わった時の処理
		exitGame();
	}
	/**
	 * 現状のすごろく状態を表示する
	 */
	private void showPath() {
		for (int i = 0; i < path.length; i++) {
			if( i < 10 ) {
				System.out.print(" ");
			}
			System.out.print( i + " ");
		}
		System.out.println();

		for (int i = 0; i < path.length; i++) {
			if( i != player.getPosition() ) {
				System.out.print("   ");
			}else {
				System.out.print( " * " );
			}
		}
		System.out.println();
	}
	/**
	 * ゲームが終わった時の処理
	 */
	private void exitGame() {


	}
	/**
	 * ゲームを始めるための下準備
	 */
	private void initGame() {
		//path = new Cell[20];
		//path[0] = new StartCell();
		//for (int i = 1; i < path.length-1; i++) {
			//とりあえず通常でマス目を作っておこうかな
		//	path[i] = new NormalCell();		
		//}	
		//path[path.length-1] = new GoolCell();
		path = new Cell[] {
			new StartCell(),
			new NormalCell(),
			new NormalCell(),
			new Demodori(),
			new Susumu(),
			new NormalCell(),
			new Demodori(),
			new NormalCell(),
			new Demodori(),
			new Susumu(),
			new NormalCell(),
			new NormalCell(),
			new Susumu(),
			new Demodori(),
			new NormalCell(),
			new GoolCell(),
			new StartCell(),
			new Susumu(),
			new NormalCell(),
			new NormalCell(),
			new Demodori(),
			new NormalCell(),
			new NormalCell(),
			new Susumu(),
			new Demodori(),
			new NormalCell(),
			new NormalCell(),
			new Demodori(),
			new Susumu(),
			new Susumu(),
			new NormalCell(),
			new Susumu(),
			new Demodori(),
			new NormalCell(),
			new NormalCell(),
			new Demodori(),
			new Susumu(),
			new Susumu(),
			new NormalCell(),
			new GoolCell(),
		};
		player = new Coma("(#^.^#)");
		System.out.println( path[0].getCaption() );
	}
}
