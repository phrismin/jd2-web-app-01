package by.academy.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class userInfo implements Serializable {
    private static final long serialVersionUID = 11L;

    private String email;
    private String passpName;
    private String passpSurname;
    private String passpPatronymic;
    private Date passpDateBirth;
    private Date passpDateIssue;
    private String passpNumber;
    private Date drivLicDateIssue;
    private String drivLicSerialNumber;
    private String drivLicCategory;

    public userInfo() {
    }

    public userInfo(String email, String passpName, String passpSurname, String passpPatronymic,
                    Date passpDateBirth, Date passpDateIssue, String passpNumber, Date drivLicDateIssue,
                    String drivLicSerialNumber, String drivLicCategory) {
        this.email = email;
        this.passpName = passpName;
        this.passpSurname = passpSurname;
        this.passpPatronymic = passpPatronymic;
        this.passpDateBirth = passpDateBirth;
        this.passpDateIssue = passpDateIssue;
        this.passpNumber = passpNumber;
        this.drivLicDateIssue = drivLicDateIssue;
        this.drivLicSerialNumber = drivLicSerialNumber;
        this.drivLicCategory = drivLicCategory;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPasspName() {
        return passpName;
    }

    public void setPasspName(String passpName) {
        this.passpName = passpName;
    }

    public String getPasspSurname() {
        return passpSurname;
    }

    public void setPasspSurname(String passpSurname) {
        this.passpSurname = passpSurname;
    }

    public String getPasspPatronymic() {
        return passpPatronymic;
    }

    public void setPasspPatronymic(String passpPatronymic) {
        this.passpPatronymic = passpPatronymic;
    }

    public Date getPasspDateBirth() {
        return passpDateBirth;
    }

    public void setPasspDateBirth(Date passpDateBirth) {
        this.passpDateBirth = passpDateBirth;
    }

    public Date getPasspDateIssue() {
        return passpDateIssue;
    }

    public void setPasspDateIssue(Date passpDateIssue) {
        this.passpDateIssue = passpDateIssue;
    }

    public String getPasspNumber() {
        return passpNumber;
    }

    public void setPasspNumber(String passpNumber) {
        this.passpNumber = passpNumber;
    }

    public Date getDrivLicDateIssue() {
        return drivLicDateIssue;
    }

    public void setDrivLicDateIssue(Date drivLicDateIssue) {
        this.drivLicDateIssue = drivLicDateIssue;
    }

    public String getDrivLicSerialNumber() {
        return drivLicSerialNumber;
    }

    public void setDrivLicSerialNumber(String drivLicSerialNumber) {
        this.drivLicSerialNumber = drivLicSerialNumber;
    }

    public String getDrivLicCategory() {
        return drivLicCategory;
    }

    public void setDrivLicCategory(String drivLicCategory) {
        this.drivLicCategory = drivLicCategory;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        userInfo userInfo = (userInfo) o;
        return Objects.equals(email, userInfo.email) && Objects.equals(passpName, userInfo.passpName)
                && Objects.equals(passpSurname, userInfo.passpSurname)
                && Objects.equals(passpPatronymic, userInfo.passpPatronymic)
                && Objects.equals(passpDateBirth, userInfo.passpDateBirth)
                && Objects.equals(passpDateIssue, userInfo.passpDateIssue)
                && Objects.equals(passpNumber, userInfo.passpNumber)
                && Objects.equals(drivLicDateIssue, userInfo.drivLicDateIssue)
                && Objects.equals(drivLicSerialNumber, userInfo.drivLicSerialNumber)
                && Objects.equals(drivLicCategory, userInfo.drivLicCategory);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, passpName, passpSurname, passpPatronymic, passpDateBirth,
                passpDateIssue, passpNumber, drivLicDateIssue, drivLicSerialNumber, drivLicCategory);
    }
}
