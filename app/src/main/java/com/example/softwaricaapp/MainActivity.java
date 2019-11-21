package com.example.softwaricaapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.FrameLayout;

import com.example.softwaricaapp.FragmentStd.AboutUsFragment;
import com.example.softwaricaapp.FragmentStd.AddStdFragment;
import com.example.softwaricaapp.FragmentStd.HomeFragment;
import com.example.softwaricaapp.Model.Student;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigation;
    FrameLayout main_layout;
    public static List<Student> students = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigation = findViewById(R.id.bottom_navigation);
        main_layout = findViewById(R.id.main_layout);
        students.add(new Student("Pasanglakpa", 22, "male", "kathmandu", R.drawable.heros));
        students.add(new Student("milan", 22, "Male", "baktapur", R.drawable.malephoto));
        students.add(new Student("priya", 22, "Female", "banglor", R.drawable.femalephotos));

        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment fragment = null;
                switch (menuItem.getItemId()) {
                    case R.id.Nav_Home:
                        fragment = new HomeFragment();
                        break;
                    case R.id.Nav_AboutUs:
                        fragment = new AboutUsFragment();
                        break;
                    case R.id.Nav_AddStudent:
                        fragment = new AddStdFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.main_layout,
                        fragment).commit();
                return true;

            }
        });
    }
     }



