package com.andronity.moviecatalogue2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_movie_detail.*


class MovieDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_MOVIE = " extra_movie"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie_detail)

        val selectedVilm = intent.getParcelableExtra<Movie>(MovieDetailActivity.EXTRA_MOVIE)

        if (selectedVilm != null) {
            Glide.with(this)
                .load(selectedVilm.photo)
                .apply(RequestOptions().override(350, 550))
                .into(img_photo)

            val txtJudul = txt_name
            txtJudul.setText(selectedVilm.name)

            val txtDeskripsi = txt_deskripsi
            txtDeskripsi.setText(selectedVilm.description)

        }

    }
}
