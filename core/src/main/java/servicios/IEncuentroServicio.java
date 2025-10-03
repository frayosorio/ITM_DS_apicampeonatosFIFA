public interface IEncuentroServicio {

    public List<Encuentro> listarCampeonato(int idCampeonato);

    public List<Encuentro> listarCampeonatoFase(int idCampeonato, int idFase);

    public List<Encuentro> listarGrupop(int idGrupo);

    public Encuentro obtener(int id);

    public Encuentro agregar(Encuentro Encuentro);

    public Encuentro modificion(Encuentro Encuentro);

    public boolean eliminar(int id);
}
