package NguHuynhDe.display;

import java.util.Arrays;

public class SpriteInGame {

	public final int SIZE;
	private int XPoint, YPoint;
	public int[] pixelInGame;
	protected int ScreenGameWidth;
	protected int ScreenGameHeight;
	private SpritePicture picSheet;

	/**
	 * Kích thước texture là 256*256
	 * Chia thành các Sprite nhỏ với size là 16*16 => sẽ có 256 sprite nhỏ
	 * Các sprite có thể được nối với nhau để tạo thành animation
	 */
	public SpriteInGame(int size, int x, int y, SpritePicture sheet, int SW, int SH) {
		SIZE = size;
		pixelInGame = new int[SIZE * SIZE];
		XPoint = x * SIZE;
		YPoint = y * SIZE;
		picSheet = sheet;
		ScreenGameWidth = SW;
		ScreenGameHeight = SH;
		load();
	}

	public SpriteInGame(int size, int color) {
		SIZE = size;

		pixelInGame = new int[SIZE * SIZE];
		setColor(color);
	}


	/**
	 * Lấy các hình ảnh thực thể tĩnh từ classic.png
	 */

	public static SpriteInGame grass = new SpriteInGame(16, 6, 0, SpritePicture.tiles, 16, 16);


	public static SpriteInGame brick = new SpriteInGame(16, 7, 0, SpritePicture.tiles, 16, 16);

	public static SpriteInGame wall = new SpriteInGame(16, 5, 0, SpritePicture.tiles, 16, 16);

	public static SpriteInGame portal = new SpriteInGame(16, 4, 0, SpritePicture.tiles, 14, 14);


	/**
	 * Lấy các hình ảnh người chơi từ classic.png
	 */
	public static SpriteInGame playerMoveUp = new SpriteInGame(16, 0, 0, SpritePicture.tiles, 12, 15);
	public static SpriteInGame playerMoveDown = new SpriteInGame(16, 2, 0, SpritePicture.tiles, 12, 14);
	public static SpriteInGame playerMoveLeft = new SpriteInGame(16, 3, 0, SpritePicture.tiles, 10, 14);
	public static SpriteInGame playerMoveRight = new SpriteInGame(16, 1, 0, SpritePicture.tiles, 10, 15);
	/**
	 * Animattion đi lên của người chơi
	 */
	public static SpriteInGame playerMoveUp_1 = new SpriteInGame(16, 0, 1, SpritePicture.tiles, 12, 15);
	public static SpriteInGame playerMoveUp_2 = new SpriteInGame(16, 0, 2, SpritePicture.tiles, 12, 14);
	/**
	 * Animate đi xuống của người chơi
	 */
	public static SpriteInGame playerMoveDown_1 = new SpriteInGame(16, 2, 1, SpritePicture.tiles, 12, 14);
	public static SpriteInGame playerMoveDown_2 = new SpriteInGame(16, 2, 2, SpritePicture.tiles, 12, 15);
	/**
	 * Animate rẽ trái của người chơi
	 */
	public static SpriteInGame playerMoveLeft_1 = new SpriteInGame(16, 3, 1, SpritePicture.tiles, 11, 16);
	public static SpriteInGame playerMoveLeft_2 = new SpriteInGame(16, 3, 2, SpritePicture.tiles, 12 ,16);
	/**
	 * Animate rẽ pahir của người chơi
	 */
	public static SpriteInGame playerMoveRight_1 = new SpriteInGame(16, 1, 1, SpritePicture.tiles, 11, 16);
	public static SpriteInGame playerMoveRight_2 = new SpriteInGame(16, 1, 2, SpritePicture.tiles, 12, 16);
	/**
	 * Animate người chơi bị tiêu diệt
	 */
	public static SpriteInGame DeadPlayer1 = new SpriteInGame(16, 4, 2, SpritePicture.tiles, 16, 16);
	public static SpriteInGame DeadPlayer2 = new SpriteInGame(16, 5, 2, SpritePicture.tiles, 16, 16);
	


