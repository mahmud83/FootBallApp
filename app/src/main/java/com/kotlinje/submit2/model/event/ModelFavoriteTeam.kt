package com.kotlinje.submit2.model.event

/**
 * Created by User on 19/05/2018.
 */
// add coruntines anko
//submission 4
//model favorite
class ModelFavoritePlayer(val id:Long?,
                          val teamName:String?,
                          val strImage:String?,
                          val strPosisi:String?
                          ) {

    //object nama tabel
    /*sesuaikan nama tabel
    field setiap tabel
    even_id
    even_date
    home team
    away team
    score home dan away*/
    companion object {
        const val TABLE_FAVORITE_TEAM= "tabel_favorite_Player"
        const val ID = "ID_"
        const val TEAM_ID = "player_id"
        const val TEAM_NAME= "player_name"
        const val TEAM_IMAGE = "player_image"
    }
}