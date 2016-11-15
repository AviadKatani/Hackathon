package hackathon.aviad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    PrefManager pref;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        pref = new PrefManager(this);

    }

    @Override
    public boolean onCreateOptionsMenu(EhudMenu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()){
            case R.id.first:

                break;
            case R.id.action_up:

                break;
            case R.id.action_down:

                break;
            case R.id.action_other:

                break;
            default:

                break;
        }

        //Return false to allow normal menu processing to proceed,
        //true to consume it here.
        return false;
    }

}

    public void prefReset(View view) {
        pref.setFirstTimeLaunch(true);
    }

    public void moveToCamera(View view) {
        Intent mIntemt = new Intent(this, CameraActivity.class);
        startActivity(mIntemt);
    }
}
