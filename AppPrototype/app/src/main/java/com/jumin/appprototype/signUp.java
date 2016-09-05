package com.jumin.appprototype;

import android.content.Intent;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.TextView;

public class signUp extends AppCompatActivity {

    public void login(View view) throws InterruptedException { // Fade out all current elements and fade in sign up elements

        Intent leadToSignUp = new Intent(signUp.this, login.class);
        signUp.this.startActivity(leadToSignUp);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
    }
}
