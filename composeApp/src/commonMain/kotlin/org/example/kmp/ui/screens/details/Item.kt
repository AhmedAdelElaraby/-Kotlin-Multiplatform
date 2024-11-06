package com.workdev.taskmoveis.ui.screens.details

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.workdev.domain.entity.remote.ProductionCompany


@ExperimentalFoundationApi
@Composable
fun MyPager(production: ProductionCompany) {
    // Create a PagerState with the number of pages you want

    Card (modifier = Modifier
        .fillMaxSize()
        .padding(5.dp)
        , onClick = {
          //  navController.navigate(StateScreen.StateScreenDetails.route + "/${item.id}")

        }) {

        Box(modifier = Modifier.fillMaxSize().padding(16.dp),
            contentAlignment = Alignment.Center)
        {
            AsyncImage(model = ImageRequest.Builder(LocalContext.current)
                    .crossfade(true)
                    .build(),
                contentDescription = null,
                modifier = Modifier.wrapContentWidth().wrapContentHeight().aspectRatio(1f),
                contentScale = ContentScale.Fit
            )

        }
    }
    }


