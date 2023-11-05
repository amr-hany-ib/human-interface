package com.btech.checkout.common

import android.content.Context
import coil.ImageLoader
import coil.decode.ImageDecoderDecoder

object CoilImageLoader {
    private var imageLoader: ImageLoader? = null
    fun getImageLoader(context: Context): ImageLoader {
        return imageLoader
            ?: ImageLoader.Builder(context)
                .components {
                    add(ImageDecoderDecoder.Factory())
                }
                .build()
    }
}
