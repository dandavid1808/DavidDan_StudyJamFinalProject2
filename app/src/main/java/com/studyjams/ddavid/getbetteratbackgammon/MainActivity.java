
package com.studyjams.ddavid.getbetteratbackgammon;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import com.studyjams.ddavid.getbetteratbackgammon.R;

import java.nio.Buffer;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswer(View view) {
        String submmit = "Ok then we will go to the next step.";
        displayMessage2(submmit);

    }
    public void submitAnswer2 (View view){
         String submit2 ="Backgammon is a game for two players, played on a board consisting of twenty-four narrow triangles called points. The triangles alternate in color and are grouped into four quadrants of six triangles each. The quadrants are referred to as a player's home board and outer board, and the opponent's home board and outer board. The home and outer boards are separated from each other by a ridge down the center of the board called the bar. The points are numbered for either player starting in that player's home board. The outermost point is the twenty-four point, which is also the opponent's one point. Each player has fifteen checkers of his own color. The initial arrangement of checkers is: two on each player's twenty-four point, five on each player's thirteen point, three on each player's eight point, and five on each player's six point.The object of the game is move all your checkers into your own home board and then bear them off. The first player to bear off all of their checkers wins the game.The roll of the dice indicates how many points, or pips, the player is to move his checkers. The checkers are always moved forward, to a lower-numbered point. The following rules apply:" +
                 "                  A checker may be moved only to an open point, one that is not occupied by two or more opposing checkers.\n" +
                 "\n" +
                 "The numbers on the two dice constitute separate moves. For example, if a player rolls 5 and 3, he may move one checker five spaces to an open point and another checker three spaces to an open point, or he may move the one checker a total of eight spaces to an open point, but only if the intermediate point (either three or five spaces from the starting point) is also open. Are you accomodated with the rules now?\n  ";

        displayMessage(submit2);
        Button learenedTheRules  =(Button) findViewById(R.id.lernedRules_button_view);
            if (learenedTheRules!=null)
                learenedTheRules.setVisibility(View.VISIBLE);
    }
    public void submitAnswer3 (View view){
        String submmit3="Because you said you learned the basic rules of the game you will be tested with a little quiz. Are you ready?";
        displayMessage3(submmit3);
    }
    public void submitAnswer4 (View view){
        String submmit4="In this exercise you will have to check the better moves. A better move is the move where you will have 2 checkers on a point or you take out an opponents checker. There will be 1 point for taking out an chacker, 1 point for putting 2checkers on a point.Check the box of the best move. The next image will have the beginning situation. Good Luck!";
        displayMessage4(submmit4);
    }
    public void submitAnswer5 (View view){
        CheckBox correctBox =(CheckBox) findViewById(R.id.thirdAnswer_checkbox);
        TextView finalText = (TextView) findViewById(R.id.final_text_view);
        String congrats= "You choose the right answer! Good Job!";
        String fail = "Try again!";

                if(correctBox.isChecked()) {
                    displayMessage10(congrats);
                    finalText.setVisibility(View.VISIBLE);
                }
                else     displayMessage11(fail);

    }








    private void displayMessage10(String message) {
        TextView rulesTextView = (TextView) findViewById(R.id.congrats_text_view  );
        TextView rulesTextView2 = (TextView) findViewById(R.id.congrats_text_view  );
        rulesTextView.setVisibility(View.VISIBLE);
        rulesTextView2.setVisibility(View.GONE);
        if (rulesTextView!=null)
            rulesTextView.setText(message);



    }

    private void displayMessage11(String message) {
        TextView rulesTextView = (TextView) findViewById(R.id.fail_text_view  );
        rulesTextView.setVisibility(View.VISIBLE);
        if (rulesTextView!=null)
            rulesTextView.setText(message);



    }

    private void displayMessage(String message) {
        TextView rulesTextView = (TextView) findViewById(R.id.rules_text_view  );
        if (rulesTextView!=null)
            rulesTextView.setText(message);

        ImageView imageView = (ImageView) findViewById(R.id.table_image_view  );
        if (imageView!=null)
            imageView.setVisibility(View.VISIBLE);


    }

    private void submitClear(String message) {
        TextView rulesTextView = (TextView) findViewById(R.id.rules_text_view  );
        rulesTextView.setVisibility(View.GONE);

        ImageView imageView = (ImageView) findViewById(R.id.table_image_view  );
        imageView.setVisibility(View.GONE);

    }
    private void displayMessage2(String message) {
        TextView rulesTextView = (TextView) findViewById(R.id.rules_text_view);
        rulesTextView.setText(message);

        ImageView imageView = (ImageView) findViewById(R.id.table_image_view  );
        imageView.setVisibility(View.GONE);

    }
    private void displayMessage3 (String message){
        TextView firstExercisesRequestTextView = (TextView) findViewById(R.id.firstExerciseRequest_text_view );
        firstExercisesRequestTextView.setText(message);

        firstExercisesRequestTextView.setVisibility(View.VISIBLE);
        Button button1 =(Button) findViewById(R.id.beginExercise_button_view);
            button1.setVisibility(View.VISIBLE);
    }
    private void displayMessage4 (String message){
        TextView firstExercisesRequestTextView = (TextView) findViewById(R.id.firstQuestion_text_view );
        firstExercisesRequestTextView.setText(message);
        ImageView theSituationImageView = (ImageView) findViewById(R.id.beginingSituation_Image_View);
        theSituationImageView.setVisibility(View.VISIBLE);
        CheckBox firstCheckbox = (CheckBox) findViewById(R.id.firstAnswer_checkbox );
        firstCheckbox.setVisibility(View.VISIBLE);
        ImageView firstImage = (ImageView) findViewById(R.id.firstAnswer_image_view);
        firstImage.setVisibility(View.VISIBLE);
        CheckBox secondCheckbox = (CheckBox) findViewById(R.id.secondAnswer_checkbox );
        secondCheckbox.setVisibility(View.VISIBLE);
        ImageView secondImage = (ImageView) findViewById(R.id.secondAnswer_image_view);
        secondImage.setVisibility(View.VISIBLE);

        CheckBox thirdCheckbox = (CheckBox) findViewById(R.id.thirdAnswer_checkbox );
        thirdCheckbox.setVisibility(View.VISIBLE);
        ImageView thirdImage = (ImageView) findViewById(R.id.thirdAnswer_image_view);
        thirdImage.setVisibility(View.VISIBLE);

        CheckBox forthCheckbox = (CheckBox) findViewById(R.id.forthAnswer_checkbox);
        forthCheckbox.setVisibility(View.VISIBLE);
        ImageView forthImage = (ImageView) findViewById(R.id.forthAnswer_image_view);
        forthImage.setVisibility(View.VISIBLE);
        firstExercisesRequestTextView.setVisibility(View.VISIBLE);
        Button button1 =(Button) findViewById(R.id.Finish_button_view);
        button1.setVisibility(View.VISIBLE);
    }

}
