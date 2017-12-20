package mchehab.com.backnavigation;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;

/**
 * Created by muhammadchehab on 12/20/17.
 */

public class Globals {

    public static void addFragment(FragmentManager fragmentManager, Fragment fragment, int id){
        fragmentManager.beginTransaction().add(id, fragment).addToBackStack(null).commit();
    }
}