package org.succlz123.doubanbooklog.bean.BookInfo;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fashi on 2015/4/1.
 */
public class Book {

    private GlobalRating rating;//��ҵ�����
    private String subtitle;//�鼮������
    private List<String> author;//�鼮�����б�
    private String pubdate;//��������
    private List<GlobalTag> tags;//��ҵı�ǩ�б�
    private String origin_title;//������ʲô���� Ĭ�Ͽ�
    private String image;//�鼮���� Ĭ�Ϸ��ص��Ƿ�����ͼ
    private String binding;//װ֡
    private List<String> translator;//�����б�
    private String catalog;//Ŀ¼
    private int pages;//ҳ��
    private BookImage images;//�鼮����
    private String alt;//�鼮��ҳ
    private int publisher;//�鼮�ڶ����id
    private int isbn10;//�鼮��isbn10���
    private int isbn13;//�鼮��isbn13��� Ĭ�Ϻ�����ʾisbn13
    private String title;//�鼮����
    private String url;//�鼮�ڶ���api�ĵ�ַ
    private String alt_title;//������ʲô���� Ĭ�Ͽ�
    private String author_intro;//���߼��
    private String summary;//�鼮���
    private double price;//�鼮����

    public GlobalRating getRating() {
        return rating;
    }

    public void setRating(GlobalRating rating) {
        this.rating = rating;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public List<String> getAuthor() {
        return author;
    }

    public void setAuthor(List<String> author) {
        this.author = author;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public List<GlobalTag> getTags() {
        return tags;
    }

    public void setTags(List<GlobalTag> tags) {
        this.tags = tags;
    }

    public String getOrigin_title() {
        return origin_title;
    }

    public void setOrigin_title(String origin_title) {
        this.origin_title = origin_title;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public List<String> getTranslator() {
        return translator;
    }

    public void setTranslator(List<String> translator) {
        this.translator = translator;
    }

    public String getCatalog() {
        return catalog;
    }

    public void setCatalog(String catalog) {
        this.catalog = catalog;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public BookImage getImages() {
        return images;
    }

    public void setImages(BookImage images) {
        this.images = images;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public int getPublisher() {
        return publisher;
    }

    public void setPublisher(int publisher) {
        this.publisher = publisher;
    }

    public int getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(int isbn10) {
        this.isbn10 = isbn10;
    }

    public int getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(int isbn13) {
        this.isbn13 = isbn13;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAlt_title() {
        return alt_title;
    }

    public void setAlt_title(String alt_title) {
        this.alt_title = alt_title;
    }

    public String getAuthor_intro() {
        return author_intro;
    }

    public void setAuthor_intro(String author_intro) {
        this.author_intro = author_intro;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static Book parseJson(JSONObject object) {
        try {
            Book book = new Book();

            {
                JSONObject jsonObject = new JSONObject("rating");
                GlobalRating globalRating = GlobalRating.parseJson(jsonObject);
                book.setRating(globalRating);
            }

            String subtitle = object.getString("subtitle");

            {
                JSONArray authorJSONArray = object.getJSONArray("author");
                List<String> collections = new ArrayList<String>();
                for (int i = 0; i < authorJSONArray.length(); i++) {
                    String result = authorJSONArray.getString(i);
                    collections.add(result);
                }
                book.setAuthor(collections);
            }

            String pubdate = object.getString("pudate");

            {
                JSONArray tagsJSONArray = object.getJSONArray("tags");
                List<GlobalTag> collections = new ArrayList<GlobalTag>();
                for (int i = 0; i < tagsJSONArray.length(); i++) {
                    JSONObject jsonObject = tagsJSONArray.getJSONObject(i);
                    GlobalTag globalTag = GlobalTag.parseJson(jsonObject);
                    if (globalTag != null) {
                        collections.add(globalTag);
                    }
                }
                book.setTags(collections);
            }

            String origin_title = object.getString("origin_title");
            String image = object.getString("image");
            String binding = object.getString("binding");

            {
                JSONArray translatorJSONArray = object.getJSONArray("translator");
                List<String> collections = new ArrayList<String>();
                for (int i = 0; i < translatorJSONArray.length(); i++) {
                    String result = translatorJSONArray.getString(i);
                    collections.add(result);
                }
                book.setTranslator(collections);
            }

            String catalog = object.getString("catalog");
            Integer pages = object.getInt("pages");

            {
                JSONObject jsonObject = new JSONObject("images");
                BookImage bookImage = BookImage.parseJson(jsonObject);
                book.setImages(bookImage);
            }

            String alt = object.getString("alt");
            Integer publisher = object.getInt("publisher");
            Integer isbn10 = object.getInt("isbn10");
            Integer isbn13 = object.getInt("isbn13");
            String title = object.getString("title");
            String url = object.getString("url");
            String alt_title = object.getString("alt_title");
            String author_intro = object.getString("author_intro");
            String summary = object.getString("summary");
            Double price = object.getDouble("price");

            book.setSubtitle(subtitle);
            book.setPubdate(pubdate);
            book.setOrigin_title(origin_title);
            book.setImage(image);
            book.setBinding(binding);
            book.setCatalog(catalog);
            book.setPages(pages);
            book.setAlt(alt);
            book.setPublisher(publisher);
            book.setIsbn10(isbn10);
            book.setIsbn13(isbn13);
            book.setTitle(title);
            book.setUrl(url);
            book.setAlt_title(alt_title);
            book.setAuthor_intro(author_intro);
            book.setSummary(summary);
            book.setPrice(price);

            return book;
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return null;
    }
}
