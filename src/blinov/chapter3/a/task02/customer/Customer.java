package blinov.chapter3.a.task02.customer;

public class Customer {
	
	private int id;
	private String surname;
	private String name;
	private String patronymic;
	private String address;
	private long numCreditCard;
	private long bankAccountNuber;
	
	public Customer(int id) {
		super();
		this.id = id;
	}

	public Customer(int id, String surname, String name, String patronymic) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
	}

	public Customer(int id, String surname, String name, String patronymic, String adress) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = adress;
	}

	public Customer(int id, long bankAccountNuber) {
		super();
		this.id = id;
		this.bankAccountNuber = bankAccountNuber;
	}

	public Customer(int id, long numCreditCard, long bankAccountNuber) {
		super();
		this.id = id;
		this.numCreditCard = numCreditCard;
		this.bankAccountNuber = bankAccountNuber;
	}

	public Customer(int id, String surname, String name, String patronymic, String address, long numCreditCard, long bankAccountNuber) {
		super();
		this.id = id;
		this.surname = surname;
		this.name = name;
		this.patronymic = patronymic;
		this.address = address;
		this.numCreditCard = numCreditCard;
		this.bankAccountNuber = bankAccountNuber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}
	
	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getNumCreditCard() {
		return numCreditCard;
	}

	public void setNumCreditCard(long numCreditCard) {
		this.numCreditCard = numCreditCard;
	}

	public long getBankAccountNuber() {
		return bankAccountNuber;
	}

	public void setBankAccountNuber(long bankAccountNuber) {
		this.bankAccountNuber = bankAccountNuber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + (int) (bankAccountNuber ^ (bankAccountNuber >>> 32));
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + (int) (numCreditCard ^ (numCreditCard >>> 32));
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (bankAccountNuber != other.bankAccountNuber)
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numCreditCard != other.numCreditCard)
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", surname=" + surname + ", name=" + name + ", patronymic=" + patronymic
				+ ", address=" + address + ", numCreditCard=" + numCreditCard + ", bankAccountNuber=" + bankAccountNuber
				+ "]";
	}

	

	

}
