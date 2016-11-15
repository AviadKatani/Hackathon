package hackathon.aviad;

/**
 * Created by Aviad on 15/11/2016.
 */
import android.content.Context;
import android.content.SharedPreferences;
public class PrefManager {
    SharedPreferences pref;
    SharedPreferences.Editor editor;
    Context context;

    // Shared Pref Mode:
    int PRIVATE_MODE = 0;
    // Shared preferences file name
    private static final String prefName = "garbagecollector-welcome";
    private static final String prefRegName = "garbagecollector-register";

    private static final String isFirstTimeLaunch = "isFirstTimeLaunch";


    public PrefManager(Context context) {
        this.context = context;
        pref = context.getSharedPreferences(prefName, PRIVATE_MODE);
        editor = pref.edit();
    }

    public void setFirstTimeLaunch(boolean isFirstTime) {
        editor.putBoolean(isFirstTimeLaunch,isFirstTime);
        editor.commit();
    }

    public void userRegister() {

    }

    public boolean getIsFirstTimeLaunch() {
        return pref.getBoolean(isFirstTimeLaunch, true);
    }
}