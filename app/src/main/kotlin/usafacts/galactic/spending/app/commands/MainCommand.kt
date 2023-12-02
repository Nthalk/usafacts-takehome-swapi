package usafacts.galactic.spending.app.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands

class MainCommand : CliktCommand() {
    init {
        subcommands(
            RunCommand()
        )
    }

    override fun run() {
    }
}
