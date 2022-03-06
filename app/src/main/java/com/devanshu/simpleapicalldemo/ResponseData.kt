package com.devanshu.simpleapicalldemo

data class ResponseData (
    val Message :String,
    val User_id : Int,
    val Name:String,
    val Email: String,
    val Phone: Long,
    val Profile_details : ProfileDetails,
    val data_list : List<DataListDetails>
        )

data class ProfileDetails(
    val is_profile_completed: Boolean,
    val rating: Double
)

data class DataListDetails(
    val id: Int,
    val name: String
)