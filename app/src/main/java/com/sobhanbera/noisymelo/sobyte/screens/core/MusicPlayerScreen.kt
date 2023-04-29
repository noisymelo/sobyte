package com.sobhanbera.noisymelo.sobyte.screens.core

import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.sobhanbera.noisymelo.sobyte.components.AppLogoHeader
import com.sobhanbera.noisymelo.sobyte.components.SobyteLinearGradient
import com.sobhanbera.noisymelo.sobyte.controllers.ScreenController
import com.sobhanbera.noisymelo.sobyte.viewmodels.CorePlayerViewModel
import com.sobhanbera.noisymelo.sobyte.viewmodels.CorePlayerViewModelState

@Composable
fun MusicPlayerScreen(
	navController: NavController,
	screenController: ScreenController,

	corePlayerViewModel: CorePlayerViewModel,
	corePlayerState: CorePlayerViewModelState,
) {

	val image = "https://lh3.googleusercontent.com/EqN-4y9jQg91mt-94KKI8L1xu3olMS-Fh_WLL5tMlnqh1pSRzt-uWdnTVlY_GBnvLuA_WJmS6FYAXJlZtQ=w520-h520-l90-rj"

	val colorPalette = corePlayerState.colorPalette

	LaunchedEffect(key1 = image) {
		corePlayerViewModel.setImageUri(image)
	}

	TODO("This screen is not implemented yet.")

	Box(
		modifier = Modifier.fillMaxSize(),
	) {
		if (colorPalette != null) {
			SobyteLinearGradient(
				colors = listOf(
					colorPalette.lightMutedColor,
					colorPalette.dominantColor,
				),
				parentModifier = Modifier
					.fillMaxSize(),
				modifier = Modifier
					.fillMaxSize(),
				gradientAngle = 270f
			) {

			}
		}
	}

//	AsyncImage(
//		model = image,
//		contentDescription = "",
//		modifier = Modifier
//			.height(TRACK_ARTWORK_HEIGHT.dp)
//			.width(TRACK_ARTWORK_WIDTH.dp)
//	)

	Column {
		AppLogoHeader()
	}
}
