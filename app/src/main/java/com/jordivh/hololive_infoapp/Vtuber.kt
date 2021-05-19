package com.jordivh.hololive_infoapp

data class Vtuber(
        var name: String,
        var detail: String,
        var originalName: String,
        var nickNames: ArrayList<String>,
        var debutDate: String,
        var channelName: String,
        var channelUrl: String,
        var gender: String,
        var age: String,
        var birthDay: String,
        var height: String,
        var quote: String,
        var backgroundStory: String,
        var listPhoto:Int=0,
        var detailPhoto:Int=0
        )
