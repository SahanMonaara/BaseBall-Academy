package com.example.sahan.baseballapp;



import android.content.Intent;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.view.MenuItem;
import android.view.View;
import android.widget.Switch;
import android.widget.Toast;


import java.util.ArrayList;


public class YoutubeActivity extends AppCompatActivity {
    public String text;
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_youtube);



        setUpRecyclerView();
        text = getIntent().getStringExtra("SelectedType").trim();
        populateRecyclerView(text);


    }

    private void setUpRecyclerView() {

            recyclerView = findViewById(R.id.recycler_view);
            recyclerView.setHasFixedSize(true);
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
            recyclerView.setLayoutManager(linearLayoutManager);

    }


    private ArrayList<YoutubeVideoModel> generateFirstBaseVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.first_base_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.first_base_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateSecondbaseVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.second_base_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.second_base_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateThirdBaseVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.third_base_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.third_base_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateShortstopVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.shortstop);
        String[] videoTitleArray = getResources().getStringArray(R.array.shortstop_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generatePitchingDrillsVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.pitching_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.pitching_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateCatchingCatchingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.catching_catcher);
        String[] videoTitleArray = getResources().getStringArray(R.array.catching_catcher_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateCatchingThrowingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.catching_throwing);
        String[] videoTitleArray = getResources().getStringArray(R.array.catching_throwing_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateCatchingFieldingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.catching_fielding);
        String[] videoTitleArray = getResources().getStringArray(R.array.catching_fielding_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateCatchingDrillsVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.catching_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.catching_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateOutfieldSkillTRowingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.outfield_skill_throw);
        String[] videoTitleArray = getResources().getStringArray(R.array.outfield_skill_trow_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateOutfieldSkillFieldingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.outfield_skill_fielding);
        String[] videoTitleArray = getResources().getStringArray(R.array.outfield_skill_fielding_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateOutFieldSkillCatchingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.outfield_skill_catching);
        String[] videoTitleArray = getResources().getStringArray(R.array.outfield_skill_catching_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateOutfieldSkillVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.outfield_skill_catching);
        String[] videoTitleArray = getResources().getStringArray(R.array.outfield_skill_catching_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateOutfieldDrillVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.outfield_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.outfield_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateBattingDrillVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.batting_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.batting_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateBattingStanceVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.batting_stance);
        String[] videoTitleArray = getResources().getStringArray(R.array.batting_stance_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateBattingGripVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.batting_grip);
        String[] videoTitleArray = getResources().getStringArray(R.array.batting_grip_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateSetPositionVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.set_position);
        String[] videoTitleArray = getResources().getStringArray(R.array.set_position_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateWinUpVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.wind_up);
        String[] videoTitleArray = getResources().getStringArray(R.array.wind_up_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateInfieldThrowingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.infield_skill_throwing);
        String[] videoTitleArray = getResources().getStringArray(R.array.infield_skill_throwing_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateInfieldCatchingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.infield_skill_catching);
        String[] videoTitleArray = getResources().getStringArray(R.array.infield_skill_catching_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateInfieldFieldingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.infield_skill_fielding);
        String[] videoTitleArray = getResources().getStringArray(R.array.infield_skill_fielding_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateSpecificFieldingDrillsVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.specific_fielding_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.specific_fielding_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateSpecificBattingDrillsVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.specific_batting_drills);
        String[] videoTitleArray = getResources().getStringArray(R.array.specific_batting_drills_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateBaseRunningVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.base_running);
        String[] videoTitleArray = getResources().getStringArray(R.array.base_running_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    private ArrayList<YoutubeVideoModel> generateMotivationVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.motivation);
        String[] videoTitleArray = getResources().getStringArray(R.array.motivation_titles);
        String[] videoDurationArray = getResources().getStringArray(R.array.video_duration_array);

        //loop through all items and add them to arraylist
        for (int i = 0; i < videoIDArray.length; i++) {

            YoutubeVideoModel youtubeVideoModel = new YoutubeVideoModel();
            youtubeVideoModel.setVideoId(videoIDArray[i]);
            youtubeVideoModel.setTitle(videoTitleArray[i]);
            youtubeVideoModel.setDuration(videoDurationArray[i]);

            youtubeVideoModelArrayList.add(youtubeVideoModel);

        }

        return youtubeVideoModelArrayList;
    }

    public void populateRecyclerView(String URL) {

        Toast.makeText(YoutubeActivity.this, URL, Toast.LENGTH_SHORT).show();
        switch (URL) {
            case "FirstBase": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateFirstBaseVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "SecondBase": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateSecondbaseVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "ThirdBase": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateThirdBaseVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "ShortStop": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateShortstopVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "OutfieldDrills": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateOutfieldDrillVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "OutFieldSkills": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateOutfieldSkillVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "BattingDrills": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateBattingDrillVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "OutFieldSkillFielding": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateOutfieldSkillFieldingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "OutFieldSkillThrowing": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateOutfieldSkillTRowingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
           /* case "Pitching": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generatePitchingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }*/
            case "CatchingCatching": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateCatchingCatchingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "CatcherDrills": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateCatchingDrillsVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "CatchingFielding": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateCatchingFieldingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "CatchingThrowing": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateCatchingThrowingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "Stance": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateBattingStanceVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "Grip": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateBattingGripVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "SetPosition": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateSetPositionVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "WindPosition": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateWinUpVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "InfieldThrowing": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateInfieldThrowingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "InfieldCatching": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateInfieldCatchingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "InfieldFielding": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateInfieldFieldingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }

            case "BaseRunning": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateBaseRunningVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "FieldingDrills": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateSpecificFieldingDrillsVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "SpecificBattingDrills": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateSpecificBattingDrillsVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "Motivation": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateMotivationVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }

            case "OutFieldSkillCatching": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateOutFieldSkillCatchingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "PitcherCatching": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateInfieldCatchingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "PitcherThrowing": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateInfieldThrowingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "PitcherFielding": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generateInfieldFieldingVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }
            case "PitchingDrills": {
                final ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = generatePitchingDrillsVideoList();
                YoutubeVideoAdapter adapter = new YoutubeVideoAdapter(this, youtubeVideoModelArrayList);
                recyclerView.setAdapter(adapter);

                //set click event
                recyclerView.addOnItemTouchListener(new RecyclerViewOnClickListener(this, new RecyclerViewOnClickListener.OnItemClickListener() {
                    @Override
                    public void onItemClick(View view, int position) {

                        //start youtube player activity by passing selected video id via intent
                        startActivity(new Intent(YoutubeActivity.this, YoutubePlayerActivity.class)
                                .putExtra("video_id", youtubeVideoModelArrayList.get(position).getVideoId()));

                    }
                }));
                break;
            }


        }






    }
    @Override
    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
