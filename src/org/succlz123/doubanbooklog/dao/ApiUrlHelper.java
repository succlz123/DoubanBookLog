package org.succlz123.doubanbooklog.dao;

/**
 * Created by fashi on 2015/3/31.
 */
public class ApiUrlHelper {

    public static final String USER_INFO = "https://api.douban.com/v2/user/~me";//api�����ַ
    public static final String BASE = "https://api.douban.com";//api���õ�ַ
    public static final String BOOK_INFO = BASE + "/v2/book/:id";//��ȡͼ����Ϣ
    public static final String BOOK_INFO_ISBN = BASE + "/v2/book/isbn/:name";//����isbn��ȡͼ����Ϣ
    public static final String USER_SEARCH = BASE + "/v2/book/search";//����ͼ��
    public static final String USER_MAX_TAG = BASE + "/v2/book/:id/tags";//��ȡĳ��ͼ���б�����ı�ǩ
    public static final String USER_ALL_TAG = BASE + "/v2/book/user/:name/tags";//��ȡ�û���ͼ������б�ǩ
    public static final String USER_BOOK_ALL_INFO = BASE + "/v2/book/user/:name/collections";//��ȡĳ���û�������ͼ���ղ���Ϣ
    public static final String USER_ONEBOOK_INFO = BASE + "/v2/book/:id/collection";//��ȡ�û���ĳ��ͼ����ղ���Ϣ
    public static final String USER_ALL_NOTE = BASE + "/v2/book/user/:name/annotations";// ��ȡĳ���û������бʼ�
    public static final String USER_ONEBOOK_NOTE = BASE + "/v2/book/:id/annotations";//��ȡĳ��ͼ������бʼ�
    public static final String USER_ONENOTE_INFO = BASE + "/v2/book/annotation/:id";//��ȡĳƪ�ʼǵ���Ϣ
    public static final String USER_BOOK_CATALOG = BASE + "/v2/book/series/:id/books";//��ȡ������Ŀ��Ϣ
}
