package com.example.getirprojectapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirprojectapplication.databinding.SearchCardDesignBinding


class SearchAdapter (var mContex:Context, var SearchList:List<PopulerProductsDataset>)
    :RecyclerView.Adapter<SearchAdapter.SearchCardDesignHolder>(){

    inner class SearchCardDesignHolder(searchCardDesignBinding: SearchCardDesignBinding)
        :RecyclerView.ViewHolder(searchCardDesignBinding.root) {

        var searchCardDesign: SearchCardDesignBinding

        init {
            this.searchCardDesign = searchCardDesignBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SearchCardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContex)
        val design = SearchCardDesignBinding.inflate(layoutInflater,parent,false)

        return SearchCardDesignHolder(design)
    }

    override fun onBindViewHolder(holder: SearchCardDesignHolder, position: Int) {
        val serch = SearchList.get(position)

        holder.searchCardDesign.pproductsSearch = serch
    }

    override fun getItemCount(): Int {
        return SearchList.size
    }
}