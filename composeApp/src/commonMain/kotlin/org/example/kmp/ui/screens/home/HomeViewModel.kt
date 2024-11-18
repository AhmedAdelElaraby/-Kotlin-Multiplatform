 package com.workdev.taskmoveis.ui.screens.home
//
//import androidx.lifecycle.ViewModel
//import androidx.lifecycle.viewModelScope
//import com.workdev.domain.entity.remote.DataExel
//import com.workdev.domain.usecase.CaseMovies
//import com.workdev.taskmoveis.StateApi.MoviesState
//import dagger.hilt.android.lifecycle.HiltViewModel
//import kotlinx.coroutines.flow.MutableStateFlow
//import kotlinx.coroutines.flow.StateFlow
//import kotlinx.coroutines.flow.catch
//import kotlinx.coroutines.launch
//import javax.inject.Inject
//
//@HiltViewModel
//class HomeViewModel @Inject constructor (private val caseMovies: CaseMovies):ViewModel() {
//    val _data:MutableStateFlow<MoviesState> = MutableStateFlow<MoviesState>(MoviesState.Empty)
//    val data:StateFlow<MoviesState> =_data
//    var currentPage = 1
//    var lastPage = 1
//
//
//
//
//    fun getMovies (dataExel: DataExel){
//
//         viewModelScope.launch {
//             _data.value = MoviesState.Loading
//             caseMovies.getMovies(dataExel).catch {
//                 _data.value=MoviesState.Failure(it)
//            }.collect{data->
//                 _data.value=MoviesState.Success(data)
//
//            }
//
//        }
//
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//
//}