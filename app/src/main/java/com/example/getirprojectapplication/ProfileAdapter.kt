package com.example.getirprojectapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.getirprojectapplication.databinding.CardDesignBinding
import com.example.getirprojectapplication.databinding.ProfileCardDesignBinding

class ProfileAdapter (var mContext:Context, var profileList:List<ProfileDataset>)
    :RecyclerView.Adapter<ProfileAdapter.ProfileCardDesignHolder>(){

    inner class ProfileCardDesignHolder (profileCardDesignBinding: ProfileCardDesignBinding)
        : RecyclerView.ViewHolder(profileCardDesignBinding.root){

        var profileCardDesign:ProfileCardDesignBinding

        init {
            this.profileCardDesign = profileCardDesignBinding
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProfileCardDesignHolder {
        val layoutInflater = LayoutInflater.from(mContext)
        val design = ProfileCardDesignBinding.inflate(layoutInflater,parent,false)
        return ProfileCardDesignHolder(design)
    }


    override fun onBindViewHolder(holder: ProfileCardDesignHolder, position: Int) {
        val pro = profileList.get(position)

        holder.profileCardDesign.imageView.setImageResource(
                mContext.resources.getIdentifier(pro.profile_image,"drawable",mContext.packageName))
        holder.profileCardDesign.prfObject = pro
    }

    override fun getItemCount(): Int {
        return profileList.size
    }
}