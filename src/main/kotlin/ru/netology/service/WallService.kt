package ru.netology.service

import ru.netology.domain.Post

class WallService {
    var posts = emptyArray<Post>()

    fun add(newPost: Post): Post {
        var flag = true
        for ((index, value) in posts.withIndex()) {
            if (newPost.id == posts[index].id)
                flag = false
        }
        if (flag) {
            posts += newPost
        }
        return posts.last()
    }

    fun update(newPost: Post): Boolean {
        var flag = false
        for ((index, value) in posts.withIndex()) {
            if (newPost.id == posts[index].id) {
                val updPost = Post(
                    posts[index].id,
                    posts[index].ownerId,
                    posts[index].fromId,
                    newPost.createdBy,
                    posts[index].date,
                    newPost.text,
                    newPost.replyOwnerId,
                    newPost.replyPostId,
                    newPost.friendsOnly,
                    newPost.comments,
                    newPost.copyright,
                    newPost.likes,
                    newPost.reposts,
                    newPost.views,
                    newPost.postType,
                    newPost.signerId,
                    newPost.canPin,
                    newPost.canDelete,
                    newPost.canEdit,
                    newPost.isPinned,
                    newPost.markedAsAds,
                    newPost.isFavorite,
                    newPost.donut,
                    newPost.postponedId
                )
                posts.set(index, updPost)
                flag = true
            }
        }
        return flag
    }
}