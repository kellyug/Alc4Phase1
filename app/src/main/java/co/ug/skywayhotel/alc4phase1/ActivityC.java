package co.ug.skywayhotel.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class ActivityC extends AppCompatActivity {
        TextView myName_textView;
        private TextView phone_textView2;
        private ImageView profile_image;
        private TextView track_textView;
        private TextView trackName_textView;
        private TextView country_textView;
        private TextView uganda_textView;
        private TextView email_textView2;
        private TextView myEmail_textView2;
        private TextView number_textView2;
        private TextView sUsername_textView;
        private TextView userName_textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_profile_activity);

        myName_textView = (TextView) findViewById(R.id.welcome_textView);

        getSupportActionBar().setTitle("Profile");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
}
