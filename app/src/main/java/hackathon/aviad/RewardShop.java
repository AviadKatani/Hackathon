package hackathon.aviad;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class RewardShop extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reward_shop);
        btn1=(Button)findViewById(R.id.btn1);
        btn2=(Button)findViewById(R.id.btn2);
        btn3=(Button)findViewById(R.id.btn3);
        btn4=(Button)findViewById(R.id.btn4);
    }

         public void Usebtn1(View view) {
            btn1.setText("Used");
            btn1.setBackgroundColor(Color.GRAY);

        }

        public void Usebtn2(View view) {
            btn2.setText("Used");
            btn2.setBackgroundColor(Color.GRAY);
        }

        public void Usebtn3(View view) {
            btn3.setText("Used");
            btn3.setBackgroundColor(Color.GRAY);

        }

        public void Usebtn4(View view) {
            btn4.setText("Used");
            btn4.setBackgroundColor(Color.GRAY);

        }
}
