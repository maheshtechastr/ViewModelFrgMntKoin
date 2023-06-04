package com.mpg.frgmntviewmodelapp.data

class RepositoryImpl : Repository {
    override fun getUserList(): List<User> {
        val list = mutableListOf<User>()
        for (i in 1..20)
            list.add(User("MPG $i"))
        return list
    }
}

interface Repository {
    fun getUserList(): List<User>
}

data class User(val name: String)