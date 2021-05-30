package cz.zvestov.blog.example.common.domain;

import java.util.Objects;
import java.util.StringJoiner;

public class AddressDto {

    private String street;

    private String postCode;

    public String getStreet() {
        return street;
    }

    public void setStreet(final String street) {
        this.street = street;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(final String postCode) {
        this.postCode = postCode;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", AddressDto.class.getSimpleName() + "[", "]")
            .add("street='" + street + "'")
            .add("postCode='" + postCode + "'")
            .toString();
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final AddressDto address = (AddressDto) o;
        return Objects.equals(street, address.street) && Objects.equals(postCode, address.postCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(street, postCode);
    }

}
