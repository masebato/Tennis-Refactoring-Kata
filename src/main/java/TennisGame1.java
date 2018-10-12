
public class TennisGame1 implements TennisGame {
    
    private int PuntajeJugador1 = 0;
    private int PuntajeJugador2 = 0;
    private String nombreJugador1;
    private String nombreJugador2;
    private String puntaje="";
    private int PuntajeTemporal=0;

    public TennisGame1(String nombreJugador1, String nombreJugador2) {
        this.nombreJugador1 = nombreJugador1;
        this.nombreJugador2 = nombreJugador2;
    }

    public void ganoPunto(String nombreJugador) {
        if (nombreJugador == "jugador1")
            PuntajeJugador1 += 1;
        else
            PuntajeJugador2 += 1;
    }

    public String getPuntaje() {
       
     
        if (PuntajeJugador1 == PuntajeJugador2)
        {
        	return GetPuntajeEmpate(PuntajeJugador1);
        }
        else if (PuntajeJugador1 >=4 || PuntajeJugador2 >=4)
        {
        	return  GetEstadoMarcador();
        }
        else
        {
        	return GetResultados() ;
        }
       
    }
    
    
    private String GetPuntajeEmpate(int PuntajeJugador) {
    	
        switch (PuntajeJugador)
        {
            case 0:
                    puntaje = "Amor-Todos";
                break;
            case 1:
                    puntaje = "Quince-Todos";
                break;
            case 2:
                    puntaje = "Treinta-Todos";
                break;
            default:
                    puntaje = "Deuce";
                break;
            
        }
    	return puntaje;
    }
    
    private String GetEstadoMarcador() {
    	
    	   int RestaPuntaje = PuntajeJugador1 - PuntajeJugador2;
           if (RestaPuntaje==1) 
        	   puntaje ="Ventaja jugador1";
           else if (RestaPuntaje ==-1)
        	   puntaje ="Ventaja jugador2";
           else if 	(RestaPuntaje>=2)
        	   puntaje = "Gana jugador1";
           else 
        	   puntaje ="Gana jugador2";
           
    	return puntaje;
    
    }
    
    private String GetResultados() {
        for (int i=1; i<3; i++)
        {
            if (i==1)
            {
            	PuntajeTemporal = PuntajeJugador1;
            }
            else
            {
            	puntaje+="-"; 
            	PuntajeTemporal = PuntajeJugador2;
            }
            switch(PuntajeTemporal)
            {
                case 0:
                    puntaje+="Amor";
                    break;
                case 1:
                    puntaje+="Quince";
                    break;
                case 2:
                    puntaje+="Treinta";
                    break;
                case 3:
                    puntaje+="Cuarenta";
                    break;
            }
        }
        return puntaje;
    }
}
