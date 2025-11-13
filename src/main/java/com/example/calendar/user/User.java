package com.example.calendar.user;



import jakarta.persistence.*;

/**
 * Represents a user entity in the calendar system.
 * This class is mapped to the "users" table in the database.
 *
 * <p>Each {@code User} object contains basic information such as
 * username, email, and password.</p>
 *
 * @author Jeremy Sun
 */
@Entity
@Table(name = "users")
public class User {

    /**
     * The unique identifier for the user.
     */
    @Id
    private Long id;

    /**
     * The username of the user.
     */
    private String userName;

    /**
     * The email address of the user.
     */
    private String email;

    /**
     * The password of the user.
     */
    private String password;

    /**
     * Returns the unique identifier of the user.
     *
     * @return the user's ID
     */
    public Long getId() {
        return id;
    }

    /**
     * Sets the unique identifier for the user.
     *
     * @param id the user's ID to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * Returns the email address of the user.
     *
     * @return the user's email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Sets the email address of the user.
     *
     * @param email the user's email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Returns the username of the user.
     *
     * @return the user's username
     */
    public String getUserName() {
        return userName;
    }

    /**
     * Sets the username for the user.
     *
     * @param userName the user's username to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * Returns the password of the user.
     *
     * @return the user's password
     */
    public String getPassword() {
        return password;
    }

    /**
     * Sets the password for the user.
     *
     * @param password the user's password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
