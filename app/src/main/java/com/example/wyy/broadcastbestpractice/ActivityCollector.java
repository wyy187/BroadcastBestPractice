package com.example.wyy.broadcastbestpractice;

import android.app.Activity;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 18729 on 2018/1/23.
 */
//用于管理所有活动
public class ActivityCollector {
    public static List<Activity> activities = new ArrayList<>();
    public static void addActivity(BaseActivity activity){
        activities.add(activity);
    }
    public static void removeActivity(Activity activity){
        activities.remove(activity);
    }
    public static void finishAll(){
        for (Activity activity: activities){//for循环的一种形式，遍历activity中的所有元素
            if (!activity.isFinishing()){
                activity.finish();
            }
        }
    }


}
