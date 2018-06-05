package id.web.jagungbakar.matches;


import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.widget.ImageView;

import id.web.jagungbakar.matches.common.Shared;
import id.web.jagungbakar.matches.engine.Engine;
import id.web.jagungbakar.matches.engine.ScreenController;
import id.web.jagungbakar.matches.engine.ScreenController.Screen;
import id.web.jagungbakar.matches.events.EventBus;
import id.web.jagungbakar.matches.events.ui.BackGameEvent;
import id.web.jagungbakar.matches.ui.PopupManager;
import id.web.jagungbakar.matches.utils.Utils;

public class MainActivity extends FragmentActivity {

	private ImageView mBackgroundImage;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		Shared.context = getApplicationContext();
		Shared.engine = Engine.getInstance();
		Shared.eventBus = EventBus.getInstance();

		setContentView(R.layout.activity_main);
		mBackgroundImage = (ImageView) findViewById(R.id.background_image);

		Shared.activity = this;
		Shared.engine.start();
		Shared.engine.setBackgroundImageView(mBackgroundImage);

		// set background
		setBackgroundImage();

		// set menu
		ScreenController.getInstance().openScreen(Screen.MENU);


	}

	@Override
	protected void onDestroy() {
		Shared.engine.stop();
		super.onDestroy();
	}

	@Override
	public void onBackPressed() {
		if (PopupManager.isShown()) {
			PopupManager.closePopup();
			if (ScreenController.getLastScreen() == Screen.GAME) {
				Shared.eventBus.notify(new BackGameEvent());
			}
		} else if (ScreenController.getInstance().onBack()) {
			super.onBackPressed();
		}
	}

	private void setBackgroundImage() {
		Bitmap bitmap = Utils.scaleDown(R.drawable.background, Utils.screenWidth(), Utils.screenHeight());
		//bitmap = Utils.crop(bitmap, Utils.screenHeight(), Utils.screenWidth());
		//bitmap = Utils.downscaleBitmap(bitmap, 2);
		// better resizer
		Utils.cropAdvance(bitmap, Utils.screenWidth(), Utils.screenHeight());

		mBackgroundImage.setImageBitmap(bitmap);
	}

}
