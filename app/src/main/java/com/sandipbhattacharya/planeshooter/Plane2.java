package com.sandipbhattacharya.planeshooter;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * Created by Recording on 9/15/2017.
 */

public class Plane2 extends Plane {

    Bitmap[] plane = new Bitmap[10];

    public Plane2(Context context) {
        super(context);
        plane[0] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_1);
        plane[1] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_2);
        plane[2] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_3);
        plane[3] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_4);
        plane[4] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_5);
        plane[5] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_6);
        plane[6] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_7);
        plane[7] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_8);
        plane[8] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_9);
        plane[9] = BitmapFactory.decodeResource(context.getResources(),R.drawable.plane2_10);
        resetPosition();
    }

    @Override
    public Bitmap getBitmap() {
        return plane[planeFrame];
    }

    @Override
    public int getWidth() {
        return plane[0].getWidth();
    }

    @Override
    public int getHeight() {
        return plane[0].getHeight();
    }

    @Override
    public void resetPosition() {
        planeX = -(200+random.nextInt(1500));
        planeY = random.nextInt(400);
        velocity = 5 + random.nextInt(21);
    }
}