	public static SpriteInGame playerMoveUp1 = new SpriteInGame(16, 0, 0, SpritePicture.tiles1, 12, 15);
	public static SpriteInGame playerMoveDown1 = new SpriteInGame(16, 2, 0, SpritePicture.tiles1, 12, 14);
	public static SpriteInGame playerMoveLeft1 = new SpriteInGame(16, 3, 0, SpritePicture.tiles1, 10, 14);
	public static SpriteInGame playerMoveRight1 = new SpriteInGame(16, 1, 0, SpritePicture.tiles1, 10, 15);
	/**
	 * Animate đi lên của người chơi
	 */
	public static SpriteInGame playerMoveUp_11 = new SpriteInGame(16, 0, 1, SpritePicture.tiles1, 12, 15);
	public static SpriteInGame playerMoveUp_21 = new SpriteInGame(16, 0, 2, SpritePicture.tiles1, 12, 14);
	/**
	 * Animate đi xuống của người chơi
	 */
	public static SpriteInGame playerMoveDown_11 = new SpriteInGame(16, 2, 1, SpritePicture.tiles1, 12, 14);
	public static SpriteInGame playerMoveDown_21 = new SpriteInGame(16, 2, 2, SpritePicture.tiles1, 12, 15);
	/**
	 * Animate rẽ trái của người chơi
	 */
	public static SpriteInGame playerMoveLeft_11 = new SpriteInGame(16, 3, 1, SpritePicture.tiles1, 11, 16);
	public static SpriteInGame playerMoveLeft_21 = new SpriteInGame(16, 3, 2, SpritePicture.tiles1, 12 ,16);
	/**
	 * Animate rẽ phải của người chơi
	 */
	public static SpriteInGame playerMoveRight_11 = new SpriteInGame(16, 1, 1, SpritePicture.tiles1, 11, 16);
	public static SpriteInGame playerMoveRight_21 = new SpriteInGame(16, 1, 2, SpritePicture.tiles1, 12, 16);

