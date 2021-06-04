package com.google.android.gms.samples.vision.barcodereader;



import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import static android.view.View.inflate;

public class CastomToast {

    public void showToas(Context context, boolean isTrue){
        View view = inflate(context, R.layout.castom_toast, null);

        ImageView imageView = (ImageView) view.findViewById(R.id.toastImg);
        if(isTrue){
            imageView.setImageResource(R.drawable.bok);
        }else{
            imageView.setImageResource(R.drawable.berror);
        }

        Toast toast = new Toast(context);
        toast.setView(view);
        toast.setGravity(Gravity.BOTTOM,0,0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.show();
    }

}
