package id.web.jagungbakar.matches.events;

import id.web.jagungbakar.matches.events.engine.FlipDownCardsEvent;
import id.web.jagungbakar.matches.events.engine.GameWonEvent;
import id.web.jagungbakar.matches.events.engine.HidePairCardsEvent;
import id.web.jagungbakar.matches.events.ui.BackGameEvent;
import id.web.jagungbakar.matches.events.ui.DifficultySelectedEvent;
import id.web.jagungbakar.matches.events.ui.FlipCardEvent;
import id.web.jagungbakar.matches.events.ui.NextGameEvent;
import id.web.jagungbakar.matches.events.ui.ResetBackgroundEvent;
import id.web.jagungbakar.matches.events.ui.StartEvent;
import id.web.jagungbakar.matches.events.ui.ThemeSelectedEvent;


public interface EventObserver {

	void onEvent(FlipCardEvent event);

	void onEvent(DifficultySelectedEvent event);

	void onEvent(HidePairCardsEvent event);

	void onEvent(FlipDownCardsEvent event);

	void onEvent(StartEvent event);

	void onEvent(ThemeSelectedEvent event);

	void onEvent(GameWonEvent event);

	void onEvent(BackGameEvent event);

	void onEvent(NextGameEvent event);

	void onEvent(ResetBackgroundEvent event);

}
