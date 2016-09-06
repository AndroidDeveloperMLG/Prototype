package com.jumin.appprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class forgot_password extends AppCompatActivity {

    public void login(View view) throws InterruptedException { // Fade out all current elements and fade in sign up elements

        Intent leadToLogin = new Intent(forgot_password.this, login.class);
        forgot_password.this.startActivity(leadToLogin);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }
}
