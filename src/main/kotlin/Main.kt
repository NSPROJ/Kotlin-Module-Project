
data class Note(val title: String, val content: String)

class Archive(val name: String, val notes: MutableList<Note> = mutableListOf()) {
    fun addNote(note: Note) {
        notes.add(note)
    }
}

fun main() {
    val app = NotesApp()
    app.start()}