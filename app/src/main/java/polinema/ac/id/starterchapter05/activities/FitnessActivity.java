package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragment.Dips;
import polinema.ac.id.starterchapter05.fragment.Handstand;
import polinema.ac.id.starterchapter05.fragment.Pushup;

public class FitnessActivity extends AppCompatActivity {

    private static final String Handstand_TAG = "HANDSTAND_FRAGMENT";
    private static final String Dips_TAG = "DIPS_FRAGMENT";
    private static final String Pushup_TAG = "PUSHUP_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fitness);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frameLayout,new Pushup());
        fragmentTransaction.commit();
    }

    public void handlerClickHandstand(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);

        if (fragment == null || fragment instanceof Dips || fragment instanceof Pushup) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.frameLayout, new Handstand(), "HANDSTAND_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickDips(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);

        if (fragment == null || fragment instanceof Handstand || fragment instanceof Pushup) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.frameLayout, new Dips(), "DIPS_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClikPushup(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.frameLayout);

        if (fragment == null || fragment instanceof Handstand || fragment instanceof Dips) {
            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left);
            fragmentTransaction.replace(R.id.frameLayout, new Pushup(), "PUSHUP_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
