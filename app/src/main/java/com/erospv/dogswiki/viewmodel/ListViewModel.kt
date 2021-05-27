package com.erospv.dogswiki.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.erospv.dogswiki.model.DogBreed

class ListViewModel: ViewModel() {
    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh() {
        val dog1 = DogBreed("1", "Corgi", "12","breadGrou","bredFor","temperament", "" )
        val dog2 = DogBreed("1", "Poddle", "12","breadGrou","bredFor","temperament", "" )
        val dog3 = DogBreed("1", "Bulldog", "12","breadGrou","bredFor","temperament", "" )
        val dog4 = DogBreed("1", "Rotwailer", "12","breadGrou","bredFor","temperament", "" )
        val dogsList = arrayListOf<DogBreed>(dog1, dog2, dog3, dog4)

        dogs.value = dogsList
        dogsLoadError.value = false
        loading.value = false


    }
}