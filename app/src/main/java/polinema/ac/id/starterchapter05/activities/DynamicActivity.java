package polinema.ac.id.starterchapter05.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.View;

import polinema.ac.id.starterchapter05.R;
import polinema.ac.id.starterchapter05.fragment.BlueFragment;
import polinema.ac.id.starterchapter05.fragment.RedFragment;

public class DynamicActivity extends AppCompatActivity {
    private static final String RED_TAG = "RED_FRAGMENT";
    private static final String BLUE_TAG = "BLUE_FRAGMENT";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dynamic);
    }

    public void handlerClickLoadRedFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);

        if (fragment == null || fragment instanceof BlueFragment) {

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new RedFragment(), "RED_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }

    public void handlerClickLoadBlueFragment(View view) {
        Fragment fragment = getSupportFragmentManager().findFragmentById(R.id.dynamic_fragment_placeholder);

        if (fragment == null || fragment instanceof RedFragment) {

            FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.setCustomAnimations(R.anim.enter_from_left, R.anim.exit_from_left, R.anim.enter_from_left, R.anim.exit_from_right);
            fragmentTransaction.replace(R.id.dynamic_fragment_placeholder, new BlueFragment(), "BLUE_FRAGMENT");
            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.commit();
        }
    }
}
