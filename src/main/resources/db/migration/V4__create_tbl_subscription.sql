CREATE TABLE subscription (
    subscribed_user_id INT NOT NULL,
    session_id INT NOT NULL,
    created_at TIMESTAMP,
    level INT,
    unique_id VARCHAR(45) NOT NULL UNIQUE,

    PRIMARY KEY (subscribed_user_id, session_id),

    CONSTRAINT fk_subscription_user
        FOREIGN KEY (subscribed_user_id)
        REFERENCES user(user_id),

    CONSTRAINT fk_subscription_session
        FOREIGN KEY (session_id)
        REFERENCES session(session_id)
);
