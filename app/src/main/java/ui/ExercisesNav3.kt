package ui

import GridAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.shapeminder_appidee.databinding.FragmentExerciseListBinding
import com.example.shapeminder_appidee.databinding.FragmentExercisesNav3Binding


class ExercisesNav3 : Fragment() {

    private lateinit var binding: FragmentExercisesNav3Binding
    val viewModel: HomeViewModel by activityViewModels()



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentExercisesNav3Binding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.bodyparts.observe(viewLifecycleOwner){
            binding.bodypartsGrid.adapter = GridAdapter(it,viewModel,requireContext())
        }
    }



}