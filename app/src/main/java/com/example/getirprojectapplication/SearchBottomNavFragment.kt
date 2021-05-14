package com.example.getirprojectapplication

import android.graphics.Color
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.getirprojectapplication.databinding.FragmentSearchBottomNavBinding


class SearchBottomNavFragment : Fragment() {
    private lateinit var design:FragmentSearchBottomNavBinding

    private lateinit var adapter: SearchAdapter
    private lateinit var searchList:ArrayList<PopulerProductsDataset>


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_search_bottom_nav, container, false)

        val p1=PopulerProductsDataset("Cucumber ",1)
        val p2=PopulerProductsDataset("Tomatos ",2)
        val p3=PopulerProductsDataset("Eggplant ",3)
        val p4=PopulerProductsDataset("Banana ",4)
        val p5=PopulerProductsDataset("Melon ",5)
        val p6=PopulerProductsDataset("Onion ",6)
        val p7=PopulerProductsDataset("Garlic ",7)
        val p8=PopulerProductsDataset("Watermelon ",8)

        searchList= ArrayList()
        searchList.add(p1)
        searchList.add(p2)
        searchList.add(p3)
        searchList.add(p4)
        searchList.add(p5)
        searchList.add(p6)
        searchList.add(p7)
        searchList.add(p8)

        adapter = SearchAdapter(requireContext(),searchList)
        design.sAdapter = adapter

        return design.root

    }
}