package com.example.user_2.libraryapp.feature;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import android.content.Intent;
/*
public class OperatingHours {
}
*/

public class OperatingHours extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.operating_hours);
        TextView register = (TextView)findViewById(R.id.lnkMainMenu);
        register.setMovementMethod(LinkMovementMethod.getInstance());
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(OperatingHours.this, MainScreen.class);
                startActivity(intent);
            }
        });
    }
}