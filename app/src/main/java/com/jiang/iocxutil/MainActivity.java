package com.jiang.iocxutil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.jiang.iocxutil.annotion.ContentView;
import com.jiang.iocxutil.annotion.OnClick;
import com.jiang.iocxutil.annotion.OnLongClick;
import com.jiang.iocxutil.annotion.ViewInject;

/**
 * IOC控制反转框架
 *
 */
@ContentView(value = R.layout.activity_main)
public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";

//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//    }

    @ViewInject(R.id.text_ioc)
    TextView textView;

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "textView ==" + textView.hashCode());
    }

//        textView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

//        textView.setOnLongClickListener(new View.OnLongClickListener() {
//            @Override
//            public boolean onLongClick(View v) {
//                return false;
//            }
//        });



    @OnClick(R.id.text_ioc)
    public void click(View view){
        toast("测试点击");
    }
    @OnLongClick(R.id.text_ioc)
    public boolean longLlick(View view){
        toast("测试点击");
        return false;
    }

    public void toast(String string) {
        Toast.makeText(this, string, Toast.LENGTH_SHORT).show();
    }
}
