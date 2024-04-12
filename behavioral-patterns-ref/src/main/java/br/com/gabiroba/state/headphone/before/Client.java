package br.com.gabiroba.state.headphone.before;

public class Client {

	public static void main(String[] args) {
		HeadPhone phone = new HeadPhone();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
		phone.onClick();
		phone.onClick();
		phone.onLongClick();
		phone.onClick();
	}
}
