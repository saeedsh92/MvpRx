package ss.com.mvprx.home.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

import ss.com.mvprx.home.model.repo.DataSource;

/**
 * @author S.Shahini
 * @since 8/13/17
 */

public class NewsApiResponse {
    private String status;

    @SerializedName("source")
    private String newsSource;

    private DataSource.Type dataSourceType =DataSource.Type.REMOTE;

    @SerializedName("articles")
    private ArrayList<NewsViewModel> newsViewModels = new ArrayList<>();

    public ArrayList<NewsViewModel> getNewsViewModels() {
        return newsViewModels;
    }

    public void setNewsViewModels(ArrayList<NewsViewModel> newsViewModels) {
        this.newsViewModels = newsViewModels;
    }

    public String getNewsSource() {
        return newsSource;
    }

    public void setNewsSource(String newsSource) {
        this.newsSource = newsSource;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public  DataSource.Type getDataSourceType() {
        return dataSourceType;
    }

    public void setDataSourceType(DataSource.Type dataSourceType) {
        this.dataSourceType = dataSourceType;
    }
}
