package com.ahwajkafabi.tokobatikpekalongan

import com.google.gson.annotations.SerializedName

data class ResponseArticles3(

	@SerializedName("data")
	val data: List<DataItem?>? = null,

	@SerializedName("status")
	val status: Boolean? = null
)
