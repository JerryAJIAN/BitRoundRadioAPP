package com.example.bitroundradio.Activity;


public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //主线程中执行
                startMainActivity();
            }
        },2000);

    }
    private void startMainActivity(){
        Intent intent = new Intent(this, SplashActivity.this,MainActivity.class);
    }
}