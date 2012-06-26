package net.morodomi.lecture3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Activity for Android Lecture 3
 * First Activity shows when the app launched.
 * @author Masahiro Morodomi <morodomi at gmail.com>
 */
public class FirstActivity extends Activity implements OnClickListener {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.first);
		// Create button instance
		Button btn = (Button) findViewById(R.id.first_btn);
		// set click event
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// move to second activity
		Intent intent = new Intent(this, SecondActivity.class);
		startActivity(intent);
	}
}