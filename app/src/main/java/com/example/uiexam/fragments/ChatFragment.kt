package com.example.uiexam.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uiexam.R
import com.example.uiexam.adapters.MessageAdapter
import com.example.uiexam.model.Message

class ChatFragment : Fragment() {

    private lateinit var rvMessage: RecyclerView
    private lateinit var messageAdapter: MessageAdapter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_chat, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rvMessage = view.findViewById(R.id.rvMessage)
        rvMessage.layoutManager = LinearLayoutManager(requireActivity())

        refreshMessage(getAllMessages())
    }

    private fun refreshMessage(allMessages: java.util.ArrayList<Message>) {
        messageAdapter = MessageAdapter(requireActivity(), allMessages)
        rvMessage.adapter = messageAdapter
    }

    private fun getAllMessages(): ArrayList<Message> {
        return ArrayList<Message>().apply {
            for (i in 0..2) {
                this.add(
                    Message(
                        R.drawable.profile_mine,
                        "Jonibek",
                        "Hi bro, how are  you! \uD83D\uDE01\uD83D\uDE01"
                    )
                )
                this.add(
                    Message(
                        R.drawable.profile_asliddin,
                        "Asliddin",
                        "Yes, everything is going well \uD83D\uDD25"
                    )
                )
                this.add(
                    Message(
                        R.drawable.profile_saidahmad,
                        "Saidahmad",
                        "Yesterdaty, I planned to go, but unfortunately my mom asked me to go to my uncles' "
                    )
                )
                this.add(
                    Message(
                        R.drawable.profile_nazirov,
                        "Nazirov",
                        "Yeap, the weather is fine \uD83C\uDFE1"
                    )
                )
            }
        }
    }
}