package com.ahwajkafabi.tokobatikpekalongan;

import android.content.Context;
import android.content.Intent;

import androidx.appcompat.app.AppCompatActivity;

import com.yarolegovich.lovelydialog.LovelyStandardDialog;

public class Utils {
    /**
     * This method will allow easily open any activity
     * @param c
     * @param clazz
     */
    public static void openActivity(Context c, Class clazz){
        Intent intent = new Intent(c, clazz);
        c.startActivity(intent);
    }

    /**
     * This method will allow us show an Info dialog anywhere in our app.
     */
    public static void showInfoDialog(final AppCompatActivity activity, String title,
                                      String message) {
        new LovelyStandardDialog(activity, LovelyStandardDialog.ButtonLayout.HORIZONTAL)
                .setTopColorRes(R.color.indigo)
                .setButtonsColorRes(R.color.darkDeepOrange)
                .setIcon(R.drawable.m_info)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton("Lanjut", v -> {})
                .setNeutralButton("Menu", v -> openActivity(activity, DasboardActivity.class))
                .setNegativeButton("kembali", v -> activity.finish())
                .show();
    }
}
