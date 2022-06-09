package ru.netology.domain

data class Post(
    val id: Int, //Идентификатор записи
    val ownerId: Int, //Идентификатор владельца стены
    val fromId: Int, //Идентификатор автора записи
    val createdBy: Int, // Идентификатор администратора, который опубликовал запись
    val date: Int, // Время публикации записи в формате unixtime
    val text: String, // Текст записи
    val replyOwnerId: Int, // Идентификатор владельца записи, в ответ на которую была оставлена текущая
    val replyPostId: Int, // Идентификатор записи, в ответ на которую была оставлена текущая
    val friendsOnly: Boolean, // true, если запись была создана с опцией «Только для друзей»
    val comments: Comment, // Информация о комментариях к записи, объект с полями
    val copyright: Copyright, // Источник материала, объект с полями
    val likes: Likes, // Информация о лайках к записи, объект с полями
    val reposts: Reposts, // Информация о репостах записи («Рассказать друзьям»), объект с полями
    val views: Views, // Информация о просмотрах записи. Объект с единственным полем
    val postType: String, // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest
    val signerId: Int, // Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    val canPin: Boolean, // может ли текущий пользователь закрепить запись
    val canDelete: Boolean, // может ли текущий пользователь удалить запись
    val canEdit: Boolean, // может ли текущий пользователь редактировать запись
    val isPinned: Boolean, // закреплена ли запись
    val markedAsAds: Boolean, // содержит ли запись отметку «реклама»
    val isFavorite: Boolean, // добавлена ли запись в закладки у текущего пользователя
    val donut: Donut, // Информация о записи VK Donut
    val postponedId: Int, // Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере
)

class Comment(
    val count: Int, // количество комментариев
    val canPost: Boolean, // информация о том, может ли текущий пользователь комментировать запись
    val groupsCanPost: Boolean, // информация о том, могут ли сообщества комментировать запись
    val canClose: Boolean, // может ли текущий пользователь закрыть комментарии к записи
    val canOpen: Boolean, // может ли текущий пользователь открыть комментарии к записи
)

class Copyright(
    val id: Int,
    val link: String,
    val name: String,
    val type: String,
)

class Likes(
    val count: Int, // число пользователей, которым понравилась запись
    val userLikes: Boolean, // наличие отметки «Мне нравится» от текущего пользователя
    val canLike: Boolean, // может ли текущий пользователь поставить отметку «Мне нравится»
    val canPublish: Boolean, // может ли текущий пользователь сделать репост записи
)

class Reposts(
    val count: Int, // число пользователей, скопировавших запись
    val userReposted: Boolean, // наличие репоста от текущего пользователя
)

class Views(
    val count: Int, // число просмотров записи
)

class Donut(
    val isDonut: Boolean, // запись доступна только платным подписчикам VK Donut
    val paidDuration: Int, // время, в течение которого запись будет доступна только платным подписчикам VK Donut
    val placeholder: Placeholder, // заглушка для пользователей, которые не оформили подписку VK Donut
    val canPublishFreeCopy: Boolean, // можно ли открыть запись для всех пользователей, а не только подписчиков VK Donut
    val editMode: String, // какие значения VK Donut можно изменить в записи. Возможные значения: all, duration
)

class Placeholder(val message: String)
