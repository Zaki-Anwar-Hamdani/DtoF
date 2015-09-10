package ind.zaki.android.temp.converter;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DtoFActivity extends Activity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		((Button) findViewById(R.id.calculate))
				.setOnClickListener(new Button.OnClickListener() {
					public void onClick(View arg0) {

						final EditText degreesText = (EditText) DtoFActivity.this
								.findViewById(R.id.degrees);

						final EditText fahrenheitText = (EditText) DtoFActivity.this
								.findViewById(R.id.fahrenheit);

						if (!"".equals(degreesText.getText().toString())) {
							fahrenheitText.setText(String.valueOf((Float
									.valueOf(degreesText.getText().toString()) * 9 / 5) + 32));
						}
					}
				});

		((Button) findViewById(R.id.calculate2))
				.setOnClickListener(new Button.OnClickListener() {
					public void onClick(View arg0) {

						final EditText degreesText = (EditText) DtoFActivity.this
								.findViewById(R.id.degrees);

						final EditText fahrenheitText = (EditText) DtoFActivity.this
								.findViewById(R.id.fahrenheit);

						if (!"".equals(fahrenheitText.getText().toString())) {
							degreesText.setText(String.valueOf((Float
									.valueOf(fahrenheitText.getText()
											.toString()) - 32) * 5 / 9));
						}
					}
				});

	}
}