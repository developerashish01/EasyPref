package sg.pocketseed.database;


import android.content.Context;

public class AppData {

    //GLOBAL_PREF is used to save FCM token
    public static final String GLOBAL_PREF = "GLOBAL_PREF";
    public static final String DEVICE_ID = "device_id";
    public static final String IS_LOGIN = "login_status";
    public static final String USER_TOKEN = "user_token";
    public static final String PROFILE_PIC = "PROFILE_PIC";
    public static final String IS_PIC_UPDATED = "IS_PIC_UPDATED";
    public static final String IS_SHOW_COACH_MARK = "IS_SHOW_COACH_MARK";
    public static final String JSON_RES = "JSON_RES";
    public static final String DOWNLOADED_TASK = "DOWNLOADED_TASK";
    public static final String EMAIL_ID = "EMAIL_ID";
    public static final String THEME_RESPONSE = "THEME_RESPONSE";
    public static final String default_pref = "skills_on_wheels";
    public static final String THEME_RES = "THEME_RES";

    public static void save(Context context, String key, String value) {
        save(default_pref, context, key, value);
    }


    public static void save(String prefName, Context context, String key, String value) {
        context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
                .edit()
                .putString(key, value)
                .apply();
    }

    public static void save(String prefName, Context context, String key, boolean value) {
        context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
                .edit()
                .putBoolean(key, value)
                .apply();
    }

    public static void save(Context context, String key, boolean value) {
        save(default_pref, context, key, value);
    }

    public static String getString(String prefName, Context context, String key) {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
                .getString(key, "");
    }

    public static String getString(Context context, String key) {
        return getString(default_pref, context, key);
    }


    public static int getInt(String prefName, Context context, String key) {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
                .getInt(key, 0);
    }

    public static int getInt(Context context, String key) {
        return getInt(default_pref, context, key);
    }

    public static boolean getBoolean(String prefName, Context context, String key) {
        return context.getSharedPreferences(prefName, Context.MODE_PRIVATE)
                .getBoolean(key, false);
    }

    public static boolean getBoolean(Context context, String key) {
        return getBoolean(default_pref, context, key);
    }

    public static void clearAll(Context context) {
        context.getSharedPreferences(default_pref, Context.MODE_PRIVATE)
                .edit()
                .clear()
                .apply();
    }
}
