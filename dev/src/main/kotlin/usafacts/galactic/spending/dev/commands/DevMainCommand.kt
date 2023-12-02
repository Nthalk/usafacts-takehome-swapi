package usafacts.galactic.spending.dev.commands

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands

class DevMainCommand : CliktCommand() {
    init {
        subcommands(
            GenSwApiCommand()
        )
    }
    override fun run() {
    }
}
