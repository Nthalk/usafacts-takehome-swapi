package usafacts.galactic.spending.app.commands

import com.github.ajalt.clikt.core.CliktCommand
import org.springframework.boot.SpringApplication
import usafacts.galactic.spending.app.WebApp

class RunCommand : CliktCommand() {
    override fun run() {
        SpringApplication.run(WebApp::class.java)
    }
}
