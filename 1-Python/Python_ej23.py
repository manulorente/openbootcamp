import sqlite3 as sql
import sys

def create_db(db_name = "database"):
    # Create a database connection
    conn = sql.connect(db_name + '.db')
    # Create a cursor
    c = conn.cursor()
    # Create a table with three columns: id, name, and surname
    c.execute("""CREATE TABLE IF NOT EXISTS users (
                id INTEGER PRIMARY KEY,
                name TEXT,
                surname TEXT
            )""")
    # Close the connection
    conn.close()

def insert_db(db_name = "database", id = 0, name = "", surname = ""):
    # Create a database connection
    conn = sql.connect(db_name + '.db')
    # Create a cursor
    c = conn.cursor()
    # Insert a row of data
    c.execute("INSERT INTO users VALUES (?, ?, ?)", (id, name, surname))
    # Commit the changes
    conn.commit()
    # Close the connection
    conn.close()

if __name__ == '__main__':
    # Create database
    create_db()
    # Insert data
    insert_db(id = 1, name = "John", surname = "Doe")
    insert_db(id = 2, name = "Jane", surname = "Doe")
    insert_db(id = 3, name = "Jack", surname = "Doe")
    insert_db(id = 4, name = "Jill", surname = "Doe")
    insert_db(id = 5, name = "Joe", surname = "Doe")
    insert_db(id = 6, name = "Jana", surname = "Doe")
    insert_db(id = 7, name = "Juan", surname = "Doe")
    insert_db(id = 8, name = "Jona", surname = "Doe")
    # Show data by name
    conn = sql.connect('database.db')
    c = conn.cursor()
    c.execute("SELECT * FROM users WHERE name = 'Jana'")
    print(c.fetchall())
    conn.close()