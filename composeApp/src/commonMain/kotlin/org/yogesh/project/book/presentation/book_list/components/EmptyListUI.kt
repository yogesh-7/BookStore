package org.yogesh.project.book.presentation.book_list.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import bookstore.composeapp.generated.resources.Res
import bookstore.composeapp.generated.resources.empty_document
import org.jetbrains.compose.resources.painterResource
import org.yogesh.project.book.presentation.nonScaledSp

@Composable
fun EmptyScreenUI() {

    Column(
        modifier = Modifier.padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Couldn't find any results. Please, Try searching for a another book!",
            textAlign = TextAlign.Center,
            //style = MaterialTheme.typography.headlineSmall,
            color = MaterialTheme.colorScheme.error,
            style  = TextStyle(
                fontSize = 18.nonScaledSp,
                fontWeight = FontWeight.W500,
                textAlign = TextAlign.Center
            )
        )
        Spacer(modifier = Modifier.height(24.dp))
        Image(
            painter =
            painterResource(Res.drawable.empty_document),
            contentDescription = "Empty Screen",
            modifier = Modifier
                .size(80.dp)

        )
    }

}