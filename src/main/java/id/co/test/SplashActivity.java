package id.co.test;// SplashActivity.java
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {


    private static final int SPLASH_TIME_OUT = 2000; // 2 detik

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(() -> {
            // Setelah SPLASH_TIME_OUT, navigasi ke aktivitas berikutnya
            Intent intent = new Intent(SplashActivity.this, NextActivity.class);
            startActivity(intent);

            // Tutup aktivitas splash agar pengguna tidak dapat kembali ke sini
            finish();
        }, SPLASH_TIME_OUT);
    }
}
