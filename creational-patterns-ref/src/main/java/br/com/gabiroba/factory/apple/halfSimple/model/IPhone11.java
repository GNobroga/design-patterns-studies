package br.com.gabiroba.factory.apple.halfSimple.model;

public class IPhone11 extends IPhone {

	@Override
	public void getHardware() {
		System.out.println("Hardware list");
		System.out.println("\t- 6.1in Screen");
		System.out.println("\t- A13 Chipset");
		System.out.println("\t- 4Gb RAM");
		System.out.println("\t- 256Gb Memory");
	}
}