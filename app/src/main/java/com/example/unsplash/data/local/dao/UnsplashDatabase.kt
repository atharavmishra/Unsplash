package com.example.unsplash.data.local.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.paging3demo.data.local.dao.UnsplashRemoteKeysDao
import com.example.paging3demo.model.UnsplashImage
import com.example.unsplash.model.UnsplashRemoteKeys

@Database(entities = [UnsplashImage::class, UnsplashRemoteKeys::class], version = 1)
abstract class UnsplashDatabase : RoomDatabase(){
    abstract fun UnsplashImageDao() : UnsplashImageDao
    abstract fun UnsplashRemoteKeys() : UnsplashRemoteKeysDao
}