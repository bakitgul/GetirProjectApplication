package com.example.getirprojectapplication

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.getirprojectapplication.databinding.FragmentObjDetailBinding
import com.google.android.material.snackbar.Snackbar

class ObjDetailFragment : Fragment(){

   private lateinit var design:FragmentObjDetailBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_obj_detail, container, false)

        val bundle:ObjDetailFragmentArgs by navArgs()
        val incomingObj = bundle.Object

        design.imageViewDetailObj.setImageResource(
                resources.getIdentifier(incomingObj.obj_image,"drawable",requireContext().packageName))
        design.objObject = incomingObj

        design.buttonAddBasket.setOnClickListener {
            Snackbar.make(it,"${incomingObj.obj_name} added to basket",Snackbar.LENGTH_SHORT).show()
        }

        return design.root
    }
}