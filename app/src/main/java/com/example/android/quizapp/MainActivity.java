package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int ans = 0;
    int questionN = 1;
    int score = 0;

    String quest = getResources().getString(R.string.quest);
    String startMsg = getResources().getString(R.string.startMsg);
    String rightMsg = getResources().getString(R.string.rightMsg);
    String wrongMsg = getResources().getString(R.string.wrongMsg);
    String chooseMsg = getResources().getString(R.string.chooseMsg);
    String startAgain = getResources().getString(R.string.start_again);
    String albania = getResources().getString(R.string.albania);
    String greece = getResources().getString(R.string.greece);
    String egypt = getResources().getString(R.string.egypt);
    String gabon = getResources().getString(R.string.gabon);
    String armenia = getResources().getString(R.string.armenia);
    String chad = getResources().getString(R.string.chad);
    String greenland = getResources().getString(R.string.greenland);
    String uae = getResources().getString(R.string.uae);
    String palestine = getResources().getString(R.string.palestine);
    String sanMarino = getResources().getString(R.string.sanMarino);
    String georgia = getResources().getString(R.string.georgia);
    String andora = getResources().getString(R.string.andora);
    String brasil = getResources().getString(R.string.brasil);
    String resetTxt = getResources().getString(R.string.reset_txt);
    String nextTxt = getResources().getString(R.string.next_txt);

    ImageView flagimg = (ImageView) findViewById(R.id.flag_img);
    RadioButton firstAnswer = (RadioButton) findViewById(R.id.first_answer);
    RadioButton secondAnswer = (RadioButton) findViewById(R.id.second_answer);
    RadioButton thirdAnswer = (RadioButton) findViewById(R.id.third_answer);
    RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
    Button nextButton = (Button) findViewById(R.id.next_button);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageButton startImage = (ImageButton) findViewById(R.id.start_img);
        startImage.setVisibility(View.VISIBLE);

    }


    public void quizStart(View view) {

        TextView startText = (TextView) findViewById(R.id.start_txt);
        ImageButton startImage = (ImageButton) findViewById(R.id.start_img);
        RadioGroup ans = (RadioGroup) findViewById(R.id.radioGroup);
        ImageView flagimage = (ImageView) findViewById(R.id.flag_img);
        Button next = (Button) findViewById(R.id.next_button);
        Button quit = (Button) findViewById(R.id.quit_button);

        Toast.makeText(this, startMsg, Toast.LENGTH_SHORT).show();

        startText.setText(quest);
        startImage.setVisibility(View.INVISIBLE);
        flagimage.setVisibility(View.VISIBLE);
        ans.setVisibility(View.VISIBLE);
        next.setVisibility(View.VISIBLE);
        quit.setVisibility(View.VISIBLE);


    }

    public void firstAnswer(View view) {
        ans = 1;

    }

    public void secondAnswer(View view) {
        ans = 2;

    }

    public void thirdAnswer(View view) {
        ans = 3;

    }


    public void quit(View view) {
        finish();
        System.exit(0);
    }

    public void nextQuestion(View view) {

        if (questionN == 1) {
            flagimg.setImageResource(R.drawable.andorra_texture);
            if (ans == 2) {
                Toast.makeText(this, rightMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                score = score + 1;
                flagimg.setImageResource(R.drawable.georgia_texture);
                ans = 0;
            } else if (ans == 0) {
                Toast.makeText(this, chooseMsg, Toast.LENGTH_SHORT).show();
                return;

            } else {
                Toast.makeText(this, wrongMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                flagimg.setImageResource(R.drawable.georgia_texture);
                ans = 0;
            }
            firstAnswer.setText(uae);
            secondAnswer.setText(gabon);
            thirdAnswer.setText(georgia);
            firstAnswer.setChecked(false);
            secondAnswer.setChecked(false);
            thirdAnswer.setChecked(false);
            return;


        }
        if (questionN == 2) {


            if (ans == 3) {
                Toast.makeText(this, rightMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                score = score + 1;
                ans = 0;

            } else if (ans == 0) {
                Toast.makeText(this, chooseMsg, Toast.LENGTH_SHORT).show();
                return;

            } else {
                Toast.makeText(this, wrongMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                ans = 0;
            }
            firstAnswer.setText(egypt);
            secondAnswer.setText(armenia);
            thirdAnswer.setText(gabon);
            firstAnswer.setChecked(false);
            secondAnswer.setChecked(false);
            thirdAnswer.setChecked(false);
            flagimg.setImageResource(R.drawable.gabon_texture);

            return;
        }

        if (questionN == 3) {


            if (ans == 3) {
                Toast.makeText(this, rightMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                score = score + 1;
                ans = 0;

            } else if (ans == 0) {
                Toast.makeText(this, chooseMsg, Toast.LENGTH_SHORT).show();
                return;

            } else {
                Toast.makeText(this, wrongMsg, Toast.LENGTH_SHORT).show();
                questionN++;

                ans = 0;
            }
            firstAnswer.setText(albania);
            secondAnswer.setText(chad);
            thirdAnswer.setText(palestine);
            firstAnswer.setChecked(false);
            secondAnswer.setChecked(false);
            thirdAnswer.setChecked(false);
            flagimg.setImageResource(R.drawable.chad_texture);
            return;
        }


        if (questionN == 4) {


            if (ans == 2) {
                Toast.makeText(this, rightMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                score = score + 1;
                ans = 0;

            } else if (ans == 0) {
                Toast.makeText(this, chooseMsg, Toast.LENGTH_SHORT).show();
                return;

            } else {
                Toast.makeText(this, wrongMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                ans = 0;
            }
            firstAnswer.setText(uae);
            secondAnswer.setText(egypt);
            thirdAnswer.setText(palestine);
            firstAnswer.setChecked(false);
            secondAnswer.setChecked(false);
            thirdAnswer.setChecked(false);
            flagimg.setImageResource(R.drawable.palestinian_territory_texture);
            return;
        }
        if (questionN == 5) {


            if (ans == 3) {
                Toast.makeText(this, rightMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                score = score + 1;
                ans = 0;

            } else if (ans == 0) {
                Toast.makeText(this, chooseMsg, Toast.LENGTH_SHORT).show();
                return;

            } else {
                Toast.makeText(this, wrongMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                ans = 0;
            }
            firstAnswer.setText(sanMarino);
            secondAnswer.setText(greenland);
            thirdAnswer.setText(greece);
            firstAnswer.setChecked(false);
            secondAnswer.setChecked(false);
            thirdAnswer.setChecked(false);
            flagimg.setImageResource(R.drawable.san_marino_texture);
            return;
        }
        if (questionN == 6) {


            if (ans == 1) {
                Toast.makeText(this, rightMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                score = score + 1;
                ans = 0;

            } else if (ans == 0) {
                Toast.makeText(this, chooseMsg, Toast.LENGTH_SHORT).show();
                return;

            } else {
                Toast.makeText(this, wrongMsg, Toast.LENGTH_SHORT).show();
                questionN++;
                ans = 0;
            }
            nextButton.setText(resetTxt);
            return;
        }

        if (questionN == 7) {

            ans = 0;
            questionN = 1;

            Toast.makeText(this, startAgain, Toast.LENGTH_SHORT).show();

            nextButton.setText(nextTxt);

            firstAnswer.setText(greece);
            secondAnswer.setText(andora);
            thirdAnswer.setText(brasil);
            firstAnswer.setChecked(false);
            secondAnswer.setChecked(false);
            thirdAnswer.setChecked(false);
            flagimg.setImageResource(R.drawable.andorra_texture);

        }
    }
}
