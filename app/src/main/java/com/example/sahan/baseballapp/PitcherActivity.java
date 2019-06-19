package com.example.sahan.baseballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class PitcherActivity extends AppCompatActivity {
    LinearLayout mainGrid5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pitcher);
        mainGrid5 = findViewById(R.id.mainGrid5);
        setSingleEvent(mainGrid5);
    }
    private void setSingleEvent(LinearLayout mainGrid5) {
        for (int i = 0 ; i<mainGrid5.getChildCount();i++){
            CardView cardView = (CardView) mainGrid5.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        Intent intent = new Intent(PitcherActivity.this,SetPositionActivity.class);
                        startActivity(intent);

                    }
                    if (finalI==1){
                        Intent intent = new Intent(PitcherActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","Catching");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                    if (finalI==2){
                        Intent intent = new Intent(PitcherActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","Throwing");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                    if (finalI==3){
                        Intent intent = new Intent(PitcherActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","Fielding");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                    if (finalI==4){
                        Intent intent = new Intent(PitcherActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","PitchingDrills");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }


                }
            });
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
