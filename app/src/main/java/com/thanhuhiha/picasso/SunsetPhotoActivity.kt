package com.thanhuhiha.picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import com.squareup.picasso.Picasso
import com.thanhuhiha.picasso.models.SunsetPhoto

class SunsetPhotoActivity : AppCompatActivity() {

    companion object {
        const val EXTRA_SUNSET_PHOTO = "SunsetPhotoActivity.EXTRA_SUNSET_PHOTO"
    }

    private lateinit var imageView: ImageView
    private lateinit var sunsetPhoto: SunsetPhoto

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sunset_photo)

        sunsetPhoto = intent.getParcelableExtra(EXTRA_SUNSET_PHOTO)
        imageView = findViewById(R.id.image)
    }

    override fun onStart() {
        super.onStart()

        Picasso.get()
            .load(sunsetPhoto.url)
            .placeholder(R.drawable.placeholder)
            .error(R.drawable.error)
            .fit()
            .into(imageView)
    }
}