package org.succlz123.doubanbooklog.bean;

/**
 * Created by fashi on 2015/3/30.
 */
public class BookInfo {

    private String self;//�����鼮xml��ַ
    private String alternate;//�����鼮��ҳ��ַ
    private String image;//�����鼮�����ַ
    private String mobile;//�����鼮�ƶ���ַ

    private String summary;//�鼮���
    private int isbn10;//isbn10ֵ
    private int isbn13;//isbn13ֵ

    private String title;//����
    private int pages;//ҳ��
    private String author;//����
    private Double price;//�۸�
    private String publisher;//������
    private String binding;//װ����ʽ
    private String pubdate;//����ʱ��
    private String authorIntro;//���߼��

    public String getSelf() {
        return self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    public String getAlternate() {
        return alternate;
    }

    public void setAlternate(String alternate) {
        this.alternate = alternate;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
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

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getBinding() {
        return binding;
    }

    public void setBinding(String binding) {
        this.binding = binding;
    }

    public String getPubdate() {
        return pubdate;
    }

    public void setPubdate(String pubdate) {
        this.pubdate = pubdate;
    }

    public String getAuthorIntro() {
        return authorIntro;
    }

    public void setAuthorIntro(String authorIntro) {
        this.authorIntro = authorIntro;
    }
}
