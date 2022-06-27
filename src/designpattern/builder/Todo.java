package designpattern.builder;

import java.util.Date;

public class Todo {
    private long id;
    private String title;
    private String userName;
    private Date createdDate;
    private boolean isCompleted;

    @Override
    public String toString() {
        return "Todo : " +
                "id=" + id +
                ", title='" + title + '\'' +
                ", userName='" + userName + '\'' +
                ", createdDate=" + createdDate +
                ", isCompleted=" + isCompleted;
    }

    Todo(Builder builder) {
        this.id = builder.id;
        this.title = builder.title;
        this.userName = builder.userName;
        this.createdDate = builder.createdDate;
        this.isCompleted = builder.isCompleted;
    }

    public static class Builder {
        private long id;
        private String title;
        private String userName;
        private Date createdDate;
        private boolean isCompleted;

        public Builder(long id) {
            this.id = id;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder userName(String userName) {
            this.userName = userName;
            return this;
        }

        public Builder createdDate(Date createdDate) {
            this.createdDate = createdDate;
            return this;
        }

        public Builder isCompleted(boolean isCompleted) {
            this.isCompleted = isCompleted;
            return this;
        }

        public Todo build() {
            return new Todo(this);
        }
    }
}
