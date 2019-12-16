package com.andronity.moviecatalogue2.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andronity.moviecatalogue2.*
import com.andronity.moviecatalogue2.Adapter.CardViewMoviesAdapter
import com.andronity.moviecatalogue2.Adapter.CardViewTvShowAdapter

class HomeFragment : Fragment() {
    private var rvCategory: RecyclerView? = null
    private val list = ArrayList<TvShow>()


    private lateinit var homeViewModel: HomeViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homeViewModel =
            ViewModelProviders.of(this).get(HomeViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_movie, container, false)
        rvCategory = root?.findViewById(R.id.rv_category)
        rvCategory!!.setHasFixedSize(true)

        list.addAll(TvShowData().getData)
        showRecyclerMovie()
        return root
    }
    private fun showRecyclerMovie() {
        rvCategory?.setLayoutManager(LinearLayoutManager(this.context))
        val cardViewTvShowAdapter = CardViewTvShowAdapter(list, activity)
        rvCategory?.setAdapter(cardViewTvShowAdapter)
    }
}