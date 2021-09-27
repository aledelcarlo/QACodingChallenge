package tech.credify.dataobjects;

import java.time.LocalDate;
import java.time.Month;
import java.util.Random;

public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private LocalDate dateOfBirth;
    private String income;
    private String additionalIncome;
    private String email;
    private String password;

    private PersonalInformation(Builder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.address = builder.address;
        this.city = builder.city;
        this.state = builder.state;
        this.zipCode = builder.zipCode;
        this.dateOfBirth = builder.dateOfBirth;
        this.income = builder.income;
        this.additionalIncome = builder.additionalIncome;
        this.email = builder.email;
        this.password = builder.password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZipCode() {
        return zipCode;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getIncome() {
        return income;
    }

    public String getAdditionalIncome() {
        return additionalIncome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static class Builder {
        private static final String[] FIRST_NAMES = {"Liam", "Noah", "Oliver", "Elijah", "William", "James", "Benjamin", "Lucas", "Henry", "Alexander"};
        private static final String[] LAST_NAMES = {"Smith", "Jones", "Gibson", "Carter", "Evans", "Wilson", "Brown", "Davies", "Taylor", "Williams"};

        private String firstName;
        private String lastName;
        private String address;
        private String city;
        private String state;
        private String zipCode;
        private LocalDate dateOfBirth;
        private String income;
        private String additionalIncome;
        private String email;
        private String password;

        private Builder() {
            Random random = new Random();
            this.firstName = FIRST_NAMES[random.nextInt(FIRST_NAMES.length)];
            this.lastName = LAST_NAMES[random.nextInt(LAST_NAMES.length)];
            this.address = "4504 Fort Hamilton Parkway";
            this.city = "Brooklyn";
            this.state = "NY";
            this.zipCode = "11219";
            this.dateOfBirth = LocalDate.of(1985, Month.APRIL, 20);
            this.income = "150000";
            this.additionalIncome = "7000";
            this.email = "candidate+" + random.nextInt(1000000) + "@upgrade-challenge.com";
            this.password = "Mfju86hyS9";
        }

        public Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Builder withAddress(String address) {
            this.address = address;
            return this;
        }

        public Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public Builder withState(String state) {
            this.state = state;
            return this;
        }

        public Builder withZipCode(String zipCode) {
            this.zipCode = zipCode;
            return this;
        }

        public Builder withDateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Builder withIncome(String income) {
            this.income = income;
            return this;
        }

        public Builder withAdditionalIncome(String additionalIncome) {
            this.additionalIncome = additionalIncome;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withPassword(String password) {
            this.password = password;
            return this;
        }

        public PersonalInformation build() {
            return new PersonalInformation(this);
        }
    }

}
