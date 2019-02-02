package br.com.helpdev.githubers.ui.favusers

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import br.com.helpdev.githubers.databinding.FragmentFavoritesUsersBinding
import br.com.helpdev.githubers.di.Injectable
import br.com.helpdev.githubers.viewmodel.factory.ViewModelInjectFactory
import javax.inject.Inject

/**
 * A placeholder fragment containing a simple view.
 */
class FavoritesUsersFragment : Fragment(), Injectable {

    @Inject
    lateinit var viewModelInjectFactory: ViewModelInjectFactory

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentFavoritesUsersBinding.inflate(inflater, container, false)
        subscribeUI(binding)
        return binding.root
    }

    private fun subscribeUI(binding: FragmentFavoritesUsersBinding) {
        val viewModel = ViewModelProviders.of(this, viewModelInjectFactory).get(FavoritesUsersViewModel::class.java)
        Toast.makeText(activity, "X: {${viewModel.getX()}}", Toast.LENGTH_LONG).show()
    }
}