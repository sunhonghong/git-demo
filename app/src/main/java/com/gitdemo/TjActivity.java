package com.gitdemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

/**
 * Created by SHH on 2017/6/14.
 */

public class TjActivity extends Activity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tj);
    }
    public static void openActivity(Context context){
        Intent intent = new Intent(context,TjActivity.class);
        context.startActivity(intent);
    }
}
