package mine.kerchin.datastructure;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void arithmetic(View view) {
        startActivity(new Intent(this, ArithmeticActivity.class));
    }

    public void line(View view) {
    }

    public void stack(View view) {
    }

    public void tree(View view) {
    }

    public void pic(View view) {
    }

    public void find(View view) {
        startActivity(new Intent(this, FindActivity.class));
    }

    public void rank(View view) {
    }
}
