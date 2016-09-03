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

    TextView textLogo;
    Button signUpButton;
    Button loginButton;
    ImageView facebookLoginButton;

    public void signUp(View view) { // Fade out all current elements and fade in sign up elements

        textLogo.animate() // Fade out the textLogo
                .translationXBy(-1000f)
                .alpha(0f)
                .setDuration(1500)
                .start();

        signUpButton.animate()
                .translationXBy(-1000f)
                .alpha(0f)
                .setDuration(1500)
                .start();

        loginButton.animate()
                .translationXBy(-1000f)
                .alpha(0f)
                .setDuration(1500)
                .start();

        facebookLoginButton.animate()
                .translationXBy(-1000f)
                .alpha(0f)
                .setDuration(1500)
                .start();

        Intent leadToSignUp = new Intent(MainActivity.this, signUp.class);
        MainActivity.this.startActivity(leadToSignUp);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textLogo = (TextView)findViewById(R.id.textLogo); // Start of textLogo code
        textLogo.setTranslationY(-300f);
        textLogo.setAlpha(0);
        textLogo.animate()
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


