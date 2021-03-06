package com.example.sahan.baseballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class InfieldActivity extends AppCompatActivity {

     LinearLayout mainGrid3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infield);
        mainGrid3 = (LinearLayout) findViewById(R.id.mainGrid3);
        setSingleEvent(mainGrid3);
    }
    private void setSingleEvent(LinearLayout mainGrid3) {
        for (int i = 0 ; i<mainGrid3.getChildCount();i++){
            CardView cardView = (CardView) mainGrid3.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        Intent intent = new Intent(InfieldActivity.this,InfieldSkillsActivity.class);
                        startActivity(intent);

                    }
                    if (finalI==1){
                        Intent intent = new Intent(InfieldActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","FirstBase");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                    if (finalI==2){
                        Intent intent = new Intent(InfieldActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","SecondBase");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                    if (finalI==3){
                        Intent intent = new Intent(InfieldActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","ShortStop");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);

                    }
                    if (finalI==4){
                        Intent intent = new Intent(InfieldActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","ThirdBase");
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
