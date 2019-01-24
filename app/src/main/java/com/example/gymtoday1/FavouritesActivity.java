package com.example.gymtoday1;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class FavouritesActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private GestureDetector mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        LinearLayout detectGesture = findViewById(R.id.detectGesture);
        mDetector = new GestureDetector(this, new MyGestureListener());

        detectGesture.setOnTouchListener(touchListener);

        final ImageView imgFavorite = (ImageView) findViewById(R.id.imgfavE);
        imgFavorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    imgFavorite.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite2 = (ImageView) findViewById(R.id.imgfav2);
        imgFavorite2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite2.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite3 = (ImageView) findViewById(R.id.imgfav3);
        imgFavorite3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite3.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite4 = (ImageView) findViewById(R.id.imgfav4);
        imgFavorite4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite4.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite5 = (ImageView) findViewById(R.id.imgfav5);
        imgFavorite5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite5.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite6 = (ImageView) findViewById(R.id.imgfav6);
        imgFavorite6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite6.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite7 = (ImageView) findViewById(R.id.imgfav7);
        imgFavorite7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite7.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite8 = (ImageView) findViewById(R.id.imgfav8);
        imgFavorite8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite8.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite9 = (ImageView) findViewById(R.id.imgfav9);
        imgFavorite9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite9.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite10 = (ImageView) findViewById(R.id.imgfav10);
        imgFavorite10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite10.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite11 = (ImageView) findViewById(R.id.imgfav11);
        imgFavorite11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite11.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite12 = (ImageView) findViewById(R.id.imgfav12);
        imgFavorite12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite12.setImageResource(R.drawable.estrella_color);
            }
        });
        final ImageView imgFavorite13 = (ImageView) findViewById(R.id.imgfav13);
        imgFavorite13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                imgFavorite13.setImageResource(R.drawable.estrella_color);
            }
        });
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.favourites, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            Intent intent = new Intent(FavouritesActivity.this, LoginActivity.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_camera) {
            Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
            startActivityForResult(intent, 0);

            // Sólo se lanzará el activity si hay apps disponibles en el sistema para ejecutarla.
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

        } else if (id == R.id.nav_crono) {
            Intent intent = new Intent(FavouritesActivity.this, CronometroActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_Calendario) {
            Intent intent = new Intent(FavouritesActivity.this, CalendarioActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_Notas) {
            Intent intent = new Intent(FavouritesActivity.this, NotasActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_home) {
            Intent intent = new Intent(FavouritesActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(FavouritesActivity.this, AyudaActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_share) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");
            intent.putExtra(Intent.EXTRA_TEXT, "GymToday");
            startActivity(Intent.createChooser(intent, "Share with"));
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
    View.OnTouchListener touchListener = new View.OnTouchListener() {
        @Override
        public boolean onTouch(View v, MotionEvent event) {
            // pass the events to the gesture detector
            // a return value of true means the detector is handling it
            // a return value of false means the detector didn't
            // recognize the event
            return mDetector.onTouchEvent(event);

        }
    };

    // In the SimpleOnGestureListener subclass you should override
    // onDown and any other gesture that you want to detect.
    class MyGestureListener extends GestureDetector.SimpleOnGestureListener {

        @Override
        public boolean onDown(MotionEvent event) {
            // don't return false here or else none of the other
            // gestures will work
            return true;
        }

        @Override
        public boolean onSingleTapConfirmed(MotionEvent e) {
            return true;
        }

        @Override
        public void onLongPress(MotionEvent e) {
        }

        @Override
        public boolean onDoubleTap(MotionEvent e) {
            return true;
        }

        @Override
        public boolean onScroll(MotionEvent e1, MotionEvent e2,
                                float distanceX, float distanceY) {
            return true;
        }

        @Override
        public boolean onFling(MotionEvent event1, MotionEvent event2,
                               float velocityX, float velocityY) {
            System.out.println("ABCD -> onFling");

            //Ya está para que cuando detecte onFling vaya al Main
            Intent intent = new Intent(FavouritesActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        }
    }

}
