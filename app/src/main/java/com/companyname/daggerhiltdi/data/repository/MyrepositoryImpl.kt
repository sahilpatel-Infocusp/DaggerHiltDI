package com.companyname.daggerhiltdi.data.repository

import com.companyname.daggerhiltdi.data.remote.MyApi
import com.companyname.daggerhiltdi.domain.repository.Myrepository

class MyrepositoryImpl(
    private val api:MyApi
):Myrepository {

    override suspend fun doNetworkCall() {

    }
}