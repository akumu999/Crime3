package com.bignerdranch.android.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() {
    val crimes = mutableListOf<Crime>()
    init {
        for (i in 0 until 100) {
            val crime = Crime()
            crime.title = "Crime #$i"
            if(i in 3..5) crime.requiresPolice = true
            crime.isSolved = i % 2 == 0
            crimes += crime
        }
    }
}