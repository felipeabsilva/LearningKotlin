package objectOrientation

class DataBaseConstants private constructor() {
    companion object GUEST {
        val table_name = "Guest"

        object COLUMNS {
            val id = "id"
            val name = "name"
            val presence = "presence"
            val document = "document"
        }
    }
}

fun main(args: Array<String>) {
    DataBaseConstants.GUEST.COLUMNS.document
    DataBaseConstants.GUEST.COLUMNS.id

    DataBaseConstants.table_name
    DataBaseConstants.GUEST.table_name
}