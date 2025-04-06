public static void main(String[] args) {
    MusicLibrary library = new MusicLibrary();

    library.addTrack("gooesebumps - Travis Scott");
    library.addTrack("Gin and Juice - Snoop Dogg");
    library.addTrack("One Dance - Drake");

    library.displayTracks();

    library.createPlaylist("Favorites");
    library.addTrackToPlaylist("Favorites", "gooesebumps - Travis Scott");
    library.addTrackToPlaylist("Favorites", "Gin and Juice - Snoop Dogg");

    library.displayPlaylist("Favorites");

    library.searchTracks("snoop");

    library.removeTrack("AC/DC - Back in Black");

    library.displayAllPlaylists();
}

