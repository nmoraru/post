package ru.netology.domain

class Post(
    id: Int, //Идентификатор записи
    ownerId: Int, //Идентификатор владельца стены
    fromId: Int, //Идентификатор автора записи
    createdBy: Int, // Идентификатор администратора, который опубликовал запись
    date: Int, // Время публикации записи в формате unixtime
    text: String, // Текст записи
    replyOwnerId: Int, // Идентификатор владельца записи, в ответ на которую была оставлена текущая
    replyPostId: Int, // Идентификатор записи, в ответ на которую была оставлена текущая
    friendsOnly: Boolean, // true, если запись была создана с опцией «Только для друзей»
    comments: Comment, // Информация о комментариях к записи, объект с полями
    copyright: Copyright, // Источник материала, объект с полями
    likes: Likes, // Информация о лайках к записи, объект с полями
    reposts: Reposts, // Информация о репостах записи («Рассказать друзьям»), объект с полями
    views: Views, // Информация о просмотрах записи. Объект с единственным полем
    postType: String, // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    signerId: Int, // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    canPin: Boolean, // может ли текущий пользователь закрепить запись
    canDelete: Boolean, // может ли текущий пользователь удалить запись
    canEdit: Boolean, // может ли текущий пользователь редактировать запись
    isPinned: Boolean, // закреплена ли запись
    markedAsAds: Boolean, // содержит ли запись отметку «реклама»
    isFavorite: Boolean, // добавлена ли запись в закладки у текущего пользователя
    donut: Donut, // Информация о записи VK Donut
    postponedId: Int, // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
) {
    // properties
    val id = id
    val ownerId = ownerId
    val fromId = fromId
    val createdBy = createdBy
    val date = date
    val text = text
    val replyOwnerId = replyOwnerId
    val replyPostId = replyPostId
    val friendsOnly = friendsOnly
    val comments = comments
    val copyright = copyright
    val likes = likes
    val reposts = reposts
    val views = views
    val postType = postType
    val signerId = signerId
    val canPin = canPin
    val canDelete = canDelete
    val canEdit = canEdit
    val isPinned = isPinned
    val markedAsAds = markedAsAds
    val isFavorite = isFavorite
    val donut = donut
    val postponedId = postponedId
}


class Comment (
    count: Int, // количество комментариев
    canPost: Boolean, // информация о том, может ли текущий пользователь комментировать запись
    groupsCanPost: Boolean, // информация о том, могут ли сообщества комментировать запись
    canClose: Boolean, // может ли текущий пользователь закрыть комментарии к записи
    canOpen: Boolean, // может ли текущий пользователь открыть комментарии к записи
) {
    // properties
    val count = count
    val canPost = canPost
    val groupsCanPost = groupsCanPost
    val canClose = canClose
    val canOpen = canOpen
}

class Copyright (
    id: Int,
    link: String,
    name: String,
    type: String,
) {
    // properties
    val id = id
    val link = link
    val name = name
    val type = type
}

class Likes(
    count: Int, // число пользователей, которым понравилась запись
    userLikes: Boolean, // наличие отметки «Мне нравится» от текущего пользователя
    canLike: Boolean, // может ли текущий пользователь поставить отметку «Мне нравится»
    canPublish: Boolean, // может ли текущий пользователь сделать репост записи
) {
    // properties
    val count = count
    val userLikes = userLikes
    val canLike = canLike
    val canPublish = canPublish
}

class Reposts(
    count: Int, // число пользователей, скопировавших запись
    userReposted: Boolean, // наличие репоста от текущего пользователя
) {
    // properties
    val count = count
    val userReposted = userReposted
}

class Views(
    count: Int, // число просмотров записи
) {
    // properties
    val count = count
}

class Donut (
    isDonut: Boolean, // запись доступна только платным подписчикам VK Donut
    paidDuration: Int, // время, в течение которого запись будет доступна только платным подписчикам VK Donut
    placeholder: Placeholder, // заглушка для пользователей, которые не оформили подписку VK Donut
    canPublishFreeCopy: Boolean, // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    editMode: String, // какие значения VK Donut можно изменить в записи. Возможные значения: all, duration
) {
    // properties
    val isDonut = isDonut
    val paidDuration = paidDuration
    val placeholder = placeholder
    val canPublishFreeCopy = canPublishFreeCopy
    val editMode = editMode
}

class Placeholder (message: String) {
    // properties
    val message = message
}
