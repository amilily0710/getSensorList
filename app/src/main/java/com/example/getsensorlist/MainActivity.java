package com.example.getsensorlist;

import androidx.appcompat.app.AppCompatActivity;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.widget.TextView;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    TextView mtextSensors;
    SensorManager sensorMgr;
    List<Sensor> sensorList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextSensors = findViewById(R.id.textSensors);
        sensorMgr = (SensorManager) getSystemService(SENSOR_SERVICE);
        sensorList = sensorMgr.getSensorList(Sensor.TYPE_ALL);

        mtextSensors.append("(# Sensors : " + sensorList.size() + ")\n\n");
        for(Sensor sensor : sensorList){
            mtextSensors.append("Sensors name: " + sensor.getName() + "\n");
            mtextSensors.append("Sensors name: " + sensor.getType() + "\n\n");
        }
    }
}