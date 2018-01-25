package mine.kerchin.datastructure;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.DrawableRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

/**
 * Created by hkq32 on 2018/1/25.
 */

public class BigImageActivity extends AppCompatActivity {
    private static final String RES = "RES";
    @DrawableRes
    int res;
    ImageView myImg;

    public static void startMe(Activity activity, @DrawableRes int res){
        Intent intent = new Intent(activity, BigImageActivity.class);
        intent.putExtra(RES, res);
        activity.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_big_image);
        res = getIntent().getIntExtra(RES, 0);
        myImg = findViewById(R.id.myImg);
        myImg.setImageResource(res);
    }
}
