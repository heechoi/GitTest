package kr.or.dgit.bigdata.gittest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickBtn01(View view) {
        Toast.makeText(getApplicationContext(),"버튼을 눌렀습니다~~~~!!",Toast.LENGTH_SHORT).show();
    }
}
