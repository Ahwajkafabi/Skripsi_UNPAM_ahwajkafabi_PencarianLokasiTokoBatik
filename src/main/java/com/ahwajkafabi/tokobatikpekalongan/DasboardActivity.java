package com.ahwajkafabi.tokobatikpekalongan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.LinearLayout;

import io.github.inflationx.viewpump.ViewPumpContextWrapper;

public class DasboardActivity extends AppCompatActivity {

    //We have 4 cards in the dashboard
    private LinearLayout viewPetaCard,viewModelbatikCard,viewMapCard,aboutCard,closeCard;

    /**
     * Let's initialize our cards  and listen to their click events
     */
    private void initializeWidgets(){
        viewPetaCard = findViewById(R.id.viewPetaCard);
        viewModelbatikCard = findViewById(R.id.viewModelbatikCard);
        viewMapCard = findViewById(R.id.viewMapCard);
        aboutCard = findViewById(R.id.aboutCard);
        closeCard = findViewById(R.id.closeCard);

        viewPetaCard.setOnClickListener(v -> Utils.openActivity(DasboardActivity.this,
                PetaActivity.class));
        viewModelbatikCard.setOnClickListener(v -> Utils.openActivity(DasboardActivity.this,
                SplashActivity.class));
        viewMapCard.setOnClickListener(v -> Utils.openActivity(DasboardActivity.this,
                SplashActivity3.class));
        aboutCard.setOnClickListener(v -> Utils.openActivity(DasboardActivity.this,
                AboutActivity.class));
        closeCard.setOnClickListener(v -> finish());
    }
    /**
     * Let's override the attachBaseContext() method so that custom fonts can
     * be used here as well
     */
    @Override
    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(ViewPumpContextWrapper.wrap(newBase));
    }

    /**
     * When the back button is pressed finish this activity
     */
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    /**
     * Let's override the onCreate() and call our initializeWidgets()
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dasboard);
        this.initializeWidgets();
    }
}
