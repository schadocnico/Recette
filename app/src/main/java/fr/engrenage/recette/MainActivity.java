package fr.engrenage.recette;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    private String conseil[] = {"Les jaloux détruisent ce qu'ils sont incapables de créer", "Le découragement est la mort morale","La tristesse est bien plus redoutable que la vieillesse et la mort", "Une ivresse efface mille tristesses","La montagne et l'eau finiront par se rencontrer","L'alcool est l'aspirine de l'ame","L'alcool tue lentement. On s'en fout. On n'est pas pressés","Nouveaté 2019 : isolez vos combles pour un euro"};



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        TimerTask task  = new TimerTask() {
            @Override
            public void run() {
                Intent acceuilActivity = new Intent(MainActivity.this, AcceuilActivity.class);
                startActivity(acceuilActivity);
            }
        };
        Timer t = new Timer();
        t.schedule(task,5000);
    }
}
