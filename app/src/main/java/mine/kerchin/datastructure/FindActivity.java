package mine.kerchin.datastructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import mine.kerchin.datastructure.find.F_BlockActivity;
import mine.kerchin.datastructure.find.F_HalfActivity;
import mine.kerchin.datastructure.find.F_LineActivity;

/**
 * Created by hkq32 on 2018/1/25.
 */

public class FindActivity extends AppCompatActivity {
    public static final String ARR = "arr";
    private int[] arr = new int[10];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
        arr = new int[]{7, 5, 0};
    }

    public void toLine(View view) {
        startActivity(new Intent(this, F_LineActivity.class));
    }

    public void toHalf(View view) {
        startActivity(new Intent(this, F_HalfActivity.class));
    }

    public void toBlock(View view) {
        startActivity(new Intent(this, F_BlockActivity.class));
    }
}
