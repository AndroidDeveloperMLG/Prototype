package com.jumin.appprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class login extends AppCompatActivity {

    public void signUp(View view) throws InterruptedException { // Fade out all current elements and fade in sign up elements

        Intent leadToSignUp = new Intent(login.this, signUp.class);
        login.this.startActivity(leadToSignUp);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
}
