package com.hatrick.api.error;

public class ResourceNotFoundDetail {
    private String title;
    private  int status;
    private String detail;
    private long timestamp;
    private String developerMessage;

    private ResourceNotFoundDetail() {
    }

    public String getTitle() {
        return title;
    }

    public int getStatus() {
        return status;
    }

    public String getDetail() {
        return detail;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getDeveloperMessage() {
        return developerMessage;
    }

    public static final class Builder {
        private String title;
        private  int status;
        private String detail;
        private long timestamp;
        private String developerMessage;

        private Builder() {
        }

        public static Builder newBuilder() {
            return new Builder();
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder status(int status) {
            this.status = status;
            return this;
        }

        public Builder detail(String detail) {
            this.detail = detail;
            return this;
        }

        public Builder timestamp(long timestamp) {
            this.timestamp = timestamp;
            return this;
        }

        public Builder developerMessage(String developerMessage) {
            this.developerMessage = developerMessage;
            return this;
        }

        public ResourceNotFoundDetail build() {
            ResourceNotFoundDetail resourceNotFoundDetail = new ResourceNotFoundDetail();
            resourceNotFoundDetail.title = this.title;
            resourceNotFoundDetail.status = this.status;
            resourceNotFoundDetail.timestamp = this.timestamp;
            resourceNotFoundDetail.developerMessage = this.developerMessage;
            resourceNotFoundDetail.detail = this.detail;
            return resourceNotFoundDetail;
        }
    }
}