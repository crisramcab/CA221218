package apps.course.android.menu;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import apps.course.android.menu.fragments.ChatFragment;
import apps.course.android.menu.fragments.HomeFragment;
import apps.course.android.menu.fragments.SettingsFragment;

public class CoordinatorActivity extends AppCompatActivity {

    Fragment selectedFragment = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initView()
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // initFragmentManager
        selectedFragment = new HomeFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, selectedFragment).commit();

        // setAction
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                                selectedFragment = new HomeFragment();
                                break;
                            case R.id.navigation_chat:
                                selectedFragment = new ChatFragment();
                                break;
                            case R.id.navigation_settings:
                                selectedFragment = new SettingsFragment();
                                break;
                        }

                        getSupportFragmentManager().beginTransaction().replace(R.id.container, selectedFragment).commit();
                        return true;
                    }
                });

    }
}
