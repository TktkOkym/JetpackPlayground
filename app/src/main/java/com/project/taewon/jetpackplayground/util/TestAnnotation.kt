package com.project.taewon.jetpackplayground.util

/**
 * This annotation allows us to open some classes for mocking purposes while they are final in
 * release builds.
 *
 * Gradle setting needed for 'all open'
 * https://github.com/googlesamples/android-architecture-components/blob/master/GithubBrowserSample/app/build.gradle
 */
@Target(AnnotationTarget.ANNOTATION_CLASS)
annotation class OpenClass

/**
 * Annotate a class with [OpenForTesting] if you want it to be extendable in debug builds.
 */
@OpenClass
@Target(AnnotationTarget.CLASS)
annotation class OpenForTesting