package com.example.sahan.baseballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class PositionsActivity extends AppCompatActivity {

    LinearLayout mainGrid2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_positions);
        mainGrid2 = (LinearLayout) findViewById(R.id.mainGrid2);
        setSingleEvent(mainGrid2);
    }
    private void setSingleEvent(LinearLayout mainGrid2) {
        for (int i = 0 ; i<mainGrid2.getChildCount();i++){
            CardView cardView = (CardView) mainGrid2.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        Intent intent = new Intent(PositionsActivity.this,InfieldActivity.class);
                        startActivity(intent);

                    }
                    if (finalI==1){
                        Intent intent = new Intent(PositionsActivity.this,OutFieldActivity.class);
                        startActivity(intent);

                    }
                    if (finalI==2){
                        Intent intent = new Intent(PositionsActivity.this,CatcherActivity.class);
                        startActivity(intent);

                    }
                    if (finalI==3){
                        Intent intent = new Intent(PositionsActivity.this,PitcherActivity.class);
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
