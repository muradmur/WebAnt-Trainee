package com.example.webanttrainee.remote

import javax.inject.Inject


class PictureRepository @Inject constructor(
    private val api: Api,
) {
    fun getPicture(isNew: Boolean, page: Int, limit: Int) = api.getPicture(isNew, page, limit)
}