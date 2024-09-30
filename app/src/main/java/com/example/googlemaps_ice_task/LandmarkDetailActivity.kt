package com.example.googlemaps_ice_task

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.gms.maps.model.LatLng

class LandmarkDetailActivity : AppCompatActivity() {
    private lateinit var selectedLandmark: LatLng
    private lateinit var userLocation: LatLng

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_landmark_detail)

        // Get selected landmark and user location from intent
        selectedLandmark = intent.getParcelableExtra("selectedLandmark")!!
        userLocation = intent.getParcelableExtra("userLocation")!!

        calculateRoute()
        displayRouteOnMap()
        showEstimatedTimeAndDistance()
    }

    private fun calculateRoute() {
        // Use a routing service or algorithm to calculate the best route
    }

    private fun displayRouteOnMap() {
        // Display the calculated route on the embedded map
    }

    private fun showEstimatedTimeAndDistance() {
        // Calculate and display estimated time and distance to the landmark
    }
}
