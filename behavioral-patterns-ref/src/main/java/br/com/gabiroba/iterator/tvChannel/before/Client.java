package br.com.gabiroba.iterator.tvChannel.before;

public class Client {

	public static void main(String[] args) {
		TV tv = new TV();
		tv.searchAvaiableChannels();

		for(int i = 1; i < 30; i++) {
			tv.accessChannel(i);
		}
	}
}
