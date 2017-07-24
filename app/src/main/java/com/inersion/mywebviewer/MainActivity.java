/*
 * MainActivity.java
 */

/*
 * A program that defines the MainActivity class, implements the abstract class OnClickListener
 * and the OnClick method for the buttons in the activity.
 * @author Parthiv Shah
 */

package com.inersion.mywebviewer;

import android.content.Intent; //Import Intent class
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View; //Import View class
import android.widget.Button; //Import Button class

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //Define the buttons in the activity
    Button buttonUCSDExt, buttonGoogle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Set the button defined to the id name in the activity
        buttonUCSDExt = (Button) findViewById(R.id.buttonUCSDExt);
        //Set the button to the OnClickListener
        buttonUCSDExt.setOnClickListener(this);

        //Set the button defined to the id name in the activity
        buttonGoogle = (Button) findViewById(R.id.buttonGoogle);
        //Set the button to the OnClickListener
        buttonGoogle.setOnClickListener(this);

    }

    //OnClick method within the OnclickListener abstract class
    //When either button is clicked, 'this' is passed to OnClick method
    @Override
    public void onClick(View v) {

        //Switch through the buttons, depending on which is activated
        switch (v.getId()){

            //UCSD Extension Button
            case R.id.buttonUCSDExt:
                //Define a new intent for the button
                Intent u;
                u = new Intent(this, UCSDExtActivity.class);

                //Start the activity for the new intent
                startActivity(u);

                break;

            //Google Button
            case R.id.buttonGoogle:
                //Define a new intent for the button
                Intent g;
                g = new Intent(this, GoogleActivity.class);

                //Start the activity for the new intent
                startActivity(g);

                break;
        }

    }

}
