package org.yogesh.project.book.presentation.book_detail.components

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import org.yogesh.project.book.presentation.nonScaledSp

@Composable
fun TitledContent(
    title: String,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = title,
            //style = MaterialTheme.typography.titleSmall,
            style = TextStyle(
                fontSize = 14.nonScaledSp,
                fontWeight = FontWeight.W600,
                textAlign = TextAlign.Center
            )
        )

        content()
    }
}