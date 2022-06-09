package ru.netology.domain

import ru.netology.service.WallService

fun main() {
    var wallService = WallService

    val post1 = Post(
        1,
        1,
        1,
        1,
        1,
        "1",
        1,
        1,
        true,
        comments = Comment(1, true, true, true, true),
        copyright = Copyright(1, "1", "1", "1"),
        likes = Likes(1, true, true, true),
        reposts = Reposts(1, true),
        views = Views(1),
        "1",
        1,
        true,
        true,
        true,
        true,
        true,
        true,
        donut = Donut(true, 1, placeholder = Placeholder("1"), true, "1"),
        1
        )

    val post2 = Post(
        2,
        2,
        2,
        2,
        2,
        "2",
        2,
        2,
        true,
        comments = Comment(2, true, true, true, true),
        copyright = Copyright(2, "2", "2", "2"),
        likes = Likes(2, true, true, true),
        reposts = Reposts(2, true),
        views = Views(2),
        "2",
        2,
        true,
        true,
        true,
        true,
        true,
        true,
        donut = Donut(true, 2, placeholder = Placeholder("2"), true, "2"),
        2
    )

    val post3 = Post(
        3,
        3,
        3,
        3,
        3,
        "3",
        3,
        3,
        true,
        comments = Comment(3, true, true, true, true),
        copyright = Copyright(3, "3", "3", "3"),
        likes = Likes(3, true, true, true),
        reposts = Reposts(3, true),
        views = Views(3),
        "3",
        3,
        true,
        true,
        true,
        true,
        true,
        true,
        donut = Donut(true, 3, placeholder = Placeholder("3"), true, "3"),
        3
    )

    wallService.add(post1)
    wallService.add(post2)
    println(wallService.update(post2))
}