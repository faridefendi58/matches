package id.web.jagungbakar.matches.common;

import android.content.Context;
import android.support.v4.app.FragmentActivity;

import id.web.jagungbakar.matches.engine.Engine;
import id.web.jagungbakar.matches.events.EventBus;

public class Shared {

	public static Context context;
	public static FragmentActivity activity; // it's fine for this app, but better move to weak reference
	public static Engine engine;
	public static EventBus eventBus;

}
