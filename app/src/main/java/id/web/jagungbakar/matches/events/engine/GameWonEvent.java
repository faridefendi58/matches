package id.web.jagungbakar.matches.events.engine;

import id.web.jagungbakar.matches.events.AbstractEvent;
import id.web.jagungbakar.matches.events.EventObserver;
import id.web.jagungbakar.matches.model.GameState;

/**
 * When the 'back to menu' was pressed.
 */
public class GameWonEvent extends AbstractEvent {

	public static final String TYPE = GameWonEvent.class.getName();

	public GameState gameState;

	
	public GameWonEvent(GameState gameState) {
		this.gameState = gameState;
	}

	@Override
	protected void fire(EventObserver eventObserver) {
		eventObserver.onEvent(this);
	}

	@Override
	public String getType() {
		return TYPE;
	}

}
