package com.example.astronotes.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

//private val DarkColorScheme = darkColorScheme(
//    primary = Purple80,
//    secondary = PurpleGrey80,
//    tertiary = Pink80
//)

private val DarkColorScheme = darkColorScheme(
    primary = LightTurqoise,
    onPrimary = DarkTeal2,
    primaryContainer = Teal2,
    onPrimaryContainer = BluishWhite2,
    secondary = BrightGreen,
    onSecondary = DarkerGreen2,
    secondaryContainer = DarkGreen2,
    onSecondaryContainer = LightGreen2,
    tertiary = Lavender,
    onTertiary = DarkPurple2,
    tertiaryContainer = Purple2,
    onTertiaryContainer = LightPurple2,
    error = RoseRed,
    onError = DarkRed2,
    errorContainer = Red2,
    onErrorContainer = LightRed,
    background = Black2,
    onBackground = LightGray2,
    surface = Black2,
//    onSurface = LightGray2,
    onSurface = DarkGray1,
    outline = Gray2,
    surfaceVariant = DarkGray1,
    onSurfaceVariant = LightGray3
)

//private val LightColorScheme = lightColorScheme(
//    primary = Purple40,
//    secondary = PurpleGrey40,
//    tertiary = Pink40
//
//    /* Other default colors to override
//    background = Color(0xFFFFFBFE),
//    surface = Color(0xFFFFFBFE),
//    onPrimary = Color.White,
//    onSecondary = Color.White,
//    onTertiary = Color.White,
//    onBackground = Color(0xFF1C1B1F),
//    onSurface = Color(0xFF1C1B1F),
//    */
//)

private val LightColorScheme = lightColorScheme(
    primary = Teal1,
    onPrimary = White,
    primaryContainer = BluishWhite1,
    onPrimaryContainer = DarkTeal1,
    secondary = DarkGreen1,
    onSecondary = White,
    secondaryContainer = LightGreen1,
    onSecondaryContainer = DarkerGreen1,
    tertiary = Purple1,
    onTertiary = White,
    tertiaryContainer = LightPurple1,
    onTertiaryContainer = DarkPurple1,
    error = Red1,
    onError = White,
    errorContainer = LightRed,
    onErrorContainer = DarkRed1,
    background = White2,
    onBackground = Black2,
    surface = White2,
    onSurface = Black2,
    outline = Gray1,
    surfaceVariant = LightGray1,
    onSurfaceVariant = DarkGray1
)

@Composable
fun AstroNotesTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
      dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
        val context = LocalContext.current
        if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
      }
      darkTheme -> DarkColorScheme
      else -> LightColorScheme
    }
    val view = LocalView.current
    if (!view.isInEditMode) {
      SideEffect {
        val window = (view.context as Activity).window
        window.statusBarColor = colorScheme.primary.toArgb()
        WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
      }
    }

    MaterialTheme(
      colorScheme = colorScheme,
      typography = Typography,
      shapes = Shapes,
      content = content
    )
}