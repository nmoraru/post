package ru.netology.service

import org.junit.Test

import org.junit.Assert.*
import ru.netology.domain.*

class WallServiceTest {
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



   // println(wallService.update(post2))

    @Test
    fun addPostWithNonexistentId() {
        var wallService = WallService()
        wallService.add(post1)
        val post2Return = wallService.add(post2)

        val actual = post2Return.id
        val expected = post2.id

        assertEquals(expected, actual)
    }

    @Test
    fun addPostWithExistingId() {
        var wallService = WallService()
        wallService.add(post1)
        wallService.add(post2)

        val post1Return = wallService.add(post1)

        val actual = post1Return.id
        val expected = post2.id

        assertEquals(expected, actual)
    }

    @Test
    fun updatePostWithNonexistentId() {
        var wallService = WallService()
        wallService.add(post1)
        val actual = wallService.update(post2)
        val expected = false

        assertEquals(expected, actual)
    }

    @Test
    fun updatePostWithExistingId() {
        var wallService = WallService()
        wallService.add(post1)
        wallService.add(post2)

        val actual = wallService.update(post1)
        val expected = true

        assertEquals(expected, actual)
    }

}