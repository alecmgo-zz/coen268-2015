package edu.scu.c16drawing;


import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

public class PaintView extends View {
    private static final String TAG = "PaintView";

    private List<Point> points = new ArrayList<Point>();
    private Paint paint = new Paint();

    public PaintView(Context context) {
        super(context);
        paint.setColor(Color.RED);
    }

    public PaintView(Context context, AttributeSet attrs) {
        this(context);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Point point = new Point();
        point.x = event.getX();
        point.y = event.getY();
        points.add(point);

        invalidate();

        Log.d(TAG, "point: " + point.x + "," + point.y);
        return true;
    }

    @Override
    public void onDraw(Canvas canvas) {
        for (Point point : points) {
            canvas.drawCircle(point.x, point.y, 5, paint);
        }
    }
}

