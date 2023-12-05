package usafacts.galactic.spending.dev

import com.github.ajalt.clikt.core.CliktCommand
import com.github.ajalt.clikt.core.subcommands
import usafacts.galactic.spending.dev.commands.GenApiCommand
import usafacts.galactic.spending.dev.commands.GenDbCommand

class DevMainCommand : CliktCommand() {
    init {
        subcommands(
            GenApiCommand(),
            GenDbCommand(),
        )
    }

    override fun run() {
    }
}

fun main(vararg args: String) {
    DevMainCommand().main(args)
}
