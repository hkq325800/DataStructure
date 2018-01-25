package mine.kerchin.datastructure.find;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mine.kerchin.datastructure.BigImageActivity;
import mine.kerchin.datastructure.R;

/**
 * Created by hkq32 on 2018/1/25.
 */

public class F_HalfActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_half);
    }

    public void toImg(View view) {
        BigImageActivity.startMe(this, R.mipmap.ic_launcher);
    }
}
