package mine.kerchin.datastructure.find;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mine.kerchin.datastructure.R;

import static mine.kerchin.datastructure.FindActivity.ARR;

/**
 * 顺序查找
 * Created by hkq32 on 2018/1/25.
 */

public class F_LineActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_line);
    }

    public static void startMe(Activity activity, int[] arr){
        Intent intent = new Intent(activity, F_LineActivity.class);
        intent.putExtra(ARR, arr);
        activity.startActivity(intent);
    }

    public static int find(int[] arr, int tar) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == tar) {
                return i;
            }
        }
        return -1;
    }
}
