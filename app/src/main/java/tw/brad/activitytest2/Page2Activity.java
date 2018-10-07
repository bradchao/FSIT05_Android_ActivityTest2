package tw.brad.activitytest2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class Page2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2);

        Intent intent = getIntent();
        int rand = intent.getIntExtra("rand", -1);
        Log.d("brad", "Page2 rand=" + rand);

    }

    @Override
    public void finish() {
        //setResult(123);
        Intent intent = new Intent();
        intent.putExtra("username", "Brad");
        intent.putExtra("isPass", true);
        setResult(321, intent);

        super.finish();
    }
}
