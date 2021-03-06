package com.example.sahan.baseballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class BattingActivity extends AppCompatActivity {
    LinearLayout mainGrid7;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_batting);
        mainGrid7 = (LinearLayout) findViewById(R.id.mainGrid7);
        setSingleEvent(mainGrid7);
    }
    private void setSingleEvent(LinearLayout mainGrid2) {
        for (int i = 0 ; i<mainGrid2.getChildCount();i++){
            CardView cardView = (CardView) mainGrid2.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        Intent intent = new Intent(BattingActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","Stance");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                    if (finalI==1){
                        Intent intent = new Intent(BattingActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","Grip");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                    if (finalI==2){
                        Intent intent = new Intent(BattingActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","BattingDrills");
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
