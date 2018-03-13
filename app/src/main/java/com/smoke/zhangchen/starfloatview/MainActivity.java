package com.smoke.zhangchen.starfloatview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.smoke.zhangchen.floatviewlib.FloatView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private FloatView floatview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        floatview = (FloatView) findViewById(R.id.float_view);
        init();
    }

    private void init() {
            List<Float> list = new ArrayList<>();
//            list.add((float) 1.245);
//            list.add((float) 1.567);
//            list.add((float) 0.261);
//            list.add((float) 2.455);
//            list.add((float) 4.643);
//            list.add((float) 3.211);
//            list.add((float) 1.425);
//            list.add((float) 1.043);
//            list.add((float) 0.221);
//            list.add((float) 0.455);
            floatview.setList(list);
           floatview.setOnItemClickListener(new FloatView.OnItemClickListener() {
               @Override
               public void itemClick(int position, float value) {
                   Toast.makeText(MainActivity.this, "当前是第"+position+"个，其值是"+value, Toast.LENGTH_SHORT).show();
               }
           });

    }
}
