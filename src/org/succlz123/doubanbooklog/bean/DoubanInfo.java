package org.succlz123.doubanbooklog.bean;

/**
 * Created by fashi on 2015/3/31.
 */
public class DoubanInfo {

    private int id; //����id
    private String uid; //����uid
    private String name; //�����û���
    private String avatar;//ͷ��Сͼ
    private String alt;//�û���ҳ
    private String relation;//�͵�ǰ��¼�û��Ĺ�ϵ��friend��contact
    private String created;//ע��ʱ��
    private int loc_id;//����id
    private String loc_name; //���ڵ�ȫ��
    private String desc;//���˼��

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getRelation() {
        return relation;
    }

    public void setRelation(String relation) {
        this.relation = relation;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public int getLoc_id() {
        return loc_id;
    }

    public void setLoc_id(int loc_id) {
        this.loc_id = loc_id;
    }

    public String getLoc_name() {
        return loc_name;
    }

    public void setLoc_name(String loc_name) {
        this.loc_name = loc_name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}
