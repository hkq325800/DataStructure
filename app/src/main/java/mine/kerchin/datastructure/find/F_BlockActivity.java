package mine.kerchin.datastructure.find;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mine.kerchin.datastructure.R;

/**
 * 分块查找
 * Created by hkq32 on 2018/1/28.
 */

public class F_BlockActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_f_block);
    }

    public static int find(int[] arr, int tar) {
        tar = 45;
        //arr必须是【分块有序】的（前一块中最大值必须小于后一块中的最小值）
        arr = new int[]{10, 8, 12, 9, 3, 15, 46, 45, 38, 50, 62, 51, 78, 55, 80};
        int n = 5;//每块的数量 给定
        //要先得到索引表？ 索引表是取各块中的最大值及其起始位置构成的
        int[] index = new int[]{12, 50, 80};
//        int[] ID = new int[]{0, 5, 10};//0-4 5-9 10-14 place*b——(place+1)*b-1
        int place = -1;//tar在index中的位置
        //索引表较大也可用折半查找
        for (int i = 0; i < index.length; i++) {
            if (tar < index[i]) {
                place = i;
            }
        }
        if (place == -1) {
            return -1;
        } else {
            //每块固定为n个
            for (int i = 0; i < n; i++) {
                if (tar == arr[place * n + i]) {
                    return place * n + i;
                }
            }
        }
        return -1;
    }
}
