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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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

    private ArrayList<YoutubeVideoModel> generatePitchingVideoList() {
        ArrayList<YoutubeVideoModel> youtubeVideoModelArrayList = new ArrayList<>();

        //get the video id array, title array and duration array from strings.xml
        String[] videoIDArray = getResources().getStringArray(R.array.pitching);
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
        String[] videoTitleArray = getResources().getStringArray(R.array.video_title_array);
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
            case "OutFieldDrills": {
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
            case "Pitching": {
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
            }
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
            case "CatchingDrills": {
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
