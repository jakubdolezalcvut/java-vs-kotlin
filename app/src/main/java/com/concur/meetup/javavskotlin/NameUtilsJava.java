package com.concur.meetup.javavskotlin;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

public class NameUtilsJava {

    private static final String TAG = "NameUtilsJava";

    public static String transformName(String name) {
        if (name == null) {
            return null;

        } else {
            return name.replaceAll("o", "0");
        }
    }

    public static boolean isNameValid(String name) {
        if (name == null) {
            return false;

        } else {
            return name.length() >= 5;
        }
    }

    public static void showLogic(String name, Context context) {
        if (name != null) {
            Toast.makeText(context, name, Toast.LENGTH_SHORT).show();
        }
    }

    public static void showCustomize(String name, Context context) {
        if (name != null) {
            final Toast toast = Toast.makeText(context, name, Toast.LENGTH_SHORT);
            toast.setMargin(10f, 5f);
            toast.show();
        }
    }

    public static void validateUsers(Context context) {
        Log.i(TAG, "transformName " + transformName(null));
        Log.i(TAG, "transformName " + transformName("Honza"));

        Log.i(TAG, "isNameValid " + isNameValid(null));
        Log.i(TAG, "isNameValid " + isNameValid("Jan"));
        Log.i(TAG, "isNameValid " + isNameValid("Honza"));

        showLogic(null, context);
        showLogic("Honza", context);
        //showCustomize("Honza", context);
    }


    private NameUtilsJava() { }
}
