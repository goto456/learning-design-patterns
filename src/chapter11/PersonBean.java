package chapter11;

/**
 * FileName: PersonBean.java
 * Description:
 * Authors: wangbiwen
 * Date: 16-11-22
 */
public interface PersonBean {
    public String getName();

    public String getGender();

    public String getInterests();

    public int getHotOrNotRating();

    public void setName(String name);

    public void setGender(String gender);

    public void setInterests(String interests);

    public void setHotOrNotRating(int rating);
}
