package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

// TODO (1) Create a class called ReminderTasks
public class ReminderTasks {

// TODO (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT
    public static final String ACTION_INCREMENT_WATER_COUNT = "increment_water_count";

// TODO (6) Create a public static void method called executeTask
    public static void executeTask(Context context, String parameter) {
        if (parameter.equals(ReminderTasks.ACTION_INCREMENT_WATER_COUNT)) {
            incrementWaterCount(context);
        }
    }

    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
    }
}

