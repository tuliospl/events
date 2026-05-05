CREATE TABLE session (
    session_id INT AUTO_INCREMENT PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    start_date DATE NOT NULL,
    start_time TIME NOT NULL,
    conference_id_conference INT,

    CONSTRAINT fk_session_conference
        FOREIGN KEY (conference_id_conference)
        REFERENCES conference(id_conference)
);
