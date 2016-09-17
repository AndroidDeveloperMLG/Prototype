package com.jumin.appprototype;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button signUpButton;
    Button loginButton;
    ImageView logo;
    ImageView facebookLoginButton;

    public void signUp(View view) throws InterruptedException { // Fade out all current elements and fade in sign up elements

        Intent leadToSignUp = new Intent(MainActivity.this, signUp.class);
        MainActivity.this.startActivity(leadToSignUp);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }

    public void login(View view) throws InterruptedException { // Fade out all current elements and fade in sign up elements

        Intent leadToLogin = new Intent(MainActivity.this, login.class);
        MainActivity.this.startActivity(leadToLogin);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo = (ImageView)findViewById(R.id.logo); // Start of textLogo code
        logo.setTranslationY(-300f);
        logo.setAlpha(0.0F);
        logo.animate()
                .translationYBy(300f)
                .alpha(1f)
                .setDuration(1250)
                .start(); // End of textLogo code

        signUpButton = (Button)findViewById(R.id.signUpButton); // Start of signUpButton code
        signUpButton.setTranslationX(-500f);
        signUpButton.setAlpha(0);
        signUpButton.animate()
                .translationXBy(500f)
                .alpha(1f)
                .setDuration(1250)
                .start(); // End of signUpButton code

        loginButton = (Button)findViewById(R.id.loginButton); // Start of loginButton code
        loginButton.setTranslationX(-500f);
        loginButton.setAlpha(0);
        loginButton.animate()
                .translationXBy(500f)
                .alpha(1f)
                .setDuration(1250)
                .start(); // End of loginButton code

        facebookLoginButton = (ImageView)findViewById(R.id.facebookLoginButton); // Start of facebookLoginButton code
        facebookLoginButton.setTranslationY(250f);
        facebookLoginButton.setAlpha(0.0F);
        facebookLoginButton.animate()
                .translationYBy(-250f)
                .setDuration(1250)
                .alpha(1)
                .start(); // End of facebookLoginButton code

    }
}


