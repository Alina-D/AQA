package part5.aqa.example2;

public class Customer {
    private String surname;
    private String name;
    private String middleName;
    private String address;
    private int cardNumber;
    private int bankAccountNumber;

    public Customer(String surname, String name, String middleName, String address, int cardNumber, int bankAccountNumber) {
        this.surname = surname;
        this.name = name;
        this.middleName = middleName;
        this.address = address;
        this.cardNumber = cardNumber;
        this.bankAccountNumber = bankAccountNumber;
    }

    public String getSurname() {
        return surname;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getAddress() {
        return address;
    }

    public int getCardNumber() {
        return cardNumber;
    }

    public int getBankAccountNumber() {
        return bankAccountNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccountNumber(int bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void getData () {
        StringBuilder builder = new StringBuilder();
        builder.append("Фамилия ");
        builder.append(this.surname);
        builder.append("Имя ");
        builder.append(this.name);
        builder.append("Отчество ");
        builder.append(this.middleName);
        builder.append("Отчество ");
        builder.append(this.address);
        builder.append("Отчество ");
        builder.append(this.cardNumber);
        builder.append("Отчество ");
        builder.append(this.bankAccountNumber);
        String result = builder.toString();
        System.out.println(result);
    }
}
