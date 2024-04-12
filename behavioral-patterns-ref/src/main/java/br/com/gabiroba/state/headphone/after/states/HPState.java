package br.com.gabiroba.state.headphone.after.states;

import br.com.gabiroba.state.headphone.after.HeadPhone;

public interface HPState {
	void click(HeadPhone hp);
	void longClick(HeadPhone hp);
}
