package com.example.sahan.baseballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class CatcherActivity extends AppCompatActivity {
    LinearLayout mainGrid4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_catcher);
        mainGrid4 = (LinearLayout) findViewById(R.id.mainGrid4);
        setSingleEvent(mainGrid4);
    }
    private void setSingleEvent(LinearLayout mainGrid4) {
        for (int i = 0 ; i<mainGrid4.getChildCount();i++){
            CardView cardView = (CardView) mainGrid4.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        Intent intent = new Intent(CatcherActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","CatchingThrowing");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                    if (finalI==1){
                        Intent intent = new Intent(CatcherActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","CatchingCatching");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                    if (finalI==2){
                        Intent intent = new Intent(CatcherActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","CatchingFielding");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                    if (finalI==3){
                        Intent intent = new Intent(CatcherActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","CatcherDrills");
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
