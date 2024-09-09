package lab2moviles.uvg.edu.gt

class CharacterDb {
    private val characters: List<Character> = listOf(
        Character(1, "Rick Sanchez", "Alive", "Human", "Male", R.drawable.rick_sanchez),
        Character(2, "Morty Smith", "Alive", "Human", "Male", R.drawable.morty_smith),
        Character(3, "Summer Smith", "Alive", "Human", "Female", R.drawable.summer_smith),
        Character(4, "Beth Smith", "Alive", "Human", "Female", R.drawable.beth_smith),
        Character(5, "Jerry Smith", "Alive", "Human", "Male", R.drawable.jerry_smith),
        Character(6, "Abadango Cluster Princess", "Alive", "Alien", "Female", R.drawable.abadango_cluster_princess),
        Character(7, "Abradolf Lincler", "unknown", "Human", "Male", R.drawable.abradolf_lincler),
        Character(8, "Adjudicator Rick", "Dead", "Human", "Male", R.drawable.adjudicator_rick),
        Character(9, "Agency Director", "Dead", "Human", "Male", R.drawable.agency_director),
        Character(10, "Alan Rails", "Dead", "Human", "Male", R.drawable.alan_rails),
        Character(11, "Albert Einstein", "Dead", "Human", "Male", R.drawable.albert_einstein),
        Character(12, "Alexander", "Dead", "Human", "Male", R.drawable.alexander),
        Character(13, "Alien Googah", "unknown", "Alien", "unknown", R.drawable.alien_googah),
        Character(14, "Alien Morty", "unknown", "Alien", "Male", R.drawable.alien_morty),
        Character(15, "Alien Rick", "unknown", "Alien", "Male", R.drawable.alien_rick),
        Character(16, "Amish Cyborg", "Dead", "Alien", "Male", R.drawable.amish_cyborg),
        Character(17, "Annie", "Alive", "Human", "Female", R.drawable.annie),
        Character(18, "Antenna Morty", "Alive", "Human", "Male", R.drawable.antenna_morty),
        Character(19, "Antenna Rick", "unknown", "Human", "Male", R.drawable.antenna_rick),
        Character(20, "Ants in my Eyes Johnson", "unknown", "Human", "Male", R.drawable.ants_in_my_eyes_johnson)
    )

    fun getAllCharacters(): List<Character> {
        return characters
    }

    fun getCharacterById(id: Int): Character {
        return characters.first { it.id == id }
    }
}
