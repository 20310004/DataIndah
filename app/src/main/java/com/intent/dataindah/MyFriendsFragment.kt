package com.intent.dataindah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.fragment_my_friends.*

class MyFriendsFragment : Fragment(){
    lateinit var listTeman:ArrayList<MyFriend>

    private fun simulasiDataTeman() {
        listTeman= ArrayList()
        listTeman.add(
            MyFriend("Indah Kurniani", "Perempuan",
            "indahkurniani291@gmail.com",  "082232929802",  "Malang Singgosari")
        )
        listTeman.add(
            MyFriend("Aretha Kanza Zayna", "Perempuan", "reta@gmail.com",
        "082765679009","Malang")
        )
        listTeman.add(
            MyFriend("Wanda Amelia", "Perempuan",
                "wandaamelia@gmail.com",  "08223292456",  "Lawang")
        )
        listTeman.add(
            MyFriend("Andre Devanto Pradana", "Laki-laki",
                "andredev@gmail.com", "0827655687","Bonagung")
        )
        listTeman.add(
            MyFriend("Abu Bakar ", "Laki-laki",
                "bakarabu@gmail.com",  "08223292345",  "arab")
        )
        listTeman.add(
            MyFriend("Zullaika", "Perempuan", "zulaika@gmail.com",
                "08276567676","Palestina")
        )
        listTeman.add(
            MyFriend("Amelian ya", "Perempuan",
                "amelia@gmail.com",  "08223292456",  "Lawang")
        )
        listTeman.add(
            MyFriend("Devanto Pradana", "Laki-laki",
                "devano@gmail.com", "0827655687","Bonagung")
        )
        listTeman.add(
            MyFriend("Abi Farhan", "Laki-laki",
                "alifarhan@gmail.com",  "08223292322",  "arab")
        )
        listTeman.add(
            MyFriend("Yusup", "Laki-laki", "yusup@gmail.com",
                "08276567988","Palestina")
        )

    }

    private fun tampilTeman(){
        rv_listMyfriends.layoutManager=LinearLayoutManager(activity)
        rv_listMyfriends.adapter=MyFriendAdapter(requireActivity(), listTeman)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_friends, container, false)
    }

    override fun onViewCreated(view: View, @Nullable savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView(){
        simulasiDataTeman()
        tampilTeman()
    }

    override fun onDestroy() {
        super.onDestroy()
        this.clearFindViewByIdCache()
    }
}