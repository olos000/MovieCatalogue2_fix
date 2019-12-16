package com.andronity.moviecatalogue2.Adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andronity.moviecatalogue2.Movie
import com.andronity.moviecatalogue2.MovieDetailActivity
import com.andronity.moviecatalogue2.R
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_movie_detail.view.img_photo
import kotlinx.android.synthetic.main.activity_movie_detail.view.txt_deskripsi
import kotlinx.android.synthetic.main.activity_movie_detail.view.txt_name
import kotlinx.android.synthetic.main.moviecardview.view.*

class CardViewMoviesAdapter(
    val listMovie: List<Movie>?,
    val activity: Activity?
) :
    RecyclerView.Adapter<CardViewMoviesAdapter.CardViewViewHolder>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewMoviesAdapter.CardViewViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.moviecardview, parent, false)
        return CardViewViewHolder(view)
    }

    override fun getItemCount(): Int = listMovie?.size ?: 0

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(movie: Movie) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(movie.photo)
                    .apply(RequestOptions().override(350, 550))
                    .into(img_photo)

                txt_name.text = movie.name
                txt_deskripsi.text = movie.description
                card_view.setOnClickListener {
                    val moveWithObjectIntent = Intent(activity, MovieDetailActivity::class.java)
                    moveWithObjectIntent.putExtra(MovieDetailActivity.EXTRA_MOVIE, movie)
                    activity!!.startActivity(moveWithObjectIntent)

                }

            }
        }

    }


    override fun onBindViewHolder(holder: CardViewMoviesAdapter.CardViewViewHolder, position: Int) {
        holder.bind(listMovie!![position])
    }
}