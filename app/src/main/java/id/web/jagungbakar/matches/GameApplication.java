package id.web.jagungbakar.matches;

import android.app.Application;

import id.web.jagungbakar.matches.utils.FontLoader;

public class GameApplication extends Application {

	@Override
	public void onCreate() {
		super.onCreate();
		FontLoader.loadFonts(this);

	}
}
