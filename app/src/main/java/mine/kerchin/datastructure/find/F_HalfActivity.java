package mine.kerchin.datastructure.find;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mine.kerchin.datastructure.BigImageActivity;
import mine.kerchin.datastructure.R;

/**
 * 折半查找
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

    public static int find(int[] arr, int tar) {
        int low = 0;
        int high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == tar) {
                return mid;//查找成功
            } else if (arr[mid] > tar) {
                high = mid - 1;//在前半区间继续查找
            } else {
                low = mid + 1;//在后半区间继续查找
            }
        }
        return -1;
    }
}
