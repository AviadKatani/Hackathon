package hackathon.aviad;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    EditText EtUsername, EtPassword;
    Button btnLogIn;
    String username, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        EtUsername=(EditText)findViewById(R.id.EtUsername);
        EtPassword=(EditText)findViewById(R.id.EtPassword);
        btnLogIn=(Button)findViewById(R.id.btnLogIn);
    }

    public void LogIn(View view) {
        username=EtUsername.getText().toString();
        password=EtPassword.getText().toString();
        if (username==null)
            Toast.makeText(this, "Please Enter Your Username", Toast.LENGTH_SHORT).show();
        else if (password==null)
            Toast.makeText(this, "Please Enter Password", Toast.LENGTH_SHORT).show();
        else {
            Intent intent=new Intent(this,);
            intent.putExtra("username",username);
            intent.putExtra("password",password);
            startActivity(intent);

        }


    }
}
