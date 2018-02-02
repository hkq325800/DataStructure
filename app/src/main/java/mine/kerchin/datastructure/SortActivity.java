package mine.kerchin.datastructure;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import mine.kerchin.datastructure.sort.insert.S_Insert_2WayActivity;
import mine.kerchin.datastructure.sort.insert.S_Insert_HalfActivity;
import mine.kerchin.datastructure.sort.insert.S_Insert_ShellActivity;
import mine.kerchin.datastructure.sort.insert.S_Insert_StraightActivity;
import mine.kerchin.datastructure.sort.merge.S_MergeActivity;
import mine.kerchin.datastructure.sort.scale.S_Scale_BubbleActivity;
import mine.kerchin.datastructure.sort.scale.S_Scale_QuickActivity;
import mine.kerchin.datastructure.sort.select.S_Select_HeapActivity;
import mine.kerchin.datastructure.sort.select.S_Select_SimpleActivity;
import mine.kerchin.datastructure.sort.select.S_Select_TreeActivity;

/**
 * Created by hkq32 on 2018/1/28.
 */

public class SortActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sort);
    }

    public void toShell(View view) {
        startActivity(new Intent(this, S_Insert_ShellActivity.class));
    }

    public void toStraight(View view) {
        startActivity(new Intent(this, S_Insert_StraightActivity.class));
    }

    public void toHalf(View view) {
        startActivity(new Intent(this, S_Insert_HalfActivity.class));
    }

    public void to2way(View view) {
        startActivity(new Intent(this, S_Insert_2WayActivity.class));
    }

    public void toBubble(View view) {
        startActivity(new Intent(this, S_Scale_BubbleActivity.class));
    }

    public void toQuick(View view) {
        startActivity(new Intent(this, S_Scale_QuickActivity.class));
    }

    public void toSimple(View view) {
        startActivity(new Intent(this, S_Select_SimpleActivity.class));
    }

    public void toTree(View view) {
        startActivity(new Intent(this, S_Select_TreeActivity.class));
    }

    public void toHeap(View view) {
        startActivity(new Intent(this, S_Select_HeapActivity.class));
    }

    public void toMerge(View view) {
        startActivity(new Intent(this, S_MergeActivity.class));
    }
}
