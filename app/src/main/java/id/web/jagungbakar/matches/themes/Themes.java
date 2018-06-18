package id.web.jagungbakar.matches.themes;

import android.graphics.Bitmap;

import id.web.jagungbakar.matches.common.Shared;
import id.web.jagungbakar.matches.utils.Utils;

import java.util.ArrayList;

public class Themes {

	public static String URI_DRAWABLE = "drawable://";

	public static Theme createAnimalsTheme() {
		Theme theme = new Theme();
		theme.id = 1;
		theme.name = "Animals";
		theme.backgroundImageUrl = URI_DRAWABLE + "background";
		theme.tileImageUrls = new ArrayList<String>();
		// 40 drawables
		for (int i = 1; i <= 28; i++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("animals_%d", i));
		}
		return theme;
	}

	public static Theme createNumberTheme() {
		Theme theme = new Theme();
		theme.id = 2;
		theme.name = "Number";
		theme.backgroundImageUrl = URI_DRAWABLE + "background";
		theme.tileImageUrls = new ArrayList<String>();
		// 25 drawables
		for (int i = 0; i <= 18; i++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("numbers_%d", i));
		}
		return theme;
	}

	public static Theme createLetterTheme() {
		Theme theme = new Theme();
		theme.id = 3;
		theme.name = "Alphabet";
		theme.backgroundImageUrl = URI_DRAWABLE + "background";
		theme.tileImageUrls = new ArrayList<String>();
		// 26 drawables
		for (int i = 1; i <= 26; i++) {
			theme.tileImageUrls.add(URI_DRAWABLE + String.format("letter_%d", i));
		}
		return theme;
	}
	
	public static Bitmap getBackgroundImage(Theme theme) {
		String drawableResourceName = theme.backgroundImageUrl.substring(Themes.URI_DRAWABLE.length());
		int drawableResourceId = Shared.context.getResources().getIdentifier(drawableResourceName, "drawable", Shared.context.getPackageName());
		Bitmap bitmap = Utils.scaleDown(drawableResourceId, Utils.screenWidth(), Utils.screenHeight());
		return bitmap;
	}

}
