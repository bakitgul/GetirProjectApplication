package com.example.getirprojectapplication

import android.content.Context
import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.StyleRes
import androidx.databinding.DataBindingUtil
import androidx.navigation.fragment.navArgs
import com.example.getirprojectapplication.databinding.FragmentGetirFoodBottomNavBinding

class GetirFoodBottomNavFragment : Fragment() {

    private lateinit var design:FragmentGetirFoodBottomNavBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_getir_food_bottom_nav, container, false)

        return design.root
    }
}