	/**
	 | Mobiles Ent
	 */
	//bot1
	public static SpriteInGame bot1MoveLeft1 = new SpriteInGame(16, 9, 0, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot1MoveLeft2 = new SpriteInGame(16, 9, 1, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot1MoveLeft3 = new SpriteInGame(16, 9, 2, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot1MoveRight1 = new SpriteInGame(16, 10, 0, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot1MoveRight2 = new SpriteInGame(16, 10, 1, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot1MoveRight3 = new SpriteInGame(16, 10, 2, SpritePicture.tiles, 16, 16);

	public static SpriteInGame deadbot1 = new SpriteInGame(16, 9, 3, SpritePicture.tiles, 16, 16);

	//bot5
	public static SpriteInGame bot5MoveLeft1 = new SpriteInGame(16, 11, 0, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot5MoveLeft2 = new SpriteInGame(16, 11, 1, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot5MoveLeft3 = new SpriteInGame(16, 11, 2, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot5MoveRight1 = new SpriteInGame(16, 12, 0, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot5MoveRight2 = new SpriteInGame(16, 12, 1, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot5MoveRight3 = new SpriteInGame(16, 12, 2, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot5dead = new SpriteInGame(16, 11, 3, SpritePicture.tiles, 16, 16);

	//bot2
	public static SpriteInGame bot2MoveLeft1 = new SpriteInGame(16, 13, 0, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot2MoveLeft2 = new SpriteInGame(16, 13, 1, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot2MoveLeft3 = new SpriteInGame(16, 13, 2, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot2MoveRight1 = new SpriteInGame(16, 14, 0, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot2MoveRight2 = new SpriteInGame(16, 14, 1, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot2MoveRight3 = new SpriteInGame(16, 14, 2, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot2_dead = new SpriteInGame(16, 13, 3, SpritePicture.tiles, 16, 16);

	//bot4
	public static SpriteInGame bot4MoveLeft1 = new SpriteInGame(16, 8, 5, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot4MoveLeft2 = new SpriteInGame(16, 8, 6, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot4MoveLeft3 = new SpriteInGame(16, 8, 7, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot4MoveRight1 = new SpriteInGame(16, 9, 5, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot4MoveRight2 = new SpriteInGame(16, 9, 6, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot4MoveRight3 = new SpriteInGame(16, 9, 7, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot4_dead = new SpriteInGame(16, 8, 8, SpritePicture.tiles, 16, 16);

	//bot3
	public static SpriteInGame bot3MoveLeft1 = new SpriteInGame(16, 10, 5, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot3MoveLeft2 = new SpriteInGame(16, 10, 6, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot3MoveLeft3 = new SpriteInGame(16, 10, 7, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot3MoveRight1 = new SpriteInGame(16, 11, 5, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot3MoveRight2 = new SpriteInGame(16, 11, 6, SpritePicture.tiles, 16, 16);
	public static SpriteInGame bot3MoveRight3 = new SpriteInGame(16, 11, 7, SpritePicture.tiles, 16, 16);

	public static SpriteInGame bot3_dead = new SpriteInGame(16, 10, 8, SpritePicture.tiles, 16, 16);

	//ALL
	public static SpriteInGame deadBot1 = new SpriteInGame(16, 15, 0, SpritePicture.tiles, 16, 16);
	public static SpriteInGame deadBot2 = new SpriteInGame(16, 15, 1, SpritePicture.tiles, 16, 16);
	public static SpriteInGame deadBot3 = new SpriteInGame(16, 15, 2, SpritePicture.tiles, 16, 16);

	/*
	|--------------------------------------------------------------------------
	| Sprites cua bomb
	|--------------------------------------------------------------------------
	 */
	public static SpriteInGame bomb = new SpriteInGame(16, 0, 3, SpritePicture.tiles, 15, 15);
	public static SpriteInGame bomb1 = new SpriteInGame(16, 1, 3, SpritePicture.tiles, 13, 15);
	public static SpriteInGame bomb2 = new SpriteInGame(16, 2, 3, SpritePicture.tiles, 12, 14);


	/**
	 * Animation boom nổ sang các hướng khác
	 */
	public static SpriteInGame bombbeExploded2 = new SpriteInGame(16, 0, 6, SpritePicture.tiles, 16, 16);

	public static SpriteInGame verticalExplo2 = new SpriteInGame(16, 3, 5, SpritePicture.tiles, 16, 16);

	public static SpriteInGame HorizonalExplo2 = new SpriteInGame(16, 1, 9, SpritePicture.tiles, 16, 16);

	public static SpriteInGame HorizonalExplo_leftlastCheck2 = new SpriteInGame(16, 0, 9, SpritePicture.tiles, 16, 16);

	public static SpriteInGame HorizonalExplo_rightlastCheck2 = new SpriteInGame(16, 2, 9, SpritePicture.tiles, 16, 16);

	public static SpriteInGame verticalExplo_toplastCheck2 = new SpriteInGame(16, 3, 4, SpritePicture.tiles, 16, 16);

	public static SpriteInGame verticalExplo_downlastCheck2 = new SpriteInGame(16, 3, 6, SpritePicture.tiles, 16, 16);

	/**
	 |--------------------------------------------------------------------------
	 | No gach
	 |--------------------------------------------------------------------------
	 */
	public static SpriteInGame BeExplodedBrick = new SpriteInGame(16, 7, 1, SpritePicture.tiles, 16, 16);
	public static SpriteInGame BeExplodedBrick1 = new SpriteInGame(16, 7, 2, SpritePicture.tiles, 16, 16);
	public static SpriteInGame BeExplodedBrick2 = new SpriteInGame(16, 7, 3, SpritePicture.tiles, 16, 16);

	/**
	 |--------------------------------------------------------------------------
	 | PU cho nhan vat
	 |--------------------------------------------------------------------------
	 */
	public static SpriteInGame powerupBombs = new SpriteInGame(16, 0, 10, SpritePicture.tiles, 16, 16);
	public static SpriteInGame powerupFlame = new SpriteInGame(16, 1, 10, SpritePicture.tiles, 16, 16);
	public static SpriteInGame powerupEnemySpeed = new SpriteInGame(16, 2, 10, SpritePicture.tiles, 16, 16);
	public static SpriteInGame powerup_undead = new SpriteInGame(16, 6, 10, SpritePicture.tiles, 16, 16);


	/**
	 |--------------------------------------------------------------------------
	 | Shield
	 |--------------------------------------------------------------------------
	 */
	public static SpriteInGame shield = new SpriteInGame(16, 15, 15, SpritePicture.tiles, 16, 16);


	public void setColor(int color) {
		Arrays.fill(pixelInGame, color);
	}

	private void load() {
		for (int y = 0; y < SIZE; y++)
			for (int x = 0; x < SIZE; x++) {
				pixelInGame[x + y * SIZE] = picSheet.pixelInGame[(x + XPoint) + (y + YPoint) * picSheet.SIZE];
			}
	}

	/**
	 |--------------------------------------------------------------------------
	 | di chuyen
	 |--------------------------------------------------------------------------
	 */
	public static SpriteInGame movingSprite(SpriteInGame normal, SpriteInGame x1, SpriteInGame x2, int animate, int time) {
		int calc = animate % time;
		int diff = time / 3;

		if(calc < diff) {
			return normal;
		}

		if(calc < diff * 2) {
			return x1;
		}

		return x2;
	}

	public static SpriteInGame movingSprite(SpriteInGame x1, SpriteInGame x2, int animate, int time) {
		int diff = time / 2;
		return (animate % time > diff) ? x1 : x2;
	}

	public int getSize() {
		return SIZE;
	}

	public int[] getPixels() {
		return pixelInGame;
	}

	public int getPixel(int i) {
		return pixelInGame[i];
	}

	public int getGameWidth() {
		return ScreenGameWidth;
	}

	public int getGameHeight() {
		return ScreenGameHeight;
	}

}