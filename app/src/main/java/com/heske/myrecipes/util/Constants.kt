package com.heske.myrecipes.util

/* Copyright (c) 2019 Jill Heske All rights reserved.
 * 
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of this software and associated documentation files (the
 * "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish,
 * distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so, subject to
 * the following conditions:
 * 
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
const val TAG = "RECIPES"
const val DATABASE_NAME = "recipes_db"
const val WIKI_BASE_URL = "https://en.wikipedia.org/w/"
const val BASE_URL = "https://www.food2fork.com"

// YOU NEED YOUR OWN API KEY!!!!!!!!!!!!! https://www.food2fork.com/about/api
const val API_KEY = "dadc63b6325aaf398163b40fea9b5e79"
const val CONNECTION_TIMEOUT = 10L // 10 seconds
const val READ_TIMEOUT = 2L // 2 seconds
const val WRITE_TIMEOUT = 2L // 2 seconds

const val RECIPE_REFRESH_TIME = 60 * 60 * 24 * 30 // 30 days (in seconds)

val DEFAULT_SEARCH_CATEGORIES =
    arrayOf("Barbeque", "Breakfast", "Chicken", "Beef", "Brunch", "Dinner", "Wine", "Italian")

val DEFAULT_SEARCH_CATEGORY_IMAGES =
    arrayOf("barbeque", "breakfast", "chicken", "beef", "brunch", "dinner", "wine", "italian")