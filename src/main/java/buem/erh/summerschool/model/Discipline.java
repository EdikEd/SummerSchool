package buem.erh.summerschool.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Discipline {
    private String id;
    private String name;
    private int lectionsAmount;
    private boolean isProjectorRequired;
    private String description;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    // constructors, getters ... ets


    public Discipline() {
    }

    public Discipline(String name, int lectionsAmount, boolean isProjectorRequired, String description) {
        this.name = name;
        this.lectionsAmount = lectionsAmount;
        this.isProjectorRequired = isProjectorRequired;
        this.description = description;
    }

    public Discipline(String id, String name, int lectionsAmount, boolean isProjectorRequired, String description, LocalDateTime createdAt, LocalDateTime updatedAt) {
        this.id = id;
        this.name = name;
        this.lectionsAmount = lectionsAmount;
        this.isProjectorRequired = isProjectorRequired;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLectionsAmount() {
        return lectionsAmount;
    }

    public void setLectionsAmount(int lectionsAmount) {
        this.lectionsAmount = lectionsAmount;
    }

    public boolean isProjectorRequired() {
        return isProjectorRequired;
    }

    public void setProjectorRequired(boolean projectorRequired) {
        isProjectorRequired = projectorRequired;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Discipline that = (Discipline) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

    @Override
    public String toString() {
        return "Discipline{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", lectionsAmount=" + lectionsAmount +
                ", isProjectorRequired=" + isProjectorRequired +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
