# Compose Multiplatform Book App 📚

A sample application demonstrating the power of Compose Multiplatform.

🚀 Features

- **Multiplatform**: Runs seamlessly on Android, iOS, and Desktop.
- **Clean Architecture**: Follows Domain, Data, and Presentation layers for maintainable code.
- **Jetpack Compose**: Utilizes Compose for declarative and efficient UI development.
- **Networking**: Fetches book data dynamically from the Open Library API.
- **Local Database**: Saves favorite books locally using Room.
- **Animations**: Provides smooth animations for an enhanced user experience.
- **Navigation**: Implements seamless screen transitions.

## 📸 Screenshots
<img width="447" alt="Screenshot 2025-01-10 at 11 03 57 PM" src="https://github.com/user-attachments/assets/803b3a02-7c41-4c05-9901-cca1a880aa00" />

## 🛠️ How It Works  
1. **Book List**:  
   - Fetches and displays a list of books from the Open Library API.
   - Allows users to select and view book details. 

2. **Book Details**:
   -Displays detailed information about a selected book.
   -Provides an option to mark books as favorites.
3. **Favorites**:
   -Saves favorite books locally using Room.
   -Allows users to view their favorite books offline.
   
## 📂 Project Structure
  -commonMain: Contains shared logic and UI components for all platforms.
  -domain: Houses business logic and domain models.
  -data: Handles API requests and database interactions.
  -presentation: Contains UI elements and view models.
  -androidMain: Android-specific implementations.
  -iosMain: iOS-specific implementations.
  -desktopMain: Desktop-specific implementations.

## 📦 Technology Stack
  -Kotlin Multiplatform: Core framework for shared code.
  -Jetpack Compose: Declarative UI for modern app development.
  -Ktor: Networking library for API requests.
  -Room: Database for local data storage.
  -Coil: Image loading library.
  -Koin: Dependency injection framework.
  -Coroutines: Simplifies asynchronous programming.

## 🚀 Getting Started
**Prerequisites**
  -Install Android Studio.
  -Set up Kotlin Multiplatform Mobile.

## Installation  
1. Clone this repository:  
   ```bash  
   git clone https://github.com/yogesh-7/BookStore.git
2. Open the project in Android Studio.
3. Build and run the app on a WearOS emulator or compatible device.

## 🤝 Contribution Guidelines
Contributions are welcome! If you have ideas for improvements or encounter any issues, feel free to:
  -Open an issue.
  -Submit a pull request.

## 🌟 Support
If you found this project helpful, consider giving it a ⭐ on GitHub!





