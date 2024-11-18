
package com.workdev.taskmoveis.ui.screens.details

 import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier


//
//@Preview(showBackground = true)
//
//@Composable
// fun SecondScreen(viewModel: DetailseViewModel = hiltViewModel(), navController: NavHostController, backStackEntry: NavBackStackEntry) {
//
//
//    val MovieId = backStackEntry.arguments?.getInt("id")
//
//
//    LaunchedEffect(MovieId) {
//       // viewModel.getDetailseMovies(APIServiceHome.KEYAPP,MovieId!!)
//    }
//    val apiState by viewModel.data.collectAsState()
//
//
//    val pagerState = rememberPagerState()
//
//
//    when (apiState) {
//            is MovieDetailseState.Loading -> {
//                // Show loading indicator
//                //  CircularProgressIndicator(modifier = Modifier.fillMaxSize())
//            }
//
//            is MovieDetailseState.Failure -> {
//                // Show error message
//
//            }
//
//            is MovieDetailseState.Empty -> {
//                // Show empty state message
//
//            }
//
//            is MovieDetailseState.Success -> {
//
//
//                val data = (apiState as MovieDetailseState.Success).data
//
//                Pager(data,pagerState)
//
//
//            }
//
//            else -> {
//
//            }
//        }
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
//    }
//
//
//
//
//
//
//@Composable
//fun Pager(data:DetailsMovies,page: PagerState){
//
//    HorizontalPager(count = data.production_companies.size, state = page,
//        modifier = Modifier.fillMaxWidth().height(300.dp).padding(top = 30.dp)) { page ->
//
//        MyPager(data.production_companies[page])
//    }
//}