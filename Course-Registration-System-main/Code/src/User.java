// Author: Shanaldo Carty
// Completed Date: June 20, 2025

import java.io.Serializable;

public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private String role;
    private String email;
    private int adminLevel; // 1 = Admin, 2 = Senior Admin, 3 = Master Admin

    public User(String username, String password, String role, String email) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.adminLevel = 1; // Default level for new Admins
    }

    public User(String username, String password, String role, String email, int adminLevel) {
        this.username = username;
        this.password = password;
        this.role = role;
        this.email = email;
        this.adminLevel = adminLevel;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public String getEmail() {
        return email;
    }

    public int getAdminLevel() {
        return adminLevel;
    }

    public String getAdminLevelName() {
        return switch (adminLevel) {
            case 3 -> "Master Admin";
            case 2 -> "Senior Admin";
            case 1 -> "Admin";
            default -> "Unknown";
        };
    }

    // Setters
    public void setPassword(String newPassword) {
        this.password = newPassword;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void setAdminLevel(int level) {
        this.adminLevel = level;
    }
}
