package org.example.lesson_22

class MainScreenViewModel {

    var mainScreenState = MainScreenState()

    fun loadData() {
        println("Current state: $mainScreenState")

        mainScreenState = mainScreenState.copy(isLoading = true)
        println("Loading data...")

        mainScreenState = mainScreenState.copy(data = "Some data", isLoading = false)
        println("Data loaded: $mainScreenState")
    }

}

data class MainScreenState(
    val data: String = "",
    val isLoading: Boolean = false,
)

fun main() {

    val viewModel = MainScreenViewModel()
    viewModel.loadData()

}