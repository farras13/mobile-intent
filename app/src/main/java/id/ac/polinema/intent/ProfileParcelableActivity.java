package id.ac.polinema.intent;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import id.ac.polinema.intent.model.User;

import static id.ac.polinema.intent.ParcelableActivity.USER_KEY;

public class ProfileParcelableActivity extends AppCompatActivity {
    private TextView usernameText;
    private TextView nameText;
    private TextView ageText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_parcelable);

        // TODO: bind here
        usernameText = findViewById(R.id.text_username);
        nameText = findViewById(R.id.text_name);
        ageText = findViewById(R.id.text_age);

        User user = getIntent().getParcelableExtra(USER_KEY);
        if (user != null) {

            // TODO: display value here
            Intent intent = getIntent();
            usernameText.setText(user.getUsername());
            nameText.setText(user.getName());
            ageText.setText(Integer.toString(user.getAge()));
        }
    }
}
