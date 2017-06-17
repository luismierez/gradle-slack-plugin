package com.luismierez

/**
 * Created by luismierez on 4/16/17.
 */
open class Attachment(var fallback: String,
                      var color: String,
                      var pretext: String,
                      var author_name: String,
                      var author_icon: String,
                      var title: String,
                      var title_link: String,
                      var text: String,
                      var fields: List<Field>,
                      var image_url: String,
                      var thumb_url: String,
                      var footer: String,
                      var footer_icon: String,
                      var ts: String)
