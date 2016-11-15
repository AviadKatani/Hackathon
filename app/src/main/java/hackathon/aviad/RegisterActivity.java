package hackathon.aviad;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity {
    EditText nameET, passET, phoneET, mailET;
    String userName, userPassword, userMail;
    int userPhone;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        nameET = (EditText) findViewById(R.id.userET);
        passET = (EditText) findViewById(R.id.passET);
        mailET = (EditText) findViewById(R.id.mailET);
        phoneET = (EditText) findViewById(R.id.phoneET);
    }

    public void userRegister(View view) {
        userName = nameET.getText().toString();
        userPassword = passET.getText().toString();
        userPhone = Integer.parseInt(phoneET.getText().toString());
        userMail = mailET.getText().toString();
        if (userName != "" && userPassword != "" && userMail != ""){
            SharedPreferences prefs = getPreferences(0);
            SharedPreferences.Editor edit = prefs.edit();
            edit.putString("userName", userName);
            edit.putString("userPassword", userPassword);
            edit.putInt("userPhone", userPhone);
            edit.putString("userMail", userMail);
            edit.commit();
        }
    }
}
