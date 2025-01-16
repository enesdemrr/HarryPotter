package com.enes.feature.home.presentation

import android.app.Application
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.viewModelScope
import com.enes.common.data.utils.onSuccess
import com.enes.common.presentation.BaseViewModel
import com.enes.feature.home.domain.entity.GetAllCharacterResponseModelEntity
import com.enes.feature.home.domain.usecase.GetAllCharacterUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val useCase: GetAllCharacterUseCase,
    application: Application
) : BaseViewModel(application) {
    private val _characterList = MutableLiveData<List<GetAllCharacterResponseModelEntity>>()
    val characterList: LiveData<List<GetAllCharacterResponseModelEntity>> = _characterList

    fun getAllCharacter() {
        viewModelScope.launch(Dispatchers.IO) {
            useCase.invoke()
                .collect { result ->
                    val list: ArrayList<GetAllCharacterResponseModelEntity> = arrayListOf()
                    result.onSuccess { success ->
                        success.data.let {
                            _characterList.postValue(it)
                        }
                    }
                }
        }
    }
}