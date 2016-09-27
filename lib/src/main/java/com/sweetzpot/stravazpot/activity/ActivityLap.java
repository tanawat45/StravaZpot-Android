package com.sweetzpot.stravazpot.activity;

import com.google.gson.annotations.SerializedName;
import com.sweetzpot.stravazpot.athlete.Athlete;
import com.sweetzpot.stravazpot.common.Distance;
import com.sweetzpot.stravazpot.common.ResourceState;
import com.sweetzpot.stravazpot.common.Speed;
import com.sweetzpot.stravazpot.common.Time;

import java.util.Date;

public class ActivityLap {
    @SerializedName("id") private int ID;
    @SerializedName("resource_state") private ResourceState resourceState;
    @SerializedName("name") private String name;
    @SerializedName("activity") private Activity activity;
    @SerializedName("athlete") private Athlete athlete;
    @SerializedName("elapsed_time") private Time elapsedTime;
    @SerializedName("moving_time") private Time movingTime;
    @SerializedName("start_date") private Date startDate;
    @SerializedName("start_date_local") private Date startDateLocal;
    @SerializedName("distance") private Distance distance;
    @SerializedName("start_index") private int startIndex;
    @SerializedName("end_index") private int endIndex;
    @SerializedName("total_elevation_gain") private Distance totalElevationGain;
    @SerializedName("average_speed") private Speed averageSpeed;
    @SerializedName("max_speed") private Speed maxSpeed;
    @SerializedName("average_cadence") private float averageCadence;
    @SerializedName("average_watts") private float averageWatts;
    @SerializedName("device_watts") private boolean deviceWatts;
    @SerializedName("has_heartrate") private boolean hasHeartRate;
    @SerializedName("max_heartrate") private float maxHeartRate;
    @SerializedName("average_heartrate") private float averageheartRate;
    @SerializedName("lap_index") private int lapIndex;

    public int getID() {
        return ID;
    }

    public ResourceState getResourceState() {
        return resourceState;
    }

    public String getName() {
        return name;
    }

    public Activity getActivity() {
        return activity;
    }

    public Athlete getAthlete() {
        return athlete;
    }

    public Time getElapsedTime() {
        return elapsedTime;
    }

    public Time getMovingTime() {
        return movingTime;
    }

    public Date getStartDate() {
        return startDate;
    }

    public Date getStartDateLocal() {
        return startDateLocal;
    }

    public Distance getDistance() {
        return distance;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public Distance getTotalElevationGain() {
        return totalElevationGain;
    }

    public Speed getAverageSpeed() {
        return averageSpeed;
    }

    public Speed getMaxSpeed() {
        return maxSpeed;
    }

    public float getAverageCadence() {
        return averageCadence;
    }

    public float getAverageWatts() {
        return averageWatts;
    }

    public boolean isDeviceWatts() {
        return deviceWatts;
    }

    public boolean isHasHeartRate() {
        return hasHeartRate;
    }

    public float getMaxHeartRate() {
        return maxHeartRate;
    }

    public float getAverageheartRate() {
        return averageheartRate;
    }

    public int getLapIndex() {
        return lapIndex;
    }
}