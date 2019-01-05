package apps.course.android.menu;

import android.app.FragmentManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import apps.course.android.menu.Fragments.ChatFragment;
import apps.course.android.menu.Fragments.HomeFragment;
import apps.course.android.menu.Fragments.SettingsFragment;

public class CoordinatorActivity extends AppCompatActivity {

    FragmentManager fragmentManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // initView()
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation);

        // initFragmentManager
        fragmentManager = getFragmentManager();
        fragmentManager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();

        // setAction
        bottomNavigationView.setOnNavigationItemSelectedListener(
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        switch (item.getItemId()) {
                            case R.id.navigation_home:
                                fragmentManager.beginTransaction().replace(R.id.container, new HomeFragment()).commit();
                            case R.id.navigation_chat:
                                fragmentManager.beginTransaction().replace(R.id.container, new ChatFragment()).commit();
                            case R.id.navigation_settings:
                                fragmentManager.beginTransaction().replace(R.id.container, new SettingsFragment()).commit();
                        }
                        return true;
                    }
                });

    }
}
