package com.example.sahan.baseballapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.View;
import android.widget.LinearLayout;

public class OutfieldSkillsActivity extends AppCompatActivity {
    LinearLayout mainGrid11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_outfield_skills);
        mainGrid11 = (LinearLayout) findViewById(R.id.mainGrid11);
        setSingleEvent(mainGrid11);
    }
    private void setSingleEvent(LinearLayout mainGrid11) {
        for (int i = 0 ; i<mainGrid11.getChildCount();i++){
            CardView cardView = (CardView) mainGrid11.getChildAt(i);
            final int finalI= i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (finalI==0){
                        Intent intent = new Intent(OutfieldSkillsActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","OutFieldSkillThrowing");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                    if (finalI==1){
                        Intent intent = new Intent(OutfieldSkillsActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","OutFieldSkillCatching");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }
                    if (finalI==2){
                        Intent intent = new Intent(OutfieldSkillsActivity.this,YoutubeActivity.class);
                        intent.putExtra("SelectedType","OutFieldSkillFielding");
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        startActivity(intent);
                    }



                }
            });
        }
    }
}
