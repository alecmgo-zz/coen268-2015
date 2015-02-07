package edu.scu.c16drawing;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // We'll be creating an image that is 100 pixels wide and 200 pixels tall.
        int width = 300;
        int height = 300;

        // Create a bitmap with the dimensions we defined above, and with a 16-bit pixel format.
        Bitmap bitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);

        // Create a paint object for us to draw with, and set our drawing color to blue.
        final Paint paint = new Paint();
        paint.setColor(Color.BLUE);

        // Create a new canvas to draw on, and link it to the bitmap that we created above. Any drawing
        // operations performed on the canvas will have an immediate effect on the pixel data of the
        // bitmap.
        final Canvas canvas = new Canvas(bitmap);

        // Fill the entire canvas with a red color.
        canvas.drawColor(Color.RED);

        // Draw a rectangle inside our image using the paint object we defined above. The rectangle's
        // upper left corner will be at (25,50), and the lower right corner will be at (75,150). Since we set
        // the paint object's color above, this rectangle will be blue.
        canvas.drawRect(25, 50, 75, 150, paint);

        // In order to display this image in our activity, we need to create a new ImageView that we
        // can display.
        ImageView imageView = (ImageView) findViewById(R.id.imageView);

        // Set this ImageView's bitmap to the one we have drawn to.
        imageView.setImageBitmap(bitmap);

        // Center the image and do not scale it.
        imageView.setScaleType(ImageView.ScaleType.CENTER);

        Button button = (Button) findViewById(R.id.add_box);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                canvas.drawRect(125, 50, 75, 150, paint);
            }
        });
    }
}
