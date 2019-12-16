package com.andronity.moviecatalogue2.Adapter

import android.app.Activity
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andronity.moviecatalogue2.R
import com.andronity.moviecatalogue2.TVShowDetailActivity
import com.andronity.moviecatalogue2.TvShow
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import kotlinx.android.synthetic.main.activity_movie_detail.view.img_photo
import kotlinx.android.synthetic.main.activity_movie_detail.view.txt_deskripsi
import kotlinx.android.synthetic.main.activity_movie_detail.view.txt_name
import kotlinx.android.synthetic.main.moviecardview.view.*


class CardViewTvShowAdapter (
    val listTvShow:List<TvShow>?,
    val activity: Activity?
) :
    RecyclerView.Adapter<CardViewTvShowAdapter.CardViewViewHolder>() {
    override fun getItemCount(): Int  = listTvShow?.size ?: 0

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): CardViewTvShowAdapter.CardViewViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.tvshowcardview, parent, false)
        return CardViewViewHolder(view)
    }

    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(tvshow: TvShow) {
            with(itemView) {
                Glide.with(itemView.context)
                    .load(tvshow.photo)
                    .apply(RequestOptions().override(350, 550))
                    .into(img_photo)

                txt_name.text = tvshow.name
                txt_deskripsi.text = tvshow.description
                card_view.setOnClickListener {
                    val moveWithObjectIntent = Intent(activity, TVShowDetailActivity::class.java)
                    moveWithObjectIntent.putExtra(TVShowDetailActivity.EXTRA_TVSHOW, tvshow)
                    activity!!.startActivity(moveWithObjectIntent)

                }

            }
        }

    }


    override fun onBindViewHolder(holder: CardViewTvShowAdapter.CardViewViewHolder, position: Int) {
        holder.bind(listTvShow!![position])
    }


}