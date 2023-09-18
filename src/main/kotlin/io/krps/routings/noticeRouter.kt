package io.krps.routings

import io.ktor.server.application.*
import io.ktor.server.html.*
import io.ktor.server.routing.*
import kotlinx.html.a
import kotlinx.html.body

fun Routing.routeNotice() {
    route("/KartRider/config/notice") {
        route("/notice-1.0") {
            get("ko.html") {
                call.respondHtml {
                    body {
                        a {
                            text("KartRider Rush Plus ReOpen!")
                        }
                    }
                }
            }
        }
    }
}