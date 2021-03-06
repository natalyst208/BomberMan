package NguHuynhDe.entities;

import java.awt.Color;

import NguHuynhDe.display.ScreenInGame;

public class Notification extends Entity {

	protected String Notice;
	protected int PUduration;
	protected Color Gcolor;
	protected int _size;
	
	public Notification(String noti, double x, double y, int duration, Color color, int size) {
		_x =x;
		_y = y;
		Notice = noti;
		PUduration = duration * 60;
		Gcolor = color;
		_size = size;
	}

	public int getDuration() {
		return PUduration;
	}

	public void setDuration(int PUduration) {
		this.PUduration = PUduration;
	}

	public String getMessage() {
		return Notice;
	}

	public Color getColor() {
		return Gcolor;
	}

	public int getSize() {
		return _size;
	}

	@Override
	public void update() {
	}

	@Override
	public void render(ScreenInGame screen) {
	}

	@Override
	public boolean checkCollide(Entity e) {
		return true;
	}
	
	
}
