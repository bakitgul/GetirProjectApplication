package com.example.getirprojectapplication

import android.graphics.Color
import android.os.Bundle
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.appcompat.widget.PopupMenu
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.example.getirprojectapplication.databinding.FragmentMainPageBinding
import com.google.android.material.snackbar.Snackbar

class MainPageFragment : Fragment() {

    private lateinit var design:FragmentMainPageBinding

    private lateinit var adapter: ObjAdapter
    private lateinit var objList:ArrayList<ObjDataset>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        design = DataBindingUtil.inflate(inflater,R.layout.fragment_main_page, container, false)

        objList = ArrayList()
        val s1 = ObjDataset(1,"Cucumber","5 \u20BA","500 gr","cucumber")
        val s2 = ObjDataset(2,"Tomatos"," 5 \u20BA","500 gr","tomatos")
        val s3 = ObjDataset(3,"Onion"," 2.5 \u20BA","500 gr","onion")
        val s4 = ObjDataset(4,"Potatoes"," 3 \u20BA","500 gr","potatoes")
        val s5 = ObjDataset(5,"Garlic"," 25 \u20BA","500 gr","garlic")
        val s6 = ObjDataset(6,"Eggplant"," 5 \u20BA","500 gr","eggplant")
        val s7 = ObjDataset(7,"Zucchini"," 5 \u20BA","500 gr","zucchini")
        val s8 = ObjDataset(8,"Parsley"," 1 \u20BA","500 gr","parsley")
        val s9 = ObjDataset(9,"Leek"," 5 \u20BA","500 gr","leek")
        val s10 = ObjDataset(9,"Spinach"," 5 \u20BA","500 gr","spinach")
        val s11 = ObjDataset(9,"Artichoke"," 10 \u20BA","500 gr","artichoke")
        val s12 = ObjDataset(9,"Strawberry"," 15 \u20BA","500 gr","strawberry")
        val s13 = ObjDataset(9,"Banana"," 12 \u20BA","500 gr","banana")
        val s14 = ObjDataset(9,"Watermelon"," 7.5 \u20BA","500 gr","watermelon")
        val s15 = ObjDataset(9,"Melon"," 8 \u20BA","500 gr","melon")
        val s16 = ObjDataset(9,"Peach"," 8 \u20BA","500 gr","peach")

        objList.add(s1)
        objList.add(s2)
        objList.add(s3)
        objList.add(s4)
        objList.add(s5)
        objList.add(s6)
        objList.add(s7)
        objList.add(s8)
        objList.add(s9)
        objList.add(s10)
        objList.add(s11)
        objList.add(s12)
        objList.add(s13)
        objList.add(s14)
        objList.add(s15)
        objList.add(s16)

        adapter = ObjAdapter(requireContext(),objList)
        design.objAdapter = adapter


        return design.root
    }

}