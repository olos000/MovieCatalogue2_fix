package com.andronity.moviecatalogue2

class MoviesData {
    var data = arrayOf(
        arrayOf(
            "Spider-Man: Into the Spider-Verse",
            "Miles Morales is juggling his life between being a high school student and being a spider-man. When Wilson \"Kingpin\" Fisk uses a \t\t\tsuper collider, others from across the Spider-Verse are transported to this dimension.",
            "https://image.tmdb.org/t/p/w300_and_h450_bestv2/iiZZdoQBEYBv6id8su7ImL0oCbD.jpg"
        ),
        arrayOf(
            "Ralph Breaks the Internet",
            "Video game bad guy Ralph and fellow misfit Vanellope von Schweetz must risk it all by traveling to the World Wide Web in search of a replacement part to save Vanellope's video game, \"Sugar Rush.\" In way over their heads, Ralph and Vanellope rely on the citizens of the internet -- the netizens -- to help navigate their way, including an entrepreneur named Yesss, who is the head algorithm and the heart and soul of trend-making site BuzzzTube.",
            "https://image.tmdb.org/t/p/w185_and_h278_bestv2/qEnH5meR381iMpmCumAIMswcQw2.jpg"
        ),
        arrayOf(
            "Fantastic Beasts: The Crimes of Grindelwald",
            "Gellert Grindelwald has escaped imprisonment and has begun gathering followers to his cause—elevating wizards above all non-magical beings. The only one capable of putting a stop to him is the wizard he once called his closest friend, Albus Dumbledore. However, Dumbledore will need to seek help from the wizard who had thwarted Grindelwald once before, his former student Newt Scamander, who agrees to help, unaware of the dangers that lie ahead. Lines are drawn as love and loyalty are tested, even among the truest friends and family, in an increasingly divided wizarding world.",
            "https://image.tmdb.org/t/p/w185_and_h278_bestv2/fMMrl8fD9gRCFJvsx0SuFwkEOop.jpg"
        ),
        arrayOf(
            "Robin Hood",
            "A war-hardened Crusader and his Moorish commander mount an audacious revolt against the corrupt English crown.",
            "https://image.tmdb.org/t/p/w300_and_h450_bestv2/AiRfixFcfTkNbn2A73qVJPlpkUo.jpg"
        ),
        arrayOf(
            "A Star Is Born",
            "Seasoned musician Jackson Maine discovers — and falls in love with — struggling artist Ally. She has just about given up on her dream to make it big as a singer — until Jack coaxes her into the spotlight. But even as Ally's career takes off, the personal side of their relationship is breaking down, as Jack fights an ongoing battle with his own internal demons.",
            "https://image.tmdb.org/t/p/w300_and_h450_bestv2/wrFpXMNBRj2PBiN4Z5kix51XaIZ.jpg"
        ),
        arrayOf(
            "Aquaman",
            "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm.  With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
            "https://image.tmdb.org/t/p/w300_and_h450_bestv2/5Kg76ldv7VxeX9YlcQXiowHgdX6.jpg"
        ),
        arrayOf(
            "Avengers: Infinity War",
            "As the Avengers and their allies have continued to protect the world from threats too large for any one hero to handle, a new \t\t\tdanger has emerged from the cosmic shadows: Thanos. A despot of intergalactic infamy, his goal is to collect all six Infinity \t\t\tStones, artifacts of unimaginable power, and use them to inflict his twisted will on all of reality. Everything the Avengers have \t\t\tfought for has led up to this moment - the fate of Earth and existence itself has never been more uncertain.",
            "https://image.tmdb.org/t/p/w300_and_h450_bestv2/7WsyChQLEftFiDOVTGkv3hFpyyt.jpg"
        ),
        arrayOf(
            "Creed II",
            "Between personal obligations and training for his next big fight against an opponent with ties to his family's past, Adonis Creed is up against the challenge of his life.",
            "https://image.tmdb.org/t/p/w300_and_h450_bestv2/v3QyboWRoA4O9RbcsqH8tJMe8EB.jpg"
        ),
        arrayOf(
            "How to Train Your Dragon: The Hidden World",
            "As Hiccup fulfills his dream of creating a peaceful dragon utopia, Toothless’ discovery of an untamed, elusive mate draws the Night Fury away. When danger mounts at home and Hiccup’s reign as village chief is tested, both dragon and rider must make impossible decisions to save their kind",
            "https://image.tmdb.org/t/p/w300_and_h450_bestv2/xvx4Yhf0DVH8G4LzNISpMfFBDy2.jpg"
        ),
        arrayOf(
            "Glass",
            "In a series of escalating encounters, former security guard David Dunn uses his supernatural abilities to track Kevin Wendell Crumb, a disturbed man who has twenty-four personalities. Meanwhile, the shadowy presence of Elijah Price emerges as an orchestrator who holds secrets critical to both men.",
            "https://image.tmdb.org/t/p/w600_and_h900_bestv2/svIDTNUoajS8dLEo7EosxvyAsgJ.jpg"
        )
    )

    val listData: ArrayList<Movie>
        get() {
            val list = ArrayList<Movie>()
            for (aData in data) {
                val movie = Movie(aData[0], aData[1], aData[2])
                movie.name = aData[0]
                movie.description = aData[1]
                movie.photo = aData[2]
                list.add(movie)
            }
            return list

        }


}