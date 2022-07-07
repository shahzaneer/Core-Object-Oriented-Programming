public class News {
    private int NewsID;
    private String NewsEditor;
    private String NewsContent;

    public News() {
    }

    public News(int NewsID, String NewsEditor, String NewsContent) {
        this.NewsID = NewsID;
        this.NewsEditor = NewsEditor;
        this.NewsContent = NewsContent;
    }

    public int getNewsID() {
        return this.NewsID;
    }

    public void setNewsID(int NewsID) {
        this.NewsID = NewsID;
    }

    public String getNewsEditor() {
        return this.NewsEditor;
    }

    public void setNewsEditor(String NewsEditor) {
        this.NewsEditor = NewsEditor;
    }

    public String getNewsContent() {
        return this.NewsContent;
    }

    public void setNewsContent(String NewsContent) {
        this.NewsContent = NewsContent;
    }

    @Override
    public String toString() {
        return "{" +
                " NewsID='" + getNewsID() + "'" +
                ", NewsEditor='" + getNewsEditor() + "'" +
                ", NewsContent='" + getNewsContent() + "'" +
                "}";
    }

    // public boolean equals(News obj) {
    //     return (obj != null && obj instanceof News);
    // }
    public boolean equals(News obj) {
        return (this.NewsID == obj.NewsID && this.NewsEditor == obj.NewsEditor && this.NewsContent == obj.NewsContent);
    }
    
}