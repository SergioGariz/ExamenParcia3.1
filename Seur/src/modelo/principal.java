package modelo;

public class principal 
{
	String ciudadOrigen;
	String ciudadDestino;
	boolean origenNacional;
	boolean destinoNacional;
	String tipoEnvio;
	int peso;
	
	@Override
	public String toString() {
		return "principal [ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", origenNacional="
				+ origenNacional + ", destinoNacional=" + destinoNacional + ", tipoEnvio=" + tipoEnvio + ", peso="
				+ peso + "]";
	}

	public String getCiudadOrigen() {
		return ciudadOrigen;
	}

	public void setCiudadOrigen(String ciudadOrigen) {
		this.ciudadOrigen = ciudadOrigen;
	}

	public String getCiudadDestino() {
		return ciudadDestino;
	}

	public void setCiudadDestino(String ciudadDestino) {
		this.ciudadDestino = ciudadDestino;
	}

	public boolean isOrigenNacional() {
		return origenNacional;
	}

	public void setOrigenNacional(boolean origenNacional) {
		this.origenNacional = origenNacional;
	}

	public boolean isDestinoNacional() {
		return destinoNacional;
	}

	public void setDestinoNacional(boolean destinoNacional) {
		this.destinoNacional = destinoNacional;
	}

	public String getTipoEnvio() {
		return tipoEnvio;
	}

	public void setTipoEnvio(String tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	public principal() {
		super();
	}

	public principal(String ciudadOrigen, String ciudadDestino, boolean origenNacional, boolean destinoNacional,
			String tipoEnvio, int peso) {
		super();
		this.ciudadOrigen = ciudadOrigen;
		this.ciudadDestino = ciudadDestino;
		this.origenNacional = origenNacional;
		this.destinoNacional = destinoNacional;
		this.tipoEnvio = tipoEnvio;
		this.peso = peso;
	}
	
	public double precioEnvio()
	{
		double dImporte;
		
		if ((origenNacional == true) && (destinoNacional == true))
		{
			dImporte = 4;		
		}
		else
		{
			dImporte = 7;
		}
		
		if (tipoEnvio.equals("Paq 10 - Antes de las 10 h"))
		{
			dImporte = dImporte + 5;
		}
		
		dImporte = dImporte + (peso * 0.1);
		return dImporte;
	}
	

}
