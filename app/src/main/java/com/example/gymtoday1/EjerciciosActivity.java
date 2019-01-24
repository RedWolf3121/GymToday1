package com.example.gymtoday1;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.widget.CardView;
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
import android.widget.LinearLayout;

public class EjerciciosActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {
    private GestureDetector mDetector;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grupo_ejercicios);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        CardView ejercicios = (CardView) findViewById(R.id.espalda);
        ejercicios.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios1 = (CardView) findViewById(R.id.pectoral);
        ejercicios1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios2 = (CardView) findViewById(R.id.biceps);
        ejercicios2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios3 = (CardView) findViewById(R.id.triceps);
        ejercicios3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios4 = (CardView) findViewById(R.id.trap);
        ejercicios4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios5 = (CardView) findViewById(R.id.homb);
        ejercicios5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios6 = (CardView) findViewById(R.id.ante);
        ejercicios6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios7 = (CardView) findViewById(R.id.abs);
        ejercicios7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios8 = (CardView) findViewById(R.id.espi);
        ejercicios8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios9 = (CardView) findViewById(R.id.nalg);
        ejercicios9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios10 = (CardView) findViewById(R.id.frontmus);
        ejercicios10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios11 = (CardView) findViewById(R.id.postmus);
        ejercicios11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });
        CardView ejercicios12 = (CardView) findViewById(R.id.pant);
        ejercicios12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EjerciciosActivity.this, EjerciciosEspaldaActivity.class);
                startActivity(intent);
            }
        });





        LinearLayout detectGesture = findViewById(R.id.detectGesture);
        mDetector = new GestureDetector(this, new EjerciciosActivity.MyGestureListener());

        detectGesture.setOnTouchListener(touchListener);
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
        getMenuInflater().inflate(R.menu.ejercicios, menu);
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
            Intent intent = new Intent(EjerciciosActivity.this, LoginActivity.class);
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
            startActivityForResult(intent,0);

            // Sólo se lanzará el activity si hay apps disponibles en el sistema para ejecutarla.
            if (intent.resolveActivity(getPackageManager()) != null) {
                startActivity(intent);
            }

        } else if (id == R.id.nav_crono) {
            Intent intent = new Intent(EjerciciosActivity.this, CronometroActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_Calendario) {
            Intent intent = new Intent(EjerciciosActivity.this, CalendarioActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_Notas) {
            Intent intent = new Intent(EjerciciosActivity.this, NotasActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_home) {
            Intent intent = new Intent(EjerciciosActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.nav_manage) {
            Intent intent = new Intent(EjerciciosActivity.this, AyudaActivity.class);
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
            Intent intent = new Intent(EjerciciosActivity.this, MainActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
            return true;
        }
    }
}
