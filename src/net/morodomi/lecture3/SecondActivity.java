package net.morodomi.lecture3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SecondActivity extends Activity implements OnClickListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.second);
		// create button instance
		Button btn = (Button) findViewById(R.id.second_btn);
		// set click event
		btn.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// move back to first activity
		finish();
	}
}
