package hackathon.aviad;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Color;
import android.os.Handler;
import android.os.health.PackageHealthStats;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class CameraActivity extends AppCompatActivity {
    Handler handler;
    TextView tvloading;
    Runnable runnable;
    Button button;
    ProgressBar progressBar;
    static final int REQUEST_IMAGE_CAPTURE = 0;
    ImageView iv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_camera);
        handler = new Handler();
        tvloading = (TextView) findViewById(R.id.tvloading);
        button = (Button) findViewById(R.id.button);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        iv = (ImageView) findViewById(R.id.iv);

        if (!hasCamera()){
            button.setEnabled(false);
        }
    }

    private boolean hasCamera () {
        return getPackageManager().hasSystemFeature(PackageManager.FEATURE_CAMERA_ANY);
    }

    public void LaunchCamera(View view) {
        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,REQUEST_IMAGE_CAPTURE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, final Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            runnable = new Runnable() {
                @Override
                public void run() {

                }
            };

            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            iv.setImageBitmap(imageBitmap);
            iv.animate().rotation(90f).setDuration(3500).start();
            progressBar.setVisibility(View.GONE);
            progressBar.setVisibility(View.VISIBLE);
            handler.postDelayed(runnable, 45000);
        }
    }
}