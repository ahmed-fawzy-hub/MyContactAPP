package com.example.mycontactapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.example.mycontactapp.databinding.FragmentContactBinding


class ContactFragment : Fragment() {

    lateinit var binding:FragmentContactBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding=FragmentContactBinding.inflate(layoutInflater)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.buSend.setOnClickListener {
            val msg=binding.etMsg.text.toString()
            val bundle=Bundle()
            bundle.putString("msg",msg)
            view.findNavController().navigate(R.id.action_contactFragment_to_contactMessageFragment,bundle)
        }
    }
}