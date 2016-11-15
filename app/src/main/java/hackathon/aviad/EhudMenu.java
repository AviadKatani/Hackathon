package hackathon.aviad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EhudMenu extends AppCompatActivity {
    TextView TvCombo, TvTodayScore, TvTotalPoints;
    Button btnEarnPoints, btnUsePoints;
    int todaypoints,totalpoints,combonum;
    Intent gi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        TvCombo = (TextView) findViewById(R.id.TvCombo);
        TvTodayScore = (TextView) findViewById(R.id.TvTodayScore);
        TvTotalPoints = (TextView) findViewById(R.id.TvTotalPoints);
        btnEarnPoints = (Button) findViewById(R.id.btnEarnPoints);
        btnUsePoints = (Button) findViewById(R.id.btnUsePoints);
        gi = getIntent();
        todaypoints = gi.getIntExtra("todaypoints", 0);
        totalpoints = totalpoints + todaypoints;
        combonum = gi.getIntExtra("comboamount", 0);
    }
            public void MoveToVideoAct(View view) {
                Intent intent=new Intent();
                intent.putExtra("totalpoints",totalpoints);
                intent.putExtra("todaypoints",todaypoints);
                intent.putExtra("comboamount",combonum);
                startActivity(intent);
            }

            public void MoveToGiftAct(View view) {
                Intent intent=new Intent();
                intent.putExtra("totalpoints",totalpoints);
                intent.putExtra("todaypoints",todaypoints);
                intent.putExtra("comboamount",combonum);
                startActivity(intent);

            }
}

