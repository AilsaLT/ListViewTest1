package com.ghl.wuhan.listviewtest1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
//ListView的简单用法

public class MainActivity extends AppCompatActivity {
    private String[] data = {"Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry",
    "Cherry","Mango","Apple","Banana","Orange","Watermelon","Pear","Grape","Pineapple","Strawberry",
            "Cherry","Mango"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayAdapter<String>adapter = new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,data);
        ListView listView = (ListView)findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
//既然ListView是用于展示大量数据的，那我们就应该先将数据提供好。这些数据可以是从网上
//下载的也可以从数据库中读取的，应该是视具体的应用场景而定。这里我们就简单使用
//了一个data数组来测试，里面包含了很多水果的名称。