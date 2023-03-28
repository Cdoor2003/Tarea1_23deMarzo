public class Bus {
	private String marca;
	private String color;
	private int añoDeFabricaion;
	private int numero;

	public Bus(String marca, String color, int añoDeFabricaion, int numero) {
		this.marca = marca;
		this.color = color;
		this.añoDeFabricaion = añoDeFabricaion;
		this.numero = numero;
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getAñoDeFabricaion() {
		return this.añoDeFabricaion;
	}

	public void setAñoDeFabricaion(int añoDeFabricaion) {
		this.añoDeFabricaion = añoDeFabricaion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String toString() {
		return " Marca: "+marca+"\n Color: "+color+"\n Año de fabricación: "+añoDeFabricaion+"\n Numero: "+numero;
	}
}