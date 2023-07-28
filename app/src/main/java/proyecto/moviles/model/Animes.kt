package proyecto.moviles.model

data class Animes(
    val studio: String,
    val genero: String,
    val titulo: String,
    val fechainicio: String,
    val infoimg: String
)

fun getData(): List<Animes> = listOf(
    Animes("Wit Studio", "Seinen", "Koutetsujou no Kabaneri", "Apr 8, 2016", "http://myanimelist.net/anime/28623/Koutetsujou_no_Kabaneri"),
    Animes("Bones", "Mystery", "Bungou Stray Dogs", "Apr 7, 2016", "http://myanimelist.net/anime/31478/Bungou_Stray_Dogs"),
    Animes("A-1 Pictures", "Fantasy", "Gakusen Toshi Asterisk 2nd Season", "Apr 2, 2016", "http://myanimelist.net/anime/31737/Gakusen_Toshi_Asterisk_2nd_Season"),
    Animes("Bones", "Action", "Boku no Hero Academia", "Apr 3, 2016", "http://myanimelist.net/anime/31964/Boku_no_Hero_Academia"),
    Animes("Trigger", "Sci-Fi", "Kiznaiver", "Mar 27, 2016", "http://myanimelist.net/anime/31798/Kiznaiver"),
    Animes("Diomedea", "Drama", "Mayoiga", "Apr 1, 2016", "http://myanimelist.net/anime/32438/Mayoiga"),
    Animes("Production I.G", "Military", "Joker Game", "Apr 5, 2016", "http://myanimelist.net/anime/31405/Joker_Game"),
    Animes("Studio Pierrot", "Action", "Sousei no Onmyouji", "Apr 6, 2016", "http://myanimelist.net/anime/32105/Sousei_no_Onmyouji"),
    Animes("Studio Deen", "School", "Sakamoto desu ga?", "Apr 8, 2016", "http://myanimelist.net/anime/32542/Sakamoto_desu_ga"),
    Animes("A-1 Pictures", "Police", "Gyakuten Saiban: Sono Shinjitsu, Igi Ari!", "Apr 2, 2016", "http://myanimelist.net/anime/31630/Gyakuten_Saiban__Sono_Shinjitsu_Igi_Ari"),
    Animes("Lay-duce", "Adventure", "Magi: Sinbad no Bouken (TV)", "Apr 16, 2016", "http://myanimelist.net/anime/31741/Magi__Sinbad_no_Bouken_TV"),
)
