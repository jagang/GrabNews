package com.jagan.grabnews.model

data class News (
	val status : String,
	val totalResults : Int,
	val articles : List<Article>
)
