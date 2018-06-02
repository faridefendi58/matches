package id.web.jagungbakar.matches.events;

import id.web.jagungbakar.matches.events.engine.FlipDownCardsEvent;
import id.web.jagungbakar.matches.events.engine.GameWonEvent;
import id.web.jagungbakar.matches.events.engine.HidePairCardsEvent;
import id.web.jagungbakar.matches.events.ui.BackGameEvent;
import id.web.jagungbakar.matches.events.ui.FlipCardEvent;
import id.web.jagungbakar.matches.events.ui.NextGameEvent;
import id.web.jagungbakar.matches.events.ui.ResetBackgroundEvent;
import id.web.jagungbakar.matches.events.ui.ThemeSelectedEvent;
import id.web.jagungbakar.matches.events.ui.DifficultySelectedEvent;
import id.web.jagungbakar.matches.events.ui.StartEvent;


public class EventObserverAdapter implements EventObserver {

	public void onEvent(FlipCardEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(DifficultySelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(HidePairCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(FlipDownCardsEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(StartEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(ThemeSelectedEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(GameWonEvent event) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void onEvent(BackGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(NextGameEvent event) {
		throw new UnsupportedOperationException();		
	}

	@Override
	public void onEvent(ResetBackgroundEvent event) {
		throw new UnsupportedOperationException();		
	}

}
