package com.example.iis5.actionbarmenu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

//created main activity
public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) { //this Perform initialization of all fragments and loaders.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//this method add an additional content view to the activity.
        getSupportActionBar();//for showing action bar

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
                                 //Inflate the menu for  which it  adds items to the action bar it is present.
        MenuInflater inflater = getMenuInflater();//	getMenuInflater()
                                // Returns a MenuInflater with this context
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    //creating the onOptionsItemSelected method to display the options and to selected them
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        // Handle action bar item clicks here which can handle items selected
        //using switch case to item selected specifically and to show the toast for the item selected
        //and we have taken five items in the menu which which shows through the action bar
        switch (item.getItemId()) {
            case R.id.Computer:

                Toast.makeText(getBaseContext(), "Clicked on Computer ", Toast.LENGTH_LONG).show();
                break;

            case R.id.Gamepad:
                Toast.makeText(getBaseContext(), "Clicked on Gamepad", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Camera:
                Toast.makeText(getBaseContext(), "Clicked on Camera", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Vedio:
                Toast.makeText(getBaseContext(), "Clicked on Vedio", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Email:
                Toast.makeText(getBaseContext(), "Clicked on Email", Toast.LENGTH_LONG).show();
                break;

        }
      return  true;

    }


}
