package com.andronity.moviecatalogue2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_movie_detail.*

class TVShowDetailActivity : AppCompatActivity() {
    companion object {
        const val EXTRA_TVSHOW = " extra_tvshow"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tvshow_detail)

        val selectedVilm = intent.getParcelableExtra<TvShow>(TVShowDetailActivity.EXTRA_TVSHOW)

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
