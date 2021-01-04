package com.placesautocomplete

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.placesautocomplete.adapter.PlacesAutoCompleteAdapter
import com.placesautocomplete.model.Place
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() , PlacesAutoCompleteAdapter.LocationListner,
    View.OnClickListener {
    lateinit var locationDialog :PlaceAutoCompleteDialog
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnOpen.setOnClickListener(this)

    }

    override fun dialogDismiss() {
        if(::locationDialog.isInitialized){
            locationDialog.dismiss()
        }
    }

    override fun dialogSave(place: PlaceAPI, place1: Place) {
        Toast.makeText(this,place1.description,Toast.LENGTH_LONG).show()
    }

    override fun onClick(v: View?) {
        locationDialog = PlaceAutoCompleteDialog()
        locationDialog.setListner(this)
        locationDialog.show(
            supportFragmentManager,
            PlaceAutoCompleteDialog::class.java.simpleName
        )
    }
}