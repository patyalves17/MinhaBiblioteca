package com.fiap.paty.minhabiblioteca;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by logonrm on 02/08/2017.
 */

public class CustomToast {
    public void showToast(Context context, String mensagem){
        LayoutInflater  inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View customToastroot =inflater.inflate(R.layout.custom_toast,null);
        Toast customtoast=new Toast(context);

        customtoast.setView(customToastroot);
        TextView textView=(TextView)customToastroot.findViewById(R.id.textView1);
        textView.setText(mensagem);
        customtoast.setGravity(Gravity.CENTER_HORIZONTAL | Gravity.BOTTOM,0,0);
        customtoast.setDuration(Toast.LENGTH_LONG);
        customtoast.show();
    }
}
