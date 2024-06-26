package ridaz.sl.composebootcamp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import ridaz.sl.composebootcamp.R

// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
    /* Other default text styles to override
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    labelSmall = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
    */
)

val Montserrat = FontFamily(
    fonts = listOf(
        Font(
            resId = R.font.montserrat_black,
            weight = FontWeight.W900,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.montserrat_black_italic,
            weight = FontWeight.W900,
            style = FontStyle.Italic
        ),
        Font(
            resId = R.font.montserrat_bold,
            weight = FontWeight.W700,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.montserrat_bold_italic,
            weight = FontWeight.W700,
            style = FontStyle.Italic
        ),
        Font(
            resId = R.font.montserrat,
            weight = FontWeight.W500,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.montserrat_italic,
            weight = FontWeight.W500,
            style = FontStyle.Italic
        ),
        Font(
            resId = R.font.montserrat_light,
            weight = FontWeight.W300,
            style = FontStyle.Normal
        ),
        Font(
            resId = R.font.montserrat_light_italic,
            weight = FontWeight.W300,
            style = FontStyle.Italic
        ),
    )
)