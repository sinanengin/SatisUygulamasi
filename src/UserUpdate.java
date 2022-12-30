public class UserUpdate extends Static {

    public void updateFirstName() {
        String newFirstName;
        System.out.println("Yeni İsim: ");
        newFirstName = scanner.next();
        users.get(loginId).setFirstName(newFirstName);
    }
    public void updateLastName() {
        String newLastName;
        System.out.println("Yeni Soyisim: ");
        newLastName = scanner.next();
        users.get(loginId).setLastName(newLastName);
    }
    public void updatePhone() {
        String newPhone;
        System.out.println("Yeni Telefon Numarası: ");
        newPhone = scanner.next();
        users.get(loginId).setPhone(newPhone);
    }
    public void updateEmail() {
        String newEmail;
        System.out.println("Yeni Email: ");
        newEmail = scanner.next();
        users.get(loginId).setEmail(newEmail);
    }
    public void updateAddress() {
        String newAddress;
        System.out.println("Yeni Adres: ");
        newAddress = scanner.next();
        users.get(loginId).setAdress(newAddress);
    }
}