package com.example.getirprojectapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.databinding.adapters.CardViewBindingAdapter
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.example.getirprojectapplication.databinding.CardDesignBinding
import com.example.getirprojectapplication.databinding.FragmentMainPageBinding
import com.google.android.material.snackbar.Snackbar

class ObjAdapter (var mContext:Context, var objList:List<ObjDataset>)
    :RecyclerView.Adapter<ObjAdapter.CardDesingHolder>(){

    inner class CardDesingHolder (cardDesignBinding: CardDesignBinding)
        : RecyclerView.ViewHolder(cardDesignBinding.root){

        var cardDesign:CardDesignBinding

        init {
            this.cardDesign = cardDesignBinding
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardDesingHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = CardDesignBinding.inflate(layoutInflater,parent,false)
        return CardDesingHolder(design)
    }

    override fun onBindViewHolder(holder: CardDesingHolder, position: Int) {
        val obj = objList.get(position)

        holder.cardDesign.imageViewCardDesign.setImageResource(mContext.resources.getIdentifier(obj.obj_image,"drawable",mContext.packageName))
        holder.cardDesign.objObject = obj

        holder.cardDesign.imageViewCardDesign.setOnClickListener {
            Snackbar.make(it,"${obj.obj_name} seçildi.",Snackbar.LENGTH_SHORT).show()
        }

        holder.cardDesign.imageViewCardDesign.setOnClickListener {
            val pass = MainPageFragmentDirections.actionObjDetail(obj)

            Navigation.findNavController(it).navigate(pass)

        }
    }

    override fun getItemCount(): Int {
        return objList.size
    }
}


