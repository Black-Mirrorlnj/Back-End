    @PrePersist
    void prePersist() {
        this.createdAt = LocalDateTime.now();
        this.ativo = true;
    }
    @PreUpdate
    void preUpdate() {
        this.updatedAt = LocalDateTime.now();
    }
