package com.workdev.taskmoveis.ui.screens.home
//
//import androidx.compose.foundation.layout.aspectRatio
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Card
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.platform.LocalContext
//import androidx.compose.ui.unit.dp
//import androidx.navigation.NavHostController
//import coil.compose.AsyncImage
//import coil.request.ImageRequest
//import com.workdev.data.data.remote.APIService
//import com.workdev.taskmoveis.ui.navigation.StateScreen
//
//@Composable
//fun GridItem(item: String, navController: NavHostController) {
//    Card (modifier = Modifier
//        .fillMaxSize()
//        .padding(5.dp)
//        , onClick = {
//            navController.navigate(StateScreen.StateScreenDetails.route + "/${item}")
//
//        }){
//        AsyncImage(
//            model = ImageRequest.Builder(LocalContext.current)
//                .data(APIService.BASE_IMAGE+item)
//                .crossfade(true)
//                .build(),
//            contentDescription = null,
//            modifier = Modifier
//                .fillMaxWidth()
//                .aspectRatio(1f)
//                .padding(bottom = 8.dp),
//            contentScale = ContentScale.Crop
//        )
//        Text(text = item
//            , modifier = Modifier.padding(start = 5.dp, top = 2.dp))
//        Text(text = item
//            ,modifier = Modifier.padding(start = 5.dp, top = 2.dp))
//
//    }
//}