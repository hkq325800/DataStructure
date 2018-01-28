package mine.kerchin.datastructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mine.kerchin.datastructure.sort.scale.S_Scale_QuickActivity;

/**
 * Created by hkq32 on 2018/1/28.
 */

public class SortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
    }

    public void toQuick(View view) {
        startActivity(new Intent(this, S_Scale_QuickActivity.class));
    }
}
