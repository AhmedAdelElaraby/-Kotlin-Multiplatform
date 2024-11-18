package com.workdev.taskmoveis.ui.screens.home
//
//import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.foundation.lazy.grid.GridCells
//import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.runtime.collectAsState
//import androidx.compose.runtime.getValue
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.text.TextStyle
//import androidx.compose.ui.text.style.TextAlign
//import androidx.compose.ui.unit.dp
//import androidx.compose.ui.unit.sp
//import androidx.hilt.navigation.compose.hiltViewModel
//import androidx.navigation.NavHostController
//import com.workdev.domain.entity.remote.DataExel
//import com.workdev.taskmoveis.StateApi.MoviesState
//
//@Composable
//fun HomeScreen(navController: NavHostController,viewModel: HomeViewModel = hiltViewModel()) {
//
//           // navController.navigate(StateScreen.StateScreenDetails.route + "/$name")
//    var data = DataExel("000","Ahmed","ahmed@gamil.com","01069696038","Egypt","000")
//    viewModel.getMovies(data)
//    TextPageLabels(navController,viewModel)
//
//
//
//
//
//
//}
//
//@Composable
//fun TextPageLabels(navController: NavHostController,viewmodel: HomeViewModel) {
//    Column (modifier = Modifier
//        .fillMaxWidth()
//        .padding(top = 30.dp),
//        horizontalAlignment = Alignment.CenterHorizontally){
//
//        Text(text = "Page List",
//            modifier = Modifier.padding(start = 5.dp, top = 10.dp),
//            style = TextStyle(fontSize = 25.sp), textAlign = TextAlign.Justify)
//
//        ListGrid(navController,viewmodel)
//    }
//}
//
//
//@Composable
//fun ListGrid(navController: NavHostController,viewmodel: HomeViewModel) {
//
//    val dataMovies by viewmodel.data.collectAsState()
//
//
//    when (dataMovies) {
//        is MoviesState.Loading -> {
//            // Show loading indicator
//            //  CircularProgressIndicator(modifier = Modifier.fillMaxSize())
//        }
//
//        is MoviesState.Failure -> {
//            // Show error message
//
//        }
//
//        is MoviesState.Empty -> {
//            // Show empty state message
//
//        }
//
//        is MoviesState.Success -> {
//
//            var movies = (String as MoviesState.Success).data
//
////            viewmodel.currentPage=movies.page!!
////            viewmodel.lastPage=movies.total_pages!!
//
//            LazyVerticalGrid(columns = GridCells.Fixed(2),
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(top = 10.dp))
//            {
////                 Handle different states
//                items(movies) { item ->
//                    GridItem(item.toString(),navController)
//                }
//            }
//
//
//        }
//
//        else -> {
//
//        }
//    }
//
//
//}
//
