package com.example.emobilis.pid;

import android.content.Intent;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.MotionEvent;

public class Main2Activity extends AppCompatActivity {
    private GestureDetectorCompat mymotion;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mymotion=new GestureDetectorCompat(this,new learnGesture());
    }
    public boolean onTouchEvent(MotionEvent event){
        this.mymotion.onTouchEvent(event);
        return super.onTouchEvent(event);
}
    class learnGesture extends GestureDetector.SimpleOnGestureListener {
        //a simple gesture listener is to tell which gesturehas been made

        @Override
        public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
            if (e2.getX() > e1.getX()){
                //this is if u swipe from left to right
                Intent left=new Intent(getApplicationContext(),Main3Activity.class);
                finish();
                //finish it to stop main activity
                startActivity(left);


            }




            return true;

    }} }