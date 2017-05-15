package com.example.alwayson2017.alwayson2017;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener, View.OnClickListener {

    //��� ��ư���� �ٸ��� ����ϴµ� �ϴ� ������Ÿ�� ����� �ؼ� ��ư���� ����������
    Button todaypick_space;
    Button history_space;
    Button camera_space;
    Button store_space;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        todaypick_space = (Button) findViewById(R.id.todaypick_space);
        history_space = (Button) findViewById(R.id.history_space);
        camera_space = (Button) findViewById(R.id.camera_space);
        store_space = (Button) findViewById(R.id.store_space);

        todaypick_space.setOnClickListener(this);
        history_space.setOnClickListener(this);
        camera_space.setOnClickListener(this);
        store_space.setOnClickListener(this);
    }



    @Override
    public void onClick(View v){
        switch(v.getId()){
            case (R.id.todaypick_space):
                //TODO �������� ����?�� �����ϴ� �Լ��� ������
                Toast.makeText(getApplicationContext(), "��", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.history_space):
                //TODO �����丮��������?�� �����ϴ� �Լ��� ������
                Toast.makeText(getApplicationContext(), "��", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.camera_space):
                //TODO ī�޶�..�� �����ϴ� �Լ��� ������
                Toast.makeText(getApplicationContext(), "�Ⱦ�", Toast.LENGTH_SHORT).show();
                break;
            case (R.id.store_space):
                //TODO ���� ��� �� �����ϴ� �Լ��� ������
                Toast.makeText(getApplicationContext(), "������", Toast.LENGTH_SHORT).show();
                break;
        }
    }

}
