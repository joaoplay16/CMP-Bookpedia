package com.plcoding.bookpedia

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.presentation.book_list.BookSearchBar

@Preview
@Composable
fun BookSearchBarPreview() {
    MaterialTheme {
        Surface {
            BookSearchBar(
                searchQuery = "Kotlin",
                onSearchQueryChange = {},
                onImeSearch = {}
            )
        }
    }
}