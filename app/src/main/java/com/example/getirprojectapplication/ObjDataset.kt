package com.example.getirprojectapplication

import java.io.Serializable

data class ObjDataset(var obj_id:Int,
                      var obj_name:String,
                      var obj_price:String,
                      var obj_gr:String,
                      var obj_image:String):Serializable {
}