package ds.gendalf.example;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// before
		final String ageKey = "age";
		final String userNameKey = "age";
		final String adminKey = "admin";
		SharedPreferences prefs = getSharedPreferences("custom_prefs", Context.MODE_PRIVATE);
		SharedPreferences.Editor editor = prefs.edit();
		editor.putInt(ageKey, 12);
		editor.putString(userNameKey, "Luke");
		editor.putBoolean(adminKey,true);
		editor.apply();

		// after
		/*Gendalf.with(this)
		       .setAge(12)
		       .setUserName("Luke")
		       .setAdmin(true)
		       .apply();*/

		// kotlin samples
		KotlinExampleKt.doSomePrefs(this);

	}

}