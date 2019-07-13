package co.ug.skywayhotel.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ActivityA extends AppCompatActivity {
    private long backPressedTime;

    //Declare view variables
        TextView welcome_textView;
         Button about_button;
         Button profile_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     //Assign views from the layout file to their corresponding variables
        welcome_textView = (TextView) findViewById(R.id.welcome_textView);

        profile_button = (Button) findViewById(R.id.profile_button);
        about_button = (Button) findViewById(R.id.about_button);
        profile_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(ActivityA.this, ActivityC.class);
                startActivity(intent2);
            }
        });
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(ActivityA.this, ActivityB.class);
                startActivity(intent1);
            }

        });

    }

        @Override
        public void onBackPressed() {
            if (backPressedTime + 2000 > System.currentTimeMillis()){
                super.onBackPressed();
                return;
            }else {
                Toast.makeText(getBaseContext(),"Press Back again to exit", Toast.LENGTH_SHORT).show();
            }
            backPressedTime = System.currentTimeMillis();
            super.onBackPressed();
    }

    }





