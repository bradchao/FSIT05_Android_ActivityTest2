package tw.brad.activitytest2;

import android.content.Intent;
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
        startActivity(intent);
    }
}
