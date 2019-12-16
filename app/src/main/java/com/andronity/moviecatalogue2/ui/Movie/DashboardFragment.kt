package com.andronity.moviecatalogue2.ui.dashboard

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.andronity.moviecatalogue2.Adapter.CardViewMoviesAdapter
import com.andronity.moviecatalogue2.Movie
import com.andronity.moviecatalogue2.MoviesData
import com.andronity.moviecatalogue2.R

class DashboardFragment : Fragment() {
    private var rvCategory: RecyclerView? = null
    private val list = ArrayList<Movie>()

    private lateinit var dashboardViewModel: DashboardViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        dashboardViewModel =
            ViewModelProviders.of(this).get(DashboardViewModel::class.java)
        val root = inflater.inflate(R.layout.fragment_movie, container, false)
        rvCategory = root?.findViewById(R.id.rv_category)
        rvCategory?.setHasFixedSize(true)

        list.addAll(MoviesData().listData)
        showRecyclerMovie()
        return root
    }
    private fun showRecyclerMovie() {
        rvCategory?.setLayoutManager(LinearLayoutManager(this.context))
        val cardViewMoviesAdapter = CardViewMoviesAdapter(list, activity)
        rvCategory?.setAdapter(cardViewMoviesAdapter)
    }
}