package mine.kerchin.datastructure.sort.scale;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import mine.kerchin.datastructure.R;

/**
 * 快速排序
 * Created by hkq32 on 2018/1/28.
 */

public class S_Scale_QuickActivity extends AppCompatActivity {

    int[] data = new int[]{};

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);
    }

    public void sort() {
        if (data.length < 2) {
            return;
        }
        sort(data, 0, data.length - 1);
    }

    public static void sort(int[] data, int begin, int end) {
        if (begin >= end) return;
        int pivot = partition(data, begin, end);//对data[begin...end]进行分划
        sort(data, begin, pivot - 1);//对低端子列进行排序
        sort(data, pivot + 1, end);//对高端子列进行排序
    }

    public static int partition(int[] data, int low, int high) {
        int pivot = data[low];//用子序列头元素作为枢轴
        while (low < high) {
            while (low < high && data[high] >= pivot)
                high--;
            data[low] = data[high];//比枢轴小的元素移至低位
            while (low < high && pivot >= data[low])
                low++;
            data[high] = data[low];//比枢轴大的元素移至高位
        }
        data[low] = pivot;//确定枢轴的合适位置
        return low;//返回枢轴的位置
    }
}
