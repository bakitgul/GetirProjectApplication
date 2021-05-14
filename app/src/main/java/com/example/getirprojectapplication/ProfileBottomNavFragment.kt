package com.example.getirprojectapplication

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirprojectapplication.databinding.FragmentProfileBottomNavBinding

class ProfileBottomNavFragment : Fragment() {

    private lateinit var design:FragmentProfileBottomNavBinding

    private lateinit var adapter: ProfileAdapter
    private lateinit var profileList: ArrayList<ProfileDataset>


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        design = DataBindingUtil.inflate(inflater,R.layout.fragment_profile_bottom_nav, container, false)

        profileList= ArrayList()
        val p1 = ProfileDataset("Bakıtgül Fatma Birlik","ic_baseline_person")
        val p2 = ProfileDataset("b.fatmabirlik@gmail.com","ic_baseline_email")
        val p3 = ProfileDataset("github.com/bakitgul","ic_baseline_account_tree")

        profileList.add(p1)
        profileList.add(p2)
        profileList.add(p3)

        adapter = ProfileAdapter(requireContext(),profileList)
        design.prfAdapter = adapter

        return design.root
    }
}