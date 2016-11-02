package com.innovagenesis.aplicaciones.android.lienzo;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Lienzo lienzo = new Lienzo(this);
        setContentView(lienzo);
    }
}

class Lienzo extends View {
    public Lienzo(Context context) {
        super(context);

    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int exeX, exeY;
        Paint paint = new Paint();
        paint.setColor(Color.WHITE);

        int alto = canvas.getHeight();
        int ancho = canvas.getWidth();

        paint.setStyle(Paint.Style.FILL);
        canvas.drawPaint(paint);
        paint.setColor(Color.GRAY);

        /** Dos ultimos son ancho y alto*/
        /** Dos primeros son ancho y alto*/


        exeX = 150;
        exeY = 300;


        canvas.drawOval(exeX, exeY, 200 + exeX, 200 + exeY, paint);

        paint.setColor(Color.BLUE);

        canvas.drawRect(30, 200, 60, 250, paint);

        paint.setColor(Color.MAGENTA);

        canvas.drawRect(70, 130, 130, 170, paint);

        paint.setColor(Color.YELLOW);
        canvas.drawCircle(200, 300, 50, paint);


        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(Color.BLACK);
        paint.setStrokeWidth(5);
        canvas.drawRect(6, 6, ancho - 6, alto - 6, paint);

    }
}

