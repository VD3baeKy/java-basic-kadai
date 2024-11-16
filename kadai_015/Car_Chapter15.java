package kadai_015;

//【クラス】
public class Car_Chapter15 { //車クラス
	
	//フィールド
	private int gear = 1; //1速から5速のギアを表す
	private int speed = 1; //ギアチェンジ後の速度を表す

	//コンストラクタ（初期化処理）
	public Car_Chapter15() {
		//this.gear = 1;
		//this.speed = 1;
	}
	
	// 【メソッド】
	public void gearChange(int afterGear) { //ギアの値により速度を変える
		//if(afterGear>5) afterGear=5;
		//if(afterGear<1) afterGear=1;
		this.gear = afterGear;
		switch(this.gear){
		case 1:
			this.speed = 10;
			break;
		case 2:
			this.speed = 20;
			break;
		case 3:
			this.speed = 30;
			break;
		case 4:
			this.speed = 40;
			break;
		case 5:
			this.speed = 50;
			break;
		default:
			this.speed = 10;
			break;
		}		
		return;
	}
	
	// 【メソッド】
	public void run() { //ギアチェンジ後の速度を表示する
		System.out.println("時速" + this.speed + "Km");
		// 1km/h = 0.6214 mph
		//System.out.println( ( this.speed * 0.6214 ) + "mph");
		return;
	}
}