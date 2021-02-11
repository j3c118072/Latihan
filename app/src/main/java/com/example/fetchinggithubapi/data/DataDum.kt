package com.example.fetchinggithubapi.data

object DataDum {
    private val uname = arrayOf(
        "pikachu",
        "rinrin",
        "ronron",
        "riri",
        "ruru"
    )
    private  val link = arrayOf(
        "https://gitlab.com/rania_ramadhiani/test",
        "https://gitlab.com/rania_ramadhiani/test",
        "https://gitlab.com/rania_ramadhiani/test",
        "https://gitlab.com/rania_ramadhiani/test",
        "https://gitlab.com/rania_ramadhiani/test"
    )

    val listData: ArrayList<ListUser>
        get() {
            var un :String
            var ln :String
            val list = ArrayList<ListUser>()
            for (position in uname.indices){
                un = uname[position]
                ln = link[position]
                val dat = ListUser(un, ln)
                list.add(dat)
            }
            return list
        }
}