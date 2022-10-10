package com.project.coordinatorlayout

import android.os.Binder
import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.content.res.AppCompatResources
import com.google.android.material.snackbar.Snackbar
import com.project.coordinatorlayout.databinding.FragmentScrollBasedBinding

class ScrollBasedFrag : Fragment() {

    lateinit var binding: FragmentScrollBasedBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentScrollBasedBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)
        setHasOptionsMenu(true)
        binding.toolbar.title = "Profile"
        binding.toolbar.logo = AppCompatResources.getDrawable(requireContext(),R.drawable.ic_baseline_person_24)

        binding.fab2.setOnClickListener{
            Snackbar.make(binding.fab2,"You Clicked on FAB", Snackbar.LENGTH_SHORT).show()
        }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_main, menu)
    }

}