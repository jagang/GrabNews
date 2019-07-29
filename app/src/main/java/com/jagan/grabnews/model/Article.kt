package com.jagan.grabnews.model

import androidx.room.Entity

@Entity(
		primaryKeys = ["id"]
)
data class Article (
		val id : Int,
		val source : Source,
		val author : String,
		val title : String,
		val description : String,
		val url : String,
		val urlToImage : String,
		val publishedAt : String,
		val content : String
)