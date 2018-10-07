package tw.brad.activitytest2;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gotoPage2(View view) {
        int rand = (int)(Math.random()*49+1);
        Log.d("brad", "Main rand=" + rand);

        Intent intent = new Intent(this, Page2Activity.class);
        intent.putExtra("rand", rand);
        //startActivity(intent);
        startActivityForResult(intent, 134);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d("brad", "onActivityResult():" + requestCode + ":" + resultCode);

        if (requestCode == 134) {
            String username = data.getStringExtra("username");
            boolean isPass = data.getBooleanExtra("isPass", false);
            Log.d("brad", username + ":" + isPass);
        }else if (requestCode == 234){
            Log.d("brad", "Page3 back");
        }
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("brad", "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("brad", "onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("brad", "onStart()");
    }

    public void gotoPage3(View view) {
        Intent intent = new Intent(this, Page3Activity.class);
        startActivityForResult(intent, 234);
    }
}
