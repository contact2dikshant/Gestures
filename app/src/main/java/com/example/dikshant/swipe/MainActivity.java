package com.example.dikshant.swipe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity implements GestureDetector.OnGestureListener,
GestureDetector.OnDoubleTapListener{

    private TextView b1;
    private GestureDetectorCompat gestureDetector;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button bb1 = (Button)findViewById(R.id.bb1);
        bb1.setOnClickListener(
                new Button.OnClickListener(){
                    public void onClick(View v)
                    {
                        TextView b2 = (TextView)findViewById(R.id.b2);
                        b2.setText("DONE DONE DONE");
                    }
                }

        );

        b1 = (TextView)findViewById(R.id.b1);
        this.gestureDetector  = new GestureDetectorCompat(this,this);
        gestureDetector.setOnDoubleTapListener(this);
    }




    /////////////gesture start/////////////

    @Override
    public boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        b1.setText("Done onSingletab");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent motionEvent) {
        b1.setText("Done onDoubletab");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent motionEvent) {
        b1.setText("Done onDoubletabEvent");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent motionEvent) {
        b1.setText("Done onDowntab");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent motionEvent) {
        b1.setText("Done onShowpress");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        b1.setText("Done onSingletabUP");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float v, float v2) {
        b1.setText("Done onScroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent motionEvent) {
        b1.setText("Done onlongpress");

    }

    @Override
    public boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float v, float v2) {
        b1.setText("Done onFling");
        return true;
    }
 ///////////////////////gesture ends//////////////////////


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.gestureDetector.onTouchEvent(event);
        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
