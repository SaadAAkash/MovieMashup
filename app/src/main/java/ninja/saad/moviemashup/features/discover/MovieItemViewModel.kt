package ninja.saad.moviemashup.features.discover

import ninja.saad.moviemashup.util.Navigator
import ninja.saad.moviemashup.core.BaseViewModel
import ninja.saad.moviemashup.data.model.Movie

class MovieItemViewModel(val navigator: Navigator): BaseViewModel() {

    lateinit var movie: Movie

    fun onClick() {
        navigator.openMovieDetails(movie)
    }

    override fun dispose() {

    }

}